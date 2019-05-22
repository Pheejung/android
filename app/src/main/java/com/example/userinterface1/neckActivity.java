package com.example.userinterface1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class neckActivity extends AppCompatActivity {

    static final String[] List_MENU = {"판피린정", "뇌신", "솔감탕", "종근당염산에페드린정", "자모", "테라싸이클린캡슐250밀리그람(염산테트라싸이클린)",
            "용각산", "종근당염산에페드린정", "푸라콩정", "푸라콩주", "대원아미노필린주사액(아미노필린수화물)", "대원염산에페드린주사액(수출명:에린주사(에페드린염산염))",
            "대한포도액주사액(10%)", "대한포도액주사액(20%)", "대한포도액주사액(5%)", "페니라민주사"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neck);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, List_MENU);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
