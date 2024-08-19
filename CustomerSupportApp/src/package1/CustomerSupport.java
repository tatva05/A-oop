package package1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupport {
    private Queue<String> tickets;

    public CustomerSupport() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        tickets.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    public void processTicket() {
        if (!tickets.isEmpty()) {
            String processedTicket = tickets.poll();
            System.out.println("Processed ticket: " + processedTicket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            for (String ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerSupport customerSupport = new CustomerSupport();
        boolean running = true;

        while (running) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String description = scanner.nextLine();
                    customerSupport.addTicket(description);
                    break;
                case 2:
                    customerSupport.processTicket();
                    break;
                case 3:
                    customerSupport.displayTickets();
                    break;
                case 4:
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
