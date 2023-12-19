package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class Second_SEA extends AppCompatActivity {
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
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_sea);

        button1 = findViewById(R.id.shirmp);
        button2 = findViewById(R.id.alimasag);
        button3 = findViewById(R.id.pusit);
        button4 = findViewById(R.id.hipon);
        button5 = findViewById(R.id.dilis);
        button6 = findViewById(R.id.tahong);
        button7 = findViewById(R.id.padthai);
        button8 = findViewById(R.id.blackened);
        button9 = findViewById(R.id.tuna);
        button10 = findViewById(R.id.lobster);
        button11 = findViewById(R.id.ceviche);
        button12 = findViewById(R.id.scampi);
        button13 = findViewById(R.id.coconot);
        button14 = findViewById(R.id.fish);
        button15 = findViewById(R.id.sheet);
        button16 = findViewById(R.id.seafood);
        button17 = findViewById(R.id.firecracker);
        button18 = findViewById(R.id.garlic);
        button19 = findViewById(R.id.polenta);
        button20 = findViewById(R.id.chiles);
        button21 = findViewById(R.id.butter);
        button22 = findViewById(R.id.boil);
        button23 = findViewById(R.id.cioppino);
        button24 = findViewById(R.id.sushibowl);
        button25 = findViewById(R.id.sticks);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, srimp_recipe.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, alimasag_recipe.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, pusit_rrecipe.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, hipon_recipe.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, dilis_recipe.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, tahong_recipe.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, padthai_recipe.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, bowls_recipe.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, spicyTuna_recipe.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, lobster_recipe.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, ceviche_recipe.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, scampi_recipe.class);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, coconut_recipe.class);
                startActivity(intent);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, fishTacus_recipe.class);
                startActivity(intent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, sheet_pam_recipe.class);
                startActivity(intent);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, SeaFoods_recipe.class);
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, firecacker_recipe.class);
                startActivity(intent);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, garlic_recipe.class);
                startActivity(intent);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Polenta_recipe.class);
                startActivity(intent);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Chilis_recipe.class);
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Butter_recipe.class);
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Crab_boils_recipe.class);
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Cioppinos_recipe.class);
                startActivity(intent);
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Sushi_Bowls_recipe.class);
                startActivity(intent);
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_SEA.this, Stick_recipe.class);
                startActivity(intent);
            }
        });
    }
}