package bitlab.askar.Module1.Lesson11;

public class Main {
    public static void main(String[] args) {

        Telephone telephone = new Telephone(123,"NOKIA");
        Telephone telephone1 = new Telephone(1234,"NOKIA");


        boolean result = telephone.equals(telephone1);

        System.out.println(result);

//        ElectroCar electroCar = new ElectroCar();
//
//        Multivarka multivarka = new Multivarka();
//
//        CanCharge[] canCharges = {telephone, electroCar, multivarka};
//
//
//        for (int i = 0; i < 3; i++) {
//            canCharges[i].charge();
//        }
//
//
//        Telephone telephone1 = new Telephone();
//
//        CanCharge c = new CanCharge() {
//
//            String disk;
//
//            @Override
//            public void charge() {
//                System.out.println("magnitophone is charging");
//            }
//
//            @Override
//            public void isFull() {
//                System.out.println("IS charged");
//            }
//        };




    }
}
