/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauntlet.scene;

import java.util.HashSet;
import java.util.Set;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Adrián Navarro Gabino
 */
public abstract class GauntletScene extends Scene {

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 600;
    private StackPane root = new StackPane();
    protected Set<KeyCode> activeKeys;
    protected Set<KeyCode> releasedKeys;
    protected GraphicsContext gc;

    public GauntletScene() {
        // Call to Scene constructor to initialize it
        super(new StackPane(), GAME_WIDTH, GAME_HEIGHT);
        
        // Change scene's root to our own stack pane
        root = new StackPane();
        this.setRoot(root);
        
        // Initialize canvas and graphics context
        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();
        
        // Initialize set of currently pressed and released keys
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

    public void draw() {
    }
}
