package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText e1,e2,e3;
    Button reg;
    DatabaseInitializer db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           e1 = findViewById(R.id.email);
           e2 = findViewById(R.id.pass);
           e3 = findViewById(R.id.confirmPass);
           reg = findViewById(R.id.register);
           //
           db = new DatabaseInitializer(Login.this);
           reg.setOnClickListener(new View.OnClickListener() {
   @Override
    public void onClick(View v) {
        String email = e1.getText().toString();
        String password = e2.getText().toString();
        String confirmPass = e3.getText().toString();
        if (email.equals("")||password.equals("")||confirmPass.equals("")){
            Toast.makeText(getApplicationContext(),"Fields can`t be empty",Toast.LENGTH_LONG).show();
        }else {
        if (!password.equals(confirmPass)) {
            Toast.makeText(getApplicationContext(), "Your Passwords don`t match", Toast.LENGTH_LONG).show();
        }else{
            Boolean checkemail = db.checkemail(email);
        if (checkemail==true){
            Boolean insert = db.insert(email,password);
        if (insert==true){
            Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
            }
               }
             }
           }

         }
        });

    }

        }
