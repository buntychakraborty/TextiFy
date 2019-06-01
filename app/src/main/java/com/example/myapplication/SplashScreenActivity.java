package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class SplashScreenActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private static int SPLASH_TIME = 2000; //This is 4 seconds
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        getSupportActionBar().hide();
        progressBar.setVisibility(View.VISIBLE);
        //Code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page

                Intent mySuperIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(mySuperIntent);
                /* This 'finish()' is for exiting the app when back button pressed
                 *  from Home page which is ActivityHome
                 */
                finish();

            }
        }, SPLASH_TIME);
    }
}
