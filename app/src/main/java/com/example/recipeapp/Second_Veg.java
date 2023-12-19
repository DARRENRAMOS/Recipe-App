package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Veg extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_veg);

        button1 = findViewById(R.id.turta);
        button2 = findViewById(R.id.monggo);
        button3 = findViewById(R.id.kangkong);
        button4 = findViewById(R.id.ubod);
        button5 = findViewById(R.id.okra);
        button6 = findViewById(R.id.Sitaw);
        button7 = findViewById(R.id.caesar);
        button8 = findViewById(R.id.root);
        button9 = findViewById(R.id.roasted);
        button10 = findViewById(R.id.brown);
        button11 = findViewById(R.id.caprese);
        button12 = findViewById(R.id.broccli);
        button13 = findViewById(R.id.creamed);
        button14 = findViewById(R.id.melting);
        button15 = findViewById(R.id.scalloped);
        button16 = findViewById(R.id.candied);
        button17 = findViewById(R.id.vegetables);
        button18 = findViewById(R.id.carrots);
        button19 = findViewById(R.id.fennel);
        button20 = findViewById(R.id.potatoes);
        button21 = findViewById(R.id.eggplant);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, turta_recipe.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, monggo_recipe.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, kangkongrecipe.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, lumpia_recipe.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, okra_recipe.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, sitaw_recipe.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, salad_recipe.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, root_recipe.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, roasted_recipe.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, brown_recipe.class);
                startActivity(intent);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, capre_recipe.class);
                startActivity(intent);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, broccoli_recipe.class);
                startActivity(intent);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, creampeas_recipe.class);
                startActivity(intent);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, melting_recipe.class);
                startActivity(intent);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, corn_recipe.class);
                startActivity(intent);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, candied_recipe.class);
                startActivity(intent);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, R_Vegetables.class);
                startActivity(intent);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, Carrots_recipe.class);
                startActivity(intent);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, Fennel_recipe.class);
                startActivity(intent);
            }
        });


        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, Potatoes_recipe.class);
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Second_Veg.this, Eggplant_recipe.class);
                startActivity(intent);
            }
        });



    }
}