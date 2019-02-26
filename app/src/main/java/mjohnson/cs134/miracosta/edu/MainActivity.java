package mjohnson.cs134.miracosta.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import mjohnson.cs134.miracosta.edu.Task.DBHelper;


//          SQL Code:
        // CREATE TABLE IF NOT EXITS Tasks(_id INTEGER PRIMARY KEY, description TEXT, isDone, INTEGER)
        // DROP TABLE IF EXISTS Tasks


public class MainActivity extends AppCompatActivity {

    private DBHelper db;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /** Instantiate database */
        db = new DBHelper(this);






    }





    // Ctrl + O gives Override options
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
