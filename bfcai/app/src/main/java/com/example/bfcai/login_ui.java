package com.example.bfcai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_ui extends AppCompatActivity {
 Button btn_student, btn_admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btn_student = findViewById(R.id.student);
        btn_admin =findViewById(R.id.admin);

        btn_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_ui.this,info_levels_ui.class);
                intent.putExtra("student",1);
                startActivity(intent);


            }
        });


        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login_ui.this,info_levels_ui.class);
                intent.putExtra("admin",2);
                startActivity(intent);


            }
        });

    }
}