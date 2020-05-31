package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText user1=(EditText) findViewById(R.id.editTextTextEmailAddress);
    EditText usp=(EditText) findViewById(R.id.editTextTextPassword);
    Intent myintent=new Intent(this,MainActivity2.class);
}