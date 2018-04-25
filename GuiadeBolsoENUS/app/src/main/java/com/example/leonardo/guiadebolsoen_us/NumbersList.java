package com.example.leonardo.guiadebolsoen_us;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numbers_list);


        ArrayList<Numbers> itens = new ArrayList<Numbers>();

        itens.add(new Numbers(getString(R.string.nb1),getString(R.string.nb11)));
        itens.add(new Numbers(getString(R.string.nb2),getString(R.string.nb22)));
        itens.add(new Numbers(getString(R.string.nb3),getString(R.string.nb33)));
        itens.add(new Numbers(getString(R.string.nb4),getString(R.string.nb44)));
        itens.add(new Numbers(getString(R.string.nb5),getString(R.string.nb55)));
        itens.add(new Numbers(getString(R.string.nb6),getString(R.string.nb66)));
        itens.add(new Numbers(getString(R.string.nb7),getString(R.string.nb77)));
        itens.add(new Numbers(getString(R.string.nb8),getString(R.string.nb88)));
        itens.add(new Numbers(getString(R.string.nb9),getString(R.string.nb99)));
        itens.add(new Numbers(getString(R.string.nb10),getString(R.string.nb101)));



        final NumbersAdapter adapter = new NumbersAdapter(this,itens);
        ListView list= findViewById(R.id.numbersList);
        list.setAdapter(adapter);

    }
}
