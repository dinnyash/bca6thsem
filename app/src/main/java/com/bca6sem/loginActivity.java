package com.bca6sem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.security.auth.login.LoginException;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signUpTv =(TextView) findViewById(R.id.signUpTb);

        EditText emailEt = findViewById(R.id.emailEt);
        EditText passwordEt = findViewById(R.id.passwordEt);

        Button loginBtn= findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(view -> {
                    Intent i = new Intent(loginActivity.this,DisplayActivity.class);
                    i.putExtra("EmailId",emailEt.getText().toString());
                    i.putExtra("password",passwordEt.getText().toString());
                    startActivity(i);
                });

        signUpTv.setOnClickListener(view -> {

            startActivity(new Intent(loginActivity.this, SignUpActivity.class));


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                return true;
            case R.id.share:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}

