package com.shubham.creational.singleton;

class DatabaseConnection {
    // 1. Private static variable of the same class type to hold the single instance
    private static DatabaseConnection instance;

    // 2. Private constructor to prevent creation from outside using 'new'
    private DatabaseConnection() {
        System.out.println("Initializing Database Connection...");
    }

    // 3. Public static method to get the single instance (Thread-safe)
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            // Only synchronize when creating the instance for the first time
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing SQL query: " + sql);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("=== Singleton Demo ===");

        // Get instance the first time (it will create the connection)
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        conn1.query("SELECT * FROM users");

        // Get instance the second time (it will reuse the existing connection)
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        conn2.query("SELECT * FROM products");

        // Check if both references point to the exact same object
        if (conn1 == conn2) {
            System.out.println("Success: Both references point to the exact same object instance.");
        } else {
            System.out.println("Error: Different instances were created!");
        }
    }
}
