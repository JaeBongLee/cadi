package com.example.gingeraebi.navercafe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gingeraebi.navercafe.R;
import com.example.gingeraebi.navercafe.adapter.CafeBoardAdapter;
import com.example.gingeraebi.navercafe.vo.Content;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WriteContentActivity.class);
                startActivity(intent);
            }
        });


        listView = (ListView) findViewById(R.id.listView_listView);

        ArrayList<Content> contents = new ArrayList<>();
        contents.add(new Content("게시글 제목 1", "4기 이재봉", "12 : 30", "0"));
        contents.add(new Content("게시글 제목 2", "3기 이재봉", "11 : 30", "0"));
        contents.add(new Content("게시글 제목 3", "2기 이재봉", "10 : 30", "0"));

        CafeBoardAdapter cafeBoardAdapter = new CafeBoardAdapter(this, contents);

        listView.setAdapter(cafeBoardAdapter);

    }

}
