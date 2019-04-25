package com.example.tahminaakhtar.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView listView;
    private RecyclerView gridView;


    private ListViewAdapter listViewAdapter;

    private GridViewAdapter gridViewAdapter;


    private ArrayList<RecyclerViewItem> laptop;
    private ArrayList<RecyclerViewItem> Company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (RecyclerView) findViewById(R.id.list);
        gridView = (RecyclerView) findViewById(R.id.grid);

        setDummyData();
        listView.setHasFixedSize(true);
        gridView.setHasFixedSize(true);

        //set layout manager and adapter for "ListView"
        LinearLayoutManager horizontalManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        listView.setLayoutManager(horizontalManager);


        listViewAdapter = new ListViewAdapter(this, laptop);
        listView.setAdapter(listViewAdapter);

        //set layout manager and adapter for "GridView"
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        gridView.setLayoutManager(layoutManager);


        gridViewAdapter = new GridViewAdapter(this, Company);
        gridView.setAdapter(gridViewAdapter);

    }

    private void setDummyData() {
        laptop = new ArrayList<>();
        laptop.add(new RecyclerViewItem(R.drawable.imageone, "Microsoft","Model 1"));
        laptop.add(new RecyclerViewItem(R.drawable.imagetwo, "Apple","Model 2"));
        laptop.add(new RecyclerViewItem(R.drawable.imagethree, "Google","Model 3"));
        laptop.add(new RecyclerViewItem(R.drawable.imagefour, "Oracle","Model 4"));
        laptop.add(new RecyclerViewItem(R.drawable.imagefive, "Yahoo","Model 5"));
        laptop.add(new RecyclerViewItem(R.drawable.imagesix, "Mozilla","Model 6"));

        Company = new ArrayList<>();
        Company.add(new RecyclerViewItem(R.drawable.imageone, "BlackBerry OS","Model 1"));
        Company.add(new RecyclerViewItem(R.drawable.imagetwo, "iOS","Model 2"));
        Company.add(new RecyclerViewItem(R.drawable.imagethree, "Tizen","Model 3"));
        Company.add(new RecyclerViewItem(R.drawable.imagefour, "Android","Model 4"));
        Company.add(new RecyclerViewItem(R.drawable.imagefive, "Symbian","Model 5"));
        Company.add(new RecyclerViewItem(R.drawable.imagesix, "Firefox OS","Model 6"));
    }
}