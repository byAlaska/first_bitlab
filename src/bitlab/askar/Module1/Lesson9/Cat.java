package bitlab.askar.Module1.Lesson9;

public class Cat extends Animal {

    private int usiki;

    public Cat() {
    }

    public Cat(String name, int weight, int usiki) {
        super(name, weight);
        this.usiki = usiki;
    }

    public int getUsiki() {
        return usiki;
    }

    public void setUsiki(int usiki) {
        this.usiki = usiki;
    }

    @Override
    public void run() {
        System.out.println("Animal: " + name + ", with weight: " + weight + " Usiki: " + usiki +  " shtuk, is running");
    }


}
