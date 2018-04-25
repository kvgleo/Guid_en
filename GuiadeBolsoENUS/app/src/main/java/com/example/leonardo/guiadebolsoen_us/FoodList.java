package com.example.leonardo.guiadebolsoen_us;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);


        ArrayList<Food> itens = new ArrayList<Food>();


        itens.add(new Food(getString(R.string.food1), getString(R.string.food11)));
        itens.add(new Food(getString(R.string.food2), getString(R.string.food22)));
        itens.add(new Food(getString(R.string.food3), getString(R.string.food33)));
        itens.add(new Food(getString(R.string.food4), getString(R.string.food44)));
        itens.add(new Food(getString(R.string.food5), getString(R.string.food55)));
        itens.add(new Food(getString(R.string.food6), getString(R.string.food66)));
        itens.add(new Food(getString(R.string.food7), getString(R.string.food77)));
        itens.add(new Food(getString(R.string.food8), getString(R.string.food88)));
        itens.add(new Food(getString(R.string.food9), getString(R.string.food99)));
        itens.add(new Food(getString(R.string.food10), getString(R.string.food101)));




        final FoodAdapter adapter = new FoodAdapter(this,itens);
        ListView list= findViewById(R.id.foodList);
        list.setAdapter(adapter);




        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Food food= (Food) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),food.toString(),Toast.LENGTH_LONG).show();
            }
        });*/
    }
}
