package bitlab.askar.Module1.Lesson8.Lab1;

public class Car {

    String name;
    String model;
    int speed;
    int weight;
    Engine []engine;

    public Car() {
    }

    public Car(String name, String model, int speed, int weight, Engine []engine) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return  "[name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", engine=" + engine + "]";
    }

    public void ride(){
        System.out.println("car " + name +" with speed: " + speed + " is riding");
    }

    public int totalWeight(){

        int sum = weight;
        for (int i=0;i<engine.length;i++){
            sum += engine[i].weight;
        }

        return sum;
    }
}
