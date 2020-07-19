package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class halls_details extends AppCompatActivity {
    Spinner spinnerExample;
    int currntItem = 0;
   // Context c;

  //  public halls_details(Spinner spinnerExample, int currntItem, Context c) {
     //   this.spinnerExample = spinnerExample;
      //  this.currntItem = currntItem;
       // this.c = c;
    //}

//    public halls_details(int contentLayoutId, Spinner spinnerExample, int currntItem, Context c) {
//        super(contentLayoutId);
//        this.spinnerExample = spinnerExample;
//        this.currntItem = currntItem;
//        this.c = c;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halls_details);

        spinnerExample = (Spinner)findViewById(R.id.spinner);
        spinnerExample.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (currntItem == position){


                   Intent i = new Intent(halls_details.this,done_pg.class);
                   startActivity(i);
                }else{
                    Intent i = new Intent(halls_details.this,SecondActivity.class);
                    startActivity(i);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Bundle b = getIntent().getExtras();
        halls h = (halls) b.getSerializable("halls");

        Button bb = findViewById(R.id.backButton);
        ImageView i = findViewById(R.id.imageView2);
        TextView nam = findViewById(R.id.thenameof);
        TextView lo = findViewById(R.id.location);
        TextView l = findViewById(R.id.loca);
        TextView g = findViewById(R.id.google);
        TextView sp = findViewById(R.id.space);
        TextView s = findViewById(R.id.spc);
        TextView r = findViewById(R.id.rating);
        RatingBar rb = findViewById(R.id.ratingBar);

        nam.setText(h.getName());
        l.setText(h.getLocation());
        s.setText(h.getSpace()+"");
        i.setImageResource(h.getImage());
        rb.setNumStars(5);


        (findViewById(R.id.google)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://bit.ly/2OFJYv6";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent u = new Intent(halls_details.this,halls_activity.class);
              startActivity(u);
            }
        });




    }
}