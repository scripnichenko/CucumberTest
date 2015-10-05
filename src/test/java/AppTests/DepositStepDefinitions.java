package AppTests;

/**
 * Created by ansk0413 on 05.10.15.
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.runtime.CucumberException;
import org.junit.Assert;

import static junit.framework.TestCase.assertTrue;


public class DepositStepDefinitions {
    private Account account;

    @Given("^a User has no money in their account$")
    public void a_User_has_no_money_in_their_current_account() throws CucumberException
    {
        User user = new User();
        account = new Account();
        user.setAccount(account);
        assertTrue("The balance is not zero.", account.getBalance() == 0L);
        //throw new CucumberException("Cucumber failed...");
    }

    @When("^£(\\d+) is deposited in to the account$")
    public void £_is_deposited_in_to_the_account(int amount) {
        account.deposit(amount);
    }

    @Then("^the balance should be £(\\d+)$")
    public void the_balance_should_be_£(int expectedBalance) {
        int currentBalance = account.getBalance();
        assertTrue("The expected balance was £100, but actually was: " + currentBalance, currentBalance == expectedBalance);
    }

    private class User {
        private Account account;

        public void setAccount(Account account) {
            this.account = account;
        }
    }

    private class Account {
        private int balance;

        public Account() {
            this.balance = 0;
        }

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            this.balance += amount;
        }
    }
}
