
package banking;

public class CurrentAccount extends BankAccount {

    private final double minimumBalance;

    public CurrentAccount(int no, String name, double opening, double minimum) {
        super(no, name, opening);

        if (minimum < 0) {
            throw new IllegalArgumentException("Minimum cannot be negative.");
        }

        minimumBalance = minimum;
    }

    @Override
    protected double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
