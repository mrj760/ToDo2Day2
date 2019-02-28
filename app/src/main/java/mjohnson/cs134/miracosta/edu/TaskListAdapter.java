package mjohnson.cs134.miracosta.edu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;

import mjohnson.cs134.miracosta.edu.Task.Task;

public class TaskListAdapter extends ArrayAdapter<Task> {


    private Context ctx;
    private int resID;
    private List<Task> allTasks;




    public TaskListAdapter(Context context, int resource, List<Task> objects) {
        super(context, resource, objects);

        ctx = context;
        resID = resource;
        allTasks = objects;
    }



    // We'll use this to use a custom layout instead of the standard one
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // For each task in the list, inflate its view
        Task focusedTask = allTasks.get(position);





        // build a new inflater, and set it to this wonky function call that works with the context ( also cast it )
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View v = inflater.inflate(resID, null);

        CheckBox isDoneCB = v.findViewById(R.id.isDoneCheckBox);
        isDoneCB.setChecked(focusedTask.isDone());
        isDoneCB.setText(focusedTask.getDescription());

        return v;
    }
}
