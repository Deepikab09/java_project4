
package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankService bank = new BankService();

        bank.createAccount(
            new SavingsAccount(1001, "Deepika", 2500, 500)
        );
        bank.createAccount(
            new CurrentAccount(1002, "Arun", 5000, 1000)
        );

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        System.out.println("JAVA BANKING MANAGEMENT SYSTEM");

        while (run) {
            System.out.println("\n1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Transaction History");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Account Number: ");
                        int no = Integer.parseInt(sc.nextLine());

                        System.out.print("Holder Name: ");
                        String name = sc.nextLine();

                        System.out.print("1. Savings  2. Current: ");
                        int type = Integer.parseInt(sc.nextLine());

                        System.out.print("Opening Balance: ");
                        double amount = Double.parseDouble(sc.nextLine());

                        BankAccount account;

                        if (type == 1) {
                            account = new SavingsAccount(no, name, amount, 500);
                        } else if (type == 2) {
                            account = new CurrentAccount(no, name, amount, 1000);
                        } else {
                            throw new IllegalArgumentException("Invalid account type");
                        }

                        bank.createAccount(account);
                        System.out.println("Account created successfully!");
                        break;

                    case 2:
                        bank.displayAll();
                        break;

                    case 3:
                    case 4:
                        System.out.print("Account Number: ");
                        int accNo = Integer.parseInt(sc.nextLine());

                        System.out.print("Amount: ");
                        double value = Double.parseDouble(sc.nextLine());

                        if (choice == 3) {
                            bank.deposit(accNo, value);
                        } else {
                            bank.withdraw(accNo, value);
                        }

                        System.out.println("Transaction successful!");
                        break;

                    case 5:
                        System.out.print("Account Number: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.println("Balance: ₹" +
                            bank.findAccount(id).getBalance());
                        break;

                    case 6:
                        System.out.print("Account Number: ");
                        int accountId = Integer.parseInt(sc.nextLine());

                        bank.findAccount(accountId).printHistory();
                        break;

                    case 7:
                        run = false;
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter valid numeric input!");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Thank you!");
    }
}
