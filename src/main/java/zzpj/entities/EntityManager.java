/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzpj.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gciolek
 */
public class EntityManager {

    Connection conn = null;

    public EntityManager() {
        // connect to the database
        this.conn = connectToDatabaseOrDie();
    }

    private Connection connectToDatabaseOrDie() {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://THE_HOST/THE_DATABASE";
            conn = DriverManager.getConnection(url, "THE_USER", "THE_PASSWORD");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(2);
        }

        return conn;
    }

    private ResultSet getQueryResult(String query) {
        try {
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(query);

//            while (rs.next()) {
//                Blog blog = new Blog();
//                blog.id = rs.getInt("id");
//                blog.subject = rs.getString("subject");
//                blog.permalink = rs.getString("permalink");
//                listOfBlogs.add(blog);
//            }
//            rs.close();
//            st.close();
            return rs;
        } catch (SQLException se) {
            System.err.println("Threw a SQLException creating the list of blogs.");
            System.err.println(se.getMessage());
        }
        
        return null;
    }

    ResultSet getFromQuery(String with) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void executeQuery(String create) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
