package com.asex102823.AppAxesHackathon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
    }

    public void LoginAttempt(View view) {

        launchFirstPage();
    }

    public void launchFirstPage() {
        Intent intent = new Intent(this, FirstPage.class);
        startActivity(intent);
    }

}