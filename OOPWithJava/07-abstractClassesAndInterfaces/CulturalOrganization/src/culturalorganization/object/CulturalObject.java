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
public class CulturalObject {
    protected int id;
    protected String title;
    protected String author;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public CulturalObject(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public CulturalObject() {
    }
}
