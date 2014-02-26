/**
 *  DataStore.java
 *
 *  DataStore contains all of the parts of speech that the ChatBot
 *  can draw upon for conversation logic.
 *
 *  @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

package com.cst426.ChatBot;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class DataStore
{
    /**
     * _partsOfSpeech: the various words that make up a sentence. Each key contains a
     */
    private Map<String, Set> _partsOfSpeech = new HashMap<String, Set>();

    /**
     * DataStore(): constructor, initializes the parts of speech
     */
    public DataStore()
    {
        //
        // NOTE: this is really just an example. Not sure what to do
        // with this data yet...
        //

        _partsOfSpeech.put( "nouns", new HashSet<String>() );
        _partsOfSpeech.put( "verbs", new HashSet<String>() );
        _partsOfSpeech.put( "pronouns", new HashSet<String>() );
        _partsOfSpeech.put( "properNouns", new HashSet<String>() );
        _partsOfSpeech.put( "determiners", new HashSet<String>() );
    }

    /**
     * addPronoun(): adds a pronoun to the DataStore
     * @param pronoun a pronoun string
     */
    public void addPronoun(String pronoun)
    {
        Object pronouns = _partsOfSpeech.get("pronouns");
        addElement(pronoun, pronouns);
    }

    /**
     * addProperNoun(): adds a properNoun to the DataStore
     * @param properNoun a properNoun string
     */
    public void addProperNoun(String properNoun)
    {
        Object properNouns = _partsOfSpeech.get("properNouns");
        addElement(properNoun, properNouns);
    }

    /**
     * addDeterminer(): adds a determine to the DataStore
     * @param determiner a determiner string
     */
    public void addDeterminer(String determiner)
    {
        Object determiners = _partsOfSpeech.get("determiners");
        addElement(determiner, determiners);
    }

    /**
     * addNoun(): adds a noun to the DataStore
     * @param noun a noun string
     */
    public void addNoun(String noun)
    {
        Object nouns = _partsOfSpeech.get("nouns");
        addElement(noun, nouns);
    }

    /**
     * addVerb(): adds a verb to the DataStore
     * @param verb a verb string
     */
    public void addVerb(String verb)
    {
        Object verbs = _partsOfSpeech.get("verbs");
        addElement(verb, verbs);
    }

    /**
     * addElement(): add an element to a collection
     * @param elem the element to add to the collection
     * @param collection the collection to be added to
     */
    @SuppressWarnings("unchecked")
    private void addElement(String elem, Object collection)
    {
        if (collection instanceof HashSet<?>)
        {
            HashSet<String> temp = (HashSet<String>)collection;
            temp.add(elem);
        }
    }
}
