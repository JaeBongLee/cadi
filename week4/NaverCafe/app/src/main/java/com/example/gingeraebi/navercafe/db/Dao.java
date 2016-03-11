package com.example.gingeraebi.navercafe.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.gingeraebi.navercafe.vo.Content;

import java.util.ArrayList;

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

    public ArrayList<Content> getContents() {
        return null;
    }


}
