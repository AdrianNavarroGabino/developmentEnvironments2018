/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationmanagement.types;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrián Navarro
 */
public class AccomodationTest {
    
    static Accomodation hotel1, hotel2, hotel3;
    static Accomodation ruralHouse1, ruralHouse2, ruralHouse3;
    
    @BeforeClass
    public static void setUp() {
        
        hotel1 = new Hotel("Hotel 1", 25, 4, true);
        ruralHouse1 = new RuralHouse("Rural House1 1", 25, 6, 2);
        hotel2 = new Hotel("Hotel 2", -10, 5, false);
        ruralHouse2 = new RuralHouse("Rural House1 2", -15, 4, 3);
        hotel3 = new Hotel("Hotel 3", 0, 4, true);
        ruralHouse3 = new RuralHouse("Rural House1 3", 0, 6, 2);
    }
    
    @Test
    public void testGetTotal() {
        
        assertEquals(100, hotel1.getTotal(4));
        assertEquals(-1, hotel1.getTotal(-1));
        assertEquals(-1, hotel1.getTotal(0));
        assertEquals(100, ruralHouse1.getTotal(4));
        assertEquals(-1, ruralHouse1.getTotal(-1));
        assertEquals(-1, ruralHouse1.getTotal(0));
        assertEquals(-1, hotel2.getTotal(4));
        assertEquals(-1, ruralHouse2.getTotal(4));
        assertEquals(-1, hotel3.getTotal(4));
        assertEquals(-1, ruralHouse3.getTotal(4));
    }
    
    @Test
    public void testGetCheckOutDate() {
        
        assertEquals("06/06/2019",Accomodation.getCheckOutDate("01/06/2019",5));
        assertEquals("01/03/2019",Accomodation.getCheckOutDate("28/02/2019",1));
        assertEquals("03/02/2019",Accomodation.getCheckOutDate("29/01/2019",5));
        assertEquals("02/07/2019",Accomodation.getCheckOutDate("25/06/2019",7));
        assertNull(Accomodation.getCheckOutDate("32/03/2019",2));
        assertNull(Accomodation.getCheckOutDate("-1/03/2019",2));
        assertNull(Accomodation.getCheckOutDate("00/03/2019",2));
        assertNull(Accomodation.getCheckOutDate("05/13/2019",2));
        assertNull(Accomodation.getCheckOutDate("05/-5/2019",2));
        assertNull(Accomodation.getCheckOutDate("05/00/2019",2));
        assertNull(Accomodation.getCheckOutDate("25/03/10000",2));
        assertNull(Accomodation.getCheckOutDate("25/03/19",2));
        assertNull(Accomodation.getCheckOutDate("25/03/-111",2));
        assertNull(Accomodation.getCheckOutDate("25/03/0000",2));
        assertNull(Accomodation.getCheckOutDate("25-03-2019",1));
        assertNull(Accomodation.getCheckOutDate("03/25/2019",7));
        assertNull(Accomodation.getCheckOutDate("15/01/2019",-1));
        assertNull(Accomodation.getCheckOutDate("15/01/2019",0));
    }
    
}
