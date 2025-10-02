# Singleton Pattern – Database Connection Example 🗄️

This project demonstrates the **Singleton Design Pattern** in Java using a **Database Connection** simulation.
The Singleton Pattern ensures that a class has **only one instance** throughout the application and provides a global access point to it.

 `DatabaseConnection.java`

* Implements the **Singleton pattern**.
* Key Points:

  * Private static field `instance` stores the single object.
  * Private constructor prevents direct instantiation.
  * Public static method `getInstance()` ensures only one object is created.
* Method:

  * `query(String sql)` → simulates executing a database query.

`SingletonDBDemo.java`

* **Client** class.
* Demonstrates the Singleton usage:

  * Gets two references `db1` and `db2` using `DatabaseConnection.getInstance()`.
  * Executes a sample SQL query.
  * Verifies that both references point to the same instance.

 How to Run

1. Save both `.java` files in the same folder.
2. Compile using:
 
   javac *.java
 
3. Run demo:

   java SingletonDBDemo


---

