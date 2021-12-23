public class Task {
    private int id;
    private String name;
    private String description;
    private String dueDate;
    private Person assignee;
    private Status status;

    public Task(String name, String desc, String dueDate) {
        Person n = new Person();
        this.setName(name);
        this.setDescription(desc);
        this.setDueDate(dueDate);
        this.setAssignee(n);
        this.setStatus(new Unclaimed());
    }

    public Task() {
        //NULL CONSTRUCTOR
        this.setId(-1);
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

    public void setId(int i) {
        id = i;
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
        status = new InProgress();
    }

    public void setStatus(Status s) {
        status = s;
    }

    public void complete() {
        status = new Completed();
    }

}
