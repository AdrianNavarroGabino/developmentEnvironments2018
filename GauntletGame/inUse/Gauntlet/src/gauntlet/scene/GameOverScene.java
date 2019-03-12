package gauntlet.scene;

import gauntlet.Gauntlet;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;

/**
 * Scene to draw the welcome screen
 * @author Adrián Navarro Gabino
 */
public class GameOverScene extends GauntletScene
{
    public static final String GAME_OVER_SCREEN_PATH = "img/game_over_screen.png";
    
    private Image imgBackground;
    
    public GameOverScene()
    {        
        super();
        
        try
        {
            imgBackground = new Image(Files.newInputStream(Paths.get(GAME_OVER_SCREEN_PATH)));
        } catch (Exception e) {
        }                
    }

    @Override
    public void draw() 
    {
        activeKeys.clear();
        
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                if(activeKeys.size() > 0)
                {
                    this.stop();
                    Gauntlet.setScene(Gauntlet.WELCOME_SCENE);
                }
                gc.drawImage(imgBackground, 0, 0);        
            }
        }.start();        
    }  
}
