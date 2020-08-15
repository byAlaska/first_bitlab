package bitlab.askar.Module1.Lesson8;

public class Dog {

    String nickName;
    String paroda;
    int weight;
    int height;


    public Dog(){}

    public Dog(String nickName, String paroda, int weight, int height) {
        this.nickName = nickName;
        this.paroda = paroda;
        this.weight = weight;
        this.height = height;
    }

    public void doSmth(){
        System.out.println("Nick: " + nickName + " gaf gaf");
    }

}
