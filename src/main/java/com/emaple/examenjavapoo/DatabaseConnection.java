package com.emaple.examenjavapoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Configuration de la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/Restaurant"; // URL de la base de données
    private static final String USER = "root"; // Nom d'utilisateur MySQL
    private static final String PASSWORD = ""; // Mot de passe MySQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établir la connexion
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie !");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC introuvable : " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        // Tester la connexion
        Connection conn = getConnection();
        if (conn != null) {
            try {
                conn.close(); // Fermer la connexion après le test
                System.out.println("Connexion fermée.");
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
            }
        }
    }
}

