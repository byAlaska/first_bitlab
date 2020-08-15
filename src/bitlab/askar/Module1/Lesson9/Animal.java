package bitlab.askar.Module1.Lesson9;

public class Animal{
    protected String name;
    protected int weight;

    public Animal() {
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("Animal: " + name + ", with weight: " + weight + " is running");
    }
}
