package com.cst426.chatbot.grammar;

/**
 * ChatBotExprVisitor.java
 *
 * Extends ChatBotBaseVisitor -- will look for tokens based on parts of
 * speech during the parse and will add them to the data store
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

import com.cst426.chatbot.Word;
import com.cst426.chatbot.Vocabulary;

public class ChatBotExprVisitor extends ChatBotBaseVisitor<String>
{
    private Vocabulary _vocabulary;

    /**
     * constructor - binds the vocabulary reference to this object
     *
     * @param vocabulary reference to Vocabulary object
     */
    public ChatBotExprVisitor(Vocabulary vocabulary)
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

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addVerb(word, new Word(word, "", "verb"));
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

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addNoun(word, new Word(word, "", "noun"));
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

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addPronoun(word, new Word(word, "", "pronoun"));
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

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addProperNoun(word, new Word(word, "", "properNoun"));
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

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addDeterminer(word, new Word(word, "", "determiner"));
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

        if (!_vocabulary.inVocabulary(word))
        {
            _vocabulary.addPreposition(word, new Word(word, "", "preposition"));
        }

        return "";
    }
}
