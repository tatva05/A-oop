package packagee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoManager {
    private List<String> todoList;

    public ToDoManager() {
        todoList = new ArrayList<>();
    }

    public void addTask(String task) {
        todoList.add(task);
        System.out.println("Task added: " + task);
    }

    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < todoList.size()) {
            todoList.set(index, newTask);
            System.out.println("Task updated: " + newTask);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        if (todoList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoManager toDoManager = new ToDoManager();
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    toDoManager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newTask = scanner.nextLine();
                    toDoManager.updateTask(updateIndex, newTask);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoManager.removeTask(removeIndex);
                    break;
                case 4:
                    toDoManager.displayTasks();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
