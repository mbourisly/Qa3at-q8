package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class halls_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halls_activity);

        ArrayList<halls> myhalls = new ArrayList<>();

        halls h1 = new halls("Sheraton",5,R.drawable.w_image4,"Kuwait city street 1 block 2","2000m");
        halls h2 = new halls("Sas",4,R.drawable.w_image2,"Hawally street 1 block 2","1000m");
        halls h3 = new halls("JW",5,R.drawable.w_image3,"Salmiya street 7 block 4","2300m");
        halls h4 = new halls("JW marriott",3,R.drawable.w_image6,"Kuwait city street 1 block 2","1500m");
        halls h5 = new halls("Marina",2,R.drawable.w_image5,"Marina street 6 block 2","2000m");
        halls h6 = new halls("Al kout",5,R.drawable.w_image1,"Alkout street 1 block 2","3000m");

        myhalls.add(h1);
        myhalls.add(h2);
        myhalls.add(h3);
        myhalls.add(h4);
        myhalls.add(h5);
        myhalls.add(h6);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);


        hallsAdapter adapter = new hallsAdapter(myhalls,this);
        rv.setAdapter(adapter);

    }
}