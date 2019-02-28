package mjohnson.cs134.miracosta.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import mjohnson.cs134.miracosta.edu.Task.DBHelper;
import mjohnson.cs134.miracosta.edu.Task.Task;


//          SQL Code:
        // CREATE TABLE IF NOT EXITS Tasks(_id INTEGER PRIMARY KEY, description TEXT, isDone, INTEGER)
        // DROP TABLE IF EXISTS Tasks


public class MainActivity extends AppCompatActivity {

    private DBHelper db;
    private List<Task> allTasks;
    private EditText taskET;
    private ListView taskLV;
    private TaskListAdapter taskListAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /** Instantiate database */
        db = new DBHelper(this);

        allTasks = db.getAllTasks();


        taskET = findViewById(R.id.taskEditText);
        taskLV = findViewById(R.id.taskListView);

        // Associate taskList Adapter with the listView
        taskLV.setAdapter( new TaskListAdapter(this, R.layout.task_item /* find the layout for each task in the list view */, allTasks /* choose the list to work with*/));






    }


    public void addTask(View v) {

        Task t = new Task(taskET.getText().toString());

        db.addTask(t);

        taskListAdapter.notifyDataSetChanged();
    }

    public void clearAllTasks(View v) {
        db.clearAllTasks();
    }




    // Ctrl + O gives Override options
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
