import java.util.*;

 class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    // Constructors
    public Book() {
    }

    public Book(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business logic methods
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Error: Not enough books in inventory.");
        }
    }

    public double getInventoryValue() {
        return price * quantity;
    }


   
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", "9780743273565", 1925, 569, 50);
        System.out.println("Inventory value: Rs " + book.getInventoryValue()); // should output "Inventory value: $649.5"
        book.increaseQuantity(10);
        System.out.println("New inventory value: Rs " + book.getInventoryValue()); // should output "New inventory value: $779.4"
        book.decreaseQuantity(20); // should output "Error: Not enough books in inventory."
        book.decreaseQuantity(10);
        System.out.println("Final inventory value: Rs " + book.getInventoryValue()); // should output "Final inventory value: $909.3"
    }}

