import java.util.ArrayList;
import java.util.Scanner;

public class array_concept {

    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 0:
                    System.out.println("To-Do App Closed");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    // Menu method
    static void showMenu() {
        System.out.println("\n----- To-Do List Menu -----");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Delete Task");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    // Add task method
    static void addTask() {
        System.out.print("Enter task name: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    // View tasks method
    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\nYour Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Delete task method
    static void deleteTask() {
        viewTasks();

        if (!tasks.isEmpty()) {
            System.out.print("Enter task number to delete: ");
            int index = sc.nextInt();

            if (index > 0 && index <= tasks.size()) {
                tasks.remove(index - 1);
                System.out.println("Task deleted successfully!");
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }
}
