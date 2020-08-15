package bitlab.askar.Module1.Project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input account number");
        String accountNumber = in.next();
        System.out.println("Input pin code");
        String pinCode = in.next();


        BankAccount account = null;

        for (int i=0;i<3;i++){
            if (accountNumber.equals(Database.accounts[i].getAccountNumber()) && pinCode.equals(Database.accounts[i].getPinCode())){
                account = Database.accounts[i];
                break;
            }
        }


        if (account==null){
            System.out.println("Incorrect pin or number");
            return;
        }

        while (true){

            if (account instanceof CityBankAccount){

                System.out.println(" PRESS [1] TO CASH WITHDRAWAL  // снять деньги\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                        "\n" +
                        "               PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                        "\n" +
                        "               PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                        "\n" +
                        "               PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                        "\n" +
                        "               PRESS [6] TO EXIT // выход\n" +
                        "\n");


                int choice = in.nextInt();

                if (choice==1){
                    System.out.println("Input money");
                    int credit = in.nextInt();
                    account.creditBalance(credit);
                }else if (choice==2){
                    System.out.println(account.totalBalance());
                }else if (choice==3){
                    String newPinCode = in.next();
                    account.setPinCode(newPinCode);
                }else if (choice==4){
                    System.out.println("Input money");
                    int debet = in.nextInt();
                    account.debetBalance(debet);
                }else if (choice==5){
                    System.out.println(account.accountData());
                }else{
                    break;
                }


            }else {

                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE\n" +
                        "\n" +
                        "               PRESS [3] TO EXIT\n" +
                        "\n");


                int choice = in.nextInt();

                if (choice==1){
                    System.out.println("Input money");
                    int credit = in.nextInt();
                    account.creditBalance(credit);
                }else if (choice==2){
                    System.out.println(account.totalBalance());
                }else{
                    break;
                }


            }


        }

    }
}
