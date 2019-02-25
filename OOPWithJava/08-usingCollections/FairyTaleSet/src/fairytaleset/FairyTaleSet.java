/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytaleset;

import fairytaleset.data.FairyTale;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class FairyTaleSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<FairyTale> tales = new HashSet<>();
        
        tales.add(new FairyTale("Aladdin", 80));
        tales.add(new FairyTale("Chicken Little", 60));
        tales.add(new FairyTale("Rapunzel", 75));
        tales.add(new FairyTale("Aladdin", 67));
        tales.add(new FairyTale("Chicken Little", 36));
        
        Iterator<FairyTale> it = tales.iterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
