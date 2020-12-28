package com.example.messagecrypto;


//THIS IS AN CRYPTOGRAPHY POWERED ANDROID APPLICATION
//IN THIS APPLICATION I WILL BE USING AED,DES,RSA,MD5 TO ENCRYPT AND DECRYPT MESSAGE
//FOR STORING MESSAGE I WILL BE USING FIREBASE
//FOR THIS PROJECT THIS FILE WILL BE THE STARTING FILE
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
}