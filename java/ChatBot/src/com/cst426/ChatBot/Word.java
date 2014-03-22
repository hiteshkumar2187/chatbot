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
    // word type constants
    public static final String NOUN = "noun";
    public static final String VERB = "verb";
    public static final String PRONOUN = "pronoun";
    public static final String PROPER_NOUN = "properNoun";
    public static final String PREPOSITION = "preposition";
    public static final String DETERMINER = "determiner";

    // properties
    private String _word;
    private String _type;
    private String _definition;

    // constructor
    public Word(String word, String type, String definition)
    {
        _word = word;
        _type = type;
        _definition = definition;
    }

    public String getWord()
    {
        return _word;
    }

    public String getType()
    {
        return _type;
    }

    public String getDefinition()
    {
        return _definition;
    }
}
