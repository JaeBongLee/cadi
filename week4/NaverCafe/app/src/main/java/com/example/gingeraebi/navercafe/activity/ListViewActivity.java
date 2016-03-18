package com.example.gingeraebi.navercafe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.gingeraebi.navercafe.R;
import com.example.gingeraebi.navercafe.adapter.CafeBoardAdapter;
import com.example.gingeraebi.navercafe.db.Dao;
import com.example.gingeraebi.navercafe.vo.Content;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WriteContentActivity.class);
                startActivity(intent);
            }
        });


        listView = (ListView) findViewById(R.id.listView_listView);

        Dao dao = new Dao(this);

        List<Content> contents = dao.getContents();

        CafeBoardAdapter cafeBoardAdapter = new CafeBoardAdapter(this, contents);

        listView.setAdapter(cafeBoardAdapter);

    }

}
