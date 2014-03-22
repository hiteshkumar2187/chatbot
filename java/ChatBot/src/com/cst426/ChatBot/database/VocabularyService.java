package com.cst426.chatbot.database;

/**
 * VocabularyService.java
 *
 * VocabularyService provides static methods for insertion and selection on
 * the Vocabulary table
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import java.util.Map;
import java.util.HashMap;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cst426.chatbot.Word;

public class VocabularyService
{
    /**
     * saveWord(): given a reference to Word object instance,
     * insert the word into the vocabulary table of the database
     *
     * @param word reference to Word object instance
     */
    public static void saveWord(Word word)
    {
        Connection connection = null;

        try
        {
            connection = ChatBotConnection.getConnection();

            PreparedStatement sql = connection.prepareStatement(
                    "INSERT vocabulary (word, type, definition) " +
                    "VALUES (?, ?, ?)"
            );

            System.out.println(sql.toString());

            sql.setString(1, word.getWord());
            sql.setString(2, word.getType());
            sql.setString(3, word.getDefinition());
            sql.executeUpdate();

        }
        catch (Exception e)
        {
            System.out.println("Error writing word to database");
            e.printStackTrace();
        }
        finally
        {
            ChatBotConnection.closeConnection(connection);
        }
    }

    /**
     * loadWord(): lookup the word by primary key and return the word if found
     *
     * @param key the word as a string
     */
    public static Word loadWord(String key) throws Exception
    {
        Connection connection = null;
        Word word = null;

        try
        {
            connection = ChatBotConnection.getConnection();

            // prepare the SQL query
            PreparedStatement sql = connection.prepareStatement(
                    "SELECT * " +
                    "FROM vocabulary " +
                    "WHERE word = ?"
            );

            ResultSet result = sql.executeQuery();

            result.next();

            return new Word(
                    result.getString("word"),
                    result.getString("type"),
                    result.getString("definition")
                    );
        }
        catch (Exception e)
        {
            // the client will handle the exception
            throw e;
        }
        finally
        {
            ChatBotConnection.closeConnection(connection);
        }
    }

    /**
     * loadWords(): given a String representing the type of word,
     * query the vocabulary table in our database and load in all words
     * corresponding to that type
     *
     * @return a Map<String, Word> collection
     */
    public static Map<String, Word> loadWords() throws Exception
    {
        Connection connection = null;
        Map <String, Word> words = null;

        try
        {
            connection = ChatBotConnection.getConnection();

            // set the variable with the prepared statement
            PreparedStatement sql = connection.prepareStatement(
                    "SELECT * " +
                    "FROM vocabulary"
            );

            ResultSet result = sql.executeQuery();

            // instantiate the HashMap
            words = new HashMap<String, Word> ();

            // populate each result into our Map of words
            while ( result.next() )
            {
                // extract all the words
                String w = result.getString("word");
                String t = result.getString("type");
                String d = result.getString("definition");

                // put the word in our map
                words.put(w, new Word(w, t, d));
            }
        }
        catch (Exception e)
        {
            System.out.println("Error loading words from database");
            e.printStackTrace();
        }
        finally
        {
            ChatBotConnection.closeConnection(connection);
        }

        return words;
    }


}
