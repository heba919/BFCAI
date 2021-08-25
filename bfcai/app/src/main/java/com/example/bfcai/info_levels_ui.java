package com.example.bfcai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class info_levels_ui extends AppCompatActivity {

    ArrayList<info_class> infos= new ArrayList<>();
    ArrayList<levels_class> levels= new ArrayList<>();

    ListView lv_info , lv_levels;
    ImageButton home;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_levels);

        lv_info=findViewById(R.id.info);
        lv_levels=findViewById(R.id.Level);
        home=findViewById(R.id.home_icon);


        info_adapter info_adapter =new info_adapter(getApplicationContext(), infos);
        lv_info.setAdapter(info_adapter);

         levels_adapter  levels_adapter =new levels_adapter(getApplicationContext(),levels );
        lv_levels.setAdapter(levels_adapter);



        infos.add(new info_class("الرؤيه"));
        infos.add(new info_class("الرساله"));
        infos.add(new info_class("الاهداف"));
        infos.add(new info_class("الاقسام"));
        infos.add(new info_class("معلومات التواصل"));
        infos.add(new info_class("كلمه عميد الكليه"));
        infos.add(new info_class("مده الدراسه"));
        infos.add(new info_class("شروط الالتحاق"));
        infos.add(new info_class("المستقبل الوظيفي"));

        info_adapter.notifyDataSetChanged();

        levels.add(new levels_class("المستوي الاول ") );
        levels.add(new levels_class("المستوي الثاني ") );
        levels.add(new levels_class("المستوي الثالث ") );
        levels.add(new levels_class("المستوي الرابع ") );

        levels_adapter.notifyDataSetChanged();

          lv_info.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                  يدخل علي صفحه فيها المعلومات
                  //        نحط الامعلومات من ال API علي طول علي اللست
                  Intent intent = new Intent(info_levels_ui.this,information_ui.class);
                  intent.putExtra("index",position);
                  startActivity(intent);
              }
          });

          lv_levels.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  //                  يدخل علي صفحه فيها المعلومات
                  //        نحط الامعلومات من ال database علي طول علي اللست
                  Intent intent = new Intent(info_levels_ui.this,levels_ui.class);
                  intent.putExtra("index",position);
                  startActivity(intent);
              }
          });




        }

        // HOME ICON
    public void onClick(View view) {
        Intent intent = new Intent(info_levels_ui.this,login_ui.class);
        startActivity(intent);
    }

    // ACCOUNT ICON
    public void account(View view) {
        Intent intent = new Intent(info_levels_ui.this,account_ui.class);
        startActivity(intent);
    }
}
