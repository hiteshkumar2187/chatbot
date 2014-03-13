package com.cst426.chatbot;

/**
 * Knowledge.java
 *
 * Knowledge the total knowledge that the ChatBot has, including
 * Vocabulary and (what else?)
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

public class Knowledge
{
    // TODO - figure out what other data constitutes "knowledge"

    private Vocabulary _vocabulary = new Vocabulary();

    /**
     * getVocabulary(): returns reference to the vocabular instance
     *
     * @return Vocabulary
     */
    public Vocabulary getVocabulary() { return _vocabulary; }
}