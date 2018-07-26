package com.mehedihasanbangladeshi.iiuc.sdmagp.androidonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, buttonLeft, buttonMiddle, buttonRight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);

        button2 = findViewById(R.id.btn2);

        buttonLeft = findViewById(R.id.btn3l);
        buttonMiddle = findViewById(R.id.btn3m);
        buttonRight = findViewById(R.id.btn3r);

        buttonLeft.setOnClickListener(this);
        buttonMiddle.setOnClickListener(this);
        buttonRight.setOnClickListener(this);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setText(R.string.button_2_text);
                button2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            }
        });


    }


    public void btn1Clicked(View v) {

        button1.setText(R.string.button_1_text);
        button1.setBackgroundColor(getResources().getColor(R.color.colorAccent));

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn3l:
                   Toast.makeText(MainActivity.this,"Left",Toast.LENGTH_SHORT).show();

                break;

            case R.id.btn3m:
                Toast.makeText(MainActivity.this,"Middle",Toast.LENGTH_SHORT).show();

                break;

            case R.id.btn3r:
                Toast.makeText(MainActivity.this,"Right",Toast.LENGTH_SHORT).show();

                break;


        }


    }
}

