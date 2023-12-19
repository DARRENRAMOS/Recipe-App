package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Second_Meat extends AppCompatActivity {

   ImageView imgv;
   Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;

    Button btn7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_meat);

        imgv = (ImageView)  findViewById(R.id.imageView);

        btn1 = findViewById(R.id.adobong);
        btn2 = findViewById(R.id.curry);
        btn3 = findViewById(R.id.sisig);
        btn4 = findViewById(R.id.belly);
        btn5 = findViewById(R.id.menudo);
        btn6 = findViewById(R.id.kalderita);
        btn7 = findViewById(R.id.more);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, adoborecipe.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, curry_recipe.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, sisigrecipe.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, belly_recipe.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, menudo_recipe.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, kaldereta_recipe.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Meat.this, moreMeat.class);
                startActivity(intent);
            }
        });

    }
}