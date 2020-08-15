package bitlab.askar.Module1.Project;

public class CityBankAccount implements BankAccount {


    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return this.pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (credit<=totalBalance()){
            this.balance = totalBalance()-credit;
        }else {
            System.out.println("Not enought money");
        }
    }

    @Override
    public void debetBalance(int debet) {
        this.balance += debet;
    }

    @Override
    public String accountData() {
        return toString();
    }

    @Override
    public String toString() {
        return "CityBankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
