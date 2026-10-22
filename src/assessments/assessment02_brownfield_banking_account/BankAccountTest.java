package assessments.assessment02_brownfield_banking_account;

import org.junit.jupiter.api.Test;

import testrunner.TestRunner;

public class BankAccountTest {
    @Test
    public void testValidTransactions() {
        BankAccount account = new BankAccount("ACC-101", 100.0);
        account.deposit(50.0);
        TestRunner.assertEquals(150.0, account.getBalance(), 1e-4, "Balance after deposit");

        boolean success = account.withdraw(30.0, 5.0);
        TestRunner.assertTrue(success, "Withdraw should succeed");
        TestRunner.assertEquals(115.0, account.getBalance(), 1e-4, "Balance after withdraw + fee");
    }

    @Test
    public void testDefensiveRejection() {
        BankAccount account = new BankAccount("ACC-102", 50.0);
        try {
            account.deposit(-10.0);
            TestRunner.fail("Should throw on negative deposit");
        } catch (IllegalArgumentException e) {
            TestRunner.assertTrue(true);
        }

        // Insufficient funds: Fee must NOT be deducted if withdrawal cannot proceed!
        boolean success = account.withdraw(100.0, 5.0);
        TestRunner.assertFalse(success, "Should fail insufficient funds");
        TestRunner.assertEquals(50.0, account.getBalance(), 1e-4, "Balance must remain unchanged when failed");
    }
}
