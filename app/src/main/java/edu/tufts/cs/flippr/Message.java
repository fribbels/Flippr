package edu.tufts.cs.flippr;

/**
 * Created by Ivan on 9/29/2016.
 */
public class Message {
    private String userId;
    private String text;

    public Message (String userId, String text) {
        this.userId = userId;
        this.text = text;
    }

    public String getId() {
        return userId;
    }

    public String getText() {
        return text;
    }
}
