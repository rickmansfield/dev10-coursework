
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
        if (amount > 0.0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0.0) {
            return 0.0;
        }
        double result = Math.min(amount, balance);
        balance -= result;
        return result;
    }
}
