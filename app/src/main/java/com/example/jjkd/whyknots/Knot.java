package com.example.jjkd.whyknots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
        TextView tv = (TextView) findViewById(R.id.knottext);       // must do this after setting new view in place
        ImageView img= (ImageView) findViewById(R.id.knotimage);    // and get handle for imageview after as well

        switch(value) {

            case R.id.button1:                                  //  do the same thing for both the
            case R.id.buttonsquare:                             //  text and image buttons
                tv.setText("Square: ");
                img.setImageResource(R.drawable.square);
                break;

            case R.id.button2:
            case R.id.buttontwohalf:
                tv.setText("Two Half Hitches: ");
                img.setImageResource(R.drawable.twohalf);
                break;

            case R.id.button3:
            case R.id.buttonsheet:
                tv.setText("Sheet Bend: ");
                img.setImageResource(R.drawable.sheetbend);
                break;

            case R.id.button4:
            case R.id.buttonbowline:
                tv.setText("Bowline: ");
                img.setImageResource(R.drawable.bowline);
                break;

            case R.id.button5:
            case R.id.buttontaut:
                tv.setText("Taut-Line Hitch: ");
                img.setImageResource(R.drawable.tautlinehitch);
                break;

            case R.id.button6:
            case R.id.buttonclove:
                tv.setText("Clove Hitch: ");
                img.setImageResource(R.drawable.clovehitch);
                break;

            default:

                break;

        }


    }
}
