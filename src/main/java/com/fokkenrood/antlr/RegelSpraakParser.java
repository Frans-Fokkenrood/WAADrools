// Generated from src\main\java\com\fokkenrood\antlr\RegelSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegelSpraakParser extends Parser {
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
	public static final int
		RULE_statements = 0, RULE_regel = 1, RULE_testcase = 2, RULE_testgeval = 3, 
		RULE_waarde = 4, RULE_vergelijking = 5, RULE_feit = 6;
	public static final String[] ruleNames = {
		"statements", "regel", "testcase", "testgeval", "waarde", "vergelijking", 
		"feit"
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

	@Override
	public String getGrammarFileName() { return "RegelSpraak.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegelSpraakParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementsContext extends ParserRuleContext {
		public List<RegelContext> regel() {
			return getRuleContexts(RegelContext.class);
		}
		public RegelContext regel(int i) {
			return getRuleContext(RegelContext.class,i);
		}
		public List<TestcaseContext> testcase() {
			return getRuleContexts(TestcaseContext.class);
		}
		public TestcaseContext testcase(int i) {
			return getRuleContext(TestcaseContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RREGEL:
					{
					setState(14);
					regel();
					}
					break;
				case TTESTCASE:
					{
					setState(15);
					testcase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RREGEL || _la==TTESTCASE );
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

	public static class RegelContext extends ParserRuleContext {
		public Token rg;
		public Token rs;
		public TerminalNode RREGEL() { return getToken(RegelSpraakParser.RREGEL, 0); }
		public TerminalNode IN() { return getToken(RegelSpraakParser.IN, 0); }
		public TerminalNode LUIDT() { return getToken(RegelSpraakParser.LUIDT, 0); }
		public TerminalNode DUBBELE_PUNT() { return getToken(RegelSpraakParser.DUBBELE_PUNT, 0); }
		public TerminalNode PUNT() { return getToken(RegelSpraakParser.PUNT, 0); }
		public List<TerminalNode> TEKST() { return getTokens(RegelSpraakParser.TEKST); }
		public TerminalNode TEKST(int i) {
			return getToken(RegelSpraakParser.TEKST, i);
		}
		public RegelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterRegel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitRegel(this);
		}
	}

	public final RegelContext regel() throws RecognitionException {
		RegelContext _localctx = new RegelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(20);
			match(RREGEL);
			setState(21);
			((RegelContext)_localctx).rg = match(TEKST);
			setState(22);
			match(IN);
			setState(23);
			((RegelContext)_localctx).rs = match(TEKST);
			setState(24);
			match(LUIDT);
			setState(25);
			match(DUBBELE_PUNT);
			setState(26);
			match(PUNT);
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

	public static class TestcaseContext extends ParserRuleContext {
		public Token tc;
		public Token rs;
		public TerminalNode TTESTCASE() { return getToken(RegelSpraakParser.TTESTCASE, 0); }
		public TerminalNode IN() { return getToken(RegelSpraakParser.IN, 0); }
		public TerminalNode OMVAT() { return getToken(RegelSpraakParser.OMVAT, 0); }
		public TerminalNode DE() { return getToken(RegelSpraakParser.DE, 0); }
		public TerminalNode VOLGENDE() { return getToken(RegelSpraakParser.VOLGENDE, 0); }
		public TerminalNode TESTGEVALLEN() { return getToken(RegelSpraakParser.TESTGEVALLEN, 0); }
		public TerminalNode DUBBELE_PUNT() { return getToken(RegelSpraakParser.DUBBELE_PUNT, 0); }
		public TerminalNode PUNT() { return getToken(RegelSpraakParser.PUNT, 0); }
		public List<TerminalNode> TEKST() { return getTokens(RegelSpraakParser.TEKST); }
		public TerminalNode TEKST(int i) {
			return getToken(RegelSpraakParser.TEKST, i);
		}
		public List<TestgevalContext> testgeval() {
			return getRuleContexts(TestgevalContext.class);
		}
		public TestgevalContext testgeval(int i) {
			return getRuleContext(TestgevalContext.class,i);
		}
		public TestcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterTestcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitTestcase(this);
		}
	}

	public final TestcaseContext testcase() throws RecognitionException {
		TestcaseContext _localctx = new TestcaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_testcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(TTESTCASE);
			setState(29);
			((TestcaseContext)_localctx).tc = match(TEKST);
			setState(30);
			match(IN);
			setState(31);
			((TestcaseContext)_localctx).rs = match(TEKST);
			setState(32);
			match(OMVAT);
			setState(33);
			match(DE);
			setState(34);
			match(VOLGENDE);
			setState(35);
			match(TESTGEVALLEN);
			setState(36);
			match(DUBBELE_PUNT);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				testgeval();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(42);
			match(PUNT);
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

	public static class TestgevalContext extends ParserRuleContext {
		public Token tg;
		public Token not;
		public TerminalNode STREEPJE() { return getToken(RegelSpraakParser.STREEPJE, 0); }
		public TerminalNode MET() { return getToken(RegelSpraakParser.MET, 0); }
		public TerminalNode ALS() { return getToken(RegelSpraakParser.ALS, 0); }
		public TerminalNode INVOER() { return getToken(RegelSpraakParser.INVOER, 0); }
		public TerminalNode DUBBELE_PUNT() { return getToken(RegelSpraakParser.DUBBELE_PUNT, 0); }
		public TerminalNode WAARDOOR() { return getToken(RegelSpraakParser.WAARDOOR, 0); }
		public TerminalNode DE() { return getToken(RegelSpraakParser.DE, 0); }
		public TerminalNode REGEL() { return getToken(RegelSpraakParser.REGEL, 0); }
		public TerminalNode ZAL() { return getToken(RegelSpraakParser.ZAL, 0); }
		public TerminalNode VUREN() { return getToken(RegelSpraakParser.VUREN, 0); }
		public TerminalNode TEKST() { return getToken(RegelSpraakParser.TEKST, 0); }
		public TerminalNode NIET() { return getToken(RegelSpraakParser.NIET, 0); }
		public TestgevalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testgeval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterTestgeval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitTestgeval(this);
		}
	}

	public final TestgevalContext testgeval() throws RecognitionException {
		TestgevalContext _localctx = new TestgevalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_testgeval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			match(STREEPJE);
			setState(45);
			((TestgevalContext)_localctx).tg = match(TEKST);
			setState(46);
			match(MET);
			setState(47);
			match(ALS);
			setState(48);
			match(INVOER);
			setState(49);
			match(DUBBELE_PUNT);
			setState(50);
			match(WAARDOOR);
			setState(51);
			match(DE);
			setState(52);
			match(REGEL);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NIET) {
				{
				setState(53);
				((TestgevalContext)_localctx).not = match(NIET);
				}
			}

			setState(56);
			match(ZAL);
			setState(57);
			match(VUREN);
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

	public static class WaardeContext extends ParserRuleContext {
		public String value;
		public Token WOORD;
		public Token TEKST;
		public Token DATUM;
		public Token GETAL;
		public Token FLOAT;
		public TerminalNode WOORD() { return getToken(RegelSpraakParser.WOORD, 0); }
		public TerminalNode TEKST() { return getToken(RegelSpraakParser.TEKST, 0); }
		public TerminalNode DATUM() { return getToken(RegelSpraakParser.DATUM, 0); }
		public TerminalNode GETAL() { return getToken(RegelSpraakParser.GETAL, 0); }
		public TerminalNode GETAL_NUL() { return getToken(RegelSpraakParser.GETAL_NUL, 0); }
		public TerminalNode FLOAT() { return getToken(RegelSpraakParser.FLOAT, 0); }
		public WaardeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waarde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterWaarde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitWaarde(this);
		}
	}

	public final WaardeContext waarde() throws RecognitionException {
		WaardeContext _localctx = new WaardeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_waarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WOORD:
				{
				setState(59);
				((WaardeContext)_localctx).WOORD = match(WOORD);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).WOORD!=null?((WaardeContext)_localctx).WOORD.getText():null); 
				}
				break;
			case TEKST:
				{
				setState(61);
				((WaardeContext)_localctx).TEKST = match(TEKST);
				 ((WaardeContext)_localctx).value =  "\"" + (((WaardeContext)_localctx).TEKST!=null?((WaardeContext)_localctx).TEKST.getText():null) + "\""; 
				}
				break;
			case DATUM:
				{
				setState(63);
				((WaardeContext)_localctx).DATUM = match(DATUM);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).DATUM!=null?((WaardeContext)_localctx).DATUM.getText():null); 
				}
				break;
			case GETAL:
				{
				setState(65);
				((WaardeContext)_localctx).GETAL = match(GETAL);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).GETAL!=null?((WaardeContext)_localctx).GETAL.getText():null); 
				}
				break;
			case GETAL_NUL:
				{
				setState(67);
				match(GETAL_NUL);
				 ((WaardeContext)_localctx).value =  "0"; 
				}
				break;
			case FLOAT:
				{
				setState(69);
				((WaardeContext)_localctx).FLOAT = match(FLOAT);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).FLOAT!=null?((WaardeContext)_localctx).FLOAT.getText():null).replace(',','.'); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VergelijkingContext extends ParserRuleContext {
		public String operator;
		public TerminalNode IS() { return getToken(RegelSpraakParser.IS, 0); }
		public TerminalNode GELIJK() { return getToken(RegelSpraakParser.GELIJK, 0); }
		public TerminalNode AAN() { return getToken(RegelSpraakParser.AAN, 0); }
		public TerminalNode NIET() { return getToken(RegelSpraakParser.NIET, 0); }
		public TerminalNode GROTER() { return getToken(RegelSpraakParser.GROTER, 0); }
		public TerminalNode OF() { return getToken(RegelSpraakParser.OF, 0); }
		public TerminalNode DAN() { return getToken(RegelSpraakParser.DAN, 0); }
		public TerminalNode KLEINER() { return getToken(RegelSpraakParser.KLEINER, 0); }
		public VergelijkingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergelijking; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterVergelijking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitVergelijking(this);
		}
	}

	public final VergelijkingContext vergelijking() throws RecognitionException {
		VergelijkingContext _localctx = new VergelijkingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vergelijking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(73);
				match(IS);
				setState(74);
				match(GELIJK);
				setState(75);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "=="; 
				}
				break;
			case 2:
				{
				setState(77);
				match(IS);
				setState(78);
				match(NIET);
				setState(79);
				match(GELIJK);
				setState(80);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "!="; 
				}
				break;
			case 3:
				{
				setState(82);
				match(IS);
				setState(83);
				match(GROTER);
				setState(84);
				match(OF);
				setState(85);
				match(GELIJK);
				setState(86);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  ">="; 
				}
				break;
			case 4:
				{
				setState(88);
				match(IS);
				setState(89);
				match(GROTER);
				setState(90);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  ">";  
				}
				break;
			case 5:
				{
				setState(92);
				match(IS);
				setState(93);
				match(KLEINER);
				setState(94);
				match(OF);
				setState(95);
				match(GELIJK);
				setState(96);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "<="; 
				}
				break;
			case 6:
				{
				setState(98);
				match(IS);
				setState(99);
				match(KLEINER);
				setState(100);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  "<";  
				}
				break;
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

	public static class FeitContext extends ParserRuleContext {
		public String signifier;
		public Token WOORD;
		public List<TerminalNode> WOORD() { return getTokens(RegelSpraakParser.WOORD); }
		public TerminalNode WOORD(int i) {
			return getToken(RegelSpraakParser.WOORD, i);
		}
		public FeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterFeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitFeit(this);
		}
	}

	public final FeitContext feit() throws RecognitionException {
		FeitContext _localctx = new FeitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_feit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			((FeitContext)_localctx).WOORD = match(WOORD);
			 ((FeitContext)_localctx).signifier =  (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null); 
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WOORD) {
				{
				{
				setState(106);
				((FeitContext)_localctx).WOORD = match(WOORD);
				 _localctx.signifier += (" " + (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null)); 
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+t\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2\24"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\59\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7i\n\7\3\b"+
		"\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2{\2\22"+
		"\3\2\2\2\4\26\3\2\2\2\6\36\3\2\2\2\b.\3\2\2\2\nI\3\2\2\2\fh\3\2\2\2\16"+
		"j\3\2\2\2\20\23\5\4\3\2\21\23\5\6\4\2\22\20\3\2\2\2\22\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\27\7\33\2\2\27\30"+
		"\7\5\2\2\30\31\7\23\2\2\31\32\7\5\2\2\32\33\7\26\2\2\33\34\7#\2\2\34\35"+
		"\7%\2\2\35\5\3\2\2\2\36\37\7\35\2\2\37 \7\5\2\2 !\7\23\2\2!\"\7\5\2\2"+
		"\"#\7\32\2\2#$\7\n\2\2$%\7\37\2\2%&\7\36\2\2&(\7#\2\2\')\5\b\5\2(\'\3"+
		"\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7%\2\2-\7\3\2\2\2./\7"+
		"&\2\2/\60\7\5\2\2\60\61\7\27\2\2\61\62\7\7\2\2\62\63\7\22\2\2\63\64\7"+
		"#\2\2\64\65\7!\2\2\65\66\7\n\2\2\668\7\34\2\2\679\7\30\2\28\67\3\2\2\2"+
		"89\3\2\2\29:\3\2\2\2:;\7\"\2\2;<\7 \2\2<\t\3\2\2\2=>\7*\2\2>J\b\6\1\2"+
		"?@\7\5\2\2@J\b\6\1\2AB\7\'\2\2BJ\b\6\1\2CD\7)\2\2DJ\b\6\1\2EF\7$\2\2F"+
		"J\b\6\1\2GH\7(\2\2HJ\b\6\1\2I=\3\2\2\2I?\3\2\2\2IA\3\2\2\2IC\3\2\2\2I"+
		"E\3\2\2\2IG\3\2\2\2J\13\3\2\2\2KL\7\24\2\2LM\7\16\2\2MN\7\6\2\2Ni\b\7"+
		"\1\2OP\7\24\2\2PQ\7\30\2\2QR\7\16\2\2RS\7\6\2\2Si\b\7\1\2TU\7\24\2\2U"+
		"V\7\17\2\2VW\7\31\2\2WX\7\16\2\2XY\7\6\2\2Yi\b\7\1\2Z[\7\24\2\2[\\\7\17"+
		"\2\2\\]\7\b\2\2]i\b\7\1\2^_\7\24\2\2_`\7\25\2\2`a\7\31\2\2ab\7\16\2\2"+
		"bc\7\6\2\2ci\b\7\1\2de\7\24\2\2ef\7\25\2\2fg\7\b\2\2gi\b\7\1\2hK\3\2\2"+
		"\2hO\3\2\2\2hT\3\2\2\2hZ\3\2\2\2h^\3\2\2\2hd\3\2\2\2i\r\3\2\2\2jk\7*\2"+
		"\2kp\b\b\1\2lm\7*\2\2mo\b\b\1\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2q\17\3\2\2\2rp\3\2\2\2\t\22\24*8Ihp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}