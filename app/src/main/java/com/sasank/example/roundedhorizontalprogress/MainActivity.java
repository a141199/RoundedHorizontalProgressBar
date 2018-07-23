package com.sasank.example.roundedhorizontalprogress;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sasank.roundedhorizontalprogress.RoundedHorizontalProgressBar;

public class MainActivity extends AppCompatActivity {
    private RoundedHorizontalProgressBar mRoundedHorizontalProgressBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoundedHorizontalProgressBar4 = (RoundedHorizontalProgressBar) findViewById(R.id.progress_bar_4);

        mRoundedHorizontalProgressBar4.animateProgress(1000, 0, 40);
    }
}
