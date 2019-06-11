package gauntlet;

import gauntlet.scene.*;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main Gauntlet class to launch the video game
 * @author nacho
 */
public class Gauntlet extends Application 
{
    public static final int MAX_SCENES = 6;
        
    public static final int WELCOME_SCENE = 0;
    public static final int PLAYER_SELECT_SCENE = 1;
    public static final int GAME_SCENE_1 = 2;
    public static final int GAME_SCENE_2 = 3;
    public static final int GAME_SCENE_3 = 4;
    public static final int GAME_OVER_SCENE = 5;
    
    public static final GauntletScene[] scenes = new GauntletScene[MAX_SCENES];
    
    private static Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) 
    {
        this.primaryStage = primaryStage;
        
        scenes[0] = new WelcomeScene();
        scenes[1] = new PlayerSelectScene();
        scenes[2] = new GameScene("level1.txt");
        scenes[3] = new GameScene("level2.txt");
        scenes[4] = new GameScene("level3.txt");
        scenes[5] = new GameOverScene();
        
        primaryStage.setTitle("Gauntlet");
        setScene(WELCOME_SCENE);
        primaryStage.show();
    }
    
    public static void setScene(int numScene)
    {
        primaryStage.setScene(scenes[numScene]);
        scenes[numScene].draw();
    }
    
    public static void exit()
    {
        primaryStage.hide();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
