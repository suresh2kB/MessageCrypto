package com.example.messagecrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangeActivity extends AppCompatActivity {

    Button btn_aes,btn_des,btn_rsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);
        btn_aes = findViewById(R.id.AES);
        btn_des = findViewById(R.id.DES);
        btn_rsa = findViewById(R.id.RSA);

        btn_aes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChangeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }


}