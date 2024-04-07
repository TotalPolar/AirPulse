package com.asex102823.AppAxesHackathon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AirPollution extends AppCompatActivity {

    private static final String LOG_TAG = FirstPage.class.getSimpleName();
    float x1,x2,y1,y2,z1,z2;
    float indicepoluare = 74;
    int temperatura = 23;
    String locatie = "\nBucharest, Romania";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.air_pollution);

        if(indicepoluare < 20) {
            ((Button) findViewById(R.id.afisajapi)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(indicepoluare < 40) {
            ((Button) findViewById(R.id.afisajapi)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(indicepoluare < 60) {
            ((Button) findViewById(R.id.afisajapi)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(indicepoluare < 80) {
            ((Button) findViewById(R.id.afisajapi)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(indicepoluare < 100) {
            ((Button) findViewById(R.id.afisajapi)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(indicepoluare > 100)
            ((Button)findViewById(R.id.afisajapi)).setBackgroundColor(getResources().getColor(R.color.purple));

        ((TextView)findViewById(R.id.textapi2)).setText(Float.toString(indicepoluare));
        ((TextView)findViewById(R.id.textapi1)).setText("AQI INDEX" + locatie);
        ((TextView)findViewById(R.id.templocala)).setText((String.valueOf(temperatura)) + "°C");
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if( Math.abs(x1-x2) > Math.abs(y1-y2) ) {
                    z1 = x1;
                    z2 = x2;
                }
                else {
                    z1 = y1;
                    z2 = y2;
                }
                if(z1 < z2){
                Intent i = new Intent(AirPollution.this, FirstPage.class);
                startActivity(i);
            }else if(z1 > z2){
                Intent i = new Intent(AirPollution.this, MeniuInformatie.class);
                startActivity(i);
            }
            break;
        }
        return false;
    }






}

