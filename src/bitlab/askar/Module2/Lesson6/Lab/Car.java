package bitlab.askar.Module2.Lesson6.Lab;

public class Car extends Thread{

    int speed;
    double distance;

    public Car(ThreadGroup threadGroup, String name, int speed, double distance) {
        super(threadGroup,name);
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {

        try {
            for (int i=0;i<distance/speed;i++){
                System.out.println(getName() + ": is on " + speed*i);
                Thread.sleep(1000);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}