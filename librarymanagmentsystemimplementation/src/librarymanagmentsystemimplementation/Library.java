package librarymanagmentsystemimplementation;

import java.util.HashMap;
import java.util.Map;

public class Library implements BorrowingProcess {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public Member getMember(String memberId) {
        return members.get(memberId);
    }

    @Override
    public void borrowBook(Book book, Member member) {
        if (book != null && !book.isBorrowed() && member != null) {
            book.borrowBook();
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book cannot be borrowed");
        }
    }

    @Override
    public void returnBook(Book book, Member member) {
        if (book != null && book.isBorrowed() && member != null) {
            book.returnBook();
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book cannot be returned");
        }
    }
}
