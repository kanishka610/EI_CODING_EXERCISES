# Bridge Pattern Example – Java

This project demonstrates the **Bridge Design Pattern** in Java using a **Shape and Color example**.

 About Bridge Pattern

The Bridge Pattern is a **structural design pattern** that **decouples abstraction from implementation** so that the two can vary independently.

Abstraction (Shape):** High-level interface that defines the abstract behavior.
Refined Abstractions (Circle, Square):** Concrete implementations of Shape.
Implementor (Color):** Defines the interface for implementation classes.
Concrete Implementors (Red, Blue):** Provide concrete behavior for colors.
Client (BridgeDemo):** Creates and uses different combinations of Shapes and Colors.


 Example Used

* Shapes: **Circle, Square**
* Colors: **Red, Blue**
* Using the bridge, we can **combine shapes with any color** without changing existing code.



* `Color.java` → Implementor interface
* `Red.java`, `Blue.java` → Concrete Implementors
* `Shape.java` → Abstraction
* `Circle.java`, `Square.java` → Refined Abstractions
* `BridgeDemo.java` → Client

1. Save the files:

   * `Color.java`
   * `Red.java`
   * `Blue.java`
   * `Shape.java`
   * `Circle.java`
   * `Square.java`
   * `BridgeDemo.java`

2. Compile the Java files:
   javac *.java
 
3. Run the program:
   java BridgeDemo
 


* Both can be extended independently.
* Avoids class explosion (e.g., no need for `RedCircle`, `BlueCircle`, `RedSquare`, `BlueSquare` separately).
