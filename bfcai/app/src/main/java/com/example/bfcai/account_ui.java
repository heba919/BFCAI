package com.example.bfcai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class account_ui extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui);
    }

    public void onClick(View view) {
        Intent intent = new Intent(account_ui.this,info_levels_ui.class);
        startActivity(intent);
    }
}