# Adapter Pattern Example – Java

This project demonstrates the **Adapter Design Pattern** in Java using a **phone charger example**.

The **Adapter Pattern** is a **structural design pattern** that allows objects with incompatible interfaces to work together. It acts as a **bridge** between two different interfaces.

Target (UsbCCharger):** The interface expected by the client.
Adaptee (RoundPinCharger):** An existing class with a different/incompatible interface.
Adapter (ChargerAdapter):** Converts the Adaptee interface into the Target interface.
Client (AdapterDemo):** Uses the Target interface but internally communicates with the Adaptee via the Adapter.

* Old charger: **RoundPinCharger**
* New device expects: **UsbCCharger**
* Adapter: **ChargerAdapter** allows the old charger to be used with the new USB-C port.

* `UsbCCharger.java` → Target interface
* `RoundPinCharger.java` → Adaptee class
* `ChargerAdapter.java` → Adapter class implementing `UsbCCharger`
* `AdapterDemo.java` → Client code to test the adapter

1. Save the files:

   * `UsbCCharger.java`
   * `RoundPinCharger.java`
   * `ChargerAdapter.java`
   * `AdapterDemo.java`

2. Compile the Java files:
   javac *.java


3. Run the program:
   java AdapterDemo




