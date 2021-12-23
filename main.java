import java.util.Scanner;


/**
 * Author: Albert Arrieta
 * 
 * A small winter break project I wanted to create after
 * learning Software Engineering concepts using C++. I missed Java
 * so I wanted to make a small project to refresh my skills in Java.
 * 
 * This idea came up during my second semester in the University of Lethbridge
 * after taking CPSC2720 which is a course all about software engineering and OOP.
 * Assigning tasks in a team can be confusing and hard to handle without some sort of
 * document to keep track of who is in charge of what. I thought it would be cool to
 * create some sort of Task Manager application that keeps track of the status of
 * tasks within a project.
 */
class TaskManager {
    static Scanner scan = new Scanner(System.in);
    static TaskList ts = new TaskList();
    public static void main(String[] args) {
        int choice;
        boolean run = true;
        
        System.out.println("============================");
        System.out.println("Welcome to the Task Manager!");

        while(run == true) {

            System.out.println("============================");
            System.out.println("Type in the number corresponding to the action you would like to do.");
            System.out.println("1) Add a new Task");
            System.out.println("2) Remove an existing Task");
            System.out.println("3) Display Tasks");
            System.out.println("4) Display Team");
            System.out.println("5) Team Management");
            System.out.println("6) Quit");
            choice = scan.nextInt();
            
            switch(choice) {
                case 1: 
                addTask();
                break;
                case 2: 
                removeTask();
                break;
                case 3: 
                displayTasks();
                break;
                case 4:
                displayTeam();
                break;
                case 5:
                teamManagement();
                case 6:
                run = false;
                break;
                default:
                System.out.println("INVALID INPUT, PLEASE TRY AGAIN");
                break;
            }
        }
    }
    
    public static void addTask() {
        String name;
        String desc;
        String dueDate;
        System.out.println("Enter the name of task: ");
        scan.nextLine();
        name = scan.nextLine();
        System.out.println("Enter the description of task: ");
        desc = scan.nextLine();
        System.out.println("Enter the dueDate of task: ");
        dueDate = scan.nextLine();
        Task t = new Task(name, desc, dueDate);
        ts.addTask(t);
        System.out.println("TASK CREATED!");
    }

    public static void removeTask() {
        int id;
        System.out.println("Enter the ID of the task you would like to remove: ");
        id = scan.nextInt();
        ts.removeTask(id);
    }

    public static void displayTasks() {
        ts.displayTasks();
    }

    public static void displayTeam() {
        
    }

    public static void teamManagement(){
        
    }
}