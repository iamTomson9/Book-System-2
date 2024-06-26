import javafx.beans.property.*;

public class Book {
    // Attributes of a book
    private StringProperty isbn;
    private StringProperty title;
    private StringProperty author;
    private StringProperty genre;
    private DoubleProperty price;
    private IntegerProperty quantity;

    // Constructor to initialize a book with provided details
    public Book(String isbn, String title, String author, String genre, double price, int quantity) {
        this.isbn = new SimpleStringProperty(isbn);
        this.title = new SimpleStringProperty(title);
        this.author = new SimpleStringProperty(author);
        this.genre = new SimpleStringProperty(genre);
        this.price = new SimpleDoubleProperty(price);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    // Getters for retrieving book details
    public StringProperty isbnProperty() {
        return isbn;
    }

    public StringProperty titleProperty() {
        return title;
    }

    public StringProperty authorProperty() {
        return author;
    }

    public StringProperty genreProperty() {
        return genre;
    }

    public DoubleProperty priceProperty() {
        return price;
    }
    
    public IntegerProperty quantityProperty() {
        return quantity;
    }

    // Setters for updating book details
    public void setIsbn(String isbn) {
        this.isbn.set(isbn);
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public void setGenre(String genre) {
        this.genre.set(genre);
    }

    public void setPrice(double price) {
        this.price.set(price);
    }
    
    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    // Method to convert Book object to a string representation
    @Override
    public String toString() {
        return "ISBN: " + isbn.get() +
                ", Title: " + title.get() +
                ", Author: " + author.get() +
                ", Genre: " + genre.get() +
                ", Price: $" + price.get() +
                ", Quantity: " + quantity.get();
    }
}
