package com.example.qa3atq8;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class done_pg extends Activity {
    Dialog mydialog ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done_pg);

        mydialog = new Dialog(this);

    }

    public void Showpopup(View v) {
//        TextView t1;
//        TextView t2;
//        ImageView img;
        mydialog.setContentView(R.layout.done_pg);
        TextView t1 = findViewById(R.id.tv1);
        TextView t2 = findViewById(R.id.tv2);
        ImageView img = findViewById(R.id.img);



//        t1 = (TextView) mydialog.findViewById(R.id.tv1);
//        t2 = (TextView) mydialog.findViewById(R.id.tv2);
//        img = (ImageView) mydialog.findViewById(R.id.img);


        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();

    }
}
