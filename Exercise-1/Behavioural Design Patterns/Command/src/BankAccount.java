public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited " + amount + ". Balance = " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println(owner + " withdrew " + amount + ". Balance = " + balance);
    }
}
