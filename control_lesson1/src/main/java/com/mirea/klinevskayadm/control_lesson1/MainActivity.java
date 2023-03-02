package com.mirea.klinevskayadm.control_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonSave;
    TextView textSave;
    Button buttonSecond;

    TextView textPush;
    int count = 0;

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSave = findViewById(R.id.buttonSave);
        buttonSecond = findViewById(R.id.secondButton);
        textSave = findViewById(R.id.textSave);
        textPush = findViewById(R.id.textPush);
        checkBox = findViewById(R.id.checkBox);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSave.setText("OLEG нажал кнопку");
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                count += 1;
                if (count % 2 == 1) {
                    textPush.setText("нажат");
                } else {
                    textPush.setText("Не нажат");

                }
            }
        });

    }
    public void goSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


}