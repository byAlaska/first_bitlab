package bitlab.askar.Module1.Lesson9;

public class Main {
    public static void main(String[] args){


//        Scanner in = new Scanner(System.in);
//
//        System.out.println("[1] Create Dog");
//        System.out.println("[2] Create Cat");
//
//        int choice = in.nextInt();
//
//        Animal animal = null;
//
//        if (choice==1){
//            animal  = new Dog("REX",50,"Labrador");
//        }else if (choice==2){
//            animal = new Cat("Kisa",25,0);
//        }
//
//        animal.run();





        Animal[] animals = new Animal[6];

        animals[0] = new Animal("ZHaba",1);
        animals[1] = new Animal("Loshad",90);
        animals[2] = new Dog("REX",50,"Labrador");
        animals[3] = new Dog("Aktos",60,"Domashnii");
        animals[4] = new Cat("Pushok",15,8);
        animals[5] = new Cat("Kisa",25,0);

        for (int i=0;i<animals.length;i++){
            animals[i].run();

            if (animals[i] instanceof Dog){
                ((Dog)animals[i]).gaf();
            }
        }
    }


    public static void startRun(Animal animal){
        animal.run();
    }
}