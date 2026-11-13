// Generated from com/example/Junior.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuniorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HAUS=1, ZIMMER=2, GERAET=3, WERT=4, SETZEN=5, BEI_EREIGNIS=6, LAGE=7, 
		ZWEIG=8, ERSATZWEG=9, REGELKREIS=10, EINSCHALTEN=11, AUSSCHALTEN=12, MELDEN=13, 
		PEGEL=14, MELDUNG=15, SCHALTZUSTAND=16, ZEITPUNKT=17, AN=18, AUS=19, LICHT=20, 
		SENSOR=21, KLIMA=22, TUER=23, ALARM=24, HAUSHALTSGERAET=25, UHR=26, BEWEGUNG=27, 
		GEOEFFNET=28, GESCHLOSSEN=29, WARNUNG=30, TEMPERATUR=31, ZEITEREIGNIS=32, 
		UND=33, ODER=34, GLEICH=35, UNGLEICH=36, GROESSER_GLEICH=37, KLEINER_GLEICH=38, 
		ZUWEISUNG=39, GROESSER=40, KLEINER=41, NICHT=42, ADDITION=43, SUBTRAKTION=44, 
		MULTIPLIKATION=45, DIVISION=46, BLOCKGRENZE=47, GRUPPENGRENZE=48, LISTENGRENZE=49, 
		ANWEISUNGSENDE=50, DOPPELPUNKT=51, PUNKT=52, KOMMA=53, UHRZEITWERT=54, 
		ZAHL=55, TEXTWERT=56, TEXTGRENZE=57, KENNUNG=58, LINE_COMMENT=59, BLOCK_COMMENT=60, 
		WS=61;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_roomDeclaration = 3, 
		RULE_deviceDeclaration = 4, RULE_deviceKind = 5, RULE_variableDeclaration = 6, 
		RULE_dataType = 7, RULE_assignment = 8, RULE_decision = 9, RULE_repetition = 10, 
		RULE_automation = 11, RULE_eventSource = 12, RULE_eventKind = 13, RULE_comparison = 14, 
		RULE_deviceReference = 15, RULE_deviceAction = 16, RULE_targets = 17, 
		RULE_notification = 18, RULE_expression = 19, RULE_logicalOr = 20, RULE_logicalAnd = 21, 
		RULE_equality = 22, RULE_relational = 23, RULE_additive = 24, RULE_multiplicative = 25, 
		RULE_unary = 26, RULE_primary = 27, RULE_reference = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "roomDeclaration", "deviceDeclaration", 
			"deviceKind", "variableDeclaration", "dataType", "assignment", "decision", 
			"repetition", "automation", "eventSource", "eventKind", "comparison", 
			"deviceReference", "deviceAction", "targets", "notification", "expression", 
			"logicalOr", "logicalAnd", "equality", "relational", "additive", "multiplicative", 
			"unary", "primary", "reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'&&'", "'||'", 
			"'=='", "'!='", "'>='", "'<='", "'='", "'>'", "'<'", "'!'", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'~'", "'^'", "';'", "':'", "'.'", "','", null, 
			null, null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HAUS", "ZIMMER", "GERAET", "WERT", "SETZEN", "BEI_EREIGNIS", "LAGE", 
			"ZWEIG", "ERSATZWEG", "REGELKREIS", "EINSCHALTEN", "AUSSCHALTEN", "MELDEN", 
			"PEGEL", "MELDUNG", "SCHALTZUSTAND", "ZEITPUNKT", "AN", "AUS", "LICHT", 
			"SENSOR", "KLIMA", "TUER", "ALARM", "HAUSHALTSGERAET", "UHR", "BEWEGUNG", 
			"GEOEFFNET", "GESCHLOSSEN", "WARNUNG", "TEMPERATUR", "ZEITEREIGNIS", 
			"UND", "ODER", "GLEICH", "UNGLEICH", "GROESSER_GLEICH", "KLEINER_GLEICH", 
			"ZUWEISUNG", "GROESSER", "KLEINER", "NICHT", "ADDITION", "SUBTRAKTION", 
			"MULTIPLIKATION", "DIVISION", "BLOCKGRENZE", "GRUPPENGRENZE", "LISTENGRENZE", 
			"ANWEISUNGSENDE", "DOPPELPUNKT", "PUNKT", "KOMMA", "UHRZEITWERT", "ZAHL", 
			"TEXTWERT", "TEXTGRENZE", "KENNUNG", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Junior.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuniorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode HAUS() { return getToken(JuniorParser.HAUS, 0); }
		public TerminalNode TEXTWERT() { return getToken(JuniorParser.TEXTWERT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JuniorParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(HAUS);
			setState(59);
			match(TEXTWERT);
			setState(60);
			block();
			setState(61);
			match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> BLOCKGRENZE() { return getTokens(JuniorParser.BLOCKGRENZE); }
		public TerminalNode BLOCKGRENZE(int i) {
			return getToken(JuniorParser.BLOCKGRENZE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(BLOCKGRENZE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZIMMER) | (1L << WERT) | (1L << SETZEN) | (1L << BEI_EREIGNIS) | (1L << LAGE) | (1L << REGELKREIS) | (1L << EINSCHALTEN) | (1L << AUSSCHALTEN) | (1L << MELDEN))) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(BLOCKGRENZE);
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

	public static class StatementContext extends ParserRuleContext {
		public RoomDeclarationContext roomDeclaration() {
			return getRuleContext(RoomDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public RepetitionContext repetition() {
			return getRuleContext(RepetitionContext.class,0);
		}
		public AutomationContext automation() {
			return getRuleContext(AutomationContext.class,0);
		}
		public DeviceActionContext deviceAction() {
			return getRuleContext(DeviceActionContext.class,0);
		}
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZIMMER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				roomDeclaration();
				}
				break;
			case WERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				variableDeclaration();
				}
				break;
			case SETZEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				assignment();
				}
				break;
			case LAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				decision();
				}
				break;
			case REGELKREIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				repetition();
				}
				break;
			case BEI_EREIGNIS:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				automation();
				}
				break;
			case EINSCHALTEN:
			case AUSSCHALTEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				deviceAction();
				}
				break;
			case MELDEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				notification();
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

	public static class RoomDeclarationContext extends ParserRuleContext {
		public TerminalNode ZIMMER() { return getToken(JuniorParser.ZIMMER, 0); }
		public TerminalNode KENNUNG() { return getToken(JuniorParser.KENNUNG, 0); }
		public List<TerminalNode> BLOCKGRENZE() { return getTokens(JuniorParser.BLOCKGRENZE); }
		public TerminalNode BLOCKGRENZE(int i) {
			return getToken(JuniorParser.BLOCKGRENZE, i);
		}
		public List<DeviceDeclarationContext> deviceDeclaration() {
			return getRuleContexts(DeviceDeclarationContext.class);
		}
		public DeviceDeclarationContext deviceDeclaration(int i) {
			return getRuleContext(DeviceDeclarationContext.class,i);
		}
		public RoomDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterRoomDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitRoomDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitRoomDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomDeclarationContext roomDeclaration() throws RecognitionException {
		RoomDeclarationContext _localctx = new RoomDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_roomDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ZIMMER);
			setState(83);
			match(KENNUNG);
			setState(84);
			match(BLOCKGRENZE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GERAET) {
				{
				{
				setState(85);
				deviceDeclaration();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(BLOCKGRENZE);
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

	public static class DeviceDeclarationContext extends ParserRuleContext {
		public TerminalNode GERAET() { return getToken(JuniorParser.GERAET, 0); }
		public TerminalNode KENNUNG() { return getToken(JuniorParser.KENNUNG, 0); }
		public TerminalNode DOPPELPUNKT() { return getToken(JuniorParser.DOPPELPUNKT, 0); }
		public DeviceKindContext deviceKind() {
			return getRuleContext(DeviceKindContext.class,0);
		}
		public TerminalNode ANWEISUNGSENDE() { return getToken(JuniorParser.ANWEISUNGSENDE, 0); }
		public DeviceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deviceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterDeviceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitDeviceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitDeviceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeviceDeclarationContext deviceDeclaration() throws RecognitionException {
		DeviceDeclarationContext _localctx = new DeviceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deviceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(GERAET);
			setState(94);
			match(KENNUNG);
			setState(95);
			match(DOPPELPUNKT);
			setState(96);
			deviceKind();
			setState(97);
			match(ANWEISUNGSENDE);
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

	public static class DeviceKindContext extends ParserRuleContext {
		public TerminalNode LICHT() { return getToken(JuniorParser.LICHT, 0); }
		public TerminalNode SENSOR() { return getToken(JuniorParser.SENSOR, 0); }
		public TerminalNode KLIMA() { return getToken(JuniorParser.KLIMA, 0); }
		public TerminalNode TUER() { return getToken(JuniorParser.TUER, 0); }
		public TerminalNode ALARM() { return getToken(JuniorParser.ALARM, 0); }
		public TerminalNode HAUSHALTSGERAET() { return getToken(JuniorParser.HAUSHALTSGERAET, 0); }
		public DeviceKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deviceKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterDeviceKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitDeviceKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitDeviceKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeviceKindContext deviceKind() throws RecognitionException {
		DeviceKindContext _localctx = new DeviceKindContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_deviceKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LICHT) | (1L << SENSOR) | (1L << KLIMA) | (1L << TUER) | (1L << ALARM) | (1L << HAUSHALTSGERAET))) != 0)) ) {
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode WERT() { return getToken(JuniorParser.WERT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode KENNUNG() { return getToken(JuniorParser.KENNUNG, 0); }
		public TerminalNode ANWEISUNGSENDE() { return getToken(JuniorParser.ANWEISUNGSENDE, 0); }
		public TerminalNode ZUWEISUNG() { return getToken(JuniorParser.ZUWEISUNG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(WERT);
			setState(102);
			dataType();
			setState(103);
			match(KENNUNG);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZUWEISUNG) {
				{
				setState(104);
				match(ZUWEISUNG);
				setState(105);
				expression();
				}
			}

			setState(108);
			match(ANWEISUNGSENDE);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode PEGEL() { return getToken(JuniorParser.PEGEL, 0); }
		public TerminalNode MELDUNG() { return getToken(JuniorParser.MELDUNG, 0); }
		public TerminalNode SCHALTZUSTAND() { return getToken(JuniorParser.SCHALTZUSTAND, 0); }
		public TerminalNode ZEITPUNKT() { return getToken(JuniorParser.ZEITPUNKT, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PEGEL) | (1L << MELDUNG) | (1L << SCHALTZUSTAND) | (1L << ZEITPUNKT))) != 0)) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode SETZEN() { return getToken(JuniorParser.SETZEN, 0); }
		public TerminalNode KENNUNG() { return getToken(JuniorParser.KENNUNG, 0); }
		public TerminalNode ZUWEISUNG() { return getToken(JuniorParser.ZUWEISUNG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ANWEISUNGSENDE() { return getToken(JuniorParser.ANWEISUNGSENDE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SETZEN);
			setState(113);
			match(KENNUNG);
			setState(114);
			match(ZUWEISUNG);
			setState(115);
			expression();
			setState(116);
			match(ANWEISUNGSENDE);
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

	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode LAGE() { return getToken(JuniorParser.LAGE, 0); }
		public List<TerminalNode> GRUPPENGRENZE() { return getTokens(JuniorParser.GRUPPENGRENZE); }
		public TerminalNode GRUPPENGRENZE(int i) {
			return getToken(JuniorParser.GRUPPENGRENZE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ZWEIG() { return getToken(JuniorParser.ZWEIG, 0); }
		public TerminalNode ERSATZWEG() { return getToken(JuniorParser.ERSATZWEG, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitDecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitDecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LAGE);
			setState(119);
			match(GRUPPENGRENZE);
			setState(120);
			expression();
			setState(121);
			match(GRUPPENGRENZE);
			setState(122);
			block();
			setState(123);
			match(ZWEIG);
			setState(124);
			match(GRUPPENGRENZE);
			setState(125);
			expression();
			setState(126);
			match(GRUPPENGRENZE);
			setState(127);
			block();
			setState(128);
			match(ERSATZWEG);
			setState(129);
			block();
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

	public static class RepetitionContext extends ParserRuleContext {
		public TerminalNode REGELKREIS() { return getToken(JuniorParser.REGELKREIS, 0); }
		public List<TerminalNode> GRUPPENGRENZE() { return getTokens(JuniorParser.GRUPPENGRENZE); }
		public TerminalNode GRUPPENGRENZE(int i) {
			return getToken(JuniorParser.GRUPPENGRENZE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepetitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterRepetition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitRepetition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitRepetition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetitionContext repetition() throws RecognitionException {
		RepetitionContext _localctx = new RepetitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repetition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(REGELKREIS);
			setState(132);
			match(GRUPPENGRENZE);
			setState(133);
			expression();
			setState(134);
			match(GRUPPENGRENZE);
			setState(135);
			block();
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

	public static class AutomationContext extends ParserRuleContext {
		public TerminalNode BEI_EREIGNIS() { return getToken(JuniorParser.BEI_EREIGNIS, 0); }
		public EventSourceContext eventSource() {
			return getRuleContext(EventSourceContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AutomationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterAutomation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitAutomation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitAutomation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomationContext automation() throws RecognitionException {
		AutomationContext _localctx = new AutomationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_automation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(BEI_EREIGNIS);
			setState(138);
			eventSource();
			setState(139);
			block();
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

	public static class EventSourceContext extends ParserRuleContext {
		public DeviceReferenceContext deviceReference() {
			return getRuleContext(DeviceReferenceContext.class,0);
		}
		public TerminalNode PUNKT() { return getToken(JuniorParser.PUNKT, 0); }
		public EventKindContext eventKind() {
			return getRuleContext(EventKindContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UHR() { return getToken(JuniorParser.UHR, 0); }
		public TerminalNode ZEITEREIGNIS() { return getToken(JuniorParser.ZEITEREIGNIS, 0); }
		public TerminalNode GLEICH() { return getToken(JuniorParser.GLEICH, 0); }
		public TerminalNode UHRZEITWERT() { return getToken(JuniorParser.UHRZEITWERT, 0); }
		public EventSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterEventSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitEventSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitEventSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventSourceContext eventSource() throws RecognitionException {
		EventSourceContext _localctx = new EventSourceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eventSource);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KENNUNG:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				deviceReference();
				setState(142);
				match(PUNKT);
				setState(143);
				eventKind();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLEICH) | (1L << UNGLEICH) | (1L << GROESSER_GLEICH) | (1L << KLEINER_GLEICH) | (1L << GROESSER) | (1L << KLEINER))) != 0)) {
					{
					setState(144);
					comparison();
					setState(145);
					expression();
					}
				}

				}
				break;
			case UHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(UHR);
				setState(150);
				match(PUNKT);
				setState(151);
				match(ZEITEREIGNIS);
				setState(152);
				match(GLEICH);
				setState(153);
				match(UHRZEITWERT);
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

	public static class EventKindContext extends ParserRuleContext {
		public TerminalNode BEWEGUNG() { return getToken(JuniorParser.BEWEGUNG, 0); }
		public TerminalNode GEOEFFNET() { return getToken(JuniorParser.GEOEFFNET, 0); }
		public TerminalNode GESCHLOSSEN() { return getToken(JuniorParser.GESCHLOSSEN, 0); }
		public TerminalNode WARNUNG() { return getToken(JuniorParser.WARNUNG, 0); }
		public TerminalNode TEMPERATUR() { return getToken(JuniorParser.TEMPERATUR, 0); }
		public EventKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterEventKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitEventKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitEventKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventKindContext eventKind() throws RecognitionException {
		EventKindContext _localctx = new EventKindContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eventKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEWEGUNG) | (1L << GEOEFFNET) | (1L << GESCHLOSSEN) | (1L << WARNUNG) | (1L << TEMPERATUR))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode GLEICH() { return getToken(JuniorParser.GLEICH, 0); }
		public TerminalNode UNGLEICH() { return getToken(JuniorParser.UNGLEICH, 0); }
		public TerminalNode GROESSER() { return getToken(JuniorParser.GROESSER, 0); }
		public TerminalNode KLEINER() { return getToken(JuniorParser.KLEINER, 0); }
		public TerminalNode GROESSER_GLEICH() { return getToken(JuniorParser.GROESSER_GLEICH, 0); }
		public TerminalNode KLEINER_GLEICH() { return getToken(JuniorParser.KLEINER_GLEICH, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLEICH) | (1L << UNGLEICH) | (1L << GROESSER_GLEICH) | (1L << KLEINER_GLEICH) | (1L << GROESSER) | (1L << KLEINER))) != 0)) ) {
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

	public static class DeviceReferenceContext extends ParserRuleContext {
		public List<TerminalNode> KENNUNG() { return getTokens(JuniorParser.KENNUNG); }
		public TerminalNode KENNUNG(int i) {
			return getToken(JuniorParser.KENNUNG, i);
		}
		public TerminalNode PUNKT() { return getToken(JuniorParser.PUNKT, 0); }
		public DeviceReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deviceReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterDeviceReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitDeviceReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitDeviceReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeviceReferenceContext deviceReference() throws RecognitionException {
		DeviceReferenceContext _localctx = new DeviceReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deviceReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(KENNUNG);
			setState(161);
			match(PUNKT);
			setState(162);
			match(KENNUNG);
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

	public static class DeviceActionContext extends ParserRuleContext {
		public TargetsContext targets() {
			return getRuleContext(TargetsContext.class,0);
		}
		public TerminalNode ANWEISUNGSENDE() { return getToken(JuniorParser.ANWEISUNGSENDE, 0); }
		public TerminalNode EINSCHALTEN() { return getToken(JuniorParser.EINSCHALTEN, 0); }
		public TerminalNode AUSSCHALTEN() { return getToken(JuniorParser.AUSSCHALTEN, 0); }
		public DeviceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deviceAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterDeviceAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitDeviceAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitDeviceAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeviceActionContext deviceAction() throws RecognitionException {
		DeviceActionContext _localctx = new DeviceActionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_deviceAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==EINSCHALTEN || _la==AUSSCHALTEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			targets();
			setState(166);
			match(ANWEISUNGSENDE);
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

	public static class TargetsContext extends ParserRuleContext {
		public List<DeviceReferenceContext> deviceReference() {
			return getRuleContexts(DeviceReferenceContext.class);
		}
		public DeviceReferenceContext deviceReference(int i) {
			return getRuleContext(DeviceReferenceContext.class,i);
		}
		public List<TerminalNode> LISTENGRENZE() { return getTokens(JuniorParser.LISTENGRENZE); }
		public TerminalNode LISTENGRENZE(int i) {
			return getToken(JuniorParser.LISTENGRENZE, i);
		}
		public List<TerminalNode> KOMMA() { return getTokens(JuniorParser.KOMMA); }
		public TerminalNode KOMMA(int i) {
			return getToken(JuniorParser.KOMMA, i);
		}
		public TargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetsContext targets() throws RecognitionException {
		TargetsContext _localctx = new TargetsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_targets);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KENNUNG:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				deviceReference();
				}
				break;
			case LISTENGRENZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(LISTENGRENZE);
				setState(170);
				deviceReference();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KOMMA) {
					{
					{
					setState(171);
					match(KOMMA);
					setState(172);
					deviceReference();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(LISTENGRENZE);
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

	public static class NotificationContext extends ParserRuleContext {
		public TerminalNode MELDEN() { return getToken(JuniorParser.MELDEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ANWEISUNGSENDE() { return getToken(JuniorParser.ANWEISUNGSENDE, 0); }
		public NotificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterNotification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitNotification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitNotification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_notification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(MELDEN);
			setState(183);
			expression();
			setState(184);
			match(ANWEISUNGSENDE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			logicalOr();
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

	public static class LogicalOrContext extends ParserRuleContext {
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public List<TerminalNode> ODER() { return getTokens(JuniorParser.ODER); }
		public TerminalNode ODER(int i) {
			return getToken(JuniorParser.ODER, i);
		}
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			logicalAnd();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ODER) {
				{
				{
				setState(189);
				match(ODER);
				setState(190);
				logicalAnd();
				}
				}
				setState(195);
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

	public static class LogicalAndContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> UND() { return getTokens(JuniorParser.UND); }
		public TerminalNode UND(int i) {
			return getToken(JuniorParser.UND, i);
		}
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			equality();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UND) {
				{
				{
				setState(197);
				match(UND);
				setState(198);
				equality();
				}
				}
				setState(203);
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

	public static class EqualityContext extends ParserRuleContext {
		public List<RelationalContext> relational() {
			return getRuleContexts(RelationalContext.class);
		}
		public RelationalContext relational(int i) {
			return getRuleContext(RelationalContext.class,i);
		}
		public List<TerminalNode> GLEICH() { return getTokens(JuniorParser.GLEICH); }
		public TerminalNode GLEICH(int i) {
			return getToken(JuniorParser.GLEICH, i);
		}
		public List<TerminalNode> UNGLEICH() { return getTokens(JuniorParser.UNGLEICH); }
		public TerminalNode UNGLEICH(int i) {
			return getToken(JuniorParser.UNGLEICH, i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			relational();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLEICH || _la==UNGLEICH) {
				{
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==GLEICH || _la==UNGLEICH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				relational();
				}
				}
				setState(211);
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

	public static class RelationalContext extends ParserRuleContext {
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public List<TerminalNode> KLEINER() { return getTokens(JuniorParser.KLEINER); }
		public TerminalNode KLEINER(int i) {
			return getToken(JuniorParser.KLEINER, i);
		}
		public List<TerminalNode> KLEINER_GLEICH() { return getTokens(JuniorParser.KLEINER_GLEICH); }
		public TerminalNode KLEINER_GLEICH(int i) {
			return getToken(JuniorParser.KLEINER_GLEICH, i);
		}
		public List<TerminalNode> GROESSER() { return getTokens(JuniorParser.GROESSER); }
		public TerminalNode GROESSER(int i) {
			return getToken(JuniorParser.GROESSER, i);
		}
		public List<TerminalNode> GROESSER_GLEICH() { return getTokens(JuniorParser.GROESSER_GLEICH); }
		public TerminalNode GROESSER_GLEICH(int i) {
			return getToken(JuniorParser.GROESSER_GLEICH, i);
		}
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			additive();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROESSER_GLEICH) | (1L << KLEINER_GLEICH) | (1L << GROESSER) | (1L << KLEINER))) != 0)) {
				{
				{
				setState(213);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GROESSER_GLEICH) | (1L << KLEINER_GLEICH) | (1L << GROESSER) | (1L << KLEINER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				additive();
				}
				}
				setState(219);
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

	public static class AdditiveContext extends ParserRuleContext {
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public List<TerminalNode> ADDITION() { return getTokens(JuniorParser.ADDITION); }
		public TerminalNode ADDITION(int i) {
			return getToken(JuniorParser.ADDITION, i);
		}
		public List<TerminalNode> SUBTRAKTION() { return getTokens(JuniorParser.SUBTRAKTION); }
		public TerminalNode SUBTRAKTION(int i) {
			return getToken(JuniorParser.SUBTRAKTION, i);
		}
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			multiplicative();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITION || _la==SUBTRAKTION) {
				{
				{
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==ADDITION || _la==SUBTRAKTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				multiplicative();
				}
				}
				setState(227);
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

	public static class MultiplicativeContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> MULTIPLIKATION() { return getTokens(JuniorParser.MULTIPLIKATION); }
		public TerminalNode MULTIPLIKATION(int i) {
			return getToken(JuniorParser.MULTIPLIKATION, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(JuniorParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(JuniorParser.DIVISION, i);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			unary();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLIKATION || _la==DIVISION) {
				{
				{
				setState(229);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLIKATION || _la==DIVISION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				unary();
				}
				}
				setState(235);
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode NICHT() { return getToken(JuniorParser.NICHT, 0); }
		public TerminalNode SUBTRAKTION() { return getToken(JuniorParser.SUBTRAKTION, 0); }
		public TerminalNode ADDITION() { return getToken(JuniorParser.ADDITION, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NICHT:
			case ADDITION:
			case SUBTRAKTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NICHT) | (1L << ADDITION) | (1L << SUBTRAKTION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				unary();
				}
				break;
			case AN:
			case AUS:
			case UHR:
			case GRUPPENGRENZE:
			case UHRZEITWERT:
			case ZAHL:
			case TEXTWERT:
			case KENNUNG:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ZAHL() { return getToken(JuniorParser.ZAHL, 0); }
		public TerminalNode TEXTWERT() { return getToken(JuniorParser.TEXTWERT, 0); }
		public TerminalNode UHRZEITWERT() { return getToken(JuniorParser.UHRZEITWERT, 0); }
		public TerminalNode AN() { return getToken(JuniorParser.AN, 0); }
		public TerminalNode AUS() { return getToken(JuniorParser.AUS, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public List<TerminalNode> GRUPPENGRENZE() { return getTokens(JuniorParser.GRUPPENGRENZE); }
		public TerminalNode GRUPPENGRENZE(int i) {
			return getToken(JuniorParser.GRUPPENGRENZE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZAHL:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(ZAHL);
				}
				break;
			case TEXTWERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(TEXTWERT);
				}
				break;
			case UHRZEITWERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(UHRZEITWERT);
				}
				break;
			case AN:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(AN);
				}
				break;
			case AUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(AUS);
				}
				break;
			case UHR:
			case KENNUNG:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				reference();
				}
				break;
			case GRUPPENGRENZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				match(GRUPPENGRENZE);
				setState(248);
				expression();
				setState(249);
				match(GRUPPENGRENZE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> KENNUNG() { return getTokens(JuniorParser.KENNUNG); }
		public TerminalNode KENNUNG(int i) {
			return getToken(JuniorParser.KENNUNG, i);
		}
		public List<TerminalNode> PUNKT() { return getTokens(JuniorParser.PUNKT); }
		public TerminalNode PUNKT(int i) {
			return getToken(JuniorParser.PUNKT, i);
		}
		public TerminalNode UHR() { return getToken(JuniorParser.UHR, 0); }
		public TerminalNode ZEITEREIGNIS() { return getToken(JuniorParser.ZEITEREIGNIS, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuniorListener ) ((JuniorListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuniorVisitor ) return ((JuniorVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_reference);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KENNUNG:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(KENNUNG);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUNKT) {
					{
					{
					setState(254);
					match(PUNKT);
					setState(255);
					match(KENNUNG);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(UHR);
				setState(262);
				match(PUNKT);
				setState(263);
				match(ZEITEREIGNIS);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4S\n\4\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0096\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u009d"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00b0\n\23\f\23\16\23\u00b3\13\23\3\23\3\23"+
		"\5\23\u00b7\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00c2"+
		"\n\26\f\26\16\26\u00c5\13\26\3\27\3\27\3\27\7\27\u00ca\n\27\f\27\16\27"+
		"\u00cd\13\27\3\30\3\30\3\30\7\30\u00d2\n\30\f\30\16\30\u00d5\13\30\3\31"+
		"\3\31\3\31\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\3\32\3\32\3\32\7\32"+
		"\u00e2\n\32\f\32\16\32\u00e5\13\32\3\33\3\33\3\33\7\33\u00ea\n\33\f\33"+
		"\16\33\u00ed\13\33\3\34\3\34\3\34\5\34\u00f2\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00fe\n\35\3\36\3\36\3\36\7\36\u0103"+
		"\n\36\f\36\16\36\u0106\13\36\3\36\3\36\3\36\5\36\u010b\n\36\3\36\2\2\37"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\f\3\2"+
		"\26\33\3\2\20\23\3\2\35!\4\2%(*+\3\2\r\16\3\2%&\4\2\'(*+\3\2-.\3\2/\60"+
		"\3\2,.\2\u010c\2<\3\2\2\2\4A\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\n_\3\2\2\2"+
		"\fe\3\2\2\2\16g\3\2\2\2\20p\3\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26\u0085\3"+
		"\2\2\2\30\u008b\3\2\2\2\32\u009c\3\2\2\2\34\u009e\3\2\2\2\36\u00a0\3\2"+
		"\2\2 \u00a2\3\2\2\2\"\u00a6\3\2\2\2$\u00b6\3\2\2\2&\u00b8\3\2\2\2(\u00bc"+
		"\3\2\2\2*\u00be\3\2\2\2,\u00c6\3\2\2\2.\u00ce\3\2\2\2\60\u00d6\3\2\2\2"+
		"\62\u00de\3\2\2\2\64\u00e6\3\2\2\2\66\u00f1\3\2\2\28\u00fd\3\2\2\2:\u010a"+
		"\3\2\2\2<=\7\3\2\2=>\7:\2\2>?\5\4\3\2?@\7\2\2\3@\3\3\2\2\2AE\7\61\2\2"+
		"BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2"+
		"HI\7\61\2\2I\5\3\2\2\2JS\5\b\5\2KS\5\16\b\2LS\5\22\n\2MS\5\24\13\2NS\5"+
		"\26\f\2OS\5\30\r\2PS\5\"\22\2QS\5&\24\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2"+
		"RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\7\4\2"+
		"\2UV\7<\2\2VZ\7\61\2\2WY\5\n\6\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\61\2\2^\t\3\2\2\2_`\7\5\2\2`a\7<\2\2ab\7"+
		"\65\2\2bc\5\f\7\2cd\7\64\2\2d\13\3\2\2\2ef\t\2\2\2f\r\3\2\2\2gh\7\6\2"+
		"\2hi\5\20\t\2il\7<\2\2jk\7)\2\2km\5(\25\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2"+
		"\2no\7\64\2\2o\17\3\2\2\2pq\t\3\2\2q\21\3\2\2\2rs\7\7\2\2st\7<\2\2tu\7"+
		")\2\2uv\5(\25\2vw\7\64\2\2w\23\3\2\2\2xy\7\t\2\2yz\7\62\2\2z{\5(\25\2"+
		"{|\7\62\2\2|}\5\4\3\2}~\7\n\2\2~\177\7\62\2\2\177\u0080\5(\25\2\u0080"+
		"\u0081\7\62\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\13\2\2\u0083\u0084\5"+
		"\4\3\2\u0084\25\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\7\62\2\2\u0087"+
		"\u0088\5(\25\2\u0088\u0089\7\62\2\2\u0089\u008a\5\4\3\2\u008a\27\3\2\2"+
		"\2\u008b\u008c\7\b\2\2\u008c\u008d\5\32\16\2\u008d\u008e\5\4\3\2\u008e"+
		"\31\3\2\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\66\2\2\u0091\u0095\5\34"+
		"\17\2\u0092\u0093\5\36\20\2\u0093\u0094\5(\25\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009d\3\2\2\2\u0097\u0098\7\34"+
		"\2\2\u0098\u0099\7\66\2\2\u0099\u009a\7\"\2\2\u009a\u009b\7%\2\2\u009b"+
		"\u009d\78\2\2\u009c\u008f\3\2\2\2\u009c\u0097\3\2\2\2\u009d\33\3\2\2\2"+
		"\u009e\u009f\t\4\2\2\u009f\35\3\2\2\2\u00a0\u00a1\t\5\2\2\u00a1\37\3\2"+
		"\2\2\u00a2\u00a3\7<\2\2\u00a3\u00a4\7\66\2\2\u00a4\u00a5\7<\2\2\u00a5"+
		"!\3\2\2\2\u00a6\u00a7\t\6\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7\64\2\2"+
		"\u00a9#\3\2\2\2\u00aa\u00b7\5 \21\2\u00ab\u00ac\7\63\2\2\u00ac\u00b1\5"+
		" \21\2\u00ad\u00ae\7\67\2\2\u00ae\u00b0\5 \21\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\63\2\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00aa\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b7%\3\2\2\2\u00b8\u00b9\7\17\2\2"+
		"\u00b9\u00ba\5(\25\2\u00ba\u00bb\7\64\2\2\u00bb\'\3\2\2\2\u00bc\u00bd"+
		"\5*\26\2\u00bd)\3\2\2\2\u00be\u00c3\5,\27\2\u00bf\u00c0\7$\2\2\u00c0\u00c2"+
		"\5,\27\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4+\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5.\30\2"+
		"\u00c7\u00c8\7#\2\2\u00c8\u00ca\5.\30\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc-\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d3\5\60\31\2\u00cf\u00d0\t\7\2\2\u00d0\u00d2\5"+
		"\60\31\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\62\32"+
		"\2\u00d7\u00d8\t\b\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\61\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00e3\5\64\33\2\u00df\u00e0\t\t\2\2\u00e0"+
		"\u00e2\5\64\33\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\63\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00eb\5\66\34\2\u00e7\u00e8\t\n\2\2\u00e8\u00ea\5\66\34\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\65\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\t\13\2\2\u00ef\u00f2\5\66"+
		"\34\2\u00f0\u00f2\58\35\2\u00f1\u00ee\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\67\3\2\2\2\u00f3\u00fe\79\2\2\u00f4\u00fe\7:\2\2\u00f5\u00fe\78\2\2\u00f6"+
		"\u00fe\7\24\2\2\u00f7\u00fe\7\25\2\2\u00f8\u00fe\5:\36\2\u00f9\u00fa\7"+
		"\62\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7\62\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2"+
		"\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe"+
		"9\3\2\2\2\u00ff\u0104\7<\2\2\u0100\u0101\7\66\2\2\u0101\u0103\7<\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u010b\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\34\2\2\u0108"+
		"\u0109\7\66\2\2\u0109\u010b\7\"\2\2\u010a\u00ff\3\2\2\2\u010a\u0107\3"+
		"\2\2\2\u010b;\3\2\2\2\24ERZl\u0095\u009c\u00b1\u00b6\u00c3\u00cb\u00d3"+
		"\u00db\u00e3\u00eb\u00f1\u00fd\u0104\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}