package DesignPatterns.Creational_DP.Singleton;

public class DbConnection {

    private static DbConnection instance;

    private DbConnection() {
        System.out.println("Conection established...");
    }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectandb...");
    }
}
