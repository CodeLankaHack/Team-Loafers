package com.example.user.poly_glot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalsh);


        // splash screen code //
        Thread myThread = new Thread() {
            @Override
            public void run() {


                try {
                    sleep(3000);
                    //calling the main activity
                    Intent startsplash = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(startsplash);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }

}

