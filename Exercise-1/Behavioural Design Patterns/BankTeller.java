public class BankTeller {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void process() {
        command.execute();
    }
}
