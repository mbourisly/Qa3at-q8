package com.example.qa3atq8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        TextView login = findViewById(R.id.login);
        final EditText email =findViewById(R.id.email);
        final EditText password =findViewById(R.id.pass);
        Button btn = findViewById(R.id.next_btn);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               if (email.getText().toString().equals("fff@gmail")&&password.getText().toString().equals("123456")){
                   Intent i = new Intent(loginPage.this,explorePage.class);
                   startActivity(i);
               }else Toast.makeText(loginPage.this,"WRONG EMAIL OR PASSWORD",Toast.LENGTH_SHORT).show();
             }
         });


}
        }