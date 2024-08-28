// Generated from com/apollographql/apollo/compiler/parser/antlr/GraphQL.g4 by ANTLR 4.5.3

package com.homer.apollographql.apollo.compiler.parser.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, BOOLEAN=15, NAME=16, 
		NUMBER=17, WS=18, COMMENT=19, COMMA=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "STRING", "BOOLEAN", "NAME", "ESC", 
		"UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS", "COMMENT", "COMMA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "':'", "'('", "')'", "'...'", "'on'", "'@'", "'$'", 
		"'='", "'['", "']'", "'!'", null, null, null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "STRING", "BOOLEAN", "NAME", "NUMBER", "WS", "COMMENT", "COMMA"
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


	public GraphQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\7\17V\n\17\f\17\16\17Y\13\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20f\n\20\3\21\3\21\7\21j\n\21\f\21\16\21m"+
		"\13\21\3\22\3\22\3\22\5\22r\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\5\25}\n\25\3\25\3\25\3\25\6\25\u0082\n\25\r\25\16\25\u0083\3"+
		"\25\5\25\u0087\n\25\3\25\5\25\u008a\n\25\3\25\3\25\3\25\3\25\5\25\u0090"+
		"\n\25\3\25\5\25\u0093\n\25\3\26\3\26\3\26\7\26\u0098\n\26\f\26\16\26\u009b"+
		"\13\26\5\26\u009d\n\26\3\27\3\27\5\27\u00a1\n\27\3\27\3\27\3\30\6\30\u00a6"+
		"\n\30\r\30\16\30\u00a7\3\30\3\30\3\31\3\31\7\31\u00ae\n\31\f\31\16\31"+
		"\u00b1\13\31\3\31\3\31\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2)"+
		"\23+\2-\2/\24\61\25\63\26\3\2\r\4\2$$^^\5\2C\\aac|\6\2\62;C\\aac|\n\2"+
		"$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\u00c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2)\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2"+
		"\2\2\17C\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3"+
		"\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#n\3\2\2\2%s\3\2\2"+
		"\2\'y\3\2\2\2)\u0092\3\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a5\3\2"+
		"\2\2\61\u00ab\3\2\2\2\63\u00b4\3\2\2\2\65\66\7}\2\2\66\4\3\2\2\2\678\7"+
		"\177\2\28\6\3\2\2\29:\7<\2\2:\b\3\2\2\2;<\7*\2\2<\n\3\2\2\2=>\7+\2\2>"+
		"\f\3\2\2\2?@\7\60\2\2@A\7\60\2\2AB\7\60\2\2B\16\3\2\2\2CD\7q\2\2DE\7p"+
		"\2\2E\20\3\2\2\2FG\7B\2\2G\22\3\2\2\2HI\7&\2\2I\24\3\2\2\2JK\7?\2\2K\26"+
		"\3\2\2\2LM\7]\2\2M\30\3\2\2\2NO\7_\2\2O\32\3\2\2\2PQ\7#\2\2Q\34\3\2\2"+
		"\2RW\7$\2\2SV\5#\22\2TV\n\2\2\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7$\2\2[\36\3\2\2\2\\]\7v\2\2]^\7t\2"+
		"\2^_\7w\2\2_f\7g\2\2`a\7h\2\2ab\7c\2\2bc\7n\2\2cd\7u\2\2df\7g\2\2e\\\3"+
		"\2\2\2e`\3\2\2\2f \3\2\2\2gk\t\3\2\2hj\t\4\2\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l\"\3\2\2\2mk\3\2\2\2nq\7^\2\2or\t\5\2\2pr\5%\23\2qo\3"+
		"\2\2\2qp\3\2\2\2r$\3\2\2\2st\7w\2\2tu\5\'\24\2uv\5\'\24\2vw\5\'\24\2w"+
		"x\5\'\24\2x&\3\2\2\2yz\t\6\2\2z(\3\2\2\2{}\7/\2\2|{\3\2\2\2|}\3\2\2\2"+
		"}~\3\2\2\2~\177\5+\26\2\177\u0081\7\60\2\2\u0080\u0082\t\7\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0087\5-\27\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0093\3\2\2\2\u0088\u008a\7/\2\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5+\26\2\u008c\u008d\5-"+
		"\27\2\u008d\u0093\3\2\2\2\u008e\u0090\7/\2\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\5+\26\2\u0092|\3\2\2\2"+
		"\u0092\u0089\3\2\2\2\u0092\u008f\3\2\2\2\u0093*\3\2\2\2\u0094\u009d\7"+
		"\62\2\2\u0095\u0099\t\b\2\2\u0096\u0098\t\7\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009d"+
		",\3\2\2\2\u009e\u00a0\t\t\2\2\u009f\u00a1\t\n\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5+\26\2\u00a3.\3"+
		"\2\2\2\u00a4\u00a6\t\13\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\30"+
		"\2\2\u00aa\60\3\2\2\2\u00ab\u00af\7%\2\2\u00ac\u00ae\n\f\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\31\3\2\u00b3\62\3\2\2"+
		"\2\u00b4\u00b5\7.\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\32\2\2\u00b7\64"+
		"\3\2\2\2\23\2UWekq|\u0083\u0086\u0089\u008f\u0092\u0099\u009c\u00a0\u00a7"+
		"\u00af\4\b\2\2\2\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}