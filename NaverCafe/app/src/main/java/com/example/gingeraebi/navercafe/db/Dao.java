package com.example.gingeraebi.navercafe.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

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


        String sql = "SELECT * FROM content";
        Cursor cursor = db.rawQuery(sql, null);

        while (cursor.moveToNext()) {
            contents.add(getContentFromCursor(cursor));
        }

        cursor.close();

        return contents;
    }

    private Content getContentFromCursor(Cursor cursor) {

        int id = cursor.getInt(0);
        String title = cursor.getString(1);
        String name = cursor.getString(2);
        String time = cursor.getString(3);
        String viewCount = cursor.getString(4);
        String content = cursor.getString(5);

        Content returnConent = new Content(id, title, name, time, viewCount, content);
        Log.i("Dao", returnConent.toString());

        return returnConent;
    }

    public Content getContentById(int id) {
        db = dbHelper.getReadableDatabase();

        String sql = "SELECT * FROM content WHERE _id = " + id;
        Log.i("Dao", sql);
        Cursor cursor = db.rawQuery(sql, null);

        cursor.moveToNext();

        Content content = getContentFromCursor(cursor);

        cursor.close();

        return content;
    }


}
