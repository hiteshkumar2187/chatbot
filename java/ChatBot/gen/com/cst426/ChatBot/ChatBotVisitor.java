// Generated from ChatBot.g4 by ANTLR 4.2
package com.cst426.ChatBot;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChatBotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChatBotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChatBotParser#det}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDet(@NotNull ChatBotParser.DetContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#np}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNp(@NotNull ChatBotParser.NpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#pronoun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPronoun(@NotNull ChatBotParser.PronounContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull ChatBotParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(@NotNull ChatBotParser.SentenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#nominal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNominal(@NotNull ChatBotParser.NominalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#vp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVp(@NotNull ChatBotParser.VpContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#preposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreposition(@NotNull ChatBotParser.PrepositionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull ChatBotParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(@NotNull ChatBotParser.VerbContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(@NotNull ChatBotParser.NounContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#properNoun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperNoun(@NotNull ChatBotParser.ProperNounContext ctx);

	/**
	 * Visit a parse tree produced by {@link ChatBotParser#pp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPp(@NotNull ChatBotParser.PpContext ctx);
}