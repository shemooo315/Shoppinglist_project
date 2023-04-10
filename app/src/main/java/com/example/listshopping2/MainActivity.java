package com.example.listshopping2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListView listView2;
    sectionadapter section_adapter;
    sectionadapter section_adapter2;
    ArrayList<datasectionmodel> info;
    ArrayList<datasectionmodel> info2;
    //app:layout_constraintVertical_bias="0.266"
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_categories);
        listView2=findViewById(R.id.list2_categories);
        info=new ArrayList<>();
        info2=new ArrayList<>();
        info.add(new datasectionmodel("Bags",R.drawable.bags,"200$"));
        info.add(new datasectionmodel("Berfums",R.drawable.berfums,"500$"));
        info.add(new datasectionmodel("Blovars",R.drawable.blovars,"207$"));
        info2.add(new datasectionmodel("Dresses",R.drawable.dresses,"600$"));
        info2.add(new datasectionmodel("Eats",R.drawable.vegata,"245$"));
        info2.add(new datasectionmodel("Heels",R.drawable.heels,"444$"));

        section_adapter= new sectionadapter(MainActivity.this,info);
        listView.setAdapter(section_adapter);

        section_adapter2= new sectionadapter(MainActivity.this,info2);
        listView2.setAdapter(section_adapter2);
    }
}