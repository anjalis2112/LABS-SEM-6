package com.example.l2q1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Grocery> groceryList = new ArrayList<>();
    private EditText et;
    private ListView lv;
    private CustomAdapter adapter;
    private Boolean editable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // add a divider after each item for more clarity
        populategroceryList();
        et = findViewById(R.id.tv);
        lv = findViewById(R.id.lv);
        adapter = new CustomAdapter(this, groceryList);
        et.setEnabled(true);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView <? > myAdapter, View myView, int myItemInt, long mylng)
            {
                String name = ((TextView)myView.findViewById(R.id.idProductName)).getText().toString();
                et.setText(name);
            }

        });


    }

    private void populategroceryList(){
        Grocery potato = new Grocery("Potato", R.drawable.potato);
        Grocery onion = new Grocery("Onion", R.drawable.onion);
        Grocery cabbage = new Grocery("Cabbage", R.drawable.cabbage);
        Grocery cauliflower = new Grocery("Cauliflower", R.drawable.cauliflower);
        Grocery apple = new Grocery("Apple", R.drawable.apple);
        Grocery banana = new Grocery("Banana", R.drawable.banana);
        Grocery pineapple = new Grocery("Pineapple", R.drawable.pineapple);
        Grocery kiwi = new Grocery("Kiwi", R.drawable.kiwi);
        Grocery garlic = new Grocery("Garlic", R.drawable.garlic);
        Grocery tomato = new Grocery("Tomato", R.drawable.tomato);
        Grocery ginger = new Grocery("Ginger", R.drawable.ginger);
        groceryList.add(potato);
        groceryList.add(onion);
        groceryList.add(cabbage);
        groceryList.add(cauliflower);
        groceryList.add(apple);
        groceryList.add(banana);
        groceryList.add(pineapple);
        groceryList.add(kiwi);
        groceryList.add(garlic);
        groceryList.add(tomato);
        groceryList.add(ginger);

        }


}