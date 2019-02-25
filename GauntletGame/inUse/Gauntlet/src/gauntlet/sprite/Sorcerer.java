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
public class Sorcerer extends MainCharacter
{
    public Sorcerer()
    {
        spriteXCoordinates[LEFT] = new int[] { 1954, 8, 442 };
        spriteYCoordinates[LEFT] = new int[] { 556, 610, 610 };
        spriteXCoordinates[RIGHT] = new int[] { 1738, 2170, 226 };
        spriteYCoordinates[RIGHT] = new int[] { 556, 556, 610 };
        spriteXCoordinates[UP] = new int[] { 1630, 2062, 118 };
        spriteYCoordinates[UP] = new int[] { 556, 556, 610 };
        spriteXCoordinates[DOWN] = new int[] { 1846, 2278, 334 };
        spriteYCoordinates[DOWN] = new int[] { 556, 556, 610 };
        spriteXCoordinates[LEFT_UP] = new int[] { 2008, 64, 496 };
        spriteYCoordinates[LEFT_UP] = new int[] { 556, 610, 610 };
        spriteXCoordinates[RIGHT_UP] = new int[] { 1684, 2116, 172 };
        spriteYCoordinates[RIGHT_UP] = new int[] { 556, 556, 610 };
        spriteXCoordinates[RIGHT_DOWN] = new int[] { 1792, 2224, 280 };
        spriteYCoordinates[RIGHT_DOWN] = new int[] { 556, 556, 610 };
        spriteXCoordinates[LEFT_DOWN] = new int[] { 1900, 2332, 388 };
        spriteYCoordinates[LEFT_DOWN] = new int[] { 556, 556, 610 };
        
        updateSpriteCoordinates();
    }
}
