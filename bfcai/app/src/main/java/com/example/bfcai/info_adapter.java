package com.example.bfcai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class info_adapter extends ArrayAdapter<info_class> {
    public info_adapter(Context context,  ArrayList<info_class> objects) {
        super(context,0 ,objects );
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View currentListView =convertView;
        if (currentListView==null){
         currentListView= LayoutInflater.from(getContext()).inflate(R.layout.info_custom_listview,parent,false);
           }

        info_class current= getItem(position);
        TextView info = currentListView.findViewById(R.id.info);
        info.setText(current.getInfo());
        return currentListView;
    }
}
