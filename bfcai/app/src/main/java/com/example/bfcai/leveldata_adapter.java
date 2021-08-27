package com.example.bfcai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class leveldata_adapter extends ArrayAdapter<leveldate_class> {

    public leveldata_adapter(Context context, ArrayList<leveldate_class> objects) {
        super(context, 0,objects);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View currentListView =convertView;
        if (currentListView==null){
         currentListView= LayoutInflater.from(getContext()).inflate(R.layout.leveldata_custom_listview,parent,false);
           }

        leveldate_class current= getItem(position);
        TextView title = currentListView.findViewById(R.id.title);
        TextView article = currentListView.findViewById(R.id.article);
        title.setText(current.getTitle());
        article.setText(current.getArticle());

        return currentListView;
    }
}

