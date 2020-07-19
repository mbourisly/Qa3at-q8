package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class wishlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        TextView wish = findViewById(R.id.wish);
        Button b3 = findViewById(R.id.backButton3);
        ImageView wishimage = findViewById(R.id.wishimage);
        TextView d3 = findViewById(R.id.description3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(wishlist.this,menu.class);
                startActivity(i);
            }
        });

    }
}