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
public class Comment {
    private Post post;
    private Visitor visitor;

    public Post getPost() {
        return post;
    }
    
    /*  
        We don't need the setter, because changing the post
        where a comment has been written has no sense.
    */

    public Visitor getVisitor() {
        return visitor;
    }
    
    /*  
        We don't need the setter,
        because changing who has written a comment has no sense.
    */

    public Comment(Post post, Visitor visitor) {
        this.post = post;
        this.visitor = visitor;
    }
}
