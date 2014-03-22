// Generated from ChatBot.g4 by ANTLR 4.2
package com.cst426.chatbot.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatBotParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, NUMBER=2, WS=3, PRONOUN=4, PROPERNOUN=5, PREPOSITION=6, DETERMINER=7, 
		NOUN=8, VERB=9;
	public static final String[] tokenNames = {
		"<INVALID>", "EOL", "NUMBER", "' '", "'pronoun'", "'properNoun'", "'preposition'", 
		"'determiner'", "'noun'", "'verb'"
	};
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_sentence = 2, RULE_np = 3, RULE_nominal = 4, 
		RULE_vp = 5, RULE_pp = 6, RULE_pronoun = 7, RULE_properNoun = 8, RULE_preposition = 9, 
		RULE_det = 10, RULE_verb = 11, RULE_noun = 12;
	public static final String[] ruleNames = {
		"prog", "line", "sentence", "np", "nominal", "vp", "pp", "pronoun", "properNoun", 
		"preposition", "det", "verb", "noun"
	};

	@Override
	public String getGrammarFileName() { return "ChatBot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatBotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26); line();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRONOUN) | (1L << PROPERNOUN) | (1L << DETERMINER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode EOL() { return getToken(ChatBotParser.EOL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); sentence();
			setState(32); match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public VpContext vp() {
			return getRuleContext(VpContext.class,0);
		}
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); np();
			setState(35); vp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NpContext extends ParserRuleContext {
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public ProperNounContext properNoun() {
			return getRuleContext(ProperNounContext.class,0);
		}
		public NominalContext nominal() {
			return getRuleContext(NominalContext.class,0);
		}
		public DetContext det() {
			return getRuleContext(DetContext.class,0);
		}
		public NpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_np; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterNp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitNp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitNp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NpContext np() throws RecognitionException {
		NpContext _localctx = new NpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_np);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case PRONOUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); pronoun();
				}
				break;
			case PROPERNOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); properNoun();
				}
				break;
			case DETERMINER:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); det();
				setState(40); nominal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NominalContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public NominalContext nominal() {
			return getRuleContext(NominalContext.class,0);
		}
		public NominalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterNominal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitNominal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitNominal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NominalContext nominal() throws RecognitionException {
		NominalContext _localctx = new NominalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nominal);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); noun();
				setState(45); nominal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); noun();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VpContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public PpContext pp() {
			return getRuleContext(PpContext.class,0);
		}
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public VpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterVp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitVp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitVp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VpContext vp() throws RecognitionException {
		VpContext _localctx = new VpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vp);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); verb();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); verb();
				setState(52); np();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); verb();
				setState(55); np();
				setState(56); pp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); verb();
				setState(59); pp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PpContext extends ParserRuleContext {
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public NpContext np() {
			return getRuleContext(NpContext.class,0);
		}
		public PpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterPp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitPp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitPp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PpContext pp() throws RecognitionException {
		PpContext _localctx = new PpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); preposition();
			setState(64); np();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PronounContext extends ParserRuleContext {
		public TerminalNode PRONOUN() { return getToken(ChatBotParser.PRONOUN, 0); }
		public PronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterPronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitPronoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitPronoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PronounContext pronoun() throws RecognitionException {
		PronounContext _localctx = new PronounContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pronoun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(PRONOUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProperNounContext extends ParserRuleContext {
		public TerminalNode PROPERNOUN() { return getToken(ChatBotParser.PROPERNOUN, 0); }
		public ProperNounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properNoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterProperNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitProperNoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitProperNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProperNounContext properNoun() throws RecognitionException {
		ProperNounContext _localctx = new ProperNounContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_properNoun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(PROPERNOUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrepositionContext extends ParserRuleContext {
		public TerminalNode PREPOSITION() { return getToken(ChatBotParser.PREPOSITION, 0); }
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitPreposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitPreposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_preposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(PREPOSITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DetContext extends ParserRuleContext {
		public TerminalNode DETERMINER() { return getToken(ChatBotParser.DETERMINER, 0); }
		public DetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_det; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterDet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitDet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitDet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DetContext det() throws RecognitionException {
		DetContext _localctx = new DetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_det);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(DETERMINER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(ChatBotParser.VERB, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(VERB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NounContext extends ParserRuleContext {
		public TerminalNode NOUN() { return getToken(ChatBotParser.NOUN, 0); }
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChatBotListener ) ((ChatBotListener)listener).exitNoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChatBotVisitor ) return ((ChatBotVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_noun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(NOUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\2J\2\35\3\2\2\2\4!\3\2\2\2\6$\3\2\2\2\b,\3\2\2\2\n\62"+
		"\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2\20D\3\2\2\2\22F\3\2\2\2\24H\3\2\2\2\26"+
		"J\3\2\2\2\30L\3\2\2\2\32N\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\"\5\6\4\2\"#\7\3\2\2#\5\3"+
		"\2\2\2$%\5\b\5\2%&\5\f\7\2&\7\3\2\2\2\'-\5\20\t\2(-\5\22\n\2)*\5\26\f"+
		"\2*+\5\n\6\2+-\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2-\t\3\2\2\2./\5\32"+
		"\16\2/\60\5\n\6\2\60\63\3\2\2\2\61\63\5\32\16\2\62.\3\2\2\2\62\61\3\2"+
		"\2\2\63\13\3\2\2\2\64@\5\30\r\2\65\66\5\30\r\2\66\67\5\b\5\2\67@\3\2\2"+
		"\289\5\30\r\29:\5\b\5\2:;\5\16\b\2;@\3\2\2\2<=\5\30\r\2=>\5\16\b\2>@\3"+
		"\2\2\2?\64\3\2\2\2?\65\3\2\2\2?8\3\2\2\2?<\3\2\2\2@\r\3\2\2\2AB\5\24\13"+
		"\2BC\5\b\5\2C\17\3\2\2\2DE\7\6\2\2E\21\3\2\2\2FG\7\7\2\2G\23\3\2\2\2H"+
		"I\7\b\2\2I\25\3\2\2\2JK\7\t\2\2K\27\3\2\2\2LM\7\13\2\2M\31\3\2\2\2NO\7"+
		"\n\2\2O\33\3\2\2\2\6\37,\62?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}