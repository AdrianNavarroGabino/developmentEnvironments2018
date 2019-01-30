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
public class Post {
    private Editor editor;

    public Editor getEditor() {
        return editor;
    }
    
    /*  
        We don't need the setter,
        because changing who has written a post has no sense.
    */

    public Post(Editor editor) {
        this.editor = editor;
    }
}
