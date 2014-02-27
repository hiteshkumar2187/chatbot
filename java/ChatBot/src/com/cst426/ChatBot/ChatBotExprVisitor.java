package com.cst426.ChatBot;

/**
 * ChatBotExprVisitor.java
 *
 * Extends ChatBotBaseVisitor -- will look for tokens based on parts of
 * speech during the parse and will add them to the data store
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

public class ChatBotExprVisitor extends ChatBotBaseVisitor<String>
{
    private DataStore _dataStore;

    /**
     * constructor - binds the datastore to this object
     * @param dataStore reference
     */
    public ChatBotExprVisitor(DataStore dataStore)
    {
        _dataStore = dataStore;
    }

    /**
     * visitVerb(): visits a tree node containing a verb and adds
     * it to the data store
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitVerb(ChatBotParser.VerbContext ctx)
    {
        String word = ctx.getText();

        if ( !_dataStore.getVocabulary().inVocabulary(word) )
        {
            _dataStore.getVocabulary().addVerb(word, "");
        }

        return "";
    }

    /**
     * visitNoun(): visits a tree node containing a noun and adds
     * it to the data store
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitNoun(ChatBotParser.NounContext ctx)
    {
        String word = ctx.getText();

        if ( !_dataStore.getVocabulary().inVocabulary(word) )
        {
            _dataStore.getVocabulary().addNoun(word, "");
        }

        return "";
    }

    /**
     * visitPronoun(): visits a tree node containing a pronoun and adds
     * it to the data store
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitPronoun(ChatBotParser.PronounContext ctx)
    {
        String word = ctx.getText();

        if (!_dataStore.getVocabulary().inVocabulary(word) )
        {
            _dataStore.getVocabulary().addPronoun(word, "");
        }

        return "";
    }

    /**
     * visitProperNoun(): visits a tree node containing a properNoun and adds
     * it to the data store
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitProperNoun(ChatBotParser.ProperNounContext ctx)
    {
        String word = ctx.getText();

        if ( !_dataStore.getVocabulary().inVocabulary(word) )
        {
            _dataStore.getVocabulary().addProperNoun(word, "");
        }

        return "";
    }

    /**
     * visitDet(): visits a tree node containing a determiner and adds it
     * to the data store
     * @param ctx the current node in the parse tree
     * @return String dummy string
     */
    @Override
    public String visitDet(ChatBotParser.DetContext ctx)
    {
        String word = ctx.getText();

        if ( !_dataStore.getVocabulary().inVocabulary(word) )
        {
            _dataStore.getVocabulary().addDeterminer(word, "");
        }

        return "";
    }
}
