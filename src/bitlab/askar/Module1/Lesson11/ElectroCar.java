package bitlab.askar.Module1.Lesson11;

public class ElectroCar implements CanCharge {




    @Override
    public void charge() {
        System.out.println("Electro Car is charging");
    }

    @Override
    public void isFull() {
        System.out.println("Electro car is charged");
    }


}
