package com.example.jjkd.whyknots;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invokeButton(View view) {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }

    public void invokeButtonK(View view) {
        int button = view.getId();
        Intent intent = new Intent(this, Knot.class);
        intent.putExtra("knot", button);
        startActivity(intent);
    }
    public void invokeButton1(View view) {

    }

    public void invokeButton2(View view) {

    }

    public void invokeButton3(View view) {

    }

    public void invokeButton4(View view) {

    }

    public void invokeButton5(View view) {

    }

    public void invokeButton6(View view) {

    }
}
