package com.example.artem.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.SeekBar;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity {

    Button myBtnClick;
    TextView myTextView;
    SeekBar mySeekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        myBtnClick = findViewById(R.id.button);
        myTextView = findViewById(R.id.textView);
        mySeekBar = findViewById(R.id.seekBar);
        mySeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                myTextView.setText(Integer.toString(i) + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        myBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myTextView.setText("Hello, World!");
            }
        });
    }
    }
