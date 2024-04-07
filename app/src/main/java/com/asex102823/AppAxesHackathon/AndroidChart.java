package com.asex102823.AppAxesHackathon;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class AndroidChart extends AppCompatActivity {

    float x1,x2,y1,y2,z1,z2;
    HorizontalBarChart h_chartbar1;
    HorizontalBarChart h_chartbar2;
    HorizontalBarChart h_chartbar3;
    HorizontalBarChart h_chartbar4;
    HorizontalBarChart h_chartbar5;
    private static final String LOG_TAG =AndroidChart.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_chart);


            h_chartbar1 = findViewById(R.id.h_chartbar1);

            ArrayList barEntries1 = new ArrayList<>();
            barEntries1.add(new BarEntry(0, 30));

            ArrayList PM2_5 = new ArrayList<>();
            PM2_5.add("PM2.5");

            BarDataSet barSet1 = new BarDataSet(barEntries1, "PM2.5 Level");

            barSet1.setDrawValues(false);
            barSet1.setColor(Color.GREEN);

            barSet1.setDrawIcons(false);
            BarData barData1 = new BarData(barSet1);

            h_chartbar1.setData(barData1);
            h_chartbar1.setDrawBarShadow(true);
            h_chartbar1.getAxisLeft().setDrawGridLines(false);
            h_chartbar1.getXAxis().setDrawGridLines(false);
            h_chartbar1.getXAxis().setDrawLabels(false);
            h_chartbar1.getAxisLeft().setAxisMaxValue(150f);
            h_chartbar1.getAxisLeft().setAxisMinValue(0f);



            h_chartbar2 = findViewById(R.id.h_chartbar2);

            ArrayList barEntries2 = new ArrayList<>();
            barEntries2.add(new BarEntry(0, 110));

            ArrayList PM10 = new ArrayList<>();
            PM10.add("PM10");

            BarDataSet barSet2 = new BarDataSet(barEntries2, "PM10 Level");

            barSet2.setDrawValues(false);
            barSet2.setColor(Color.GREEN);

            barSet2.setDrawIcons(false);
            BarData barData2 = new BarData(barSet2);

            h_chartbar2.setData(barData2);
            h_chartbar2.setDrawBarShadow(true);
            h_chartbar2.getAxisLeft().setDrawGridLines(false);
            h_chartbar2.getXAxis().setDrawGridLines(false);
            h_chartbar2.getXAxis().setDrawLabels(false);
            h_chartbar2.getAxisLeft().setAxisMaxValue(200f);
            h_chartbar2.getAxisLeft().setAxisMinValue(0f);



            h_chartbar3 = findViewById(R.id.h_chartbar3);

            ArrayList barEntries3 = new ArrayList<>();
            barEntries3.add(new BarEntry(0, 250));

            ArrayList NO2 = new ArrayList<>();
            NO2.add("NO2");

            BarDataSet barSet3 = new BarDataSet(barEntries3, "NO2 Level");

            barSet3.setDrawValues(false);
            float y = h_chartbar3.getY();
            Log.d(LOG_TAG,Float.toString(y));

            //barSet3.setColor((y<=40)?Color.CYAN:(y<=90)?Color.GREEN:(y<=120)?Color.YELLOW:(y<=230)?Color.RED:(y<=340)?getResources().getColor(R.color.MAROON):getResources().getColor(R.color.DARK_MAGENTA));
            barSet3.setColor(Color.GREEN);

            barSet3.setDrawIcons(false);
            BarData barData3 = new BarData(barSet3);

            h_chartbar3.setData(barData3);
            h_chartbar3.setDrawBarShadow(true);
            h_chartbar3.getAxisLeft().setDrawGridLines(false);
            h_chartbar3.getXAxis().setDrawGridLines(false);
            h_chartbar3.getXAxis().setDrawLabels(false);
            h_chartbar3.getAxisLeft().setAxisMaxValue(400f);
            h_chartbar3.getAxisLeft().setAxisMinValue(0f);



            h_chartbar4 = findViewById(R.id.h_chartbar4);

            ArrayList barEntries4 = new ArrayList<>();
            barEntries4.add(new BarEntry(0, 250));

            ArrayList O3 = new ArrayList<>();
            O3.add("O3");

            BarDataSet barSet4 = new BarDataSet(barEntries4, "O3 Level");

            barSet4.setDrawValues(false);
            barSet4.setColor(Color.GREEN);

            barSet4.setDrawIcons(false);
            BarData barData4 = new BarData(barSet4);

            h_chartbar4.setData(barData4);
            h_chartbar4.setDrawBarShadow(true);
            h_chartbar4.getAxisLeft().setDrawGridLines(false);
            h_chartbar4.getXAxis().setDrawGridLines(false);
            h_chartbar4.getXAxis().setDrawLabels(false);
            h_chartbar4.getAxisLeft().setAxisMaxValue(500f);
            h_chartbar4.getAxisLeft().setAxisMinValue(0f);



            h_chartbar5 = findViewById(R.id.h_chartbar5);

            ArrayList barEntries5 = new ArrayList<>();
            barEntries5.add(new BarEntry(0, 650));

            ArrayList SO2 = new ArrayList<>();
            SO2.add("SO2");

            BarDataSet barSet5 = new BarDataSet(barEntries5, "SO2 Level");

            barSet5.setDrawValues(false);
            barSet5.setColor(Color.GREEN);

            barSet5.setDrawIcons(false);
            BarData barData5 = new BarData(barSet5);

            h_chartbar5.setData(barData5);
            h_chartbar5.setDrawBarShadow(true);
            h_chartbar5.getAxisLeft().setDrawGridLines(false);
            h_chartbar5.getXAxis().setDrawGridLines(false);
            h_chartbar5.getXAxis().setDrawLabels(false);
            h_chartbar5.getAxisLeft().setAxisMaxValue(800f);
            h_chartbar5.getAxisLeft().setAxisMinValue(0f);




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
                    Intent i = new Intent(AndroidChart.this, MeniuInformatie.class);
                    startActivity(i);
                }else if(z1 > z2){
                    Intent i = new Intent(AndroidChart.this, MapPage.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}