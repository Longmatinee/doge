package com.example.matinee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloDogeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloDogeView = (TextView)findViewById(R.id.textView);
    }

    public void onClick(View view) {
        mHelloDogeView.setText("Hello Doge!");
    }
}
