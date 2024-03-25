package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    // Dane do połączenia z bazą danych MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/nazwa_bazy_danych";
    private static final String USER = "uzytkownik";
    private static final String PASSWORD = "haslo";

    private Connection connection;

    // Metoda do nawiązania połączenia z bazą danych
    public void connect() {
        try {
            // Ładowanie sterownika JDBC dla MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Nawiązanie połączenia
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Połączono z bazą danych MySQL.");
        } catch (ClassNotFoundException e) {
            System.out.println("Nie można znaleźć sterownika JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Błąd podczas nawiązywania połączenia z bazą danych.");
            e.printStackTrace();
        }
    }

    // Metoda do zwracania obiektu Connection
    public Connection getConnection() {
        return connection;
    }
    
    
    // Metoda do zamykania połączenia z bazą danych
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Zamknięto połączenie z bazą danych MySQL.");
            } catch (SQLException e) {
                System.out.println("Błąd podczas zamykania połączenia z bazą danych.");
                e.printStackTrace();
            }
        }
    }
}