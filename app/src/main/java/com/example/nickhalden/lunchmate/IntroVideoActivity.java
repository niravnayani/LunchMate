package com.example.nickhalden.lunchmate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroVideoActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_video);
        //btnBack = (Button) findViewById(R.id.buttonBack);
        //btnBack.setOnClickListener(new View.OnClickListener() {
        //public void onClick(View v) {
        //  finish();
        // }
        //});
    }
}
