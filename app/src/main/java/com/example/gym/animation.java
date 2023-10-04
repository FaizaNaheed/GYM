package com.example.gym;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class animation extends AppCompatActivity {
    AnimationDrawable animation;
    AppCompatButton but;
    ImageView iv;
    TextView tv;
    long counter=0;
    String PreviousActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_animation);
        // to receive previous data
        Intent intent = getIntent();
        PreviousActivity = intent.getStringExtra("PA");

        Toast.makeText(this, ""+PreviousActivity, Toast.LENGTH_SHORT).show();

 iv=findViewById(R.id.an1);
        but=findViewById(R.id.con);
        LoadAnimation();

    }
    public void add(View view)
    {
        counter=counter+1;
        tv.setText(""+counter);
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        animation.start();}




    public void LoadAnimation()
    {
      if(PreviousActivity.equals("1"))
      {
    iv.setBackgroundResource(R.drawable.animation1);
  animation=(AnimationDrawable) iv.getBackground();
    animation.start();

      }
      if (PreviousActivity.equals("2"))
      {
          iv.setBackgroundResource(R.drawable.butt_bridge);
          animation=(AnimationDrawable) iv.getBackground();
          animation.start();
      }
        if (PreviousActivity.equals("3"))
        {
            iv.setBackgroundResource(R.drawable.clapping_crunches);
            animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("4"))
        {
            iv.setBackgroundResource(R.drawable.cross_arm_crunches);
            animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("5"))
        {
            iv.setBackgroundResource(R.drawable.dead_bug);
           animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("6"))
        {
            iv.setBackgroundResource(R.drawable.flutter_kicks);
            animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("7"))
        {
            iv.setBackgroundResource(R.drawable.leg_drop);
         animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("8"))
        {
            iv.setBackgroundResource(R.drawable.long_arm_crunches);
          animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("9"))
        {
            iv.setBackgroundResource(R.drawable.mountain_climbers);
           animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("10"))
        {
            iv.setBackgroundResource(R.drawable.bent_leg_twist);
            animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("11"))
        {
            iv.setBackgroundResource(R.drawable.reclined_oblique_twist);
           animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("12"))
        {
            iv.setBackgroundResource(R.drawable.reverse_crunches);
           animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("13"))
        {
            iv.setBackgroundResource(R.drawable.side_leg_raise_left);
           animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("14"))
        {
            iv.setBackgroundResource(R.drawable.side_leg_raise_right);
            animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("15"))
        {
            iv.setBackgroundResource(R.drawable.swimmer_superman);
           animation=(AnimationDrawable) iv.getBackground();
        }
        if (PreviousActivity.equals("16"))
        {
            iv.setBackgroundResource(R.drawable.trunk_rotation);
            animation=(AnimationDrawable) iv.getBackground();
        }


    }



}