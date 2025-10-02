# Factory Pattern – Notification Example 

This project demonstrates the **Factory Design Pattern** in Java using a **Notification System** example.
The Factory Pattern is a **Creational Design Pattern** that provides an interface for creating objects in a superclass but allows subclasses (or logic) to alter the type of objects that will be created.



 Files Overview

`Notification.java` (Product – Interface)

* Defines a common interface for all notification types.
* Method:

  * `notifyUser()` → implemented by all concrete products.

 `EmailNotification.java` & `SMSNotification.java` (Concrete Products)

* Implement the `Notification` interface.
* Provide specific behavior:

  * `EmailNotification` → prints "Sending Email Notification..."
  * `SMSNotification` → prints "Sending SMS Notification..."

NotificationFactory.java` (Factory Class)

* Responsible for creating objects of different types.
* Method:

  * `createNotification(String type)` → returns an instance of `EmailNotification` or `SMSNotification` depending on the type.

`FactoryNotificationDemo.java` (Client)

* Demonstrates the Factory usage:

  * Creates a factory instance.
  * Requests an `EMAIL` and an `SMS` notification.
  * Calls `notifyUser()` on both objects.


How to Run

1. Save all `.java` files in the same folder.
2. Compile using:

   javac *.java

3. Run demo:

   java FactoryNotificationDemo


