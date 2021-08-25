package com.example.bfcai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class levels_adapter extends ArrayAdapter<levels_class> {
    public levels_adapter(Context context, ArrayList<levels_class> objects) {
        super(context,0 ,objects );
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {


        View currentListView =convertView;
        if (currentListView==null){

            currentListView= LayoutInflater.from(getContext()).inflate(R.layout.levels_custom_listview,parent,false);
           }

        levels_class current= getItem(position);
        TextView level = currentListView.findViewById(R.id.leve);
        level.setText(current.getLevel());
        return currentListView;
    }
}
