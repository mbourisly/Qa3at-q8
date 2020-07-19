package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.LinearInterpolator;

import com.agrawalsuneet.dotsloader.loaders.TashieLoader;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {
    TashieLoader tashieLoader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tashieLoader =(TashieLoader)findViewById(R.id.loadingbar);

        TashieLoader tashie = new TashieLoader(
                this, 5,
                30, 10,
                ContextCompat.getColor(this, R.color.green));

        tashie.setAnimDuration(500);
        tashie.setAnimDelay(100);
        tashie.setInterpolator(new LinearInterpolator());

        tashieLoader.addView(tashie);

        Handler h = new Handler(getMainLooper());
        final Runnable r = new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this,loginPage.class);
                startActivity(i);

            }
        };
         h.postDelayed(r,5000);


    }
}