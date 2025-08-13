public class BankAccount {
    private double balance = 5000;

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }
}
