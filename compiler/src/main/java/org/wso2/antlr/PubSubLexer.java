package org.wso2.antlr;// Generated from PubSub.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PubSubLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SEMICOLON=3, COLON=4, DOT=5, COMMA=6, LEFT_BRACE=7, RIGHT_BRACE=8, 
		SINGLE_STRING=9, DOUBLE_STRING=10, NATP=11, NATS=12, IDENTIFIER=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SEMICOLON", "COLON", "DOT", "COMMA", "LEFT_BRACE", "RIGHT_BRACE", 
		"SINGLE_STRING", "DOUBLE_STRING", "NATP", "NATS", "IDENTIFIER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "';'", "':'", "'.'", "','", "'{'", "'}'", null, 
		null, "'natP'", "'natS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SEMICOLON", "COLON", "DOT", "COMMA", "LEFT_BRACE", 
		"RIGHT_BRACE", "SINGLE_STRING", "DOUBLE_STRING", "NATP", "NATS", "IDENTIFIER", 
		"WS"
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


	public PubSubLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PubSub.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\6\n9\n\n\r\n\16\n:\3\n\3\n\3\13\3\13\6\13A\n\13\r\13\16\13B\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16R\n\16\r\16\16\16"+
		"S\3\17\6\17W\n\17\r\17\16\17X\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\6\3\2))\3\2$$\7\2/"+
		"/\62;C\\aac|\5\2\13\f\17\17\"\"\2_\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3\37\3\2\2\2\5$\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2"+
		"\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\25>\3\2\2\2\27F\3\2\2\2"+
		"\31K\3\2\2\2\33Q\3\2\2\2\35V\3\2\2\2\37 \7v\2\2 !\7t\2\2!\"\7w\2\2\"#"+
		"\7g\2\2#\4\3\2\2\2$%\7h\2\2%&\7c\2\2&\'\7n\2\2\'(\7u\2\2()\7g\2\2)\6\3"+
		"\2\2\2*+\7=\2\2+\b\3\2\2\2,-\7<\2\2-\n\3\2\2\2./\7\60\2\2/\f\3\2\2\2\60"+
		"\61\7.\2\2\61\16\3\2\2\2\62\63\7}\2\2\63\20\3\2\2\2\64\65\7\177\2\2\65"+
		"\22\3\2\2\2\668\7)\2\2\679\n\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;<\3\2\2\2<=\7)\2\2=\24\3\2\2\2>@\7$\2\2?A\n\3\2\2@?\3\2\2\2AB\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7$\2\2E\26\3\2\2\2FG\7p\2\2GH\7"+
		"c\2\2HI\7v\2\2IJ\7R\2\2J\30\3\2\2\2KL\7p\2\2LM\7c\2\2MN\7v\2\2NO\7U\2"+
		"\2O\32\3\2\2\2PR\t\4\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\34\3"+
		"\2\2\2UW\t\5\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b"+
		"\17\2\2[\36\3\2\2\2\7\2:BSX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}