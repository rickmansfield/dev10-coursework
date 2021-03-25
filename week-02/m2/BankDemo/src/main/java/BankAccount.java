public class BankAccount {
    private double balance;
    private String description;
    private int accountId;

    public BankAccount(double balance, String description, int accountId) {
        this.balance = balance;
        this.description = description;
        this.accountId = accountId;
    }

    //Getters & Setters
    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAccountId() {
        return accountId;
    }

    //if the amount is greater than the balance, allow for a negative balance up to -25
    //should return the amount if it is successful
    //should
    public double withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return amount;
        }

        if (balance + 25 >= amount) {
            balance -= amount;
            return amount;
        }

        return 0.0;
    }

    // If the amount is greater than 0, add that to the balance
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;

        }
        balance += amount;
        return true;
    }


}
