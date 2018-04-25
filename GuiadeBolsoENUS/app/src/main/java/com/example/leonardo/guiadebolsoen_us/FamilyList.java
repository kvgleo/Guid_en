package com.example.leonardo.guiadebolsoen_us;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family_list);


        ArrayList<Family> itens = new ArrayList<Family>();

        itens.add(new Family(getString(R.string.fam1),getString(R.string.fam11)));
        itens.add(new Family(getString(R.string.fam2),getString(R.string.fam22)));
        itens.add(new Family(getString(R.string.fam3),getString(R.string.fam33)));
        itens.add(new Family(getString(R.string.fam4),getString(R.string.fam44)));
        itens.add(new Family(getString(R.string.fam5),getString(R.string.fam55)));
        itens.add(new Family(getString(R.string.fam6),getString(R.string.fam66)));
        itens.add(new Family(getString(R.string.fam7),getString(R.string.fam77)));
        itens.add(new Family(getString(R.string.fam8),getString(R.string.fam88)));
        itens.add(new Family(getString(R.string.fam9),getString(R.string.fam99)));
        itens.add(new Family(getString(R.string.fam10),getString(R.string.fam101)));

        final FamilyAdapter adapter = new FamilyAdapter(this, itens);
        ListView list= findViewById(R.id.familyList);
        list.setAdapter(adapter);

    }
}
