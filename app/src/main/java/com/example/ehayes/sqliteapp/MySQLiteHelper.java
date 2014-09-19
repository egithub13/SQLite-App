package com.example.ehayes.sqliteapp;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ehayes on 9/19/2014.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    //Books table name
    private static final String TABLE_BOOKS = "books";

    //Books table column names
    private static final String KEY_ID = "id";
    private static final String KEY_TITLE = "title";
    private static final String KEY_AUTHOR = "author";

    private static final String[] COLUMNS = {KEY_ID,KEY_TITLE,KEY_AUTHOR};

    //Database version
    private static final int DATABASE_VERSION = 1;
    //Database Name
    private static final String DATABASE_NAME = "BookDB";
    //Table name
    private static final String TABLE_NAME = "BOOKTABLE";
    //Create book table
    private static final String CREATE_BOOK_TABLE = "CREATE TABLE " + TABLE_NAME + "( " + KEY_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " +
            KEY_TITLE + " TEXT,  " + KEY_AUTHOR + " TEXT )";

    private static final String DROP_TABLE = "DROP TABLE" + TABLE_NAME +" IF EXISTS";
    private Context context;

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        Message.message(context,"CONSTRUCTOR CALLED");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //SQL statement to create book table
        try {
            db.execSQL(CREATE_BOOK_TABLE);
            Message.message(context,"onCreate() Called");
        } catch (SQLException e) {
            Message.message(context,""+e);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop older books table if exists
        db.execSQL(DROP_TABLE);

        //Create fresh books table
        try {
            this.onCreate(db);
            Message.message(context,"onUpgrade() Called");
        } catch (Exception e) {
            Message.message(context,""+e);
        }

    }
}
