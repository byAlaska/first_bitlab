package bitlab.askar.Module1.Lesson11;

public class Multivarka implements CanCharge, CanCook{



    @Override
    public void charge() {
        System.out.println("Multivarka is charging");
    }

    @Override
    public void isFull() {
        System.out.println("Multivarka is charged");
    }


    public void cook(){

    }

}
