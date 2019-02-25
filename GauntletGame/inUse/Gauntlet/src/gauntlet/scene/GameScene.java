package gauntlet.scene;

import gauntlet.Gauntlet;
import gauntlet.sprite.Dwarf;
import gauntlet.sprite.MainCharacter;
import gauntlet.sprite.MovableSprite;
import gauntlet.sprite.Sorcerer;
import gauntlet.sprite.Valkyrie;
import gauntlet.sprite.Warrior;
import java.io.File;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class GameScene extends GauntletScene
{   
    MainCharacter character;
    
    Random rnd = new Random();
    
    private final String[] list = {
        "sound/themeA.mp3", "sound/themeB.mp3", "sound/themeC.mp3"};
    private final String mainSong;
    
    public final String MAIN_SONG;
    
    public GameScene()
    {        
        super();
        mainSong = list[rnd.nextInt(list.length)];
        MAIN_SONG = mainSong;
    }

    @Override
    public void draw() 
    {
        sound = new Media(new File(MAIN_SONG).toURI().toString());
        mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        
        activeKeys.clear();

        try
        {
            switch (PlayerSelectScene.chosenPlayer)
            {
                case 0:
                    character = new Warrior();
                    break;
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
            
            character.moveTo(100, 200);
        } catch (Exception e) {
        }                
        
        new AnimationTimer()
        {
            @Override
            public void handle(long currentNanoTime)
            {
                // Black background
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
                
                if(activeKeys.contains(KeyCode.SPACE))
                {
                    this.stop();
                    mediaPlayer.stop();
                    Gauntlet.setScene(Gauntlet.GAME_OVER_SCENE);
                }
                else if(activeKeys.contains(KeyCode.RIGHT) &&
                        activeKeys.contains(KeyCode.UP))
                {
                    character.moveTo(character.getX() + 1,
                                    character.getY() - 1);
                    character.animate(MovableSprite.RIGHT_UP);
                }
                else if(activeKeys.contains(KeyCode.RIGHT) &&
                        activeKeys.contains(KeyCode.DOWN))
                {
                    character.moveTo(character.getX() + 1,
                                    character.getY() + 1);
                    character.animate(MovableSprite.RIGHT_DOWN);
                }
                else if(activeKeys.contains(KeyCode.LEFT) &&
                        activeKeys.contains(KeyCode.UP))
                {
                    character.moveTo(character.getX() - 1,
                                    character.getY() - 1);
                    character.animate(MovableSprite.LEFT_UP);
                }
                else if(activeKeys.contains(KeyCode.LEFT) &&
                        activeKeys.contains(KeyCode.DOWN))
                {
                    character.moveTo(character.getX() - 1,
                                    character.getY() + 1);
                    character.animate(MovableSprite.LEFT_DOWN);
                }
                else if (activeKeys.contains(KeyCode.UP))
                {
                    character.moveTo(character.getX(),
                                    character.getY() - 1);
                    character.animate(MovableSprite.UP);
                }
                else if (activeKeys.contains(KeyCode.DOWN))
                {
                    character.moveTo(character.getX(),
                                    character.getY() + 1);
                    character.animate(MovableSprite.DOWN);
                }
                else if (activeKeys.contains(KeyCode.LEFT))
                {
                    character.moveTo(character.getX() - 1,
                                    character.getY());
                    character.animate(MovableSprite.LEFT);
                }
                else if (activeKeys.contains(KeyCode.RIGHT))
                {
                    character.moveTo(character.getX() + 1,
                                    character.getY());
                    character.animate(MovableSprite.RIGHT);
                }
                
                character.draw(gc);
                
                gc.setStroke(Color.YELLOW);
                gc.strokeLine(0,500,GAME_WIDTH,500);
                
                Font energy = Font.font("Courier New", FontWeight.BOLD, 24);
                gc.setFont(energy);
                gc.setFill(Color.RED);
                gc.fillText("ENERGY: ", 5, 550);
                
                Font points = Font.font("Courier New", FontWeight.BOLD, 24);
                gc.setFont(points);
                gc.setFill(Color.GREEN);
                gc.fillText("POINTS: ", 600, 550);
            }
        }.start();        
    }  
}
