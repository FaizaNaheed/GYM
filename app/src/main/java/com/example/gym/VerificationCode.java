package com.example.gym;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class VerificationCode extends AppCompatActivity {

    AppCompatButton but2;
    EditText myEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code);
         myEditText = findViewById(R.id.myEditText);
        myEditText.setText("");
        myEditText.getText().clear();
        getSupportActionBar().hide();
        but2=findViewById(R.id.con2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VerificationCode.this,MaleFemale.class);
                startActivity(intent);

            }
        });
    }
}