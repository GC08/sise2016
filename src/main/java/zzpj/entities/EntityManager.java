package zzpj.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EntityManager {

    Connection conn = null;

    public EntityManager() {
        // connect to the database
        this.conn = connectToDatabaseOrDie();
    }

    private Connection connectToDatabaseOrDie() {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://THE_HOST/THE_DATABASE";
            connection = DriverManager.getConnection(url, "THE_USER", "THE_PASSWORD");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(2);
        }

        return connection;
    }

    private ResultSet getQueryResult(String query) {
        try {
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.close();
            st.close();

            return rs;
        } catch (SQLException se) {
            System.err.println("Threw a SQLException creating the list from query.");
            System.err.println(se.getMessage());
        }

        return null;
    }

    ResultSet getFromQuery(String query) {
        return this.getQueryResult(query);
    }

    void executeQuery(String query) {
        this.getQueryResult(query);
    }
}
