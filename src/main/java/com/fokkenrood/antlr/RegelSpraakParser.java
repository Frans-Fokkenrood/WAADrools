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
		EEEN=9, EEN=10, EN=11, GELIJK=12, GESTELD=13, GROTER=14, HHET=15, HET=16, 
		INVOER=17, IN=18, IS=19, JA=20, KLEINER=21, LUIDT=22, MET=23, NEE=24, 
		NIET=25, OF=26, OP=27, OMVAT=28, RREGEL=29, REGEL=30, TTESTCASE=31, TESTGEVALLEN=32, 
		VOLGENDE=33, VUREN=34, WAARBIJ=35, WERKGEVER=36, WERKNEMER=37, WAARDOOR=38, 
		WORDT=39, ZAL=40, DUBBELE_PUNT=41, GETAL_NUL=42, PUNT=43, STREEPJE=44, 
		DATUM=45, FLOAT=46, GETAL=47, WOORD=48, WS=49;
	public static final int
		RULE_statements = 0, RULE_regel = 1, RULE_testcase = 2, RULE_testgeval = 3, 
		RULE_invoer = 4, RULE_toekennen = 5, RULE_waarde = 6, RULE_vergelijking = 7, 
		RULE_feit = 8;
	public static final String[] ruleNames = {
		"statements", "regel", "testcase", "testgeval", "invoer", "toekennen", 
		"waarde", "vergelijking", "feit"
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
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RREGEL:
					{
					setState(18);
					regel();
					}
					break;
				case TTESTCASE:
					{
					setState(19);
					testcase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
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
			setState(24);
			match(RREGEL);
			setState(25);
			((RegelContext)_localctx).rg = match(TEKST);
			setState(26);
			match(IN);
			setState(27);
			((RegelContext)_localctx).rs = match(TEKST);
			setState(28);
			match(LUIDT);
			setState(29);
			match(DUBBELE_PUNT);
			setState(30);
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
			setState(32);
			match(TTESTCASE);
			setState(33);
			((TestcaseContext)_localctx).tc = match(TEKST);
			setState(34);
			match(IN);
			setState(35);
			((TestcaseContext)_localctx).rs = match(TEKST);
			setState(36);
			match(OMVAT);
			setState(37);
			match(DE);
			setState(38);
			match(VOLGENDE);
			setState(39);
			match(TESTGEVALLEN);
			setState(40);
			match(DUBBELE_PUNT);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				testgeval();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STREEPJE );
			setState(46);
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
		public List<InvoerContext> invoer() {
			return getRuleContexts(InvoerContext.class);
		}
		public InvoerContext invoer(int i) {
			return getRuleContext(InvoerContext.class,i);
		}
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
			setState(48);
			match(STREEPJE);
			setState(49);
			((TestgevalContext)_localctx).tg = match(TEKST);
			setState(50);
			match(MET);
			setState(51);
			match(ALS);
			setState(52);
			match(INVOER);
			setState(53);
			match(DUBBELE_PUNT);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				invoer();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EEN );
			setState(59);
			match(WAARDOOR);
			setState(60);
			match(DE);
			setState(61);
			match(REGEL);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NIET) {
				{
				setState(62);
				((TestgevalContext)_localctx).not = match(NIET);
				}
			}

			setState(65);
			match(ZAL);
			setState(66);
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

	public static class InvoerContext extends ParserRuleContext {
		public Token obj;
		public TerminalNode EEN() { return getToken(RegelSpraakParser.EEN, 0); }
		public TerminalNode WERKGEVER() { return getToken(RegelSpraakParser.WERKGEVER, 0); }
		public TerminalNode WERKNEMER() { return getToken(RegelSpraakParser.WERKNEMER, 0); }
		public List<ToekennenContext> toekennen() {
			return getRuleContexts(ToekennenContext.class);
		}
		public ToekennenContext toekennen(int i) {
			return getRuleContext(ToekennenContext.class,i);
		}
		public InvoerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterInvoer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitInvoer(this);
		}
	}

	public final InvoerContext invoer() throws RecognitionException {
		InvoerContext _localctx = new InvoerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_invoer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			match(EEN);
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WERKGEVER:
				{
				setState(69);
				((InvoerContext)_localctx).obj = match(WERKGEVER);
				}
				break;
			case WERKNEMER:
				{
				setState(70);
				((InvoerContext)_localctx).obj = match(WERKNEMER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				toekennen((((InvoerContext)_localctx).obj!=null?((InvoerContext)_localctx).obj.getText():null));
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WAARBIJ );
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

	public static class ToekennenContext extends ParserRuleContext {
		public String obj;
		public FeitContext f;
		public WaardeContext w;
		public TerminalNode WAARBIJ() { return getToken(RegelSpraakParser.WAARBIJ, 0); }
		public TerminalNode WORDT() { return getToken(RegelSpraakParser.WORDT, 0); }
		public TerminalNode GESTELD() { return getToken(RegelSpraakParser.GESTELD, 0); }
		public TerminalNode OP() { return getToken(RegelSpraakParser.OP, 0); }
		public FeitContext feit() {
			return getRuleContext(FeitContext.class,0);
		}
		public WaardeContext waarde() {
			return getRuleContext(WaardeContext.class,0);
		}
		public ToekennenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ToekennenContext(ParserRuleContext parent, int invokingState, String obj) {
			super(parent, invokingState);
			this.obj = obj;
		}
		@Override public int getRuleIndex() { return RULE_toekennen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).enterToekennen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegelSpraakListener ) ((RegelSpraakListener)listener).exitToekennen(this);
		}
	}

	public final ToekennenContext toekennen(String obj) throws RecognitionException {
		ToekennenContext _localctx = new ToekennenContext(_ctx, getState(), obj);
		enterRule(_localctx, 10, RULE_toekennen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			match(WAARBIJ);
			setState(79);
			((ToekennenContext)_localctx).f = feit();
			setState(80);
			match(WORDT);
			setState(81);
			match(GESTELD);
			setState(82);
			match(OP);
			setState(83);
			((ToekennenContext)_localctx).w = waarde();
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
		public TerminalNode NEE() { return getToken(RegelSpraakParser.NEE, 0); }
		public TerminalNode JA() { return getToken(RegelSpraakParser.JA, 0); }
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
		enterRule(_localctx, 12, RULE_waarde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WOORD:
				{
				setState(85);
				((WaardeContext)_localctx).WOORD = match(WOORD);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).WOORD!=null?((WaardeContext)_localctx).WOORD.getText():null); 
				}
				break;
			case TEKST:
				{
				setState(87);
				((WaardeContext)_localctx).TEKST = match(TEKST);
				 ((WaardeContext)_localctx).value =  "\"" + (((WaardeContext)_localctx).TEKST!=null?((WaardeContext)_localctx).TEKST.getText():null) + "\""; 
				}
				break;
			case DATUM:
				{
				setState(89);
				((WaardeContext)_localctx).DATUM = match(DATUM);
				 ((WaardeContext)_localctx).value =  "@@" + (((WaardeContext)_localctx).DATUM!=null?((WaardeContext)_localctx).DATUM.getText():null); 
				}
				break;
			case GETAL:
				{
				setState(91);
				((WaardeContext)_localctx).GETAL = match(GETAL);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).GETAL!=null?((WaardeContext)_localctx).GETAL.getText():null); 
				}
				break;
			case GETAL_NUL:
				{
				setState(93);
				match(GETAL_NUL);
				 ((WaardeContext)_localctx).value =  "0"; 
				}
				break;
			case FLOAT:
				{
				setState(95);
				((WaardeContext)_localctx).FLOAT = match(FLOAT);
				 ((WaardeContext)_localctx).value =  (((WaardeContext)_localctx).FLOAT!=null?((WaardeContext)_localctx).FLOAT.getText():null).replace(',','.'); 
				}
				break;
			case NEE:
				{
				setState(97);
				match(NEE);
				 ((WaardeContext)_localctx).value =  "false"; 
				}
				break;
			case JA:
				{
				setState(99);
				match(JA);
				 ((WaardeContext)_localctx).value =  "true"; 
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
		enterRule(_localctx, 14, RULE_vergelijking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(103);
				match(IS);
				setState(104);
				match(GELIJK);
				setState(105);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "=="; 
				}
				break;
			case 2:
				{
				setState(107);
				match(IS);
				setState(108);
				match(NIET);
				setState(109);
				match(GELIJK);
				setState(110);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "!="; 
				}
				break;
			case 3:
				{
				setState(112);
				match(IS);
				setState(113);
				match(GROTER);
				setState(114);
				match(OF);
				setState(115);
				match(GELIJK);
				setState(116);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  ">="; 
				}
				break;
			case 4:
				{
				setState(118);
				match(IS);
				setState(119);
				match(GROTER);
				setState(120);
				match(DAN);
				 ((VergelijkingContext)_localctx).operator =  ">";  
				}
				break;
			case 5:
				{
				setState(122);
				match(IS);
				setState(123);
				match(KLEINER);
				setState(124);
				match(OF);
				setState(125);
				match(GELIJK);
				setState(126);
				match(AAN);
				 ((VergelijkingContext)_localctx).operator =  "<="; 
				}
				break;
			case 6:
				{
				setState(128);
				match(IS);
				setState(129);
				match(KLEINER);
				setState(130);
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
		public List<TerminalNode> IN() { return getTokens(RegelSpraakParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(RegelSpraakParser.IN, i);
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
		enterRule(_localctx, 16, RULE_feit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(134);
			((FeitContext)_localctx).WOORD = match(WOORD);
			 ((FeitContext)_localctx).signifier =  (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null); 
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN || _la==WOORD) {
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WOORD:
					{
					setState(136);
					((FeitContext)_localctx).WOORD = match(WOORD);
					 _localctx.signifier += (" " + (((FeitContext)_localctx).WOORD!=null?((FeitContext)_localctx).WOORD.getText():null)); 
					}
					break;
				case IN:
					{
					setState(138);
					match(IN);
					 _localctx.signifier += (" in"); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\6\2\27\n\2\r\2\16\2\30\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3\5\3\5\5\5B\n\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6J\n\6\3\6\6\6M\n\6\r\6\16\6N\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"h\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092\13\n\3\n\2\2\13\2\4"+
		"\6\b\n\f\16\20\22\2\2\u009f\2\26\3\2\2\2\4\32\3\2\2\2\6\"\3\2\2\2\b\62"+
		"\3\2\2\2\nF\3\2\2\2\fP\3\2\2\2\16g\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3"+
		"\2\2\2\24\27\5\4\3\2\25\27\5\6\4\2\26\24\3\2\2\2\26\25\3\2\2\2\27\30\3"+
		"\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\33\7\37\2\2\33\34\7"+
		"\5\2\2\34\35\7\24\2\2\35\36\7\5\2\2\36\37\7\30\2\2\37 \7+\2\2 !\7-\2\2"+
		"!\5\3\2\2\2\"#\7!\2\2#$\7\5\2\2$%\7\24\2\2%&\7\5\2\2&\'\7\36\2\2\'(\7"+
		"\n\2\2()\7#\2\2)*\7\"\2\2*,\7+\2\2+-\5\b\5\2,+\3\2\2\2-.\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7-\2\2\61\7\3\2\2\2\62\63\7.\2\2\63\64"+
		"\7\5\2\2\64\65\7\31\2\2\65\66\7\7\2\2\66\67\7\23\2\2\679\7+\2\28:\5\n"+
		"\6\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7(\2\2>?\7\n"+
		"\2\2?A\7 \2\2@B\7\33\2\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7*\2\2DE\7$\2"+
		"\2E\t\3\2\2\2FI\7\f\2\2GJ\7&\2\2HJ\7\'\2\2IG\3\2\2\2IH\3\2\2\2JL\3\2\2"+
		"\2KM\5\f\7\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PQ\7%"+
		"\2\2QR\5\22\n\2RS\7)\2\2ST\7\17\2\2TU\7\35\2\2UV\5\16\b\2V\r\3\2\2\2W"+
		"X\7\62\2\2Xh\b\b\1\2YZ\7\5\2\2Zh\b\b\1\2[\\\7/\2\2\\h\b\b\1\2]^\7\61\2"+
		"\2^h\b\b\1\2_`\7,\2\2`h\b\b\1\2ab\7\60\2\2bh\b\b\1\2cd\7\32\2\2dh\b\b"+
		"\1\2ef\7\26\2\2fh\b\b\1\2gW\3\2\2\2gY\3\2\2\2g[\3\2\2\2g]\3\2\2\2g_\3"+
		"\2\2\2ga\3\2\2\2gc\3\2\2\2ge\3\2\2\2h\17\3\2\2\2ij\7\25\2\2jk\7\16\2\2"+
		"kl\7\6\2\2l\u0087\b\t\1\2mn\7\25\2\2no\7\33\2\2op\7\16\2\2pq\7\6\2\2q"+
		"\u0087\b\t\1\2rs\7\25\2\2st\7\20\2\2tu\7\34\2\2uv\7\16\2\2vw\7\6\2\2w"+
		"\u0087\b\t\1\2xy\7\25\2\2yz\7\20\2\2z{\7\b\2\2{\u0087\b\t\1\2|}\7\25\2"+
		"\2}~\7\27\2\2~\177\7\34\2\2\177\u0080\7\16\2\2\u0080\u0081\7\6\2\2\u0081"+
		"\u0087\b\t\1\2\u0082\u0083\7\25\2\2\u0083\u0084\7\27\2\2\u0084\u0085\7"+
		"\b\2\2\u0085\u0087\b\t\1\2\u0086i\3\2\2\2\u0086m\3\2\2\2\u0086r\3\2\2"+
		"\2\u0086x\3\2\2\2\u0086|\3\2\2\2\u0086\u0082\3\2\2\2\u0087\21\3\2\2\2"+
		"\u0088\u0089\7\62\2\2\u0089\u0090\b\n\1\2\u008a\u008b\7\62\2\2\u008b\u008f"+
		"\b\n\1\2\u008c\u008d\7\24\2\2\u008d\u008f\b\n\1\2\u008e\u008a\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\23\3\2\2\2\u0092\u0090\3\2\2\2\r\26\30.;AINg\u0086\u008e"+
		"\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}