package com.asex102823.AppAxesHackathon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.asex102823.AppAxesHackathon.R;

import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {

    private static final String LOG_TAG = FirstPage.class.getSimpleName();

    float x1,x2,y1,y2,z1,z2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.first_page);


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
                if( z1 > z2 ){
                Intent i = new Intent(FirstPage.this, AirPollution.class);
                startActivity(i);
            }
            break;
        }
        return false;
    }

}
