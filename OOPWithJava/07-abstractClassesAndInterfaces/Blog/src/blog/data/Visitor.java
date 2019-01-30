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
public class Visitor extends User {

    public Visitor(String login, String password) {
        super(login, password);
    }

    public Visitor(String login) {
        super(login);
    }
    
    public void commentPost(Post post, Comment comment) {
        System.out.println("The comment has been published.");
    }
}
