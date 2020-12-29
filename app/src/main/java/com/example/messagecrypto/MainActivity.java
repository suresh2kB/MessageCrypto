package com.example.messagecrypto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    Button btn_varify;
    TextView text_varify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_varify = findViewById(R.id.btn_varify);
        text_varify = findViewById(R.id.text_varify);

        auth = FirebaseAuth.getInstance();
        final FirebaseUser firebaseUser = auth.getCurrentUser();

        if(!firebaseUser.isEmailVerified())
        {
            btn_varify.setVisibility(View.VISIBLE);
            text_varify.setVisibility(View.VISIBLE);

            btn_varify.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!firebaseUser.isEmailVerified()) {
                        firebaseUser.sendEmailVerification()
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Toast.makeText(MainActivity.this, "An Email has been sent for verify your account", Toast.LENGTH_SHORT).show();
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, "Some thing went wrong", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }
            });
        }
    }
}