package com.cst426.chatbot.grammar;

/**
 * ChatBotSentenceVisitor.java
 *
 * Extends ChatBotBaseVisitor -- will look for tokens based on parts of
 * speech during the parse and will add them to the data store
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import com.cst426.chatbot.Word;
import com.cst426.chatbot.Vocabulary;

public class ChatBotSentenceVisitor extends ChatBotBaseVisitor<String>
{
    private Vocabulary _vocabulary;

    /**
     * constructor - binds the vocabulary reference to this object
     *
     * @param vocabulary reference to Vocabulary object
     */
    public ChatBotSentenceVisitor(Vocabulary vocabulary)
    {
        _vocabulary = vocabulary;
    }

    /**
     * visitVerb(): visits a tree node containing a verb and adds
     * it to the data store
     *
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitVerb(ChatBotParser.VerbContext ctx)
    {
        String word = ctx.getText();

        // if the chatbot doesn't know the word, add it to the dictionary
        // without the definition, then ask about it later

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addWord(word, new Word(word, Word.VERB, ""));
        }

        return "";
    }

    /**
     * visitNoun(): visits a tree node containing a noun and adds
     * it to the data store
     *
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitNoun(ChatBotParser.NounContext ctx)
    {
        String word = ctx.getText();

        // if the chatbot doesn't know the word, add it to the dictionary
        // without the definition, then ask about it later

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addWord(word, new Word(word, Word.NOUN, ""));
        }

        return "";
    }

    /**
     * visitPronoun(): visits a tree node containing a pronoun and adds
     * it to the data store
     *
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitPronoun(ChatBotParser.PronounContext ctx)
    {
        String word = ctx.getText();

        // if the chatbot doesn't know the word, add it to the dictionary
        // without the definition, then ask about it later

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addWord(word, new Word(word, Word.PRONOUN, ""));
        }

        return "";
    }

    /**
     * visitProperNoun(): visits a tree node containing a properNoun and adds
     * it to the data store
     *
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitProperNoun(ChatBotParser.ProperNounContext ctx)
    {
        String word = ctx.getText();

        // if the chatbot doesn't know the word, add it to the dictionary
        // without the definition, then ask about it later

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addWord(word, new Word(word, Word.PROPER_NOUN, ""));
        }

        return "";
    }

    /**
     * visitDet(): visits a tree node containing a determiner and adds it
     * to the data store
     *
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitDet(ChatBotParser.DetContext ctx)
    {
        String word = ctx.getText();

        // if the chatbot doesn't know the word, add it to the dictionary
        // without the definition, then ask about it later

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addWord(word, new Word(word, Word.DETERMINER, ""));
        }

        return "";
    }

    /**
     * visitPreposition(): visits a tree node containing a determiner and adds it
     * to the data store
     *
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitPreposition(ChatBotParser.PrepositionContext ctx)
    {
        String word = ctx.getText();

        // if the chatbot doesn't know the word, add it to the dictionary
        // without the definition, then ask about it later

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addWord(word, new Word(word, Word.PREPOSITION, ""));
        }

        return "";
    }
}
