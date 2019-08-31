package com.anushka.kid;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;
import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Intent in;
    ImageView i;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar t=(Toolbar)findViewById(R.id.toolbar2);
            t.setTitle("Number");
            t.setTitleTextColor(getResources().getColor(R.color.colorPrimary));
           //setSupportActionBar(t);
        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        i=(ImageView)findViewById(R.id.img);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                Log.e(TAG, "onClick: 1");
                i.setImageDrawable(getResources().getDrawable(R.drawable.one));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.one);
                mp.start();
               }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.two));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.two);
                mp.start();
                Log.e(TAG, "onClick: 2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.three));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.three);
                mp.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.four));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.four);
                mp.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.five));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.five);
                mp.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.six));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.six);
                mp.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.seven));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.seven);
                mp.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.eight));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.eight);
                mp.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.nine));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.nine);
                mp.start();
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // here you can add functions
                i.setImageDrawable(getResources().getDrawable(R.drawable.zero));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.zero);
                mp.start();
            }
        });
    }}