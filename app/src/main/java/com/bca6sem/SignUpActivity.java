package com.bca6sem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView signup=(TextView) findViewById(R.id.signup);
        signup.setText("Login");

        Button signupBtn = findViewById(R.id.signUpBtn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Long click","this is long click");

            }
        });

        TextView logInTb = (TextView) findViewById(R.id.logInTb);
        logInTb.setOnClickListener(view -> {
            startActivity(new Intent(SignUpActivity.this, loginActivity.class));

        });
    }
}