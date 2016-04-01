package com.example.gingeraebi.navercafe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.gingeraebi.navercafe.R;
import com.example.gingeraebi.navercafe.db.Dao;
import com.example.gingeraebi.navercafe.vo.Content;

public class ContentDetailActivity extends AppCompatActivity {

    private int contentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_detail);

        Intent intent = getIntent();
        contentId = intent.getIntExtra("ContentId", 0);

        Dao dao = new Dao(this);
        Content content = dao.getContentById(contentId);
        setViewWithContent(content);

    }

    private void setViewWithContent(Content content) {
        TextView tv_title = (TextView) findViewById(R.id.textView_contentDetail_title);
        TextView tv_name = (TextView) findViewById(R.id.textView_contentDetail_name);
        TextView tv_time = (TextView) findViewById(R.id.textView_contentDetail_time);
        TextView tv_viewCount = (TextView) findViewById(R.id.textView_contentDetail_viewCount);
        TextView tv_content = (TextView) findViewById(R.id.textView_contentDetail_content);

        tv_title.setText("제목          :    " + content.getTitle());
        tv_name.setText("작성자      :    " + content.getName());
        tv_time.setText("작성 시간 :    " + content.getTime());
        tv_viewCount.setText("조회수      :    " + content.getViewCount());
        tv_content.setText(content.getContent());

    }

}
