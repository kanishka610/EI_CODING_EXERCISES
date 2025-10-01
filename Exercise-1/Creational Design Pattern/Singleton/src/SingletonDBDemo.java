

public class SingletonDBDemo {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.query("SELECT * FROM users");

        if (db1 == db2) {
            System.out.println("Both are the same DB instance!");
        }
    }
}
