package com.cyd.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppPortfolio extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        addListeners();
    }

    private void addListeners(){
        final Button buttonSpotify = (Button) findViewById(R.id.button1Spotify);
        final Button buttonScoreApp = (Button) findViewById(R.id.button2ScoreApp);
        final Button buttonLibrary = (Button) findViewById(R.id.button3Library);
        final Button buttonBuildItBigger = (Button) findViewById(R.id.button4BuildItBigger);
        final Button buttonXYZReader = (Button) findViewById(R.id.button5XYZReader);
        final Button buttonCapstone = (Button) findViewById(R.id.button6Capstone);

        buttonSpotify.setOnClickListener(this);
        buttonScoreApp.setOnClickListener(this);
        buttonLibrary.setOnClickListener(this);
        buttonBuildItBigger.setOnClickListener(this);
        buttonXYZReader.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        String text="";
        if ( v instanceof AppCompatButton){
            AppCompatButton aux = (AppCompatButton)v;
            text = "This button will launch my " + aux.getText().toString() + "app";
        }
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
