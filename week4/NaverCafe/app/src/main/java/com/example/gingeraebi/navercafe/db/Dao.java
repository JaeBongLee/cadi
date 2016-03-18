package com.example.gingeraebi.navercafe.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.gingeraebi.navercafe.vo.Content;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GingerAebi on 2016. 3. 11..
 */
public class Dao {
    private Context context;
    private CafeDBHelper dbHelper;
    private SQLiteDatabase db;
    private ContentValues row;


    public Dao(Context context) {
        this.context = context;
        dbHelper = new CafeDBHelper(context);
    }

    public void insertContent(Content content) {
        db = dbHelper.getWritableDatabase();
        row = new ContentValues();

        row.put("title", content.getTitle());
        row.put("name", content.getName());
        row.put("time", content.getTime());
        row.put("view_count", content.getViewCount());
        row.put("content", content.getContent());

        db.insert("content", null, row);

    }

    public List<Content> getContents() {
        db = dbHelper.getReadableDatabase();

        List<Content> contents = new ArrayList<>();

        String title;
        String name;
        String time;
        String viewCount;
        String content;

        String sql = "SELECT * FROM content";
        Cursor cursor = db.rawQuery(sql,null);

        while(cursor.moveToNext()) {
            title = cursor.getString(1);
            name = cursor.getString(2);
            time = cursor.getString(3);
            viewCount = cursor.getString(4);
            content = cursor.getString(5);

            contents.add(new Content(title,name,time,viewCount,content));
        }

        cursor.close();

        return contents;
    }


}
