package com.example.leonardo.guiadebolsoen_us;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ExpList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exp_list);


        ArrayList<Expressions> itens = new ArrayList<Expressions>();

        itens.add(new Expressions(getString(R.string.exp1),getString(R.string.exp111)));
        itens.add(new Expressions(getString(R.string.exp2),getString(R.string.exp22)));
        itens.add(new Expressions(getString(R.string.exp3),getString(R.string.exp33)));
        itens.add(new Expressions(getString(R.string.exp4),getString(R.string.exp44)));
        itens.add(new Expressions(getString(R.string.exp5),getString(R.string.exp55)));
        itens.add(new Expressions(getString(R.string.exp6),getString(R.string.exp66)));
        itens.add(new Expressions(getString(R.string.exp7),getString(R.string.exp77)));
        itens.add(new Expressions(getString(R.string.exp8),getString(R.string.exp88)));
        itens.add(new Expressions(getString(R.string.exp9),getString(R.string.exp99)));
        itens.add(new Expressions(getString(R.string.exp10),getString(R.string.exp101)));
        itens.add(new Expressions(getString(R.string.exp11),getString(R.string.exp1111)));
        itens.add(new Expressions(getString(R.string.exp12),getString(R.string.exp121)));
        itens.add(new Expressions(getString(R.string.exp13),getString(R.string.exp131)));
        itens.add(new Expressions(getString(R.string.exp14),getString(R.string.exp141)));
        itens.add(new Expressions(getString(R.string.exp15),getString(R.string.exp151)));
        itens.add(new Expressions(getString(R.string.exp16),getString(R.string.exp161)));
        itens.add(new Expressions(getString(R.string.exp17),getString(R.string.exp171)));
        itens.add(new Expressions(getString(R.string.exp18),getString(R.string.exp181)));
        itens.add(new Expressions(getString(R.string.exp19),getString(R.string.exp191)));
        itens.add(new Expressions(getString(R.string.exp20),getString(R.string.exp201)));


        final ExpAdapter adapter = new ExpAdapter(this, itens);
        ListView list= findViewById(R.id.expList);
        list.setAdapter(adapter);

    }
}
