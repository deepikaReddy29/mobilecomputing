package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click(View v){
        TextView tv_msg = findViewById(R.id.msg);
        tv_msg.setText("Mobile computing hello world homework");
        Toast.makeText(this, "This is a simple toast!", Toast.LENGTH_SHORT).show();

    }
}