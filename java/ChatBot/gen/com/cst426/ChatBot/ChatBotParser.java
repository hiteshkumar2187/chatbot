// Generated from ChatBot.g4 by ANTLR 4.2
package com.cst426.ChatBot;
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
		EOL=1, NUMBER=2, WS=3, I=4, YOU=5, HE=6, SHE=7, THEY=8, IT=9, JACOB=10, 
		DUSTIN=11, DYLAN=12, BOT=13, IN=14, ON=15, FOR=16, TO=17, BY=18, WITH=19, 
		AT=20, OF=21, FROM=22, AS=23, THE=24, ALL=25, A=26, SOME=27, WHICH=28, 
		THIS=29, THAT=30, BOTH=31, MY=32, YOUR=33, PIZZA=34, SCHOOL=35, EAT=36, 
		LIKE=37;
	public static final String[] tokenNames = {
		"<INVALID>", "EOL", "NUMBER", "' '", "'I'", "YOU", "HE", "SHE", "THEY", 
		"IT", "'Jacob'", "'Dustin'", "'Dylan'", "'Bot'", "'in'", "'on'", "'for'", 
		"'to'", "'by'", "'with'", "'at'", "'of'", "'from'", "'as'", "THE", "ALL", 
		"A", "SOME", "WHICH", "THIS", "THAT", "BOTH", "MY", "YOUR", "'pizza'", 
		"'school'", "'eat'", "LIKE"
	};
	public static final int
		RULE_line = 0, RULE_sentence = 1, RULE_np = 2, RULE_nominal = 3, RULE_vp = 4, 
		RULE_pp = 5, RULE_pronoun = 6, RULE_properNoun = 7, RULE_preposition = 8, 
		RULE_det = 9, RULE_verb = 10, RULE_noun = 11;
	public static final String[] ruleNames = {
		"line", "sentence", "np", "nominal", "vp", "pp", "pronoun", "properNoun", 
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
		enterRule(_localctx, 0, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); sentence();
			setState(25); match(EOL);
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
		enterRule(_localctx, 2, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); np();
			setState(28); vp();
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
		enterRule(_localctx, 4, RULE_np);
		try {
			setState(35);
			switch (_input.LA(1)) {
			case I:
			case YOU:
			case HE:
			case SHE:
			case THEY:
			case IT:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); pronoun();
				}
				break;
			case JACOB:
			case DUSTIN:
			case DYLAN:
			case BOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); properNoun();
				}
				break;
			case THE:
			case ALL:
			case A:
			case SOME:
			case WHICH:
			case THIS:
			case THAT:
			case BOTH:
			case MY:
			case YOUR:
				enterOuterAlt(_localctx, 3);
				{
				setState(32); det();
				setState(33); nominal();
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
		enterRule(_localctx, 6, RULE_nominal);
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); noun();
				setState(38); nominal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); noun();
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
		enterRule(_localctx, 8, RULE_vp);
		try {
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); verb();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); verb();
				setState(45); np();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47); verb();
				setState(48); np();
				setState(49); pp();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); verb();
				setState(52); pp();
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
		enterRule(_localctx, 10, RULE_pp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); preposition();
			setState(57); np();
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
		public TerminalNode SHE() { return getToken(ChatBotParser.SHE, 0); }
		public TerminalNode HE() { return getToken(ChatBotParser.HE, 0); }
		public TerminalNode THEY() { return getToken(ChatBotParser.THEY, 0); }
		public TerminalNode I() { return getToken(ChatBotParser.I, 0); }
		public TerminalNode YOU() { return getToken(ChatBotParser.YOU, 0); }
		public TerminalNode IT() { return getToken(ChatBotParser.IT, 0); }
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
		enterRule(_localctx, 12, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << I) | (1L << YOU) | (1L << HE) | (1L << SHE) | (1L << THEY) | (1L << IT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode DUSTIN() { return getToken(ChatBotParser.DUSTIN, 0); }
		public TerminalNode BOT() { return getToken(ChatBotParser.BOT, 0); }
		public TerminalNode DYLAN() { return getToken(ChatBotParser.DYLAN, 0); }
		public TerminalNode JACOB() { return getToken(ChatBotParser.JACOB, 0); }
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
		enterRule(_localctx, 14, RULE_properNoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JACOB) | (1L << DUSTIN) | (1L << DYLAN) | (1L << BOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode AS() { return getToken(ChatBotParser.AS, 0); }
		public TerminalNode IN() { return getToken(ChatBotParser.IN, 0); }
		public TerminalNode ON() { return getToken(ChatBotParser.ON, 0); }
		public TerminalNode FOR() { return getToken(ChatBotParser.FOR, 0); }
		public TerminalNode BY() { return getToken(ChatBotParser.BY, 0); }
		public TerminalNode WITH() { return getToken(ChatBotParser.WITH, 0); }
		public TerminalNode OF() { return getToken(ChatBotParser.OF, 0); }
		public TerminalNode AT() { return getToken(ChatBotParser.AT, 0); }
		public TerminalNode TO() { return getToken(ChatBotParser.TO, 0); }
		public TerminalNode FROM() { return getToken(ChatBotParser.FROM, 0); }
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
		enterRule(_localctx, 16, RULE_preposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << ON) | (1L << FOR) | (1L << TO) | (1L << BY) | (1L << WITH) | (1L << AT) | (1L << OF) | (1L << FROM) | (1L << AS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode BOTH() { return getToken(ChatBotParser.BOTH, 0); }
		public TerminalNode SOME() { return getToken(ChatBotParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(ChatBotParser.ALL, 0); }
		public TerminalNode THE() { return getToken(ChatBotParser.THE, 0); }
		public TerminalNode WHICH() { return getToken(ChatBotParser.WHICH, 0); }
		public TerminalNode MY() { return getToken(ChatBotParser.MY, 0); }
		public TerminalNode YOUR() { return getToken(ChatBotParser.YOUR, 0); }
		public TerminalNode A() { return getToken(ChatBotParser.A, 0); }
		public TerminalNode THAT() { return getToken(ChatBotParser.THAT, 0); }
		public TerminalNode THIS() { return getToken(ChatBotParser.THIS, 0); }
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
		enterRule(_localctx, 18, RULE_det);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THE) | (1L << ALL) | (1L << A) | (1L << SOME) | (1L << WHICH) | (1L << THIS) | (1L << THAT) | (1L << BOTH) | (1L << MY) | (1L << YOUR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode LIKE() { return getToken(ChatBotParser.LIKE, 0); }
		public TerminalNode EAT() { return getToken(ChatBotParser.EAT, 0); }
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
		enterRule(_localctx, 20, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==EAT || _la==LIKE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode SCHOOL() { return getToken(ChatBotParser.SCHOOL, 0); }
		public TerminalNode PIZZA() { return getToken(ChatBotParser.PIZZA, 0); }
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
		enterRule(_localctx, 22, RULE_noun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==PIZZA || _la==SCHOOL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4&\n\4\3"+
		"\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\69\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\b\3\2\6\13\3\2\f\17\3\2\20"+
		"\31\3\2\32#\3\2&\'\3\2$%C\2\32\3\2\2\2\4\35\3\2\2\2\6%\3\2\2\2\b+\3\2"+
		"\2\2\n8\3\2\2\2\f:\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22A\3\2\2\2\24C\3\2"+
		"\2\2\26E\3\2\2\2\30G\3\2\2\2\32\33\5\4\3\2\33\34\7\3\2\2\34\3\3\2\2\2"+
		"\35\36\5\6\4\2\36\37\5\n\6\2\37\5\3\2\2\2 &\5\16\b\2!&\5\20\t\2\"#\5\24"+
		"\13\2#$\5\b\5\2$&\3\2\2\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2&\7\3\2\2\2\'"+
		"(\5\30\r\2()\5\b\5\2),\3\2\2\2*,\5\30\r\2+\'\3\2\2\2+*\3\2\2\2,\t\3\2"+
		"\2\2-9\5\26\f\2./\5\26\f\2/\60\5\6\4\2\609\3\2\2\2\61\62\5\26\f\2\62\63"+
		"\5\6\4\2\63\64\5\f\7\2\649\3\2\2\2\65\66\5\26\f\2\66\67\5\f\7\2\679\3"+
		"\2\2\28-\3\2\2\28.\3\2\2\28\61\3\2\2\28\65\3\2\2\29\13\3\2\2\2:;\5\22"+
		"\n\2;<\5\6\4\2<\r\3\2\2\2=>\t\2\2\2>\17\3\2\2\2?@\t\3\2\2@\21\3\2\2\2"+
		"AB\t\4\2\2B\23\3\2\2\2CD\t\5\2\2D\25\3\2\2\2EF\t\6\2\2F\27\3\2\2\2GH\t"+
		"\7\2\2H\31\3\2\2\2\5%+8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}