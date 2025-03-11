package Practices_FinalExam;

import java.util.*;

public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
        System.out.println("Added");
    }

    public void updateBook(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return;
            }
        }
        System.out.println("Not found ID");
    }

    public void deleteBookById(String id) {
        //    boolean removed = bookList.removeIf(book -> book.getBookId().equals(id));
        for (Book object : bookList) {
            if (id.equals(object.getBookId())) {
                bookList.remove(object);
                System.out.println("Deleted ID: " + id);
            } else {
                System.out.println("Not found ID");
            }
        }
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        System.out.println("Not found ID");
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }
}
