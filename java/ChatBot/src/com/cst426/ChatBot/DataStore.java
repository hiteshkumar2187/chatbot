package com.cst426.ChatBot;

/**
 *  DataStore.java
 *
 *  DataStore contains all of the parts of speech that the ChatBot
 *  can draw upon for conversation logic.
 *
 *  @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

public class DataStore
{
    // TODO - figure out what other data we need in our data store

    Vocabulary _vocabulary;

    /**
     * constructor: initializes all of the DataStore members
     */
    public DataStore()
    {
        _vocabulary = new Vocabulary();
    }

    /**
     * getVocabulary(): returns reference to the vocabular instance
     * @return Vocabulary
     */
    public Vocabulary getVocabulary()
    {
        return _vocabulary;
    }
}
