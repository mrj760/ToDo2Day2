package mjohnson.cs134.miracosta.edu.Task;

public class Task {

    private long id;
    private String description;
    private boolean isDone;

    public Task(long id, String description, boolean isDone) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
    }

    public Task(String description) {
        this(-1, description, false);
    }

    public String getDescription() {
        return description.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void flagDone(boolean done) {
        isDone = !isDone;
    }

    public boolean isDone() {
        return isDone;
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
