import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    // Constructor
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    // Constructor
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class libraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Fiction book
        System.out.println("Enter details for Fiction book:");
        System.out.print("Title: ");
        String fictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double fictionPrice = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);

        // Input for Non-Fiction book
        System.out.println("Enter details for Non-Fiction book:");
        System.out.print("Title: ");
        String nonFictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double nonFictionPrice = scanner.nextDouble();
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);

        // Display book details
        fictionBook.displayDetails();
        nonFictionBook.displayDetails();
    }
}
