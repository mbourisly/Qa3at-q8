package com.example.qa3atq8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TimePicker;

import java.util.Calendar;

public class SecondActivity extends AppCompatActivity {

    int t1Hour,t1Minute,t2Hour,t2Minute;

    private static final String TAG = "SecondActivity";

    private CalendarView mCalenderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button b = findViewById(R.id.backButton1);
        mCalenderView = (CalendarView)findViewById(R.id.calendarView);
        Button s = findViewById(R.id.selectbtn);
        Button c = findViewById(R.id.checkbtn);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondActivity.this,done_pg.class);
                startActivity(i);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        SecondActivity.this,
                        android.R.style.Theme_DeviceDefault_Dialog_MinWidth,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfday, int minute) {
                                t1Hour = hourOfday;
                                t1Minute = minute;
                                Calendar calendar = Calendar.getInstance();
                                calendar.set(0,0,0,t1Hour,t1Minute);

                            }
                        },12,0,false
                );
                timePickerDialog.updateTime(t1Hour,t1Minute);
                timePickerDialog.show();


            }
        });






        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SecondActivity.this,halls_details.class);
                startActivity(i);
            }
        });

        mCalenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
             String date = (i1 + 1) + "/" + i2 + "/" + i;
                Log.d(TAG, "onSelectedDayChange: mm/dd/yyyy:" + date);

            }
        });
    }
}