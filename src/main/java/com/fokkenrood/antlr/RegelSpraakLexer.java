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
		BLOCKCOMMENT=1, LINECOMMENT=2, TEKST=3, AAN=4, ALS=5, ARBEIDSOVEREENKOMST=6, 
		DAN=7, DDE=8, DE=9, EEEN=10, EEN=11, EN=12, GELIJK=13, GESTELD=14, GROTER=15, 
		HHET=16, HET=17, INVOER=18, IN=19, IS=20, JA=21, KLEINER=22, LUIDT=23, 
		MET=24, NEE=25, NIET=26, OF=27, OP=28, OMVAT=29, RREGEL=30, REGEL=31, 
		TTESTCASE=32, TESTGEVALLEN=33, VOLGENDE=34, VUREN=35, WAARBIJ=36, WERKGEVER=37, 
		WERKNEMER=38, WAARDOOR=39, WORDT=40, ZAL=41, DUBBELE_PUNT=42, GETAL_NUL=43, 
		PUNT=44, STREEPJE=45, DATUM=46, FLOAT=47, GETAL=48, WOORD=49, WS=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BLOCKCOMMENT", "LINECOMMENT", "QUOTE", "KOMMA", "LETTER", "CIJFER", "TEKST", 
		"AAN", "ALS", "ARBEIDSOVEREENKOMST", "DAN", "DDE", "DE", "EEEN", "EEN", 
		"EN", "GELIJK", "GESTELD", "GROTER", "HHET", "HET", "INVOER", "IN", "IS", 
		"JA", "KLEINER", "LUIDT", "MET", "NEE", "NIET", "OF", "OP", "OMVAT", "RREGEL", 
		"REGEL", "TTESTCASE", "TESTGEVALLEN", "VOLGENDE", "VUREN", "WAARBIJ", 
		"WERKGEVER", "WERKNEMER", "WAARDOOR", "WORDT", "ZAL", "DUBBELE_PUNT", 
		"GETAL_NUL", "PUNT", "STREEPJE", "DATUM", "FLOAT", "GETAL", "WOORD", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'aan'", "'als'", "'arbeidsovereenkomst'", "'dan'", 
		"'De'", "'de'", "'Een'", "'een'", "'en'", "'gelijk'", "'gesteld'", "'groter'", 
		"'Het'", "'het'", "'invoer'", "'in'", "'is'", "'ja'", "'kleiner'", "'luidt'", 
		"'met'", "'nee'", "'niet'", "'of'", "'op'", "'omvat'", "'Regel'", "'regel'", 
		"'Testcase'", "'testgevallen'", "'volgende'", "'vuren'", "'waarbij'", 
		"'werkgever'", "'werknemer'", "'waardoor'", "'wordt'", "'zal'", "':'", 
		"'0'", "'.'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCKCOMMENT", "LINECOMMENT", "TEKST", "AAN", "ALS", "ARBEIDSOVEREENKOMST", 
		"DAN", "DDE", "DE", "EEEN", "EEN", "EN", "GELIJK", "GESTELD", "GROTER", 
		"HHET", "HET", "INVOER", "IN", "IS", "JA", "KLEINER", "LUIDT", "MET", 
		"NEE", "NIET", "OF", "OP", "OMVAT", "RREGEL", "REGEL", "TTESTCASE", "TESTGEVALLEN", 
		"VOLGENDE", "VUREN", "WAARBIJ", "WERKGEVER", "WERKNEMER", "WAARDOOR", 
		"WORDT", "ZAL", "DUBBELE_PUNT", "GETAL_NUL", "PUNT", "STREEPJE", "DATUM", 
		"FLOAT", "GETAL", "WOORD", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u01b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\7\2t\n\2\f\2\16\2"+
		"w\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b"+
		"\u0096\n\b\f\b\16\b\u0099\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\7\64\u0198\n\64\f\64\16\64\u019b\13\64\3"+
		"\64\3\64\6\64\u019f\n\64\r\64\16\64\u01a0\3\65\5\65\u01a4\n\65\3\65\6"+
		"\65\u01a7\n\65\r\65\16\65\u01a8\3\66\3\66\3\66\7\66\u01ae\n\66\f\66\16"+
		"\66\u01b1\13\66\3\67\6\67\u01b4\n\67\r\67\16\67\u01b5\3\67\3\67\5u\u0083"+
		"\u0097\28\3\3\5\4\7\2\t\2\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n\33\13"+
		"\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32"+
		";\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_-a.c/e\60g\61i\62k\63"+
		"m\64\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u01be\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\3o\3\2\2\2\5}\3\2\2\2\7\u008b\3\2\2\2\t\u008d\3\2\2\2\13\u008f"+
		"\3\2\2\2\r\u0091\3\2\2\2\17\u0093\3\2\2\2\21\u009d\3\2\2\2\23\u00a1\3"+
		"\2\2\2\25\u00a5\3\2\2\2\27\u00b9\3\2\2\2\31\u00bd\3\2\2\2\33\u00c0\3\2"+
		"\2\2\35\u00c3\3\2\2\2\37\u00c7\3\2\2\2!\u00cb\3\2\2\2#\u00ce\3\2\2\2%"+
		"\u00d5\3\2\2\2\'\u00dd\3\2\2\2)\u00e4\3\2\2\2+\u00e8\3\2\2\2-\u00ec\3"+
		"\2\2\2/\u00f3\3\2\2\2\61\u00f6\3\2\2\2\63\u00f9\3\2\2\2\65\u00fc\3\2\2"+
		"\2\67\u0104\3\2\2\29\u010a\3\2\2\2;\u010e\3\2\2\2=\u0112\3\2\2\2?\u0117"+
		"\3\2\2\2A\u011a\3\2\2\2C\u011d\3\2\2\2E\u0123\3\2\2\2G\u0129\3\2\2\2I"+
		"\u012f\3\2\2\2K\u0138\3\2\2\2M\u0145\3\2\2\2O\u014e\3\2\2\2Q\u0154\3\2"+
		"\2\2S\u015c\3\2\2\2U\u0166\3\2\2\2W\u0170\3\2\2\2Y\u0179\3\2\2\2[\u017f"+
		"\3\2\2\2]\u0183\3\2\2\2_\u0185\3\2\2\2a\u0187\3\2\2\2c\u0189\3\2\2\2e"+
		"\u018b\3\2\2\2g\u0199\3\2\2\2i\u01a3\3\2\2\2k\u01aa\3\2\2\2m\u01b3\3\2"+
		"\2\2op\7\61\2\2pq\7,\2\2qu\3\2\2\2rt\13\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3"+
		"\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7,\2\2yz\7\61\2\2z{\3\2\2\2{|\b"+
		"\2\2\2|\4\3\2\2\2}~\7\61\2\2~\177\7\61\2\2\177\u0083\3\2\2\2\u0080\u0082"+
		"\13\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087"+
		"\7\17\2\2\u0087\u0088\7\f\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\3\2\2"+
		"\u008a\6\3\2\2\2\u008b\u008c\7$\2\2\u008c\b\3\2\2\2\u008d\u008e\7.\2\2"+
		"\u008e\n\3\2\2\2\u008f\u0090\t\2\2\2\u0090\f\3\2\2\2\u0091\u0092\t\3\2"+
		"\2\u0092\16\3\2\2\2\u0093\u0097\5\7\4\2\u0094\u0096\13\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\7\4\2\u009b\u009c\b\b"+
		"\3\2\u009c\20\3\2\2\2\u009d\u009e\7c\2\2\u009e\u009f\7c\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4"+
		"\7u\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7d\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7f\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7m\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7o\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\7f\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7p\2\2\u00bc\30\3\2\2\2\u00bd\u00be\7F\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\34\3\2\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6"+
		"\36\3\2\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		" \3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7p\2\2\u00cd\"\3\2\2\2\u00ce"+
		"\u00cf\7i\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7k\2\2"+
		"\u00d2\u00d3\7l\2\2\u00d3\u00d4\7m\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7i\2"+
		"\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7f\2\2\u00dc&\3\2\2\2\u00dd\u00de"+
		"\7i\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7v\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\u00e3\7t\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7J\2\2\u00e5"+
		"\u00e6\7g\2\2\u00e6\u00e7\7v\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7j\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7v\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7g\2\2"+
		"\u00f1\u00f2\7t\2\2\u00f2.\3\2\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7p\2"+
		"\2\u00f5\60\3\2\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7u\2\2\u00f8\62\3\2"+
		"\2\2\u00f9\u00fa\7l\2\2\u00fa\u00fb\7c\2\2\u00fb\64\3\2\2\2\u00fc\u00fd"+
		"\7m\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7k\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7g\2\2\u0102\u0103\7t\2\2\u0103\66\3\2\2\2\u0104"+
		"\u0105\7n\2\2\u0105\u0106\7w\2\2\u0106\u0107\7k\2\2\u0107\u0108\7f\2\2"+
		"\u0108\u0109\7v\2\2\u01098\3\2\2\2\u010a\u010b\7o\2\2\u010b\u010c\7g\2"+
		"\2\u010c\u010d\7v\2\2\u010d:\3\2\2\2\u010e\u010f\7p\2\2\u010f\u0110\7"+
		"g\2\2\u0110\u0111\7g\2\2\u0111<\3\2\2\2\u0112\u0113\7p\2\2\u0113\u0114"+
		"\7k\2\2\u0114\u0115\7g\2\2\u0115\u0116\7v\2\2\u0116>\3\2\2\2\u0117\u0118"+
		"\7q\2\2\u0118\u0119\7h\2\2\u0119@\3\2\2\2\u011a\u011b\7q\2\2\u011b\u011c"+
		"\7r\2\2\u011cB\3\2\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011f\u0120"+
		"\7x\2\2\u0120\u0121\7c\2\2\u0121\u0122\7v\2\2\u0122D\3\2\2\2\u0123\u0124"+
		"\7T\2\2\u0124\u0125\7g\2\2\u0125\u0126\7i\2\2\u0126\u0127\7g\2\2\u0127"+
		"\u0128\7n\2\2\u0128F\3\2\2\2\u0129\u012a\7t\2\2\u012a\u012b\7g\2\2\u012b"+
		"\u012c\7i\2\2\u012c\u012d\7g\2\2\u012d\u012e\7n\2\2\u012eH\3\2\2\2\u012f"+
		"\u0130\7V\2\2\u0130\u0131\7g\2\2\u0131\u0132\7u\2\2\u0132\u0133\7v\2\2"+
		"\u0133\u0134\7e\2\2\u0134\u0135\7c\2\2\u0135\u0136\7u\2\2\u0136\u0137"+
		"\7g\2\2\u0137J\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a\7g\2\2\u013a\u013b"+
		"\7u\2\2\u013b\u013c\7v\2\2\u013c\u013d\7i\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7x\2\2\u013f\u0140\7c\2\2\u0140\u0141\7n\2\2\u0141\u0142\7n\2\2"+
		"\u0142\u0143\7g\2\2\u0143\u0144\7p\2\2\u0144L\3\2\2\2\u0145\u0146\7x\2"+
		"\2\u0146\u0147\7q\2\2\u0147\u0148\7n\2\2\u0148\u0149\7i\2\2\u0149\u014a"+
		"\7g\2\2\u014a\u014b\7p\2\2\u014b\u014c\7f\2\2\u014c\u014d\7g\2\2\u014d"+
		"N\3\2\2\2\u014e\u014f\7x\2\2\u014f\u0150\7w\2\2\u0150\u0151\7t\2\2\u0151"+
		"\u0152\7g\2\2\u0152\u0153\7p\2\2\u0153P\3\2\2\2\u0154\u0155\7y\2\2\u0155"+
		"\u0156\7c\2\2\u0156\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158\u0159\7d\2\2"+
		"\u0159\u015a\7k\2\2\u015a\u015b\7l\2\2\u015bR\3\2\2\2\u015c\u015d\7y\2"+
		"\2\u015d\u015e\7g\2\2\u015e\u015f\7t\2\2\u015f\u0160\7m\2\2\u0160\u0161"+
		"\7i\2\2\u0161\u0162\7g\2\2\u0162\u0163\7x\2\2\u0163\u0164\7g\2\2\u0164"+
		"\u0165\7t\2\2\u0165T\3\2\2\2\u0166\u0167\7y\2\2\u0167\u0168\7g\2\2\u0168"+
		"\u0169\7t\2\2\u0169\u016a\7m\2\2\u016a\u016b\7p\2\2\u016b\u016c\7g\2\2"+
		"\u016c\u016d\7o\2\2\u016d\u016e\7g\2\2\u016e\u016f\7t\2\2\u016fV\3\2\2"+
		"\2\u0170\u0171\7y\2\2\u0171\u0172\7c\2\2\u0172\u0173\7c\2\2\u0173\u0174"+
		"\7t\2\2\u0174\u0175\7f\2\2\u0175\u0176\7q\2\2\u0176\u0177\7q\2\2\u0177"+
		"\u0178\7t\2\2\u0178X\3\2\2\2\u0179\u017a\7y\2\2\u017a\u017b\7q\2\2\u017b"+
		"\u017c\7t\2\2\u017c\u017d\7f\2\2\u017d\u017e\7v\2\2\u017eZ\3\2\2\2\u017f"+
		"\u0180\7|\2\2\u0180\u0181\7c\2\2\u0181\u0182\7n\2\2\u0182\\\3\2\2\2\u0183"+
		"\u0184\7<\2\2\u0184^\3\2\2\2\u0185\u0186\7\62\2\2\u0186`\3\2\2\2\u0187"+
		"\u0188\7\60\2\2\u0188b\3\2\2\2\u0189\u018a\7/\2\2\u018ad\3\2\2\2\u018b"+
		"\u018c\5\r\7\2\u018c\u018d\5\r\7\2\u018d\u018e\5c\62\2\u018e\u018f\5\r"+
		"\7\2\u018f\u0190\5\r\7\2\u0190\u0191\5c\62\2\u0191\u0192\5\r\7\2\u0192"+
		"\u0193\5\r\7\2\u0193\u0194\5\r\7\2\u0194\u0195\5\r\7\2\u0195f\3\2\2\2"+
		"\u0196\u0198\5\r\7\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019e\5\t\5\2\u019d\u019f\5\r\7\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1h\3\2\2\2\u01a2\u01a4"+
		"\5c\62\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a7\5\r\7\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9j\3\2\2\2\u01aa\u01af\5\13\6\2\u01ab\u01ae"+
		"\5\13\6\2\u01ac\u01ae\5c\62\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0l\3"+
		"\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\t\4\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b8\b\67\2\2\u01b8n\3\2\2\2\r\2u\u0083\u0097\u0199\u01a0"+
		"\u01a3\u01a8\u01ad\u01af\u01b5\4\b\2\2\3\b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}