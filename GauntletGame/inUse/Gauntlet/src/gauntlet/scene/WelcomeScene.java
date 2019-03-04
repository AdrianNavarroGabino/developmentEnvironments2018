package gauntlet.scene;

import gauntlet.Gauntlet;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Scene to draw the welcome screen
 * @author Adrián Navarro Gabino
 */
public class WelcomeScene extends GauntletScene
{
    public static final String WELCOME_SCREEN_PATH = "img/welcome_screen.png";
    public static final String WELCOME_SONG = "sound/title.mp3";
    
    private Image imgBackground;
    
    public WelcomeScene()
    {        
        super();
        
        try
        {
            imgBackground = new Image(Files.newInputStream(Paths.get(WELCOME_SCREEN_PATH)));
        } catch (Exception e) {
        }                
    }

    @Override
    public void draw() 
    {
        activeKeys.clear();
        sound = new Media(new File(WELCOME_SONG).toURI().toString());
        mediaPlayer = new MediaPlayer(sound);        
        mediaPlayer.play();
        
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                if(activeKeys.contains(KeyCode.SPACE))
                {
                    this.stop();
                    mediaPlayer.stop();
                    Gauntlet.setScene(Gauntlet.PLAYER_SELECT_SCENE);
                } else if (activeKeys.contains(KeyCode.ESCAPE)) {
                    this.stop();
                    mediaPlayer.stop();
                    Gauntlet.exit();
                }
                gc.drawImage(imgBackground, 0, 0);        
            }
        }.start();        
    }  
}
