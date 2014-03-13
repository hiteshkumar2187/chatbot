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

public class Vocabulary
{
    private Map<String, Word> _nouns;
    private Map<String, Word> _verbs;
    private Map<String, Word> _pronouns;
    private Map<String, Word> _properNouns;
    private Map<String, Word> _determiners;
    private Map<String, Word> _prepositions;

    /**
     * constructor: initializes all Maps for all different
     * word classifications
     */
    public Vocabulary()
    {
        _nouns = new HashMap<String, Word>();
        _verbs = new HashMap<String, Word>();
        _pronouns = new HashMap<String, Word>();
        _properNouns = new HashMap<String, Word>();
        _determiners = new HashMap<String, Word>();
        _prepositions = new HashMap<String, Word>();
    }

    /**
     * addNoun(): add a noun and its definition to the collection
     * of nouns
     *
     * @param key word field of Word object
     * @param val Word object
     */
    public void addNoun(String key, Word val)
    {
        _nouns.put(key, val);
    }

    /**
     * addVerb(): add a verb and its definition to the collection
     * of verbs
     *
     * @param key word field of Word object
     * @param val Word object
     */
    public void addVerb(String key, Word val)
    {
        _verbs.put(key, val);
    }

    /**
     * addPronoun(): add pronoun and its definition to the collection
     * of pronouns
     *
     * @param key word field of Word object
     * @param val Word object
     */
    public void addPronoun(String key, Word val)
    {
        _pronouns.put(key, val);
    }

    /**
     * addProperNoun(): add proper noun and its definition to the collection
     * of proper nouns
     *
     * @param key word field of Word object
     * @param val Word Object
     */
    public void addProperNoun(String key, Word val)
    {
        _properNouns.put(key, val);
    }

    /**
     * addDeterminer(): add determiner and its definition to the collection
     * of determiners
     *
     * @param key word field of Word object
     * @param val Word object
     */
    public void addDeterminer(String key, Word val)
    {
        _determiners.put(key, val);
    }

    /**
     * addPreposition(): add preposition and its definition to the collection
     * of prepositions
     *
     * @param key word field of Word object
     * @param val Word object
     */
    public void addPreposition(String key, Word val)
    {
        _prepositions.put(key, val);
    }

    /**
     * inVocabulary(): given a word, determine if it is in our vocabulary
     *
     * @param word we want to search for
     * @return boolean
     */
    public boolean inVocabulary(String word)
    {
        return  _nouns.containsKey(word) ||
                _verbs.containsKey(word) ||
                _pronouns.containsKey(word) ||
                _properNouns.containsKey(word) ||
                _determiners.containsKey(word) ||
                _prepositions.containsKey(word);
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
        sb.append("Nouns\n");
        sb.append(header);
        mapToString(sb, _nouns);

        // concatenate all verbs to the string
        sb.append("Verbs\n");
        sb.append(header);
        mapToString(sb, _verbs);

        // concatenate all pronouns to the string
        sb.append("Pronouns\n");
        sb.append(header);
        mapToString(sb, _pronouns);

        // concatenate all properNouns to the string
        sb.append("Proper nouns\n");
        sb.append(header);
        mapToString(sb, _properNouns);

        // concatenate all properNouns to the string
        sb.append("Determiners\n");
        sb.append(header);
        mapToString(sb, _determiners);

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
