package gauntlet.scene;

import gauntlet.Gauntlet;
import gauntlet.level.Level;
import gauntlet.sprite.*;
import java.io.File;
import java.util.*;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Scene to draw the welcome screen
 * @author Adrián Navarro Gabino
 */
public class GameScene extends GauntletScene
{
    public static final int BOTTOM_LIMIT = 500;
    private static final long ENERGY_UPDATE = 1000000000;
    private static final int ENERGY_DECREASE = 10;
    
    public static String[] GAME_SONGS = { 
        "sound/themeA.mp3",
        "sound/themeB.mp3",
        "sound/themeC.mp3"
    };
    
    private MainCharacter character;
    private Level level;
    private Font gameFont;
    private Random random;
    private String levelFile;
    
    private int oldX, oldY, oldXMap, oldYMap;    
    private long currentTime = 0;
        
    public GameScene(String levelFile)
    {        
        super();        
        random = new Random();
        gameFont = Font.font("Courier New", FontWeight.BOLD, 24);
        gc.setFont(gameFont);
        this.levelFile = levelFile;
    }
    
    @Override
    public void draw() 
    {        
        activeKeys.clear();
        sound = new Media(new File(GAME_SONGS[random.nextInt(GAME_SONGS.length)]).toURI().toString());
        mediaPlayer = new MediaPlayer(sound);        
        mediaPlayer.play();
        
        choosePlayer();
        level = new Level();
        level.load(Level.LEVELS_FOLDER + levelFile, character);
        List<Food> food = level.getFood();
        List<Treasure> treasures = level.getTreasures();
        List<Enemy> enemies = level.getEnemies();
        List<Wall> walls = level.getWalls();
        ExitPoint exit = level.getExit();
        level.setXMap(character.getX() - 150);
        level.setYMap(character.getY() - 150);
                
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {                
                updateTime(currentNanoTime);
                
                detectKeys(this);
                
                // Move elements player and weapons
                
                moveCharacter();
                character.moveWeapons();
                moveEnemies(enemies, walls);                
                
                // Check collisions
                collisionCharacterWalls(character, walls);
                collisionCharacterFood(character, food);
                collisionCharacterTreasures(character, treasures);
                collisionWeaponsWalls(character.getWeapons(), walls);
                collisionWeaponsEnemies(character.getWeapons(), enemies);                
                
                // Clear screen
                
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
                
                // Draw everything       
                
                character.draw(gc, level.getXMap(), level.getYMap());
                
                for (Enemy enemy: enemies)
                    enemy.draw(gc, level.getXMap(), level.getYMap());

                for (Weapon w: character.getWeapons())
                    w.draw(gc, level.getXMap(), level.getYMap());

                for (Food f: food)
                    f.draw(gc, level.getXMap(), level.getYMap());

                for (Treasure t: treasures)
                    t.draw(gc, level.getXMap(), level.getYMap());

                for (Wall w: walls)
                    w.draw(gc, level.getXMap(), level.getYMap());

                level.getExit().draw(gc, level.getXMap(), level.getYMap());
                
                drawHUD();
            }
        }.start();        
    }  
    
    private void moveCharacter()
    {
        oldX = character.getX();
        oldY = character.getY();
        oldXMap = level.getXMap();
        oldYMap = level.getYMap();
        
        boolean left = activeKeys.contains(KeyCode.LEFT);
        boolean right = activeKeys.contains(KeyCode.RIGHT);
        boolean up = activeKeys.contains(KeyCode.UP);
        boolean down = activeKeys.contains(KeyCode.DOWN);

        if (up && character.getY() > 0)
        {
            character.moveTo(character.getX(), 
                             character.getY() - MainCharacter.STEP_LENGTH);
            if(level.getYMap() > 0)
                level.setYMap(level.getYMap() - MainCharacter.STEP_LENGTH);
        }
        if (down && character.getY() < level.getHeight() - Sprite.SPRITE_HEIGHT)
        {
            character.moveTo(character.getX(), 
                             character.getY() + MainCharacter.STEP_LENGTH);
            if (level.getYMap() < level.getHeight() - BOTTOM_LIMIT)
                level.setYMap(level.getYMap() + MainCharacter.STEP_LENGTH);
        }
        if (left && character.getX() > 0)
        {
            character.moveTo(character.getX() - MainCharacter.STEP_LENGTH, 
                             character.getY());
            if (level.getXMap() > 0)
                level.setXMap(level.getXMap() - MainCharacter.STEP_LENGTH);
        }
        if (right && character.getX() < level.getWidth() - Sprite.SPRITE_WIDTH)
        {
            character.moveTo(character.getX() + MainCharacter.STEP_LENGTH, 
                             character.getY());
            if (level.getXMap() < level.getWidth() - GauntletScene.GAME_WIDTH)
                level.setXMap(level.getXMap() + MainCharacter.STEP_LENGTH);
        }        
        
        if (left)
            if (up) character.animate(MovableSprite.LEFT_UP);
            else if (down) character.animate(MovableSprite.LEFT_DOWN);
            else character.animate(MovableSprite.LEFT);
        else if (right)
            if (up) character.animate(MovableSprite.RIGHT_UP);
            else if (down) character.animate(MovableSprite.RIGHT_DOWN);
            else character.animate(MovableSprite.RIGHT);
        else if (up)
            character.animate(MovableSprite.UP);
        else if (down)
            character.animate(MovableSprite.DOWN);
    }
    
    private void drawEnergy()
    {
        gc.setFill(Color.RED);
        gc.fillText("ENERGY: " + character.getEnergy(), 5, BOTTOM_LIMIT + 50);
    }

    private void drawPoints()
    {
        gc.setFill(Color.GREEN);
        gc.fillText("POINTS: " + character.getPoints(), GauntletScene.GAME_WIDTH - 200, BOTTOM_LIMIT + 50);
    }
    
    private void drawHUD()
    {
        // Black background
        gc.setFill(Color.BLACK);
        gc.fillRect(0, BOTTOM_LIMIT, GAME_WIDTH, GAME_HEIGHT - BOTTOM_LIMIT);

        // Bottom texts and line

        gc.setStroke(Color.YELLOW);
        gc.strokeLine(0, BOTTOM_LIMIT, GauntletScene.GAME_WIDTH, BOTTOM_LIMIT);
        drawPoints();
        drawEnergy();        
    }
    
    private void updateEnergy()
    {
        int totalDecrease = ENERGY_DECREASE;
        character.setEnergy(-totalDecrease);
    }
    
    private void updateTime(long currentNanoTime)
    {
        if (currentTime == 0)
        {
            currentTime = currentNanoTime;
        }
        if (currentNanoTime - currentTime > ENERGY_UPDATE)
        {
            currentTime = currentNanoTime;
            updateEnergy();
        }        
    }
    
    private void choosePlayer()
    {   
        character = new Warrior();
        
        switch (PlayerSelectScene.chosenPlayer)
        {
            case 1:
                character = new Valkyrie();
                break;
            case 2:
                character = new Sorcerer();
                break;
            case 3:
                character = new Dwarf();
                break;
        }
    }
    
    private void detectKeys(AnimationTimer timer)
    {
        if(activeKeys.contains(KeyCode.ESCAPE) || 
           character.getEnergy() <= 0 ||
           (character.collidesWith(level.getExit()) && levelFile.equals("level3.txt")))
        {
            timer.stop();
            mediaPlayer.stop();
            Gauntlet.setScene(Gauntlet.GAME_OVER_SCENE);
        }
        if(character.collidesWith(level.getExit()) && levelFile.equals("level1.txt"))
        {
            timer.stop();
            mediaPlayer.stop();
            Gauntlet.setScene(Gauntlet.GAME_SCENE_2);
        }
        if(character.collidesWith(level.getExit()) && levelFile.equals("level2.txt"))
        {
            timer.stop();
            mediaPlayer.stop();
            Gauntlet.setScene(Gauntlet.GAME_SCENE_3);
        }
        if (releasedKeys.contains(KeyCode.SPACE))
        {
            releasedKeys.remove(KeyCode.SPACE);
            character.addWeapon();
        }        
    }
    
    private void collisionCharacterWalls(MainCharacter character, List<Wall> walls)
    {
        for(Wall wall: walls)
        {
            if (character.collidesWith(wall))
            {
                character.moveTo(oldX, oldY);
                level.setXMap(oldXMap);
                level.setYMap(oldYMap);
            }        
        }
    }
    
    private void collisionCharacterFood(MainCharacter character, List<Food> food)
    {
        int i = 0;
        while (i < food.size())
        {
            if (character.collidesWith(food.get(i)))
            {
                character.setEnergy(food.get(i).getEnergy());
                food.remove(i);
            }
            else
            {
                i++;
            }
        }
    }
    
    private void collisionCharacterTreasures(MainCharacter character, List<Treasure> treasures)
    {
        int i = 0;
        while (i < treasures.size())
        {
            if (character.collidesWith(treasures.get(i)))
            {
                character.setPoints(Treasure.SCORE);
                drawPoints();
                treasures.remove(i);
            }
            else
            {
                i++;
            }
        }        
    }
    
    private void collisionWeaponsWalls(List<Weapon> weapons, List<Wall> walls)
    {
        int i = 0;
        int j;
        boolean collided;
        while (i < weapons.size())
        {
            j = 0;
            collided = false;
            while (j < walls.size() && ! collided)
            {
                if (weapons.get(i).collidesWith(walls.get(j)) ||
                    weapons.get(i).isOutOfBounds(level.getWidth(),
                                                level.getHeight()))
                {
                    character.removeWeapon(i);
                    collided = true;
                }
                else
                {
                    j++;
                }
            }
            
            if (!collided)
            {
                i++;
            }
        }        
    }
    
    private void collisionWeaponsEnemies(List<Weapon> weapons, List<Enemy> enemies)
    {
        int i = 0;
        int j = 0;
        while (i < weapons.size())
        {
            boolean enemyCollided = false;
            while (j < enemies.size() && !enemyCollided)
            {
                if (weapons.get(i).collidesWith(enemies.get(j)))
                {
                    character.removeWeapon(i);
                    enemies.remove(j);
                    character.setPoints(Enemy.SCORE) ;
                    enemyCollided = true;
                }
                else
                {
                    j++;
                }
            }

            if (!enemyCollided)
                i++;
        }                        
    }
    
    private void moveEnemies(List<Enemy> enemies, List<Wall> walls)
    {
        int oldXEnemy, oldYEnemy;
        for (Enemy enemy: enemies)
        {
            oldXEnemy = enemy.getX();
            oldYEnemy = enemy.getY();
            enemy.move(character);

            for (Wall wall: walls)
            {
                if (enemy.collidesWith(wall))
                {
                    enemy.moveTo(oldXEnemy, oldYEnemy);
                }
            }    
                
            if (enemy.collidesWith(character))
            {
                enemy.moveTo(oldXEnemy, oldYEnemy);
                character.moveTo(oldX, oldY);
                level.setXMap(oldXMap);
                level.setYMap(oldYMap);
            }
        }
        
    }
}

