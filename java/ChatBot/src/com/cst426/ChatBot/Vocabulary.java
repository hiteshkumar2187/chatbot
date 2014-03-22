package com.cst426.chatbot;

/**
 * Vocabulary.java
 *
 * The vocabulary for the chatbot, which is part of its datastore.
 * Vocabulary words are classified as nouns, verbs, pronouns,
 * proper nouns and determiners
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */


import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;

import com.cst426.chatbot.database.VocabularyService;


public class Vocabulary
{
    // properites represent each part of speech
    private Map<String, Word> _words;

    /**
     * Vocabulary(): constructor initaliazes all parts of speech
     * and loads all words from the dictionary
     */
    public Vocabulary()
    {
        this.loadWords();
    }

    /**
     * addNoun(): add a noun and its definition to the collection
     * of nouns
     *
     * @param key word field of Word object
     * @param val Word object
     */
    public void addWord(String key, Word val)
    {
        _words.put(key, val);
    }

    /**
     * inVocabulary(): given a word, determine if it is in our vocabulary
     *
     * @param word we want to search for
     * @return boolean
     */
    public boolean inVocabulary(String word)
    {
        return  _words.containsKey(word);
    }

    /**
     * lookupWord(): given a string representing a word, lookup the word
     * in the collection
     */
    public Word lookupWord(String key)
    {
        try
        {
            return VocabularyService.loadWord(key);
        }
        catch (Exception e)
        {
            // no word found, just return null
            return null;
        }
    }

    /**
     * loadWords(): given a reference to a Map and a string indicating
     * the type, load all of the words from the database of that type
     */
    private void loadWords()
    {
        try
        {
            _words = VocabularyService.loadWords();
        }
        catch (Exception e)
        {
            System.out.println("Error: could not load words by type ");
            e.printStackTrace();
        }
    }

    /**
     * toString(): returns String representation of the vocabulary
     *
     * @return String
     */
    @Override
    public String toString()
    {
        String header = "------------------\n";
        StringBuilder sb = new StringBuilder();

        // concatenate all nouns to the string
        sb.append("Words\n");
        sb.append(header);
        this.mapToString(sb, _words);

        return sb.toString();
    }

    /**
     * mapToString(): convert a map to a string
     *
     * @param sb reference to string builder
     * @param hm reference to our Map<String, String>
     */
    private void mapToString(StringBuilder sb, Map<String, Word> hm)
    {
        for (Map.Entry entry : hm.entrySet())
        {
            sb.append(entry.getKey());
            sb.append("\n");
        }

        sb.append("\n");
    }
}
