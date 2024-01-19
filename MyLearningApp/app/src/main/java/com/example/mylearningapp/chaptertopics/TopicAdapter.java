package com.example.mylearningapp.chaptertopics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mylearningapp.R;
import com.example.mylearningapp.ui.code.CodeFragment;

public class TopicAdapter extends BaseAdapter {
    String topicName[];
    Context context;

    public TopicAdapter(String[] topicName, Context context){
        this.topicName = topicName;
        this.context = context;
    }
//    @Override
//    public int getCount() {
//        return topicName.length;
//    }
    @Override
    public int getCount() {
        if (topicName != null) {
            return topicName.length;
        } else {
            return 0; // Or return a default count if the data is null
        }
    }


    @Override
    public Object getItem(int position) {
        return topicName[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup ViewGroup) {
        View gridView = view;
        LayoutInflater inflater;
        if(view == null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_topic_item_layout, null);

        }
        TextView textView = gridView.findViewById(R.id.topic_text);
        textView.setText(topicName[i]);

        return gridView;
    }
}
