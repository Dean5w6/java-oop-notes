public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(500.50);

        System.out.println("Initial balance is: " + account.getBalance());

        account.credit(600.49);
        System.out.println("New balance: " + account.getBalance());
    }
}
