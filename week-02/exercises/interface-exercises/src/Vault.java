
public class Vault implements MoneyStorage {
    //FIELDS
    private double balance;
    private String description;

    //CONSTRUCTORS
    public Vault(double startingBalance, String description) {
        this.balance = balance;
        this.description = description;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public boolean deposit(double amount) {
        return false;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }
}
