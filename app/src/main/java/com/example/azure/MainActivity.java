package com.example.azure;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void SelfHelp(View view) {
        Intent i = new Intent ( this, MainActivity4.class);
        startActivity(i);


    }

    public void Connect(View view) {
        Intent n = new Intent(this, MainActivity2.class);
        startActivity(n);
    }
}
