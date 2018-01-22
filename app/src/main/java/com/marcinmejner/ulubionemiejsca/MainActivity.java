package com.marcinmejner.ulubionemiejsca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    static ArrayList<String> miejsca = new ArrayList<>();
    static ArrayList<LatLng> lokacje = new ArrayList<>();
    static ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);


        lokacje.add(new LatLng(0,0));
        miejsca.add("Dodaj nowe miejsce...");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, miejsca);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("numerMiejsca", i);
                startActivity(intent);



            }
        });

    }
}
