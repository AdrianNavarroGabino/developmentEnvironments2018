/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauntlet.sprite;

import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Sprite
{
    public static final int SPRITE_WIDTH = 46;
    public static final int SPRITE_HEIGHT = 46;
    
    public static final String SPRITE_SHEET_PATH =
        "img/gauntlet_spritesheet.png";

    protected static Image spriteSheet;
    
    protected int x, y;
    protected int spriteX, spriteY;
    
    public Sprite()
    {
        try
        {
            spriteSheet = new Image(Files.newInputStream(
                Paths.get(SPRITE_SHEET_PATH)));
        } catch (Exception e) {
        }
    }
    
    public void moveTo(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void draw(GraphicsContext gc)
    {
        gc.drawImage(spriteSheet, spriteX, spriteY,
            SPRITE_WIDTH, SPRITE_HEIGHT,
            x, y, SPRITE_WIDTH, SPRITE_HEIGHT);
    }
}