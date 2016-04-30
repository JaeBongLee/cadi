package com.example.gingeraebi.navercafe.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gingeraebi.navercafe.R;
import com.example.gingeraebi.navercafe.db.Dao;
import com.example.gingeraebi.navercafe.network.Proxy;
import com.example.gingeraebi.navercafe.vo.Content;

import java.util.List;

public class WriteContentActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText title;
    private EditText name;
    private EditText time;
    private EditText viewCount;
    private EditText content;

    private Button send;

    private Dao dao;


    public class POSTContentsTest extends AsyncTask<Content, Void, Content> {

        @Override
        protected Content doInBackground(Content... params) {
            Proxy proxy = new Proxy();
            Content savedContent = proxy.saveContent(params[0]);
            Log.i("WriteContentActivity", "SavedContent : " + savedContent.toString());
            return savedContent;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_content);

        title = (EditText) findViewById(R.id.editText_writeContent_title);
        name = (EditText) findViewById(R.id.editText_writeContent_name);
        time = (EditText) findViewById(R.id.editText_writeContent_time);
        viewCount = (EditText) findViewById(R.id.editText_writeContent_viewCount);
        content = (EditText) findViewById(R.id.editText_writeContent_content);

        send = (Button) findViewById(R.id.button_writeContent_send);
        send.setOnClickListener(this);
        dao = new Dao(this);
    }

    private Content exportContnet() {
        return new Content(title.getText().toString(), name.getText().toString(),
                time.getText().toString(), viewCount.getText().toString(), content.getText().toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_writeContent_send:
                Intent intent = new Intent(this, ContentListActivity.class);
                Log.i("TEST",content.toString());

                Content content = exportContnet();

                dao.insertContent(content);
                new POSTContentsTest().execute(content);
                startActivity(intent);
                finish();
        }
    }
}
