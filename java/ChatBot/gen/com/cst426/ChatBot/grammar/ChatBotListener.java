// Generated from ChatBot.g4 by ANTLR 4.2
package com.cst426.chatbot.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatBotParser}.
 */
public interface ChatBotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatBotParser#det}.
	 * @param ctx the parse tree
	 */
	void enterDet(@NotNull ChatBotParser.DetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#det}.
	 * @param ctx the parse tree
	 */
	void exitDet(@NotNull ChatBotParser.DetContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#np}.
	 * @param ctx the parse tree
	 */
	void enterNp(@NotNull ChatBotParser.NpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#np}.
	 * @param ctx the parse tree
	 */
	void exitNp(@NotNull ChatBotParser.NpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void enterPronoun(@NotNull ChatBotParser.PronounContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void exitPronoun(@NotNull ChatBotParser.PronounContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull ChatBotParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull ChatBotParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull ChatBotParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull ChatBotParser.SentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#nominal}.
	 * @param ctx the parse tree
	 */
	void enterNominal(@NotNull ChatBotParser.NominalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#nominal}.
	 * @param ctx the parse tree
	 */
	void exitNominal(@NotNull ChatBotParser.NominalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#vp}.
	 * @param ctx the parse tree
	 */
	void enterVp(@NotNull ChatBotParser.VpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#vp}.
	 * @param ctx the parse tree
	 */
	void exitVp(@NotNull ChatBotParser.VpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(@NotNull ChatBotParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(@NotNull ChatBotParser.PrepositionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ChatBotParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ChatBotParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull ChatBotParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull ChatBotParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(@NotNull ChatBotParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(@NotNull ChatBotParser.NounContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#properNoun}.
	 * @param ctx the parse tree
	 */
	void enterProperNoun(@NotNull ChatBotParser.ProperNounContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#properNoun}.
	 * @param ctx the parse tree
	 */
	void exitProperNoun(@NotNull ChatBotParser.ProperNounContext ctx);

	/**
	 * Enter a parse tree produced by {@link ChatBotParser#pp}.
	 * @param ctx the parse tree
	 */
	void enterPp(@NotNull ChatBotParser.PpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatBotParser#pp}.
	 * @param ctx the parse tree
	 */
	void exitPp(@NotNull ChatBotParser.PpContext ctx);
}