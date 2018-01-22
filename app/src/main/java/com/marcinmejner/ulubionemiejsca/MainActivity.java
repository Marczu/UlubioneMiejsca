package com.marcinmejner.ulubionemiejsca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        final ArrayList<String> miejsca = new ArrayList<>();
        miejsca.add("Dodaj nowe miejsce...");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, miejsca);

    }
}
