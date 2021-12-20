import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> tasks = new ArrayList<Task>();

    public TaskList(){
        //NULL CONSTRUCTOR
    }

    public void getAllTasks() {
        for (Task t : tasks) {
            System.out.println("ID: " + t.getId() + " TASK: " + t.getName());
        }
    }

    public void getTasksType(String status) {
        //List all tasks with a spsecific type
    }

    public void addTask(Task t) {
        tasks.add(t);
    }

    public void removeTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id)
                tasks.remove(t);
        }
    }
}
