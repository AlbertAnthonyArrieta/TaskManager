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
    public static void main(String[] args) {
        System.out.println("Welcome to the Task Manager!");
        
        TaskList ts = new TaskList();

        Task task1 = new Task("Laundry", "Finish doing the laundry", "January 1st, 2022");
        Task task2 = new Task("Dishes", "Clean all the dishes", "January 4th, 2022");
        Task task3 = new Task("Trash", "Take out the trash", "January 7th, 2022");
        Person Bob = new Person("Bob");
        Person Alice = new Person("Alice");

        ts.addTask(task1);
        ts.addTask(task2);
        ts.addTask(task3);

        ts.getTask(2).setAssignee(Alice);
        ts.getTask(3).setAssignee(Bob);
        ts.getTask(2).complete();

        ts.displayTasks();
    }
}