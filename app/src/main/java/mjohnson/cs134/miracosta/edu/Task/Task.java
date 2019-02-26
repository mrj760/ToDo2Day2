package mjohnson.cs134.miracosta.edu.Task;

public class Task {

    private String description;
    private long id;
    private boolean isDone;

    public Task(String description, long id, boolean isDone) {
        this.description = description;
        this.id = id;
        this.isDone = isDone;
    }

    public Task(String description) {
        this(description, -1, false);
    }

    public String getDescription() {
        return description.toString();
    }

    public long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void isDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description=" + description +
                ", id=" + id +
                ", isDone=" + isDone +
                '}';
    }
}
