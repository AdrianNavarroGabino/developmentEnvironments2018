/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauntlet.sprite;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Warrior extends MainCharacter
{
    public Warrior()
    {
        spriteXCoordinates[LEFT] = new int[] { 334, 766, 1198 };
        spriteYCoordinates[LEFT] = new int[] { 502, 502, 502 };
        spriteXCoordinates[RIGHT] = new int[] { 118, 550, 982 };
        spriteYCoordinates[RIGHT] = new int[] { 502, 502, 502 };
        spriteXCoordinates[UP] = new int[] { 8, 442, 874 };
        spriteYCoordinates[UP] = new int[] { 502, 502, 502 };
        spriteXCoordinates[DOWN] = new int[] { 226, 658, 1090 };
        spriteYCoordinates[DOWN] = new int[] { 502, 502, 502 };
        spriteXCoordinates[LEFT_UP] = new int[] { 388, 820, 1252 };
        spriteYCoordinates[LEFT_UP] = new int[] { 502, 502, 502 };
        spriteXCoordinates[RIGHT_UP] = new int[] { 64, 496, 928 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 502, 502, 502 };
        spriteXCoordinates[RIGHT_DOWN] = new int[] { 172, 604, 1036 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 502, 502, 502 };
        spriteXCoordinates[LEFT_DOWN] = new int[] { 280, 712, 1144 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 502, 502, 502 };
        
        updateSpriteCoordinates();
    }
}
