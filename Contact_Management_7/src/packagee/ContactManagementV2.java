package packagee;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Person {
    private String fullName;
    private String phone;
    private String emailAddress;

    public Person(String fullName, String phone, String emailAddress) {
        this.fullName = fullName;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + ", Phone: " + phone + ", Email: " + emailAddress;
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return fullName.equals(person.fullName);
    }
}

public class ContactManagementV2 {
    private Set<Person> contactSet;
    private Map<String, Person> contactMap;

    public ContactManagementV2() {
        contactSet = new HashSet<>();
        contactMap = new HashMap<>();
    }

    public void addPerson(Person person) {
        if (contactSet.add(person)) {
            contactMap.put(person.getFullName(), person);
            System.out.println("Person added: " + person);
        } else {
            System.out.println("Person already exists.");
        }
    }

    public void deletePerson(String fullName) {
        Person person = contactMap.remove(fullName);
        if (person != null) {
            contactSet.remove(person);
            System.out.println("Person removed: " + person);
        } else {
            System.out.println("Person not found.");
        }
    }

    public void showContacts() {
        if (contactSet.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("Contacts:");
            for (Person person : contactSet) {
                System.out.println(person);
            }
        }
    }

    public void findPerson(String fullName) {
        Person person = contactMap.get(fullName);
        if (person != null) {
            System.out.println("Person found: " + person);
        } else {
            System.out.println("Person not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManagementV2 contactManagement = new ContactManagementV2();
        boolean running = true;

        while (running) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Person");
            System.out.println("2. Delete Person");
            System.out.println("3. Show Contacts");
            System.out.println("4. Find Person");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email address: ");
                    String emailAddress = scanner.nextLine();
                    Person person = new Person(fullName, phone, emailAddress);
                    contactManagement.addPerson(person);
                    break;
                case 2:
                    System.out.print("Enter full name of the person to delete: ");
                    fullName = scanner.nextLine();
                    contactManagement.deletePerson(fullName);
                    break;
                case 3:
                    contactManagement.showContacts();
                    break;
                case 4:
                    System.out.print("Enter full name to find: ");
                    fullName = scanner.nextLine();
                    contactManagement.findPerson(fullName);
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
