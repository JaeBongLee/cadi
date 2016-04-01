package com.example.gingeraebi.navercafe.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gingeraebi.navercafe.R;
import com.example.gingeraebi.navercafe.adapter.CafeBoardAdapter;
import com.example.gingeraebi.navercafe.db.Dao;
import com.example.gingeraebi.navercafe.network.Proxy;
import com.example.gingeraebi.navercafe.vo.Content;

import java.util.List;

public class ContentListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private List<Content> contents;

    public class GetContentsTest extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            Proxy proxy = new Proxy();
            List<Content> contents = proxy.getContents();
            for (Content content : contents) {
                Log.i("TEST", content.toString());

            }
            return null;
        }
    }

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

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new GetContentsTest().execute();
            }
        });

        listView = (ListView) findViewById(R.id.listView_listView);

        Dao dao = new Dao(this);

        contents = dao.getContents();

        CafeBoardAdapter cafeBoardAdapter = new CafeBoardAdapter(this, contents);

        listView.setAdapter(cafeBoardAdapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ContentDetailActivity.class);

        Content content = contents.get(position);

        Log.i("ContentListActivity", "id = " + content.toString());
        intent.putExtra("ContentId", content.getId());
        startActivity(intent);
    }
}
