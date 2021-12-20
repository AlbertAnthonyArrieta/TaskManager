public class Task {
    private int id;
    private String name;
    private String description;
    private String dueDate;
    private Person assignee;
    private Status status;

    public Task(String name, String desc, String dueDate, Person assignee, Status status) {
        this.setName(name);
        this.setDescription(desc);
        this.setDueDate(dueDate);
        this.setAssignee(assignee);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Person getAssignee() {
        return assignee;
    }

    public Status getStatus() {
        return status;
    }

    public void generateId() {
        //generate a new unique ID
    }

    public void setName(String n) {
        name = n;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setDueDate(String dd) {
        dueDate = dd;
    }

    public void setAssignee(Person a) {
        assignee = a;
    }

    public void completed() {
        //changes the task's status from in-Progress to completed
    }

}
