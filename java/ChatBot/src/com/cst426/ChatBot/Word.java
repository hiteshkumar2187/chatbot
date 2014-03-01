package com.cst426.chatbot;

/**
 * Word.java
 * <p/>
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
     * getWord(): getter for the word
     *
     * @return String
     */
    public String getWord()
    {
        return _word;
    }

    /**
     * getDefinition(): getter for the definition
     *
     * @return String
     */
    public String getDefinition()
    {
        return _definition;
    }

    /**
     * getType(): getter for the part of speech
     *
     * @return String
     */
    public String getType()
    {
        return _type;
    }
}
