/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauntlet.scene;

import gauntlet.Gauntlet;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class PlayerSelectScene extends GauntletScene {
    
    public static final String PLAYER_SELECT_SCENE_PATH
            = "img/player_select_screen.png";
    public static final String CHOOSE_PATH
            = "img/choose_player.png";
    
    private Image imgBackground;
    private Image imgChoose;
    private int yChoose = 125;
    private static String character;

    public static String getCharacter() {
        return character;
    }

    public static void setCharacter(String character) {
        PlayerSelectScene.character = character;
    }
    
    public PlayerSelectScene() {
        super();
        try {
            imgBackground = new Image(Files.newInputStream(
                    Paths.get(PLAYER_SELECT_SCENE_PATH)));
        } catch (Exception e) {
        }
        try {
        imgChoose = new Image(Files.newInputStream(
                Paths.get(CHOOSE_PATH)));
        } catch (Exception e) {
        }
    }

    @Override
    public void draw() {
        activeKeys.clear();
        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                
                if (activeKeys.contains(KeyCode.SPACE)) {
                    if(yChoose == 125) {
                        setCharacter("warrior");
                    }
                    else if(yChoose == 230) {
                        setCharacter("valkyrie");
                    }
                    else if(yChoose == 335) {
                        setCharacter("sorcerer");
                    }
                    else {
                        setCharacter("dwarf");
                    }

                    this.stop();
                    Gauntlet.setScene(Gauntlet.GAME_SCENE);
                }
                if (releasedKeys.contains(KeyCode.UP) && yChoose != 125) {
                    yChoose -= 105;
                }
                else if (releasedKeys.contains(KeyCode.DOWN) && yChoose != 440){
                    yChoose += 105;
                }
                else if (releasedKeys.contains(KeyCode.DOWN) && yChoose == 440){
                    yChoose = 125;
                }
                else if (releasedKeys.contains(KeyCode.UP) && yChoose == 125){
                    yChoose = 440;
                }
                releasedKeys.remove(KeyCode.UP);
                releasedKeys.remove(KeyCode.DOWN);
               
                
                gc.drawImage(imgBackground, 0, 0);
                gc.drawImage(imgChoose, 510, yChoose);
            }
        }.start();
    }
}
