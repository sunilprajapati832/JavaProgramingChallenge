class Book {
    private String title;
    private String author;
    private String isbn;
    private static int totalBooks = 0; // Static variable to count total number of books

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++; // Increment totalBooks when a new Book instance is created
    }

    // Instance method to borrow a book
    public void borrowBook() {
        System.out.println("Book '" + title + "' by " + author + " is borrowed.");
    }

    // Instance method to return a book
    public void returnBook() {
        System.out.println("Book '" + title + "' by " + author + " is returned.");
    }

    // Static method to get total number of books
    public static int getTotalBooks() {
        return totalBooks;
    }

    // Getters and Setters
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Main method for testing
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        System.out.println("Total books in the library: " + Book.getTotalBooks());

        book1.borrowBook();
        book1.returnBook();

        System.out.println("Total books in the library: " + Book.getTotalBooks());
    }
}