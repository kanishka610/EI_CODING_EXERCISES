# Command Pattern Example – Banking Application (Java)

This project demonstrates the **Command Design Pattern** in Java using a **simple banking application**.

About Command Pattern

The Command Pattern is a **behavioral design pattern** that encapsulates a request as an object, allowing parameterization of clients with different requests, queuing, or logging them, and supporting undoable operations.

It decouples the **Invoker** (who sends the request) from the **Receiver** (who performs the request).


Receiver: `BankAccount` (performs operations like deposit/withdraw).
Command: `Command` interface, `DepositCommand`, `WithdrawCommand` (represent banking actions).
Invoker: `BankTeller` (executes the commands).
Client: `BankCommandDemo` (creates objects and ties them together).



1. `Command.java` → Command interface
2. `BankAccount.java` → Receiver class (actual banking operations)
3. `DepositCommand.java` → Concrete Command (deposit operation)
4. `WithdrawCommand.java` → Concrete Command (withdraw operation)
5. `BankTeller.java` → Invoker (executes commands)
6. `BankCommandDemo.java` → Client (main program to test commands)

1. Save the files:

   * `Command.java`
   * `BankAccount.java`
   * `DepositCommand.java`
   * `WithdrawCommand.java`
   * `BankTeller.java`
   * `BankCommandDemo.java`

2. Compile all Java files:

   javac *.java


3. Run the demo:

   java BankCommandDemo




This ensures **loose coupling** and makes it easy to add new commands in the future (e.g., `TransferCommand`) without changing existing code.
