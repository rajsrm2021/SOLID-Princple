package DesignPatterns.Creational_DP.Singleton;

public class Driver {
    public static void main(String[] args) {
//        payment
        DbConnection dbConnection = DbConnection.getInstance();
        dbConnection.connect();

//        service
        DbConnection dbConnection1 = DbConnection.getInstance();
        dbConnection1.connect();

//      when you run the code you can see that you have established the connection only one time
//      but connected to db directly on second time because the connection is stored in variable.
//      this is called singletion design pattern.
    }
}
