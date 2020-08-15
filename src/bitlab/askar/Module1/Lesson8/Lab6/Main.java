package bitlab.askar.Module1.Lesson8.Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);

        Library library = new Library();


        while (true){

            System.out.println("[1] add book");
            System.out.println("[2] list book");
            System.out.println("[0] exit");

            int choice = in.nextInt();

            if (choice==1){
                System.out.println("[1] literature book");
                System.out.println("[1] scientific book");

                int choice2 = in.nextInt();

                Book book;
                System.out.println("name");
                String name = in.next();
                System.out.println("author");
                String author = in.next();
                System.out.println("isbn");
                int isbn = in.nextInt();
                System.out.println("price");
                int price = in.nextInt();

                
                if (choice2==1){
                    int publishedYear = in.nextInt();
                    book = new LiteratureBook(name,author, isbn,price,publishedYear);
                }else{
                    String publisher = in.next();
                    book = new ScientificBook(name,author,isbn,price,publisher);
                }

                library.addBook(book);
            }else if(choice==2){
                Book []books = library.getBooks();

                for (int i=0;i<library.size();i++){
                    System.out.println(books[i].toString());
                }
            }else{
                break;
            }
        }


    }
}
