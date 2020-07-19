package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView user = findViewById(R.id.userimage);
        final TextView profile = findViewById(R.id.profile);
        TextView bookings = findViewById(R.id.bookings);
        TextView reviews = findViewById(R.id.reviews);
        TextView wishlist = findViewById(R.id.wishlist);
        TextView share = findViewById(R.id.share);
        ImageView x = findViewById(R.id.xicon);


       

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this, com.example.qa3atq8.profile.class);
                startActivity(i);
            }
        });

        bookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this,bookingsPage.class);
                startActivity(i);

            }
        });

        reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this,reviewsPage.class);
                startActivity(i);

            }
        });

        wishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this,wishlist.class);
                startActivity(i);
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this,explorePage.class);
                startActivity(i);
            }
        });

    }
}