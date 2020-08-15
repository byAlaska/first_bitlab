package bitlab.askar.Module1.Lesson8.Lab6;

public class Book {

    protected String name;
    protected String author;
    protected int isbn;
    protected int price;

    public Book() {
    }

    public Book(String name, String author, int isbn, int price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }



}
