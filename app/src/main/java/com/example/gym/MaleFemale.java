package com.example.gym;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MaleFemale extends AppCompatActivity {
    CardView Male,Female;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_female);
        getSupportActionBar().hide();
        Male=findViewById(R.id.male);
        Female=findViewById(R.id.female);

        // get data from shared pref
        SharedPreferences sharedPreferences = getSharedPreferences("FitnessZone", MODE_PRIVATE);
        String firstrun = sharedPreferences.getString("firstrun","true");
        if(firstrun.equals("false"))
        {
            startActivity( new Intent(MaleFemale.this,mainMenu.class));
        }


        Male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MaleFemale.this,calResult.class);
                startActivity(intent);

            }
        });
        Female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MaleFemale.this,calResult.class);
                startActivity(intent);

            }
        });
    }
}