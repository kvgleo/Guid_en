package com.example.leonardo.guiadebolsoen_us;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         LinearLayout food = findViewById(R.id.ly1);
         food.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, FoodList.class);
                 startActivity(intent);
             }
         });

         LinearLayout numbers = findViewById(R.id.ly2);
         numbers.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, NumbersList.class);
                 startActivity(intent);
             }
         });

         LinearLayout family = findViewById(R.id.ly3);
         family.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, FamilyList.class);
                 startActivity(intent);
             }
         });

         LinearLayout exp = findViewById(R.id.ly4);
         exp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(MainActivity.this, ExpList.class);
                 startActivity(intent);
             }
         });


     }


}
