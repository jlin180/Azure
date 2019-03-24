package com.example.azure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NextActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next1);
    }
    public void DoSomething(View view) {
        Intent i = new Intent ( this, MainActivity7.class);
        startActivity(i);


    }
}
