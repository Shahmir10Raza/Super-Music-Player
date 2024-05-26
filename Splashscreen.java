package com.example.srmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        setContentView(R.layout.activity_splashscreen);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView version = findViewById(R.id.version);

        String ver = BuildConfig.VERSION_NAME;

        version.setText(ver);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.ZoomIn).duration(400).playOn(findViewById(R.id.textView));
            }
        }, 2200);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView2.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.ZoomIn).duration(400).playOn(findViewById(R.id.textView));
            }
        }, 2600);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3200);
    }
}
