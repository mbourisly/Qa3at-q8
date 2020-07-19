package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {

   // Bundle b =
    //the usernsme shows uo on the profile page    putextra

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView profilePage = findViewById(R.id.profilePage);
        Button back = findViewById(R.id.backButton);
        ImageView user1 = findViewById(R.id.userimage1);
        TextView name = findViewById(R.id.name);
        Button edit = findViewById(R.id.edit);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(profile.this,menu.class);
                startActivity(i);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(profile.this,details_page.class);
                startActivity(i);
            }
        });


    }
}