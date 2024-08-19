package paclagee;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class HistoryManager {
    private Deque<String> historyStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public HistoryManager() {
        historyStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = "Home"; // Initial page
    }

    public void visitPage(String page) {
        if (currentPage != null) {
            historyStack.push(currentPage);
        }
        currentPage = page;
        forwardStack.clear(); // Clear forward stack on new page visit
        System.out.println("Visited page: " + currentPage);
    }

    public void goBack() {
        if (!historyStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = historyStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            historyStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No forward page.");
        }
    }

    public void displayCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HistoryManager manager = new HistoryManager();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nBrowser History System");
            System.out.println("1. Visit Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter page name: ");
                    String page = scanner.nextLine();
                    manager.visitPage(page);
                    break;
                case 2:
                    manager.goBack();
                    break;
                case 3:
                    manager.goForward();
                    break;
                case 4:
                    manager.displayCurrentPage();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
