/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauntlet;

import gauntlet.scene.GameOverScene;
import gauntlet.scene.GameScene;
import gauntlet.scene.GauntletScene;
import gauntlet.scene.PlayerSelectScene;
import gauntlet.scene.WelcomeScene;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Gauntlet extends Application {

    public static final int MAX_SCENES = 4;

    public static final int WELCOME_SCENE = 0;
    public static final int PLAYER_SELECT_SCENE = 1;
    public static final int GAME_SCENE = 2;
    public static final int GAME_OVER_SCENE = 3;

    public static final GauntletScene[] scenes = new GauntletScene[MAX_SCENES];

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        scenes[0] = new WelcomeScene();
        scenes[1] = new PlayerSelectScene();
        scenes[2] = new GameScene();
        scenes[3] = new GameOverScene();

        primaryStage.setTitle("Gauntlet");
        setScene(WELCOME_SCENE);
        primaryStage.show();
    }

    public static void setScene(int numScene) {
        primaryStage.setScene(scenes[numScene]);
        scenes[numScene].draw();
    }

    public static void exit() {
        primaryStage.hide();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
