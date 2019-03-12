package gauntlet.scene;

import java.util.HashSet;
import java.util.Set;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Main abstract class to define every scene of the video game
 * @author Adrián Navarro Gabino
 */
public abstract class GauntletScene extends Scene
{
    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 600;
    
    private StackPane root = new StackPane();

    protected Set<KeyCode> activeKeys;
    protected Set<KeyCode> releasedKeys;

    protected GraphicsContext gc;
    
    protected MediaPlayer mediaPlayer;
    protected Media sound;
    
    public GauntletScene() 
    {
        super(new StackPane(), GAME_WIDTH, GAME_HEIGHT);
        root = new StackPane();
        this.setRoot(root);
                
        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();        

        activeKeys = new HashSet<>();
        releasedKeys = new HashSet<>();
        
        this.setOnKeyPressed(e -> {
            activeKeys.add(e.getCode());
        });
        this.setOnKeyReleased(e -> {
            activeKeys.remove(e.getCode());
            releasedKeys.add(e.getCode());
        });    
    }
    
    public abstract void draw();
}
