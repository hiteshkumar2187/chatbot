package com.cst426.ChatBot;

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
    /**
     * Each word falls under 5 different classifications
     */
    private Map<String, String> _nouns;
    private Map<String, String> _verbs;
    private Map<String, String> _pronouns;
    private Map<String, String> _properNouns;
    private Map<String, String> _determiners;

    /**
     * constructor: initializes all Maps for all different
     * word classifications
     */
    public Vocabulary()
    {
        _nouns = new HashMap<String, String>();
        _verbs = new HashMap<String, String>();
        _pronouns = new HashMap<String, String>();
        _properNouns = new HashMap<String, String>();
        _determiners = new HashMap<String, String>();
    }

    /**
     * addNoun(): add a noun and its definition to the collection
     * of nouns
     * @param noun to be added to the verb map
     * @param def for the verb
     */
    public void addNoun(String noun, String def)
    {
        _nouns.put(noun, def);
    }

    /**
     * addVerb(): add a verb and its definition to the collection
     * of verbs
     * @param verb to be added to the the verb map
     * @param def for the verb
     */
    public void addVerb(String verb, String def)
    {
        _verbs.put(verb, def);
    }

    /**
     * addPronoun(): add pronoun and its definition to the collection
     * of pronouns
     * @param pronoun to be added to the pronoun map
     * @param def for the pronoun
     */
    public void addPronoun(String pronoun, String def)
    {
        _pronouns.put(pronoun, def);
    }

    /**
     * addProperNoun(): add proper noun and its definition to the collection
     * of proper nouns
     * @param properNoun to be added to the properNoun map
     * @param def for the properNoun
     */
    public void addProperNoun(String properNoun, String def)
    {
        _properNouns.put(properNoun, def);
    }

    /**
     * addDeterminer(): add determiner and its definitino to the collection
     * of determiners
     * @param determiner to be added to the determiner map
     * @param def for the determiner
     */
    public void addDeterminer(String determiner, String def)
    {
        _determiners.put(determiner, def);
    }

    /**
     * inVocabulary(): given a word, determine if it is in our vocabulary
     * @param word we want to search for
     * @return boolean
     */
    public boolean inVocabulary(String word)
    {
        return _nouns.containsKey(word) ||
               _verbs.containsKey(word) ||
               _pronouns.containsKey(word) ||
               _properNouns.containsKey(word) ||
               _determiners.containsKey(word);
    }

    /**
     * toString(): returns String representation of the vocabulary
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
     * @param sb reference to string builder
     * @param hm reference to our Map<String, String>
     */
    private void mapToString(StringBuilder sb, Map<String, String> hm)
    {
        for ( Map.Entry entry : hm.entrySet() )
        {
            sb.append( entry.getKey () );
            sb.append("\n");
        }

        sb.append("\n");
    }
}
