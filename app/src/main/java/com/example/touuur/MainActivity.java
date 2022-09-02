package com.example.touuur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Button button5 = (Button)findViewById(R.id.button5);
        //button5.setOnClickListener(this);

        //Button button3 = (Button)findViewById(R.id.button3);
        //button3.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }



    public void onClick1(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void onClick4(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void onClick5(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void onClick6(View view) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
    public void onClick7(View view) {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }


}

