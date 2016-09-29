package edu.tufts.cs.flippr;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ivan on 9/28/2016.
 */
public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private List<Message> messages;
    private int count = 0;

    public CustomListAdapter(Context context, List<Message> messages) {
        this.context = context;
        this.messages = messages;
    }

    public int getCount() {
        return messages.size();
    }

    public void addItem(Message item) {
        Log.v("******", "count: " + count++);
        messages.add(item);
    }

    public Object getItem(int position) {
        return messages.get(position);
    }

    public long getItemId(int position) {
        return 5l;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.v("**********************", "" + position);
        View row;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.item1, null);
        }
        else {
            row = convertView;
        }
        Message message = (Message)getItem(position);

        TextView v = (TextView)row.findViewById(R.id.messageText);
        v.setTextColor(Color.BLACK);
        v.setText(message.getText());

        v = (TextView)row.findViewById(R.id.messageId);
        v.setTextColor(Color.BLACK);
        v.setText(message.getId());


        return row;
    }
}
