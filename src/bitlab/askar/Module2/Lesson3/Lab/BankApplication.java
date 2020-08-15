package bitlab.askar.Module2.Lesson3.Lab;

import java.util.ArrayList;

public class BankApplication {

    String name;
    ArrayList<Account> accounts = new ArrayList<>();


    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount(){

        Account maxAccount = null;
        for (Account account:accounts) {
            if (maxAccount.getBalance()<account.getBalance()){
                maxAccount = account;
            }
        }

        return maxAccount;
    }

    public double getAverageBalance(){
        double sum = 0;

        for (Account account:accounts){
            sum+=account.getBalance();
        }

        return sum/accounts.size();
    }


    public double getTotalBalance(){
        double sum = 0;

        for (Account account:accounts){
            sum+=account.getBalance();
        }

        return sum;
    }

    public int totalAccounts(){
        return accounts.size();
    }

    public String getBankData(){
        return name + ", " + totalAccounts() + ", " + getTotalBalance() + ", " + getAverageBalance() + "\n";
    }
}
