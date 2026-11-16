
package banking;

import java.util.LinkedHashMap;
import java.util.Map;

public class BankService {

    private final Map<Integer, BankAccount> accounts = new LinkedHashMap<>();

    public void createAccount(BankAccount account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            throw new IllegalArgumentException("Account already exists!");
        }

        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount findAccount(int accountNumber) {
        BankAccount account = accounts.get(accountNumber);

        if (account == null) {
            throw new AccountNotFoundException(
                "Account not found: " + accountNumber
            );
        }

        return account;
    }

    public void deposit(int accountNumber, double amount) {
        findAccount(accountNumber).deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) {
        findAccount(accountNumber).withdraw(amount);
    }

    public void displayAll() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("\n--- BANK ACCOUNT DETAILS ---");

        for (BankAccount account : accounts.values()) {
            System.out.println(account);
        }
    }
}
