package gauntlet.sprite;

import static gauntlet.scene.WelcomeScene.WELCOME_SCREEN_PATH;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite 
{
    public static final int SPRITE_WIDTH = 46;
    public static final int SPRITE_HEIGHT = 46;

    public static final String SPRITE_SHEET_PATH = "img/gauntlet_spritesheet.png";
     
    protected static Image spriteSheet;

    protected int x, y;
    protected int spriteX, spriteY;
    
    
    public Sprite()
    {
        try
        {
            spriteSheet = new Image(Files.newInputStream(Paths.get(SPRITE_SHEET_PATH)));
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

    public void draw(GraphicsContext gc, int xMap, int yMap)
    {
        gc.drawImage(spriteSheet, spriteX, spriteY, SPRITE_WIDTH, SPRITE_HEIGHT, 
                     x - xMap, y - yMap, SPRITE_WIDTH, SPRITE_HEIGHT);
    }
    
    public boolean collidesWith(Sprite sp)
    {
        return (x + Sprite.SPRITE_WIDTH > sp.x && x < sp.x + Sprite.SPRITE_WIDTH && 
                y + Sprite.SPRITE_HEIGHT > sp.y && y < sp.y + Sprite.SPRITE_HEIGHT);
    }
    
}
