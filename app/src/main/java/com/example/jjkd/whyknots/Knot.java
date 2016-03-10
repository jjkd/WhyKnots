package com.example.jjkd.whyknots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * Created by jjkd on 3/9/2016.
 */
public class Knot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knot);                          // set new view in place
        int value = getIntent().getExtras().getInt("knot");     // find out which button was pushed
        TextView tv = (TextView) findViewById(R.id.knottext);  // must do this after setting new view in place

        switch(value) {

            case R.id.button1:
            case R.id.buttonsquare:
                tv.setText("Square: ");
                break;

            case R.id.button2:
            case R.id.buttontwohalf:
                tv.setText("Two Half Hitches: ");
                break;

            case R.id.button3:
            case R.id.buttonsheet:
                tv.setText("Sheet Bend: ");
                break;

            case R.id.button4:
            case R.id.buttonbowline:
                tv.setText("Bowline: ");
                break;

            case R.id.button5:
            case R.id.buttontaut:
                tv.setText("Taut-Line Hitch: ");
                break;

            case R.id.button6:
            case R.id.buttonclove:
                tv.setText("Clove Hitch: ");
                break;

            default:

                break;

        }


    }
}
