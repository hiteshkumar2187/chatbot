package com.cst426.chatbot.database;

/**
 * ChatBotConnection.java
 *
 * Provides static methods for initializing and closing the
 * ChatBot database
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ChatBotConnection
{
    // authentication details for the database
    private static final String _dbName   = "chatbot_db";
    private static final String _username = "root";
    private static final String _password = "password";
    
    /**
     * getConnection(): returns a reference to the Connection object for the
     * chatbot database
     *
     * @return java.sql.Connection
     */
    protected static Connection getConnection()
    {
        Connection connection = null;

        try
        {
            // Load Connector/J
            Class.forName("com.mysql.jdbc.Driver");

            // Get the MySQL connection passing the URL, username and password
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + _dbName,
                    _username,
                    _password
            );
        }
        catch (Exception e)
        {
            System.out.println("Error connecting to database \"" + _dbName + "\"");
            e.printStackTrace();
        }

        return connection;
    }

    /**
     * closeConnection(): given a reference to a Conneciton instance, close the
     * database connection
     *
     * @param connection reference to Connection object
     */
    protected static void closeConnection(Connection connection)
    {
        try
        {
            connection.close();
        }
        catch (Exception e)
        {
            System.out.println("Error closing database \"" + _dbName + "\"");
            e.printStackTrace();
        }
    }
}
