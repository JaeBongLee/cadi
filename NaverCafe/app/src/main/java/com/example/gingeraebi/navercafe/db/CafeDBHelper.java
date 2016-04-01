package com.example.gingeraebi.navercafe.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by GingerAebi on 2016. 3. 11..
 */
public class CafeDBHelper extends SQLiteOpenHelper {
    public CafeDBHelper(Context context) {
        super(context, "CafeDB.db", null, 1);
    }

    //처음 DB를 실행할 때 실행된다.
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE content(_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, name TEXT, time TEXT,  view_count TEXT, content TEXT);");
    }

    //DB의 버전이 바뀔 때 실행된다.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS board");
        onCreate(db);
    }
}
