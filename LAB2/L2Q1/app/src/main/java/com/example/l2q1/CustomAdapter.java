package com.example.l2q1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Grocery> arrayList;
    private TextView name;
    private ImageView img;

    public CustomAdapter(Context context, ArrayList<Grocery> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        convertView = LayoutInflater.from(context).inflate(R.layout.vertical_list_grocery_item, parent, false);
        name = convertView.findViewById(R.id.idProductName);
        name.setText(arrayList.get(position).getProductName());
        img =  convertView.findViewById(R.id.idProductImage);
        img.setImageResource(arrayList.get(position).getProductImage());
        return convertView;
    }
}