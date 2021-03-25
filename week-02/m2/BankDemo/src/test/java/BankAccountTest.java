import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//if the amount is greater than the balance, allow for a negative balance up to -25
//should return the amount if it is successful
//should return the amount if it is successful
// should return 0 if it fails

public class BankAccountTest {
    @Test
    void depositShouldAddToBalance(){
        //ARRANGE (Not always used. Build all the dependencies

        BankAccount account = new BankAccount(0, "Scrooge's Money bag", 1);

        //ACT (Does it act like you want?) call the method you want to test
        account.deposit(1.0);

        //ASSERT (like true or false. Pick what makes sense though)
        assertEquals(1.0, account.getBalance());

    }

    @Test
    void depositShouldNotAddToBalance(){
        //ARRANGE (Not always used. Build all the dependencies

        BankAccount account = new BankAccount(10, "Scrooge's Money bag", 1);

        //ACT (Does it act like you want?) call the method you want to test
        boolean successful = account.deposit(-1.0);

        //ASSERT (like true or false. Pick what makes sense though)
        assertFalse(successful);

    }

    @Test
    void withdrawShouldWithdrawFromAccount() {
        //ARRANGE
        BankAccount account = new BankAccount(1000.0, "checking account", 1234);
        //Act
        double amount = account.withdraw(100);
        //Arrange
        assertEquals(900.0, account.getBalance());
        assertEquals(100.0, amount);

    }
    @Test
    void withdrawShouldAllowSmallOverdraft() {
        BankAccount account = new BankAccount(0.0, "checking account", 1234);
        double amount = account.withdraw(25.00);
        assertEquals(-25.0, account.getBalance());
        assertEquals(25.0, amount);

    }

    @Test
    void withdrawShouldNotAllowSmallOverdraft() {
        BankAccount account = new BankAccount(0.0, "checking account", 1234);
        double amount = account.withdraw(26.00);
        assertEquals(0.0, account.getBalance());
        assertEquals(0.0, amount);

    }
}
