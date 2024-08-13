package librarymanagmentsystemimplementation;

public interface BorrowingProcess {
    void borrowBook(Book book, Member member);
    void returnBook(Book book, Member member);
}
