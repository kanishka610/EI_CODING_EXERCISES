# EI_CODING_EXERCISES
# Design Patterns in Java 

This repository contains simple **Java implementations** of popular **Design Patterns** with real-life examples.
It covers **Creational, Structural, and Behavioral** patterns.



 Included Patterns
Adapter Pattern (Structural)

* **Purpose**: Converts the interface of a class into another interface clients expect.
* **Example**: Using an old round-pin charger with a modern USB-C phone.
* **Files**:

  * `UsbCCharger.java` (Target interface)
  * `RoundPinCharger.java` (Adaptee – old charger)
  * `ChargerAdapter.java` (Adapter)
  * `AdapterDemo.java` (Client)


**Bridge Pattern** (Structural)

* **Purpose**: Decouples abstraction from implementation so both can vary independently.
* **Example**: Drawing shapes (`Circle`, `Square`) with different colors (`Red`, `Blue`).
* **Files**:

  * `Color.java` (Implementor interface)
  * `Red.java`, `Blue.java` (Concrete Implementors)
  * `Shape.java` (Abstraction)
  * `Circle.java`, `Square.java` (Refined Abstractions)
  * `BridgeDemo.java` (Client)


 **Command Pattern** (Behavioral)

* **Purpose**: Encapsulates a request as an object, allowing parameterization and queuing of operations.
* **Example**: Bank transactions (`Deposit`, `Withdraw`) handled by a bank teller.
* **Files**:

  * `Command.java` (Command interface)
  * `BankAccount.java` (Receiver)
  * `DepositCommand.java`, `WithdrawCommand.java` (Concrete Commands)
  * `BankTeller.java` (Invoker)
  * `BankCommandDemo.java` (Client)

 **Iterator Pattern** (Behavioral)

* **Purpose**: Provides a way to access elements of a collection sequentially without exposing internal structure.
* **Example**: Iterating through a playlist of songs.
* **Files**:

  * `Iterator.java` (Iterator interface)
  * `Aggregate.java` (Aggregate interface)
  * `SongPlaylist.java` (Concrete Aggregate)
  * `SongIterator.java` (Concrete Iterator)
  * `IteratorPatternDemo.java` (Client)

**Singleton Pattern** (Creational)

* **Purpose**: Ensures a class has only one instance and provides a global point of access.
* **Example**: Database connection manager.
* **Files**:

  * `DatabaseConnection.java` (Singleton class)
  * `SingletonDBDemo.java` (Client)

**Factory Pattern** (Creational)

* **Purpose**: Defines an interface for creating objects but lets subclasses (or logic) decide which class to instantiate.
* **Example**: Notification system (Email, SMS).
* **Files**:

  * `Notification.java` (Product interface)
  * `EmailNotification.java`, `SMSNotification.java` (Concrete Products)
  * `NotificationFactory.java` (Factory)
  * `FactoryNotificationDemo.java` (Client)

 How to Run

1. Save each pattern’s `.java` files in the same folder (or organize into packages).
2. Compile:

   ```bash
   javac *.java
   ```
3. Run the client file for each pattern (e.g., `java AdapterDemo`, `java BridgeDemo`).

---

📌 This collection serves as a **reference for learning Design Patterns in Java** with clear, beginner-friendly examples.
You can extend these by adding more notification types, more bank operations, or new shapes/colors.


# Rocket Launch Simulator

A Java terminal app to simulate a multi-stage rocket launch. Uses Object-Oriented Programming and the Command, Singleton, and Composite design patterns.

## Running

1. Compile:
javac com\rocketlauncher\commands*.java com\rocketlauncher\rocket*.java com\rocketlauncher\missioncontrol*.java com\rocketlauncher\Main.java

text
2. Start:
java com.rocketlauncher.Main

text

## Commands

- `start_checks` — Initialize a new launch.
- `launch` — Start the rocket launch.
- `fast_forward X` — Advance X seconds.
- `exit` — Quit simulation.

## Structure

- `commands/` – Command classes
- `rocket/` – Rocket and Stage
- `missioncontrol/` – MissionControl singleton
