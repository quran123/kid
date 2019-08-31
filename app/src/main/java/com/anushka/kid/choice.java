package com.anushka.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choice extends Activity {
    Button b1,b2,b3,b4,b5;
    Intent i;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.choice);
//        b1=(Button) findViewById(R.id.alpha);
//        b2=(Button) findViewById(R.id.num);
//        b3=(Button) findViewById(R.id.col);
//        b4=(Button) findViewById(R.id.rel);
//        b5=(Button) findViewById(R.id.conv);
//    }
//    public void onClick(View v) {
//        final int id = v.getId();
//        switch (id) {
//            case R.id.alpha:
//                i=new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(i);
//                break;
//            case R.id.button2:
//                //button2.setText("You clicked on Button 2");
//                break;
//            case R.id.button3:
//                //button3.setText("You clicked on Button 3");
//                break;
//            case R.id.button4:
//                //button4.setText("You clicked on Button 4");
//                break;
//            case R.id.button5:
//                //button5.setText("You clicked on Button 5");
//                break;
//        }
    }
}
