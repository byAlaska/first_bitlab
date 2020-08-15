package bitlab.askar.Module1.Lesson8.Lab6;

public class LiteratureBook extends Book {

    private int publishedYear;

    public LiteratureBook() {
    }

    public LiteratureBook(String name, String author, int isbn, int price, int publishedYear) {
        super(name, author, isbn, price);
        this.publishedYear = publishedYear;
    }


    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "LiteratureBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                "publishedYear=" + publishedYear +
                '}';
    }
}
