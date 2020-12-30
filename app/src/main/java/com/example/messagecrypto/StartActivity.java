package com.example.messagecrypto;


//THIS IS AN CRYPTOGRAPHY POWERED ANDROID APPLICATION
//IN THIS APPLICATION I WILL BE USING AED,DES,RSA,MD5 TO ENCRYPT AND DECRYPT MESSAGE
//FOR STORING MESSAGE I WILL BE USING FIREBASE
//FOR THIS PROJECT THIS FILE WILL BE THE STARTING FILE
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button btn_register,btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}