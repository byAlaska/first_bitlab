package bitlab.askar.Module1.Lesson8.Lab6;

public class ScientificBook extends Book {

    private String publisher;

    public ScientificBook() {
    }

    public ScientificBook(String name, String author, int isbn, int price,String publisher) {
        super(name, author, isbn, price);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "ScientificBook{" +
                "publisher='" + publisher + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}
