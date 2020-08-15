package bitlab.askar.Module2.Lesson8;

public class Main {
    public static void main(String[] args){

        DBManager db = new DBManager();
        db.connect();

        System.out.println(db.getAllCars().toString());

        db.addCar(new Car(4,"Hyundai",55000));

    }
}
