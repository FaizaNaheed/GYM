package com.example.gym;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class calResult extends AppCompatActivity {
    private ProgressBar pb;
    private int current_progress=0;
    Button button;
    EditText BMIedittext;
    String name,height,weight,age;
int count=0;
    String arr1[]={"WHAT'S YOUR NAME?","WHAT'S YOUR AGE?","WHAT'S YOUR HEIGHT?","WHAT'S YOUR WEIGHT?"};
    String arr2[]={"ENTER YOUR FULL NAME","ENTER YOUR AGE IN ROUND YEARS","HOW TALL ARE YOU ENTER YOUR HEIGHT IN CENTIMETERS(FEET*30.48)","WHATS YOUR WEIGHT IN KG WE NEED TO CALCULATE YOUR BMI"};
    TextView t1,t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_result);
        BMIedittext= findViewById(R.id.bmiEdittext);
        BMIedittext.setText("");
        BMIedittext.getText().clear();

        button = findViewById(R.id.con);
        getSupportActionBar().hide();
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
        BMIedittext = findViewById(R.id.bmiEdittext);
        pb=findViewById(R.id.progress_bar);
        pb.setMax(100);
        //
        t1.setText(arr1[count]);
        t2.setText((arr2[count]));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count == 0) {
                    name = BMIedittext.getText().toString();
                    current_progress = current_progress + 25;
                    count++;
                    t1.setText(arr1[count]);
                    t2.setText((arr2[count]));
                    pb.setProgress(current_progress);
                    BMIedittext.getText().clear();
                }


                else if (count==1) {
                    age = BMIedittext.getText().toString();
                    current_progress = current_progress + 25;
                    count++;
                    t1.setText(arr1[count]);
                    t2.setText((arr2[count]));
                    pb.setProgress(current_progress);
                    BMIedittext.getText().clear();
                }


                else if (count == 2) {
                    height = BMIedittext.getText().toString();

                    current_progress = current_progress + 25;
                    count++;
                    t1.setText(arr1[count]);
                    t2.setText((arr2[count]));
                    pb.setProgress(current_progress);
                    BMIedittext.getText().clear();
                }


                else if (count == 3) {
                    weight = BMIedittext.getText().toString();
                    current_progress = current_progress + 25;
                    t1.setText(arr1[count]);
                    t2.setText((arr2[count]));
                    pb.setProgress(current_progress);
                    count++;
                    BMIedittext.getText().clear();
                }
                else {

                    Toast.makeText(calResult.this, "Click calculate Button", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void ShowResult(View view) {


        SharedPreferences.Editor editor = getSharedPreferences("FitnessZone", MODE_PRIVATE).edit();
        editor.putString("name", name);
        editor.putString("bmi", ""+"35.42");
        editor.putString("calories", ""+"1440");
        editor.putString("firstrun","false");
        editor.apply();




                TextView tname, tbmi, tcal, ttcal;


                final Dialog dialog = new Dialog(calResult.this);
                dialog.setContentView(R.layout.result);
                tname = dialog.findViewById(R.id.ename);
                tbmi = dialog.findViewById(R.id.ebmi);
                tcal = dialog.findViewById(R.id.ecalories);
                ttcal = dialog.findViewById(R.id.etarget);
                tname.setText("" + name);
                tbmi.setText("34.5" + " kg/m2");
                tcal.setText("1234" + "/kcal");
                ttcal.setText("" + (1234 - 340) + "/kcal");
                Button dialogButton = (Button) dialog.findViewById(R.id.mbtn);
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        Intent intent = new Intent(calResult.this, mainMenu.class);




                        startActivity(intent);
                    }
                });
                dialog.show();
            }
}