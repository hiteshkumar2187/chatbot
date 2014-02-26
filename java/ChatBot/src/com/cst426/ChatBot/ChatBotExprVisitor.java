/**
 * ChatBotExprVisitor.java
 *
 * Extends ChatBotBaseVisitor -- will look for tokens based on parts of
 * speech during the parse and will add them to the data store
 *
 * @author Dylan Gleason, dgleason8384 -at- gmail -dot- com
 */

package com.cst426.ChatBot;

public class ChatBotExprVisitor extends ChatBotBaseVisitor<String>
{
    private DataStore _dataStore;

    /**
     * Constructor
     * @param dataStore a reference to the partsOfSpeech for our knowledge store
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
        _dataStore.addVerb(word);
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
        _dataStore.addNoun(word);
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
        _dataStore.addPronoun(word);
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
        _dataStore.addProperNoun(word);
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
        _dataStore.addDeterminer(word);
        return "";
    }
}
