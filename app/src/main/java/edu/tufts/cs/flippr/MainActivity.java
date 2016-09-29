package edu.tufts.cs.flippr;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Context context = getApplicationContext();
        ServerConnector serverConnector = new ServerConnector();
        List<Message> messages = serverConnector.getMessages();

        CustomListAdapter listAdapter = new CustomListAdapter(context, messages);

    // Test


        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.BasicList);
        listView.setAdapter(listAdapter);
    }
}
