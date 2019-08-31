// Adrián Navarro Gabino

package sales.types;

import static org.junit.Assert.*;
import org.junit.Test;

public class SalesListTest {

    @Test
    public void addSalesTest() {
        
        SalesList testSales = new SalesList();
        
        assertEquals(0,testSales.addSale("screw",2,2));
        assertEquals(-1,testSales.addSale("", 2, 2));
        assertEquals(-1,testSales.addSale("2screw", 2, 2));
        assertEquals(-1,testSales.addSale("@screw", 2, 2));
        assertEquals(0,testSales.addSale("screw",-2,2));
        assertEquals(-1,testSales.addSale("screw",0,2));
        assertEquals(0,testSales.addSale("screw",2,0));        
        assertEquals(-1,testSales.addSale("screw",2,-2));
    }
    
    @Test
    public void getTotalTest() {
        
        SalesList testSales = new SalesList();
        
        // When we compare floating point values, we need to specify an additional
        // parameter with the "delta", the maximum difference allowed between
        // actual and expected result to consider the comparison valid
        assertEquals(0, testSales.getTotal(), 0.000001);
        
        testSales.addSale("screw", 2, 2);
        testSales.addSale("knife", 3, 10);
        
        assertEquals(34, testSales.getTotal(), 0.000001);
    }
    
    @Test
    public void getAverageTest() {
        SalesList testSales = new SalesList();
        
        assertEquals(0, testSales.getAverage(), 0.000001);
        
        testSales.addSale("screw", 2, 2);
        testSales.addSale("knife", 3, 10);
        
        assertEquals(17, testSales.getAverage(), 0.000001);
        
    }
    
}
