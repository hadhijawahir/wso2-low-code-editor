package org.wso2.antlr;

// Generated from CompilerParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, COLON=2, DOT=3, COMMA=4, LEFT_BRACE=5, RIGHT_BRACE=6, SINGLE_STRING=7, 
		DOUBLE_STRING=8, PUBLISHER=9, SUBSCRIBER=10, TRUE=11, FALSE=12, IDENTIFIER=13, 
		WS=14;
	public static final int
		RULE_compilationUnit = 0, RULE_publisher = 1, RULE_subscriber = 2, RULE_keyValuePair = 3, 
		RULE_primitive = 4, RULE_string = 5, RULE_bool = 6;
	public static final String[] ruleNames = {
		"compilationUnit", "publisher", "subscriber", "keyValuePair", "primitive", 
		"string", "bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'.'", "','", "'{'", "'}'", null, null, "'publisher'", 
		"'subscriber'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMICOLON", "COLON", "DOT", "COMMA", "LEFT_BRACE", "RIGHT_BRACE", 
		"SINGLE_STRING", "DOUBLE_STRING", "PUBLISHER", "SUBSCRIBER", "TRUE", "FALSE", 
		"IDENTIFIER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CompilerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<PublisherContext> publisher() {
			return getRuleContexts(PublisherContext.class);
		}
		public PublisherContext publisher(int i) {
			return getRuleContext(PublisherContext.class,i);
		}
		public List<SubscriberContext> subscriber() {
			return getRuleContexts(SubscriberContext.class);
		}
		public SubscriberContext subscriber(int i) {
			return getRuleContext(SubscriberContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLISHER || _la==SUBSCRIBER) {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUBLISHER:
					{
					setState(14);
					publisher();
					}
					break;
				case SUBSCRIBER:
					{
					setState(15);
					subscriber();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PublisherContext extends ParserRuleContext {
		public TerminalNode PUBLISHER() { return getToken(CompilerParser.PUBLISHER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(CompilerParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CompilerParser.RIGHT_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CompilerParser.SEMICOLON, 0); }
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CompilerParser.COMMA, i);
		}
		public PublisherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publisher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterPublisher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitPublisher(this);
		}
	}

	public final PublisherContext publisher() throws RecognitionException {
		PublisherContext _localctx = new PublisherContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_publisher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(PUBLISHER);
			setState(22);
			match(LEFT_BRACE);
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(23);
					keyValuePair();
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(29);
					match(COMMA);
					setState(30);
					keyValuePair();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(38);
			match(RIGHT_BRACE);
			setState(39);
			match(SEMICOLON);
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

	public static class SubscriberContext extends ParserRuleContext {
		public TerminalNode SUBSCRIBER() { return getToken(CompilerParser.SUBSCRIBER, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(CompilerParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CompilerParser.RIGHT_BRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CompilerParser.SEMICOLON, 0); }
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CompilerParser.COMMA, i);
		}
		public SubscriberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterSubscriber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitSubscriber(this);
		}
	}

	public final SubscriberContext subscriber() throws RecognitionException {
		SubscriberContext _localctx = new SubscriberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subscriber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SUBSCRIBER);
			setState(42);
			match(LEFT_BRACE);
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(43);
					keyValuePair();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(49);
					match(COMMA);
					setState(50);
					keyValuePair();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(58);
			match(RIGHT_BRACE);
			setState(59);
			match(SEMICOLON);
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

	public static class KeyValuePairContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CompilerParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CompilerParser.COLON, 0); }
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CompilerParser.SEMICOLON, 0); }
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitKeyValuePair(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(COLON);
			setState(63);
			primitive();
			setState(64);
			match(SEMICOLON);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitPrimitive(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitive);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_STRING:
			case DOUBLE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				string();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				bool();
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_STRING() { return getToken(CompilerParser.SINGLE_STRING, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(CompilerParser.DOUBLE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_STRING || _la==DOUBLE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CompilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CompilerParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerParserListener ) ((CompilerParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\7\3\"\n\3\f\3"+
		"\16\3%\13\3\5\3\'\n\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13"+
		"\4\3\4\3\4\7\4\66\n\4\f\4\16\49\13\4\5\4;\n\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\5\6G\n\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4"+
		"\3\2\t\n\3\2\r\16\2N\2\24\3\2\2\2\4\27\3\2\2\2\6+\3\2\2\2\b?\3\2\2\2\n"+
		"F\3\2\2\2\fH\3\2\2\2\16J\3\2\2\2\20\23\5\4\3\2\21\23\5\6\4\2\22\20\3\2"+
		"\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2"+
		"\2\2\26\24\3\2\2\2\27\30\7\13\2\2\30&\7\7\2\2\31\33\5\b\5\2\32\31\3\2"+
		"\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35#\3\2\2\2\36\34\3\2\2"+
		"\2\37 \7\6\2\2 \"\5\b\5\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$"+
		"\'\3\2\2\2%#\3\2\2\2&\34\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\b\2\2)*\7\3"+
		"\2\2*\5\3\2\2\2+,\7\f\2\2,:\7\7\2\2-/\5\b\5\2.-\3\2\2\2/\62\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\67\3\2\2\2\62\60\3\2\2\2\63\64\7\6\2\2\64\66"+
		"\5\b\5\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\2:\60\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\b\2\2=>\7\3\2\2>\7\3"+
		"\2\2\2?@\7\17\2\2@A\7\4\2\2AB\5\n\6\2BC\7\3\2\2C\t\3\2\2\2DG\5\f\7\2E"+
		"G\5\16\b\2FD\3\2\2\2FE\3\2\2\2G\13\3\2\2\2HI\t\2\2\2I\r\3\2\2\2JK\t\3"+
		"\2\2K\17\3\2\2\2\13\22\24\34#&\60\67:F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}