package com.example.bfcai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class levels_ui extends AppCompatActivity {
    ArrayList<leveldate_class> leveldata= new ArrayList<>();

    ListView lv_levedata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);

        lv_levedata=findViewById(R.id.leveldate);


        leveldata_adapter leveldata_adapter =new leveldata_adapter(getApplicationContext(), leveldata);
        lv_levedata.setAdapter(leveldata_adapter);


        //dummy
        leveldata.add(new leveldate_class("Title ","hellllllllokfjvdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("hii ","h") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );
        leveldata.add(new leveldate_class("bye ","hellllllllokfjvfdsdfnb d;fvidfjs nkdff hiiii") );




        leveldata_adapter.notifyDataSetChanged();



        lv_levedata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                //نمسح  العنصر

            }
        });


    }
}