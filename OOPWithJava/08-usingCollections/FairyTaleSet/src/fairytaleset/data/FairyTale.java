/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytaleset.data;

import java.util.Objects;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class FairyTale {
    protected String title;
    protected int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public FairyTale(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    
    @Override
    public boolean equals(Object o)
    {
        FairyTale f = (FairyTale)o;
        
        return this.getTitle().equals(f.getTitle());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.title);
        return hash;
    }
    
    @Override
    public String toString()
    {
        return "Title: " + title + ", pages: " + pages;
    }
}
