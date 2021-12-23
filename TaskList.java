import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> tasks = new ArrayList<Task>();
    private int idGen = 1;

    public TaskList(){
        //NULL CONSTRUCTOR
    }

    public void displayTasks() {
        for (Task t : tasks) {
            System.out.println("==");
            System.out.println("ID: " + t.getId() + " \nTASK: " + t.getName() + " \nDESCRIPTION: " + t.getDescription() + " \nASSIGNED TO: " + t.getAssignee().getName() + " \nSTATUS: " + t.getStatus().description() + " \nDUE: " + t.getDueDate());
        }
    }

    public void getTasksType(String status) {
        //List all tasks with a spsecific type
    }

    public void addTask(Task t) {
        t.setId(idGen);
        tasks.add(t);
        idGen++;
    }

    public void removeTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id)
                tasks.remove(t);
        }
    }

    public Task getTask(int id) {
        Task thisTask = new Task();
        for (Task t : tasks) {
            if (t.getId() == id)
                thisTask = t;
        }
        return thisTask;
    }
}
