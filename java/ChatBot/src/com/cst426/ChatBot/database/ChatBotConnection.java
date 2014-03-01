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
import java.sql.SQLException;
import java.sql.DriverManager;

public class ChatBotConnection
{
    // the name of our database
    protected static final String _dbName = "chatbot";

    /**
     * getConnection(): returns a reference to the Connection object for the
     * chatbot database
     *
     * @return java.sql.Connection
     */
    protected static final Connection getConnection()
    {
        Connection connection = null;

        try
        {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + _dbName,
                    "root",
                    "password"
            );
        }
        catch (SQLException e)
        {
            System.out.println("ERROR: couldn't connect to database \"" + _dbName + "\"");
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
    protected static final void closeConnection(Connection connection)
    {
        try
        {
            connection.close();
        }
        catch (SQLException e)
        {
            System.out.println("ERROR: couldn't close database \"" + _dbName + "\"");
            e.printStackTrace();
        }
    }
}
