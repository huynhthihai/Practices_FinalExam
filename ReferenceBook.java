package Practices_FinalExam;

import java.util.*;

public class ReferenceBook extends Book {

    private double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, String bookId, String publisher, Date entryDate, double unitPrice, double quantity) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("Enter Tax: ");
        setTax(scanner.nextDouble());
        System.out.println("ReferenceBook successfully.");
    }

    public void updateBook(String id) {
        if (getBookId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateBook(id);
            System.out.print("Enter new Tax: ");
            setTax(scanner.nextDouble());
            System.out.println("ReferenceBook successfully.");
        } else {
            System.out.println("Not found ID ");
        }
    }

    public void displayBook() {
        super.displayBook();
        System.out.println("Tax: " + getTax());
    }
}
