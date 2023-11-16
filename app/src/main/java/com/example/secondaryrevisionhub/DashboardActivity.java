package com.example.secondaryrevisionhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        CardView exit = findViewById(R.id.cardExit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });

        CardView FormOne = findViewById(R.id.cardFormOne);
        FormOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, FormOneActivity.class));
            }
        });

        CardView FormTwo = findViewById(R.id.cardFormTwo);
        FormTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, FormTwoActivity.class));
            }
        });

        CardView FormThree = findViewById(R.id.cardFormThree);
        FormThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, FormThreeActivity.class));
            }
        });

        CardView FormFour = findViewById(R.id.cardFormFour);
        FormFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, FormFourActivity.class));
            }
        });

        CardView About = findViewById(R.id.cardAbout);
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AboutActivity.class));
            }
        });

    }
}