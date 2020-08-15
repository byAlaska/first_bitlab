package bitlab.askar.Module1.Lesson11;

public class Telephone implements CanCharge{

    int isbn;
    String name;
    Multivarka multivarka;

    public Telephone(int isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    @Override
    public void charge() {

        System.out.println("Telephone is charging");
    }

    @Override
    public void isFull() {
        System.out.println("Telephone is charged");
    }

    @Override
    public boolean equals(Object obj) {

        Telephone telephone = (Telephone)obj;

        if (this.name.equals(telephone.name)){
            return true;
        }else{
            return false;
        }

    }
}
