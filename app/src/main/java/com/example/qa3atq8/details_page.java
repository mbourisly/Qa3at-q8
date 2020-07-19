package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class details_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        TextView dt = findViewById(R.id.details);
        Button b = findViewById(R.id.backButton);
        ImageView im = findViewById(R.id.userimage1);
        final EditText un = findViewById(R.id.username);
        final EditText fn = findViewById(R.id.firstname);
        final EditText ln = findViewById(R.id.lastname);
        final EditText pn = findViewById(R.id.phonenumber);
        Button s = findViewById(R.id.submit);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (un.getText().toString().equals("AhmadM")&&fn.getText().toString().equals("Ahmad")&&
                ln.getText().toString().equals("Mohd")&&pn.getText().toString().equals("12345678")){
                    Intent i = new Intent(details_page.this,profile.class);
                    startActivity(i);

                }else Toast.makeText(details_page.this,"Invalid phone number",Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(details_page.this,profile.class);
                startActivity(i);
            }
        });

    }
}