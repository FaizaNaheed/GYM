package com.example.gym;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class food extends AppCompatActivity {
    TextView tbreakfast,tlunch,tdinner,tsnacks;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        getSupportActionBar().hide();
        tbreakfast=findViewById(R.id.breakfast);
        tlunch=findViewById(R.id.lunch);
        tdinner=findViewById(R.id.dinner);
        tsnacks=findViewById(R.id.snacks);

            tbreakfast.setText("2 Brown Bread 2-3\nEgg Omelette(Without yolk)\n1 Cup Juice (200 - 300 ml, No sugar");
            tlunch.setText("3-4 Pieces of baked fish\nand salad");
            tdinner.setText("A bowl of small serving of White\nBrown rice with Lentil\ncurry");
            tsnacks.setText("Vegetable Soup\nor Lentil\nor Bean Soup (200-300 gram)");


    }


}