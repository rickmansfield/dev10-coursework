/**
 * BankAccount starts with a zero balance.
 * Deposits must be positive and increase the balance.
 * Withdraws are limited to a -25.00 ending balance.
 */
public class BankAccount implements MoneyStorage{

    private double balance;
    private String accountNumber;

    //Constructor
    public BankAccount(double startingBalance, String accountNumber){
        this.balance = startingBalance;
        this.accountNumber = accountNumber;
    }
    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getDescription() {
        return String.format("Bank Account#%s", accountNumber);
    }

    public String getAccountNumber() { return accountNumber;}

    @Override
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
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
}
