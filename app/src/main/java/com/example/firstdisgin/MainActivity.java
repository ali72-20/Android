package com.example.firstdisgin;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button androidButton = findViewById(R.id.btn_android);
        androidButton.setOnClickListener(this);
        
        Button iosButton = findViewById(R.id.btn_ios);
        iosButton.setOnClickListener(this);
        
        Button fullStack = findViewById(R.id.btn_fullStack);
        fullStack.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View v) {
        Intent intent = null;
        if(v.getId() == R.id.btn_android){
            intent  = new Intent(this,Adnriod.class);
        }
        else if(v.getId() == R.id.btn_ios){
            intent = new Intent(this,Ios.class);
        }
        else if(v.getId() == R.id.btn_fullStack){
            intent = new Intent(this,FullStack.class);
        }
        startActivity(intent);
    }


}