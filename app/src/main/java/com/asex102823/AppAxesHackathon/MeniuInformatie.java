package com.asex102823.AppAxesHackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MeniuInformatie extends AppCompatActivity {

    float ozone = 6;
    float sulfurdioxide = 15;
    float nitrogendioxide = 77;
    float carbonmonoxid = 82;
    float PM25 = 54;
    float PM10 = 38;

    float x1,x2,y1,y2,z1,z2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.meniu_informatie);

        ((TextView)findViewById(R.id.textView12)).setText("O3");
        ((TextView)findViewById(R.id.textView22)).setText("SO2");
        ((TextView)findViewById(R.id.textView32)).setText("NO2");
        ((TextView)findViewById(R.id.textView42)).setText("CO");
        ((TextView)findViewById(R.id.textView52)).setText("PM25");
        ((TextView)findViewById(R.id.textView62)).setText("PM10");


        ((TextView)findViewById(R.id.textView11)).setText(String.valueOf(ozone));
        ((TextView)findViewById(R.id.textView21)).setText(String.valueOf(sulfurdioxide));
        ((TextView)findViewById(R.id.textView31)).setText(String.valueOf(nitrogendioxide));
        ((TextView)findViewById(R.id.textView41)).setText(String.valueOf(carbonmonoxid));
        ((TextView)findViewById(R.id.textView51)).setText(String.valueOf(PM25));
        ((TextView)findViewById(R.id.textView61)).setText(String.valueOf(PM10));

        if(ozone < 20) {
            ((Button) findViewById(R.id.button1)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(ozone < 40) {
            ((Button) findViewById(R.id.button1)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(ozone < 60) {
            ((Button) findViewById(R.id.button1)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(ozone < 80) {
            ((Button) findViewById(R.id.button1)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(ozone < 100) {
            ((Button) findViewById(R.id.button1)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(ozone > 100)
            ((Button)findViewById(R.id.button1)).setBackgroundColor(getResources().getColor(R.color.purple));

        if(sulfurdioxide < 20) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(sulfurdioxide < 40) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(sulfurdioxide < 60) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(sulfurdioxide < 80) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(sulfurdioxide < 100) {
            ((Button) findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(sulfurdioxide > 100)
            ((Button)findViewById(R.id.button2)).setBackgroundColor(getResources().getColor(R.color.purple));

        if(nitrogendioxide < 20) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(nitrogendioxide < 40) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(nitrogendioxide < 60) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(nitrogendioxide < 80) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(nitrogendioxide < 100) {
            ((Button) findViewById(R.id.button3)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(nitrogendioxide > 100)
            ((Button)findViewById(R.id.button3)).setBackgroundColor(getResources().getColor(R.color.purple));

        if(carbonmonoxid < 20) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(carbonmonoxid < 40) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(carbonmonoxid < 60) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(carbonmonoxid < 80) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(carbonmonoxid < 100) {
            ((Button) findViewById(R.id.button4)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(carbonmonoxid > 100)
            ((Button)findViewById(R.id.button4)).setBackgroundColor(getResources().getColor(R.color.purple));

        if(PM25 < 20) {
            ((Button) findViewById(R.id.button5)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(PM25 < 40) {
            ((Button) findViewById(R.id.button5)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(PM25 < 60) {
            ((Button) findViewById(R.id.button5)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(PM25 < 80) {
            ((Button) findViewById(R.id.button5)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(PM25 < 100) {
            ((Button) findViewById(R.id.button5)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(PM25 > 100)
            ((Button)findViewById(R.id.button5)).setBackgroundColor(getResources().getColor(R.color.purple));

        if(PM10 < 20) {
            ((Button) findViewById(R.id.button6)).setBackgroundColor(getResources().getColor(R.color.bright_green));
        }else if(PM10 < 40) {
            ((Button) findViewById(R.id.button6)).setBackgroundColor(getResources().getColor(R.color.green));
        }else if(PM10 < 60) {
            ((Button) findViewById(R.id.button6)).setBackgroundColor(getResources().getColor(R.color.yellow));
        }else if(PM10 < 80) {
            ((Button) findViewById(R.id.button6)).setBackgroundColor(getResources().getColor(R.color.orange));
        }else if(PM10 < 100) {
            ((Button) findViewById(R.id.button6)).setBackgroundColor(getResources().getColor(R.color.red));
        }else if(PM10 > 100)
            ((Button)findViewById(R.id.button6)).setBackgroundColor(getResources().getColor(R.color.purple));

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
                    Intent i = new Intent(MeniuInformatie.this, AirPollution.class);
                    startActivity(i);
                }else if(z1 > z2){
                    Intent i = new Intent(MeniuInformatie.this, AndroidChart.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }





}
