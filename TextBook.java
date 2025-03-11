package Practices_FinalExam;

import java.util.*;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public TextBook() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("Enter Status: ");
        setStatus(scanner.nextLine());
        System.out.println("TextBook successfully.");
    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("Enter new Status: ");
            setStatus(scanner.nextLine());
            System.out.println("TextBook successfully.");
        } else {
            System.out.println("Not found ID");
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Status: " + getStatus());
    }

}
