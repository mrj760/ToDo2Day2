package mjohnson.cs134.miracosta.edu.Task;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static final String TAG = DBHelper.class.getSimpleName();


    /** Define all database info in constants */
    public static final String DATABASE_NAME = "ToDo2Day";
    public static final String DATABASE_TABLE = "Tasks";
    public static final String FIELD_PRIMARY_KEY = "_id";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_IS_DONE = "is_done";




    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        /** Create all database tables
         * 1.) Determine whether to read or write the database (CREATE = write)
         * */

        /** Open a writable connection to the ToDo2Day database */
        db = getWritableDatabase();
        // other option for reading another database instead =>> db = getReadableDatabase()



        // this string will be used as a sql command
        String sql = (     "CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE + " ( "    +
                        FIELD_PRIMARY_KEY + " INTEGER PRIMARY KEY , "             +
                FIELD_DESCRIPTION + "TEXT, "                               +
                        FIELD_IS_DONE + "INTEGER" + ")"                           );

         // run that string command here
        db.execSQL(sql);


        // Log the SQL String in case shit hits the fan
        Log.i(TAG, sql);







        db.close();



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
