
package banking;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements TransactionOperations {

    private final int accountNumber;
    private final String accountHolder;
    protected double balance;

    private final List<String> history = new ArrayList<>();

    public BankAccount(int number, String holder, double openingBalance) {

        if (number <= 0 || holder == null || holder.isBlank()
                || openingBalance < 0) {
            throw new IllegalArgumentException("Invalid account details");
        }

        accountNumber = number;
        accountHolder = holder;
        balance = openingBalance;

        history.add("Account opened with ₹" + openingBalance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    protected abstract double getMinimumBalance();

    public abstract String getAccountType();

    private void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be greater than zero");
        }
    }

    @Override
    public void deposit(double amount) {
        validateAmount(amount);

        balance += amount;

        history.add("Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        validateAmount(amount);

        if (balance - amount < getMinimumBalance()) {
            throw new IllegalArgumentException(
                "Insufficient balance");
        }

        balance -= amount;

        history.add("Withdrawn ₹" + amount);
    }

    public void printHistory() {
        System.out.println("Transaction History:");

        for (String item : history) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return accountNumber + "  "
                + accountHolder + "  "
                + getAccountType() + "  ₹"
                + balance;
    }
}
