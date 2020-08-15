package bitlab.askar.Module1.Lesson8.Lab6;

public class Library {

    private String name;
    private String city;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int size(){
        return sizeOfBooks;
    }

    public int priceSum(){
        int sum = 0;

        for (int i=0;i<sizeOfBooks;i++){
            sum += books[i].getPrice();
        }

        return sum;
    }

    public void addBook(Book book){
        books[sizeOfBooks] = book;
        sizeOfBooks++;
    }

}
