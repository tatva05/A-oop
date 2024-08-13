package librarymanagmentsystemimplementation;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");
        library.addBook(book1);
        library.addBook(book2);

        // Add members to the library
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.addMember(member1);
        library.addMember(member2);

        // Borrow and return books
        library.borrowBook(book1, member1);
        library.returnBook(book1, member1);
        library.borrowBook(book2, member2);
        library.returnBook(book2, member2);
    }
}
