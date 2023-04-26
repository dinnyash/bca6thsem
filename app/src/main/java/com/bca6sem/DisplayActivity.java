package com.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent i = getIntent();

        TextView emailTv = findViewById(R.id.emailTv);
        TextView passwordTv = findViewById(R.id.passwordTv);
        Button secondBtn = findViewById(R.id.secondBtn);




    }
}