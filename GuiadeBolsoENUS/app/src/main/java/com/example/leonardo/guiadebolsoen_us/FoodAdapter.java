package com.example.leonardo.guiadebolsoen_us;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {

    public FoodAdapter(@NonNull Context context, @NonNull List<Food> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.lista,parent,false);
        }

        Food current = getItem(position);

        TextView nome =  listItemView.findViewById(R.id.txtNome);
        TextView desc =  listItemView.findViewById(R.id.txtDesc);

        nome.setText(current.getNome().toString());
        desc.setText(current.getDesc().toString());

        return  listItemView;
    }
}

