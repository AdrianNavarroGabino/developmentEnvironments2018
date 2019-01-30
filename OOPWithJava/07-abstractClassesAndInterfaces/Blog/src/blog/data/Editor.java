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
public class Editor extends User {
    public Editor(String login, String password) {
        super(login, password);
    }

    public Editor(String login) {
        super(login);
    }
    
    public void publishedPost(Post post) {
        System.out.println("The post has been published.");
    }
}
