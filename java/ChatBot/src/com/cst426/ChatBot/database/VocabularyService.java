package com.cst426.chatbot.database;

/**
 * VocabularyService.java
 *
 * VocabularyService provides static methods for insertion and selection on
 * the Vocabulary table
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import java.sql.*;
import java.util.Map;
import java.util.HashMap;

import com.cst426.chatbot.Word;

public class VocabularyService extends Connection
{
    /**
     * saveWord(): given a reference to Word object instance,
     * insert the word into the vocabulary table of the database
     *
     * @param word reference to Word object instance
     */
    public static void saveWord(Word word)
    {
        // TODO - implement the saveWord method

        try
        {
            Connection.init();

            /**
             * INSERT chatbot.vocabulary (word, type, definition)
             * VALUES (word, type, definition);
             */

        }
        finally
        {

            Connection.close();
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
        // TODO - implement the loadWords method

        try
        {
            Connection.init();

            /**
             * SELECT * FROM chatbot.vocabulary
             * WHERE type = {type};
             */

        }
        finally
        {
            Connection.close();
        }

        return new HashMap<String, Word>();
    }
}
