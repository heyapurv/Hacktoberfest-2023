import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    addTask(tasks, task);
                    break;
                case 2:
                    viewTasks(tasks);
                    break;
                case 3:
                    viewTasks(tasks);
                    System.out.print("Enter the index of the task to remove: ");
                    int taskIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    removeTask(tasks, taskIndex);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(ArrayList<String> tasks, String task) {
        tasks.add(task);
        System.out.println("Task '" + task + "' has been added to the to-do list.");
    }

    private static void viewTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask(ArrayList<String> tasks, int taskIndex) {
        if (taskIndex >= 1 && taskIndex <= tasks.size()) {
            String removedTask = tasks.remove(taskIndex - 1);
            System.out.println("Task '" + removedTask + "' has been removed from the to-do list.");
        } else {
            System.out.println("Invalid task index. Please enter a valid index.");
        }
    }
}
