// Generated from src\main\java\com\fokkenrood\antlr\RegelSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegelSpraakLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AAN=4, ALS=5, DAN=6, DDE=7, DE=8, 
		EEEN=9, EEN=10, EN=11, GELIJK=12, GESTELD=13, GROTER=14, HHET=15, HET=16, 
		INVOER=17, IN=18, IS=19, JA=20, KLEINER=21, LUIDT=22, MET=23, NEE=24, 
		NIET=25, OF=26, OP=27, OMVAT=28, RREGEL=29, REGEL=30, TTESTCASE=31, TESTGEVALLEN=32, 
		VOLGENDE=33, VUREN=34, WAARBIJ=35, WERKGEVER=36, WERKNEMER=37, WAARDOOR=38, 
		WORDT=39, ZAL=40, DUBBELE_PUNT=41, GETAL_NUL=42, PUNT=43, STREEPJE=44, 
		DATUM=45, FLOAT=46, GETAL=47, WOORD=48, WS=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AAN", "ALS", "DAN", "DDE", "DE", "EEEN", "EEN", "EN", "GELIJK", "GESTELD", 
		"GROTER", "HHET", "HET", "INVOER", "IN", "IS", "JA", "KLEINER", "LUIDT", 
		"MET", "NEE", "NIET", "OF", "OP", "OMVAT", "RREGEL", "REGEL", "TTESTCASE", 
		"TESTGEVALLEN", "VOLGENDE", "VUREN", "WAARBIJ", "WERKGEVER", "WERKNEMER", 
		"WAARDOOR", "WORDT", "ZAL", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", 
		"DATUM", "FLOAT", "GETAL", "WOORD", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'aan'", "'als'", "'dan'", "'De'", "'de'", "'Een'", 
		"'een'", "'en'", "'gelijk'", "'gesteld'", "'groter'", "'Het'", "'het'", 
		"'invoer'", "'in'", "'is'", "'ja'", "'kleiner'", "'luidt'", "'met'", "'nee'", 
		"'niet'", "'of'", "'op'", "'omvat'", "'Regel'", "'regel'", "'Testcase'", 
		"'testgevallen'", "'volgende'", "'vuren'", "'waarbij'", "'werkgever'", 
		"'werknemer'", "'waardoor'", "'wordt'", "'zal'", "':'", "'0'", "'.'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "AAN", "ALS", "DAN", "DDE", 
		"DE", "EEEN", "EEN", "EN", "GELIJK", "GESTELD", "GROTER", "HHET", "HET", 
		"INVOER", "IN", "IS", "JA", "KLEINER", "LUIDT", "MET", "NEE", "NIET", 
		"OF", "OP", "OMVAT", "RREGEL", "REGEL", "TTESTCASE", "TESTGEVALLEN", "VOLGENDE", 
		"VUREN", "WAARBIJ", "WERKGEVER", "WERKNEMER", "WAARDOOR", "WORDT", "ZAL", 
		"DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", "DATUM", "FLOAT", "GETAL", 
		"WOORD", "WS"
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


	public RegelSpraakLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegelSpraak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			TEKST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEKST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().replaceAll("\"","")); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u01a3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\7\2r\n\2\f\2\16\2u\13\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u0094\n\b"+
		"\f\b\16\b\u0097\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\7\63\u0182"+
		"\n\63\f\63\16\63\u0185\13\63\3\63\3\63\6\63\u0189\n\63\r\63\16\63\u018a"+
		"\3\64\5\64\u018e\n\64\3\64\6\64\u0191\n\64\r\64\16\64\u0192\3\65\3\65"+
		"\3\65\7\65\u0198\n\65\f\65\16\65\u019b\13\65\3\66\6\66\u019e\n\66\r\66"+
		"\16\66\u019f\3\66\3\66\5s\u0081\u0095\2\67\3\3\5\4\7\2\t\2\13\2\r\2\17"+
		"\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-"+
		"\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q"+
		"&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\u01a8\2\3\3\2\2\2\2\5\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5{\3\2\2\2\7\u0089\3\2\2\2\t\u008b"+
		"\3\2\2\2\13\u008d\3\2\2\2\r\u008f\3\2\2\2\17\u0091\3\2\2\2\21\u009b\3"+
		"\2\2\2\23\u009f\3\2\2\2\25\u00a3\3\2\2\2\27\u00a7\3\2\2\2\31\u00aa\3\2"+
		"\2\2\33\u00ad\3\2\2\2\35\u00b1\3\2\2\2\37\u00b5\3\2\2\2!\u00b8\3\2\2\2"+
		"#\u00bf\3\2\2\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d2\3\2\2\2+\u00d6\3"+
		"\2\2\2-\u00dd\3\2\2\2/\u00e0\3\2\2\2\61\u00e3\3\2\2\2\63\u00e6\3\2\2\2"+
		"\65\u00ee\3\2\2\2\67\u00f4\3\2\2\29\u00f8\3\2\2\2;\u00fc\3\2\2\2=\u0101"+
		"\3\2\2\2?\u0104\3\2\2\2A\u0107\3\2\2\2C\u010d\3\2\2\2E\u0113\3\2\2\2G"+
		"\u0119\3\2\2\2I\u0122\3\2\2\2K\u012f\3\2\2\2M\u0138\3\2\2\2O\u013e\3\2"+
		"\2\2Q\u0146\3\2\2\2S\u0150\3\2\2\2U\u015a\3\2\2\2W\u0163\3\2\2\2Y\u0169"+
		"\3\2\2\2[\u016d\3\2\2\2]\u016f\3\2\2\2_\u0171\3\2\2\2a\u0173\3\2\2\2c"+
		"\u0175\3\2\2\2e\u0183\3\2\2\2g\u018d\3\2\2\2i\u0194\3\2\2\2k\u019d\3\2"+
		"\2\2mn\7\61\2\2no\7,\2\2os\3\2\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3"+
		"\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7,\2\2wx\7\61\2\2xy\3\2\2\2yz\b"+
		"\2\2\2z\4\3\2\2\2{|\7\61\2\2|}\7\61\2\2}\u0081\3\2\2\2~\u0080\13\2\2\2"+
		"\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0086\7\f\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\3\2\2\u0088\6\3\2\2\2"+
		"\u0089\u008a\7$\2\2\u008a\b\3\2\2\2\u008b\u008c\7.\2\2\u008c\n\3\2\2\2"+
		"\u008d\u008e\t\2\2\2\u008e\f\3\2\2\2\u008f\u0090\t\3\2\2\u0090\16\3\2"+
		"\2\2\u0091\u0095\5\7\4\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\5\7\4\2\u0099\u009a\b\b\3\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\7c\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e"+
		"\22\3\2\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\24\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\26\3\2\2\2\u00a7\u00a8\7F\2\2\u00a8\u00a9\7g\2\2\u00a9\30\3\2\2\2\u00aa"+
		"\u00ab\7f\2\2\u00ab\u00ac\7g\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7G\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7p\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7n\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7l\2\2\u00bd\u00be\7m\2\2"+
		"\u00be\"\3\2\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7u"+
		"\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6"+
		"\7f\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"&\3\2\2\2\u00ce\u00cf\7J\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"(\3\2\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"*\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7x\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7t\2\2\u00dc,\3\2\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df.\3\2\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7l\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\62\3\2\2\2\u00e6\u00e7\7m\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9"+
		"\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7t\2\2"+
		"\u00ed\64\3\2\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7"+
		"k\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7v\2\2\u00f3\66\3\2\2\2\u00f4\u00f5"+
		"\7o\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7v\2\2\u00f78\3\2\2\2\u00f8\u00f9"+
		"\7p\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7g\2\2\u00fb:\3\2\2\2\u00fc\u00fd"+
		"\7p\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100"+
		"<\3\2\2\2\u0101\u0102\7q\2\2\u0102\u0103\7h\2\2\u0103>\3\2\2\2\u0104\u0105"+
		"\7q\2\2\u0105\u0106\7r\2\2\u0106@\3\2\2\2\u0107\u0108\7q\2\2\u0108\u0109"+
		"\7o\2\2\u0109\u010a\7x\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c"+
		"B\3\2\2\2\u010d\u010e\7T\2\2\u010e\u010f\7g\2\2\u010f\u0110\7i\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7n\2\2\u0112D\3\2\2\2\u0113\u0114\7t\2\2\u0114"+
		"\u0115\7g\2\2\u0115\u0116\7i\2\2\u0116\u0117\7g\2\2\u0117\u0118\7n\2\2"+
		"\u0118F\3\2\2\2\u0119\u011a\7V\2\2\u011a\u011b\7g\2\2\u011b\u011c\7u\2"+
		"\2\u011c\u011d\7v\2\2\u011d\u011e\7e\2\2\u011e\u011f\7c\2\2\u011f\u0120"+
		"\7u\2\2\u0120\u0121\7g\2\2\u0121H\3\2\2\2\u0122\u0123\7v\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7u\2\2\u0125\u0126\7v\2\2\u0126\u0127\7i\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7x\2\2\u0129\u012a\7c\2\2\u012a\u012b\7n\2\2"+
		"\u012b\u012c\7n\2\2\u012c\u012d\7g\2\2\u012d\u012e\7p\2\2\u012eJ\3\2\2"+
		"\2\u012f\u0130\7x\2\2\u0130\u0131\7q\2\2\u0131\u0132\7n\2\2\u0132\u0133"+
		"\7i\2\2\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7f\2\2\u0136"+
		"\u0137\7g\2\2\u0137L\3\2\2\2\u0138\u0139\7x\2\2\u0139\u013a\7w\2\2\u013a"+
		"\u013b\7t\2\2\u013b\u013c\7g\2\2\u013c\u013d\7p\2\2\u013dN\3\2\2\2\u013e"+
		"\u013f\7y\2\2\u013f\u0140\7c\2\2\u0140\u0141\7c\2\2\u0141\u0142\7t\2\2"+
		"\u0142\u0143\7d\2\2\u0143\u0144\7k\2\2\u0144\u0145\7l\2\2\u0145P\3\2\2"+
		"\2\u0146\u0147\7y\2\2\u0147\u0148\7g\2\2\u0148\u0149\7t\2\2\u0149\u014a"+
		"\7m\2\2\u014a\u014b\7i\2\2\u014b\u014c\7g\2\2\u014c\u014d\7x\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7t\2\2\u014fR\3\2\2\2\u0150\u0151\7y\2\2\u0151"+
		"\u0152\7g\2\2\u0152\u0153\7t\2\2\u0153\u0154\7m\2\2\u0154\u0155\7p\2\2"+
		"\u0155\u0156\7g\2\2\u0156\u0157\7o\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7t\2\2\u0159T\3\2\2\2\u015a\u015b\7y\2\2\u015b\u015c\7c\2\2\u015c\u015d"+
		"\7c\2\2\u015d\u015e\7t\2\2\u015e\u015f\7f\2\2\u015f\u0160\7q\2\2\u0160"+
		"\u0161\7q\2\2\u0161\u0162\7t\2\2\u0162V\3\2\2\2\u0163\u0164\7y\2\2\u0164"+
		"\u0165\7q\2\2\u0165\u0166\7t\2\2\u0166\u0167\7f\2\2\u0167\u0168\7v\2\2"+
		"\u0168X\3\2\2\2\u0169\u016a\7|\2\2\u016a\u016b\7c\2\2\u016b\u016c\7n\2"+
		"\2\u016cZ\3\2\2\2\u016d\u016e\7<\2\2\u016e\\\3\2\2\2\u016f\u0170\7\62"+
		"\2\2\u0170^\3\2\2\2\u0171\u0172\7\60\2\2\u0172`\3\2\2\2\u0173\u0174\7"+
		"/\2\2\u0174b\3\2\2\2\u0175\u0176\5\r\7\2\u0176\u0177\5\r\7\2\u0177\u0178"+
		"\5a\61\2\u0178\u0179\5\r\7\2\u0179\u017a\5\r\7\2\u017a\u017b\5a\61\2\u017b"+
		"\u017c\5\r\7\2\u017c\u017d\5\r\7\2\u017d\u017e\5\r\7\2\u017e\u017f\5\r"+
		"\7\2\u017fd\3\2\2\2\u0180\u0182\5\r\7\2\u0181\u0180\3\2\2\2\u0182\u0185"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0188\5\t\5\2\u0187\u0189\5\r\7\2\u0188\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"f\3\2\2\2\u018c\u018e\5a\61\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u0190\3\2\2\2\u018f\u0191\5\r\7\2\u0190\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193h\3\2\2\2\u0194"+
		"\u0199\5\13\6\2\u0195\u0198\5\13\6\2\u0196\u0198\5a\61\2\u0197\u0195\3"+
		"\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019aj\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\t\4\2\2"+
		"\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b\66\2\2\u01a2l\3\2\2\2\r\2s"+
		"\u0081\u0095\u0183\u018a\u018d\u0192\u0197\u0199\u019f\4\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}