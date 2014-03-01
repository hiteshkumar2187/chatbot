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
import java.sql.Connection;
import java.sql.SQLException;

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

            /**
             * INSERT chatbot.vocabulary (word, type, definition)
             * VALUES (word, type, definition);
             */

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
     * @param type the type of word, e.g. "noun"
     * @return a Map<String, Word> collection
     */
    public static Map<String, Word> loadWords(String type)
    {
        Connection connection = null;

        try
        {
            connection = ChatBotConnection.getConnection();

            /**
             * SELECT word, type, definition
             * FROM chatbot.vocabulary
             * WHERE type = {type};
             */
        }
        finally
        {
            ChatBotConnection.closeConnection(connection);
        }

        return new HashMap<String, Word>();
    }
}
