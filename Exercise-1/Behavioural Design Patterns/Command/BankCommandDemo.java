public class BankCommandDemo {
    public static void main(String[] args) {
        BankAccount alice = new BankAccount("Alice", 500);

        Command deposit = new DepositCommand(alice, 200);
        Command withdraw = new WithdrawCommand(alice, 100);

        BankTeller teller = new BankTeller();

        teller.setCommand(deposit);
        teller.process();   // Alice deposited 200

        teller.setCommand(withdraw);
        teller.process();   // Alice withdrew 100
    }
}
