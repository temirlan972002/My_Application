package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    boolean click = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(buttonClickListener);
    }

    View.OnClickListener buttonClickListener = new View.OnClickListener() {

        public void onClick(View v) {
            if (click) {
                textView.setVisibility(View.VISIBLE);
                click = false;
            } else {
                textView.setVisibility(View.INVISIBLE);
                click = true;
            }
        }
    };
}