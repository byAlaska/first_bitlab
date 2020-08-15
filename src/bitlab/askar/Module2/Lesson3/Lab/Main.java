package bitlab.askar.Module2.Lesson3.Lab;

public class Main {
    public static void main(String[] args){
        BankApplication bankApplication = new BankApplication("KASPI");

        bankApplication.addAccount(new Account(1,"Aslar","Adkar",5000));
        bankApplication.addAccount(new Account(2,"Berik","KAzbel",9000));
        bankApplication.addAccount(new Account(3,"Serik","Kazbek",7000));
        bankApplication.addAccount(new Account(4,"Erik","Adkar",50000));
        bankApplication.addAccount(new Account(5,"Leoric","qwerty",1000));

        System.out.println(bankApplication.getBankData());
    }
}
