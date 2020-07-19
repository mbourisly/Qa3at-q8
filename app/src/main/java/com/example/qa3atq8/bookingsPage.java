package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class bookingsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings_page);

        TextView bookings = findViewById(R.id.bookingPage);
        Button b = findViewById(R.id.backButton1);
        ImageView c = findViewById(R.id.calender);
        TextView d = findViewById(R.id.description);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(bookingsPage.this,menu.class);
                startActivity(i);
            }
        });

    }
}