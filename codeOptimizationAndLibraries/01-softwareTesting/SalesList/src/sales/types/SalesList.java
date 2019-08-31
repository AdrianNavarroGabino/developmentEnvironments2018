// Adrián Navarro Gabino

package sales.types;

import java.util.*;

public class SalesList {

    Map<String, Double> myList;
    
    public SalesList() {
        myList = new HashMap<String, Double>();
    }
    
    public int addSale(String concept,int quantity,double price) {
        
        int result=0;

        if (concept == null || concept.isEmpty() || 
            concept.toUpperCase().charAt(0) < 'A' ||
            concept.toUpperCase().charAt(0) > 'Z')
            result=-1;
        else if (quantity == 0 || price < 0)
            result = -1;
        else {
            result = 0;
            myList.put(concept,(double)(quantity*price));
        }
        
        return result;
    }    

    public double getSale(String concept) {
            return (double)myList.get(concept);
    }    
    
    public double getTotal() {
        
        double result = 0;
        for (String concept: myList.keySet()) {
            result += myList.get(concept);
        }
        
        return result;
    }
    
    public double getAverage() {
        
        double result = 0;
        if (myList.size() > 0)
            result = getTotal() / myList.size();
        else
            result = 0;
        
        return result;
    }
}
