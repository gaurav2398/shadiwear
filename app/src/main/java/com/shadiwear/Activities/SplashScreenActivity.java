package com.shadiwear.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.shadiwear.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent goToLoginIntent = new Intent(SplashScreenActivity.this,HomeActivity.class );
                startActivity(goToLoginIntent);
                finish();
            }
        }, 500);
    }
}
