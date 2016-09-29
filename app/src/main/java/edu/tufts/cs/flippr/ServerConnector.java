package edu.tufts.cs.flippr;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 9/29/2016.
 */
public class ServerConnector {
    private List<Message> messages;
    private int count = 0;

    public ServerConnector () {
        createMockServerMessages();
    }

    public List<Message> getMessages () {
        return messages;
    }

    public int messagesCount() {
        return count;
    }

    private void createMockServerMessages() {
        Log.v("***************", "MAKEMessages");
        messages = new ArrayList<Message>();

        messages.add(new Message("Nick", "Yo this shit dope"));
        messages.add(new Message("Nick", "AAAAY WAAAZZZAAAAP"));
        messages.add(new Message("Ivan", "hello"));
        messages.add(new Message("Nick", "LMAO fuck this class"));
        messages.add(new Message("Ivan", "hello world"));
        messages.add(new Message("Nick", "yo ming its fucking lit"));
        messages.add(new Message("Ivan", "is this working"));
        messages.add(new Message("Nick", "AAAAAAAAAAYYYYYYYYYYYYYY"));
        messages.add(new Message("Ivan", "test"));

        count = 8;
    }
}
