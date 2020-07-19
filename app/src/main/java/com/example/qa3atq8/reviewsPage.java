package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class reviewsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews_page);

        TextView reviews = findViewById(R.id.reviewsPage);
        Button b2 = findViewById(R.id.backButton2);
        ImageView rating = findViewById(R.id.ratingimage);
        TextView des = findViewById(R.id.description1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(reviewsPage.this,menu.class);
                startActivity(i);
            }
        });

    }
}