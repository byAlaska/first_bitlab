package bitlab.askar.Module1.Project;

public class Database {

    public static BankAccount[] accounts = {
            new CityBankAccount("Ilyas", "Zhuanyshev", 20000, "KZ010322312", "0102"),
            new CityBankAccount("Erbol", "Assanbek", 10000, "KZ010322313", "0101"),
            new NationalBankAccount("Ilyas Zhuanyshev", 2000, "KZ0101112", "0102")
    };

}
