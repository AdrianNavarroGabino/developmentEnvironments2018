/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.HashMap;
import java.util.Map;
import library.data.Book;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Map<String, Book> mapOfBooks = new HashMap<>();
        
        mapOfBooks.put("0001", new Book("0001", "It", "Stephen King"));
        mapOfBooks.put("0002", new Book("0002", "The Chronicles of Narnia",
                "C.S. Lewis"));
        mapOfBooks.put("0003", new Book("0003", "Momo", "Michael Ende"));
        
        for(String key : mapOfBooks.keySet())
        {
            System.out.println(mapOfBooks.get(key));
        }
    }
    
}
