public class Account {
    private double balance = 0.0;

    public Account(double newBalance) {
        if (newBalance > 0.0) {
            balance = newBalance;
        }
    }

    public void credit(double addCredit) {
        balance += addCredit;
    }

    public double getBalance() {
        return balance;
    }
}
