/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culturalorganization.object;

/**
 *
 * @author adnag
 */
public class Book extends CulturalObject {
    protected int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(int numberOfPages, int id, String title, String author) {
        super(id, title, author);
        this.numberOfPages = numberOfPages;
    }
}
