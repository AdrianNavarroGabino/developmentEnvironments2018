/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauntlet.level;

import gauntlet.sprite.*;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Level
{
    public static final String LEVELS_FOLDER = "levels/";
    
    List<Wall> walls;
    List<Enemy> enemies;
    List<Food> food;
    List<Treasure> treasures;
    ExitPoint exit;
    int width, height;
    int xMap, yMap;
    
    public Level()
    {
        walls = new ArrayList<>();
        enemies = new ArrayList<>();
        food = new ArrayList<>();
        treasures = new ArrayList<>();
        xMap = yMap = 0;
    }
    
    public List<Wall> getWalls()
    {
        return walls;
    }
    
    public List<Enemy> getEnemies()
    {
        return enemies;
    }
    
    public List<Food> getFood()
    {
        return food;
    }
    
    public List<Treasure> getTreasures()
    {
        return treasures;
    }
    
    public ExitPoint getExit()
    {
        return exit;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getXMap() {
        return xMap;
    }

    public int getYMap() {
        return yMap;
    }

    public void setXMap(int xMap) {
        this.xMap = xMap;
    }

    public void setYMap(int yMap) {
        this.yMap = yMap;
    }
    
    public void load(String fileName, MainCharacter character)
    {
        List<String> lines;
        int currentX, currentY;
        
        try
        {
            lines = Files.readAllLines(Paths.get(fileName));
        } catch (Exception e) {
            lines = new ArrayList<>();
        }
        
        if(lines.size() > 0)
        {
            width = lines.get(0).length() * Sprite.SPRITE_WIDTH;
            height = lines.size() * Sprite.SPRITE_HEIGHT;
        }
        
        for (int i = 0; i < lines.size(); i++)
        {
            String line = lines.get(i);
            currentY = i * Sprite.SPRITE_HEIGHT;
            
            for (int j = 0; j < line.length(); j++)
            {
                currentX = j * Sprite.SPRITE_WIDTH;
                switch(line.charAt(j))
                {
                    case 'W':
                        walls.add(new Wall(currentX, currentY));
                        break;
                    case 'X':
                        exit = new ExitPoint(currentX, currentY);
                        break;
                    case 'S':
                        character.moveTo(currentX, currentY);
                        break;
                    case 'T':
                        treasures.add(new Treasure(currentX, currentY));
                        break;
                    case 'P':
                        food.add(new Potion(currentX, currentY));
                        break;
                    case 'M':
                        food.add(new Meat(currentX, currentY));
                        break;
                    case 'G':
                        Ghost g = new Ghost();
                        g.moveTo(currentX, currentY);
                        enemies.add(g);
                        break;
                    case 'E':
                        Musketeer m = new Musketeer();
                        m.moveTo(currentX, currentY);
                        enemies.add(m);
                        break;
                }
            }
        }
    }
}