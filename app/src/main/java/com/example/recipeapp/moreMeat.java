package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class moreMeat extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;






    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_meat);

        button1 = findViewById(R.id.baka);
        button2 = findViewById(R.id.bulalo);
        button3 = findViewById(R.id.kare);
        button4 = findViewById(R.id.lumpia);
        button5 = findViewById(R.id.afritada);
        button6 = findViewById(R.id.embutido);
        button7 = findViewById(R.id.beeftapa);
        button8 = findViewById(R.id.empanada);
        button9 = findViewById(R.id.inasal);
        button10 = findViewById(R.id.mami);
        button11 = findViewById(R.id.Sch);
        button12 = findViewById(R.id.parmesan);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,Mechado_recipe.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,Bulalo_recipe.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,Bagnet_recipe.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,rollslumpia_recipe.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,afritada_recipe.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,embutido_recipe.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,beef_tafa_recipe.class);
                startActivity(intent);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,inasal_recipe.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,mami_recipe.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,Schnitzel_recipe.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(moreMeat.this,Parmesan_recipe.class);
                startActivity(intent);
            }
        });

    }
}