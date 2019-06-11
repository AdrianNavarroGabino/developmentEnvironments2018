package gauntlet.scene;

import gauntlet.Gauntlet;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

/**
 * Scene to choose player before starting the game
 * @author Adrián Navarro Gabino
 */
public class PlayerSelectScene extends GauntletScene
{
    public static final String PLAYER_SELECT_SCENE_PATH = "img/player_select_screen.png";
    public static final String POINTER_PATH = "img/choose_player.png";
    
    public static final int STARTING_POINTER_X = 510;
    public static final int STARTING_POINTER_Y = 125;
    public static final int POINTER_Y_INCREMENT = 105;
    
    private Image imgBackground;
    private Image imgPointer;
    protected static int chosenPlayer;
    private int chosenPlayerY;
    
    public PlayerSelectScene()
    {
        super();
        
        chosenPlayer = 0;
        chosenPlayerY = STARTING_POINTER_Y;
        
        try
        {
            imgBackground = new Image(Files.newInputStream(Paths.get(PLAYER_SELECT_SCENE_PATH)));
            imgPointer = new Image(Files.newInputStream(Paths.get(POINTER_PATH)));            
        } catch (Exception e) {
            return;
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
                if(activeKeys.contains(KeyCode.SPACE))
                {
                    this.stop();
                    Gauntlet.setScene(Gauntlet.GAME_SCENE_1);
                } else if (releasedKeys.contains(KeyCode.UP) && chosenPlayer > 0) {
                    chosenPlayer--;
                    chosenPlayerY -= POINTER_Y_INCREMENT;
                } else if (releasedKeys.contains(KeyCode.DOWN) && chosenPlayer < 3) {
                    chosenPlayer++;
                    chosenPlayerY += POINTER_Y_INCREMENT;
                }
                gc.drawImage(imgBackground, 0, 0);    
                gc.drawImage(imgPointer, STARTING_POINTER_X, chosenPlayerY);
                
                releasedKeys.clear();
            }
        }.start();        
    }
}    
