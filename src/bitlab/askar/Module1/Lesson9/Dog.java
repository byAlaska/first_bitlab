package bitlab.askar.Module1.Lesson9;

public class Dog extends Animal{

    private String dogParoda;

    public Dog() {
    }

    public Dog(String name, int weight, String dogParoda) {
        super(name,weight);
        this.dogParoda = dogParoda;
    }

    public String getDogParoda() {
        return dogParoda;
    }

    public void setDogParoda(String dogParoda) {
        this.dogParoda = dogParoda;
    }

    @Override
    public void run(){
        System.out.println("Animal: " + name + ", with weight: " + weight + " Paroda is: " + dogParoda +  " is running");
    }


    public void gaf(){
        System.out.println("Gaf");
    }
}
