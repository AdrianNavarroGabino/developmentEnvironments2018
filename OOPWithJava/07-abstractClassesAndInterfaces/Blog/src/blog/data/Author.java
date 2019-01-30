/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.data;

/**
 *
 * @author Adrián Navarro Gabino
 */
public class Author extends Editor {
    private Editor supervisor;
    
    public Author(String login, String password, Editor supervisor) {
        super(login, password);
        this.supervisor = supervisor;
    }

    public Author(String login) {
        super(login);
    }

    public void setSupervisor(Editor supervisor) {
        this.supervisor = supervisor;
    }

    public Editor getSupervisor() {
        return supervisor;
    }
}
