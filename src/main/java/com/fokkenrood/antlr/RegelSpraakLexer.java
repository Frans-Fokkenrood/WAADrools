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
		EEEN=9, EEN=10, EN=11, GELIJK=12, GROTER=13, HHET=14, HET=15, INVOER=16, 
		IN=17, IS=18, KLEINER=19, LUIDT=20, MET=21, NIET=22, OF=23, OMVAT=24, 
		RREGEL=25, REGEL=26, TTESTCASE=27, TESTGEVALLEN=28, VOLGENDE=29, VUREN=30, 
		WAARDOOR=31, ZAL=32, DUBBELE_PUNT=33, GETAL_NUL=34, PUNT=35, STREEPJE=36, 
		DATUM=37, FLOAT=38, GETAL=39, WOORD=40, WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AAN", "ALS", "DAN", "DDE", "DE", "EEEN", "EEN", "EN", "GELIJK", "GROTER", 
		"HHET", "HET", "INVOER", "IN", "IS", "KLEINER", "LUIDT", "MET", "NIET", 
		"OF", "OMVAT", "RREGEL", "REGEL", "TTESTCASE", "TESTGEVALLEN", "VOLGENDE", 
		"VUREN", "WAARDOOR", "ZAL", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", 
		"DATUM", "FLOAT", "GETAL", "WOORD", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'aan'", "'als'", "'dan'", "'De'", "'de'", "'Een'", 
		"'een'", "'en'", "'gelijk'", "'groter'", "'Het'", "'het'", "'invoer'", 
		"'in'", "'is'", "'kleiner'", "'luidt'", "'met'", "'niet'", "'of'", "'omvat'", 
		"'Regel'", "'regel'", "'Testcase'", "'testgevallen'", "'volgende'", "'vuren'", 
		"'waardoor'", "'zal'", "':'", "'0'", "'.'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "AAN", "ALS", "DAN", "DDE", 
		"DE", "EEEN", "EEN", "EN", "GELIJK", "GROTER", "HHET", "HET", "INVOER", 
		"IN", "IS", "KLEINER", "LUIDT", "MET", "NIET", "OF", "OMVAT", "RREGEL", 
		"REGEL", "TTESTCASE", "TESTGEVALLEN", "VOLGENDE", "VUREN", "WAARDOOR", 
		"ZAL", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", "DATUM", "FLOAT", 
		"GETAL", "WOORD", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\7+\u013e"+
		"\n+\f+\16+\u0141\13+\3+\3+\6+\u0145\n+\r+\16+\u0146\3,\5,\u014a\n,\3,"+
		"\6,\u014d\n,\r,\16,\u014e\3-\3-\3-\7-\u0154\n-\f-\16-\u0157\13-\3.\6."+
		"\u015a\n.\r.\16.\u015b\3.\3.\5cq\u0085\2/\3\3\5\4\7\2\t\2\13\2\r\2\17"+
		"\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-"+
		"\24/\25\61\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q"+
		"&S\'U(W)Y*[+\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u0164\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5k\3\2"+
		"\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2"+
		"\21\u008b\3\2\2\2\23\u008f\3\2\2\2\25\u0093\3\2\2\2\27\u0097\3\2\2\2\31"+
		"\u009a\3\2\2\2\33\u009d\3\2\2\2\35\u00a1\3\2\2\2\37\u00a5\3\2\2\2!\u00a8"+
		"\3\2\2\2#\u00af\3\2\2\2%\u00b6\3\2\2\2\'\u00ba\3\2\2\2)\u00be\3\2\2\2"+
		"+\u00c5\3\2\2\2-\u00c8\3\2\2\2/\u00cb\3\2\2\2\61\u00d3\3\2\2\2\63\u00d9"+
		"\3\2\2\2\65\u00dd\3\2\2\2\67\u00e2\3\2\2\29\u00e5\3\2\2\2;\u00eb\3\2\2"+
		"\2=\u00f1\3\2\2\2?\u00f7\3\2\2\2A\u0100\3\2\2\2C\u010d\3\2\2\2E\u0116"+
		"\3\2\2\2G\u011c\3\2\2\2I\u0125\3\2\2\2K\u0129\3\2\2\2M\u012b\3\2\2\2O"+
		"\u012d\3\2\2\2Q\u012f\3\2\2\2S\u0131\3\2\2\2U\u013f\3\2\2\2W\u0149\3\2"+
		"\2\2Y\u0150\3\2\2\2[\u0159\3\2\2\2]^\7\61\2\2^_\7,\2\2_c\3\2\2\2`b\13"+
		"\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7"+
		",\2\2gh\7\61\2\2hi\3\2\2\2ij\b\2\2\2j\4\3\2\2\2kl\7\61\2\2lm\7\61\2\2"+
		"mq\3\2\2\2np\13\2\2\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2\2rt\3\2\2"+
		"\2sq\3\2\2\2tu\7\17\2\2uv\7\f\2\2vw\3\2\2\2wx\b\3\2\2x\6\3\2\2\2yz\7$"+
		"\2\2z\b\3\2\2\2{|\7.\2\2|\n\3\2\2\2}~\t\2\2\2~\f\3\2\2\2\177\u0080\t\3"+
		"\2\2\u0080\16\3\2\2\2\u0081\u0085\5\7\4\2\u0082\u0084\13\2\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5\7\4\2\u0089\u008a\b\b"+
		"\3\2\u008a\20\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7p\2\2\u008e\22\3\2\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7u\2\2\u0092\24\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095\7c\2\2\u0095\u0096"+
		"\7p\2\2\u0096\26\3\2\2\2\u0097\u0098\7F\2\2\u0098\u0099\7g\2\2\u0099\30"+
		"\3\2\2\2\u009a\u009b\7f\2\2\u009b\u009c\7g\2\2\u009c\32\3\2\2\2\u009d"+
		"\u009e\7G\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7p\2\2\u00a0\34\3\2\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\36\3\2\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7i\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7l\2\2"+
		"\u00ad\u00ae\7m\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7t"+
		"\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7J\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7v\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd(\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1"+
		"\7x\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"*\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7,\3\2\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7u\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7m\2\2\u00cc\u00cd"+
		"\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2\60\3\2\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7w\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\62\3\2\2\2\u00d9\u00da\7o\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7"+
		"v\2\2\u00dc\64\3\2\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7k\2\2\u00df\u00e0"+
		"\7g\2\2\u00e0\u00e1\7v\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7h\2\2\u00e48\3\2\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8"+
		"\7x\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7T\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7g\2\2\u00ef"+
		"\u00f0\7n\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7i\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6>\3\2\2\2\u00f7"+
		"\u00f8\7V\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2"+
		"\u00fb\u00fc\7e\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff"+
		"\7g\2\2\u00ff@\3\2\2\2\u0100\u0101\7v\2\2\u0101\u0102\7g\2\2\u0102\u0103"+
		"\7u\2\2\u0103\u0104\7v\2\2\u0104\u0105\7i\2\2\u0105\u0106\7g\2\2\u0106"+
		"\u0107\7x\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\u010a\7n\2\2"+
		"\u010a\u010b\7g\2\2\u010b\u010c\7p\2\2\u010cB\3\2\2\2\u010d\u010e\7x\2"+
		"\2\u010e\u010f\7q\2\2\u010f\u0110\7n\2\2\u0110\u0111\7i\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114\u0115\7g\2\2\u0115"+
		"D\3\2\2\2\u0116\u0117\7x\2\2\u0117\u0118\7w\2\2\u0118\u0119\7t\2\2\u0119"+
		"\u011a\7g\2\2\u011a\u011b\7p\2\2\u011bF\3\2\2\2\u011c\u011d\7y\2\2\u011d"+
		"\u011e\7c\2\2\u011e\u011f\7c\2\2\u011f\u0120\7t\2\2\u0120\u0121\7f\2\2"+
		"\u0121\u0122\7q\2\2\u0122\u0123\7q\2\2\u0123\u0124\7t\2\2\u0124H\3\2\2"+
		"\2\u0125\u0126\7|\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128J\3\2"+
		"\2\2\u0129\u012a\7<\2\2\u012aL\3\2\2\2\u012b\u012c\7\62\2\2\u012cN\3\2"+
		"\2\2\u012d\u012e\7\60\2\2\u012eP\3\2\2\2\u012f\u0130\7/\2\2\u0130R\3\2"+
		"\2\2\u0131\u0132\5\r\7\2\u0132\u0133\5\r\7\2\u0133\u0134\5Q)\2\u0134\u0135"+
		"\5\r\7\2\u0135\u0136\5\r\7\2\u0136\u0137\5Q)\2\u0137\u0138\5\r\7\2\u0138"+
		"\u0139\5\r\7\2\u0139\u013a\5\r\7\2\u013a\u013b\5\r\7\2\u013bT\3\2\2\2"+
		"\u013c\u013e\5\r\7\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0144\5\t\5\2\u0143\u0145\5\r\7\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147V\3\2\2\2\u0148\u014a"+
		"\5Q)\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u014d\5\r\7\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014fX\3\2\2\2\u0150\u0155\5\13\6\2\u0151\u0154"+
		"\5\13\6\2\u0152\u0154\5Q)\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156Z\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0158\u015a\t\4\2\2\u0159\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\b.\2\2\u015e\\\3\2\2\2\r\2cq\u0085\u013f\u0146\u0149\u014e\u0153"+
		"\u0155\u015b\4\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}