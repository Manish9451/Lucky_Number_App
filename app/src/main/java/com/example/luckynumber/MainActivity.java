package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView randomNumberTextView = findViewById(R.id.randomNumberTextView);
        Button generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int randomNum = generateRandomNumber(101, 1000);


                // Start the second activity and pass the random number
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("randomNumber", randomNum);
                startActivity(intent);
            }
        });
    }

    private int generateRandomNumber(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt((maxValue - minValue) + 1) + minValue;
}


}


