package com.cst426.chatbot;

/**
 * Word.java
 *
 * Vocabulary word implements the Model interface
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */


public class Word
{
    private String _word;
    private String _definition;
    private String _type;

    /**
     * constructor: sets the word, the definition and the part of speech
     */
    public Word(String word, String definition, String type)
    {
        _word = word;
        _definition = definition;
        _type = type;
    }

    /**
     * Word member Getters
     */
    public String getWord() { return _word; }

    public String getDefinition() { return _definition; }

    public String getType() { return _type; }
}
