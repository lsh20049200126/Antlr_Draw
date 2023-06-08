// Generated from DRAW.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DRAWParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICO=1, COMMA=2, L_BACK=3, R_BACK=4, PLUS=5, MINUS=6, MUL=7, DIV=8, 
		POWER=9, FOR=10, FROM=11, STEP=12, CONST=13, COLOR=14, ORIGIN=15, IS=16, 
		SIZE=17, TO=18, DRAW=19, SCALE=20, ROT=21, COMMENT=22, FUNC=23, T=24, 
		ID=25, WS=26, ERROR=27;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'**'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICO", "COMMA", "L_BACK", "R_BACK", "PLUS", "MINUS", "MUL", 
			"DIV", "POWER", "FOR", "FROM", "STEP", "CONST", "COLOR", "ORIGIN", "IS", 
			"SIZE", "TO", "DRAW", "SCALE", "ROT", "COMMENT", "FUNC", "T", "ID", "WS", 
			"ERROR"
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
	public String getGrammarFileName() { return "DRAW.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DRAWParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DRAWParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << COLOR) | (1L << ORIGIN) | (1L << SIZE) | (1L << SCALE) | (1L << ROT))) != 0)) {
				{
				{
				setState(6);
				statement();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ORIGINContext extends StatementContext {
		public TerminalNode ORIGIN() { return getToken(DRAWParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(DRAWParser.IS, 0); }
		public TerminalNode L_BACK() { return getToken(DRAWParser.L_BACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DRAWParser.COMMA, 0); }
		public TerminalNode R_BACK() { return getToken(DRAWParser.R_BACK, 0); }
		public TerminalNode SEMICO() { return getToken(DRAWParser.SEMICO, 0); }
		public ORIGINContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitORIGIN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ROTContext extends StatementContext {
		public TerminalNode ROT() { return getToken(DRAWParser.ROT, 0); }
		public TerminalNode IS() { return getToken(DRAWParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICO() { return getToken(DRAWParser.SEMICO, 0); }
		public ROTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitROT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class COLORContext extends StatementContext {
		public TerminalNode COLOR() { return getToken(DRAWParser.COLOR, 0); }
		public TerminalNode IS() { return getToken(DRAWParser.IS, 0); }
		public TerminalNode L_BACK() { return getToken(DRAWParser.L_BACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DRAWParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DRAWParser.COMMA, i);
		}
		public TerminalNode R_BACK() { return getToken(DRAWParser.R_BACK, 0); }
		public TerminalNode SEMICO() { return getToken(DRAWParser.SEMICO, 0); }
		public COLORContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitCOLOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIZEContext extends StatementContext {
		public TerminalNode SIZE() { return getToken(DRAWParser.SIZE, 0); }
		public TerminalNode IS() { return getToken(DRAWParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICO() { return getToken(DRAWParser.SEMICO, 0); }
		public SIZEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitSIZE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FORContext extends StatementContext {
		public TerminalNode FOR() { return getToken(DRAWParser.FOR, 0); }
		public TerminalNode T() { return getToken(DRAWParser.T, 0); }
		public TerminalNode FROM() { return getToken(DRAWParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(DRAWParser.TO, 0); }
		public TerminalNode STEP() { return getToken(DRAWParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(DRAWParser.DRAW, 0); }
		public TerminalNode L_BACK() { return getToken(DRAWParser.L_BACK, 0); }
		public TerminalNode COMMA() { return getToken(DRAWParser.COMMA, 0); }
		public TerminalNode R_BACK() { return getToken(DRAWParser.R_BACK, 0); }
		public TerminalNode SEMICO() { return getToken(DRAWParser.SEMICO, 0); }
		public FORContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitFOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SCALEContext extends StatementContext {
		public TerminalNode SCALE() { return getToken(DRAWParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(DRAWParser.IS, 0); }
		public TerminalNode L_BACK() { return getToken(DRAWParser.L_BACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DRAWParser.COMMA, 0); }
		public TerminalNode R_BACK() { return getToken(DRAWParser.R_BACK, 0); }
		public TerminalNode SEMICO() { return getToken(DRAWParser.SEMICO, 0); }
		public SCALEContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitSCALE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new FORContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(FOR);
				setState(15);
				match(T);
				setState(16);
				match(FROM);
				setState(17);
				expr(0);
				setState(18);
				match(TO);
				setState(19);
				expr(0);
				setState(20);
				match(STEP);
				setState(21);
				expr(0);
				setState(22);
				match(DRAW);
				setState(23);
				match(L_BACK);
				setState(24);
				expr(0);
				setState(25);
				match(COMMA);
				setState(26);
				expr(0);
				setState(27);
				match(R_BACK);
				setState(28);
				match(SEMICO);
				}
				break;
			case ORIGIN:
				_localctx = new ORIGINContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(ORIGIN);
				setState(31);
				match(IS);
				setState(32);
				match(L_BACK);
				setState(33);
				expr(0);
				setState(34);
				match(COMMA);
				setState(35);
				expr(0);
				setState(36);
				match(R_BACK);
				setState(37);
				match(SEMICO);
				}
				break;
			case SCALE:
				_localctx = new SCALEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(SCALE);
				setState(40);
				match(IS);
				setState(41);
				match(L_BACK);
				setState(42);
				expr(0);
				setState(43);
				match(COMMA);
				setState(44);
				expr(0);
				setState(45);
				match(R_BACK);
				setState(46);
				match(SEMICO);
				}
				break;
			case ROT:
				_localctx = new ROTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(ROT);
				setState(49);
				match(IS);
				setState(50);
				expr(0);
				setState(51);
				match(SEMICO);
				}
				break;
			case COLOR:
				_localctx = new COLORContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(COLOR);
				setState(54);
				match(IS);
				setState(55);
				match(L_BACK);
				setState(56);
				expr(0);
				setState(57);
				match(COMMA);
				setState(58);
				expr(0);
				setState(59);
				match(COMMA);
				setState(60);
				expr(0);
				setState(61);
				match(R_BACK);
				setState(62);
				match(SEMICO);
				}
				break;
			case SIZE:
				_localctx = new SIZEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(SIZE);
				setState(65);
				match(IS);
				setState(66);
				expr(0);
				setState(67);
				match(SEMICO);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DIVContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(DRAWParser.DIV, 0); }
		public DIVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TContext extends ExprContext {
		public TerminalNode T() { return getToken(DRAWParser.T, 0); }
		public TContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FUNCContext extends ExprContext {
		public TerminalNode FUNC() { return getToken(DRAWParser.FUNC, 0); }
		public TerminalNode L_BACK() { return getToken(DRAWParser.L_BACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BACK() { return getToken(DRAWParser.R_BACK, 0); }
		public FUNCContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitFUNC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DRAWParser.MUL, 0); }
		public MULContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitMUL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CONSTContext extends ExprContext {
		public TerminalNode CONST() { return getToken(DRAWParser.CONST, 0); }
		public CONSTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitCONST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class POWERContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(DRAWParser.POWER, 0); }
		public POWERContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitPOWER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ERRORContext extends ExprContext {
		public TerminalNode ERROR() { return getToken(DRAWParser.ERROR, 0); }
		public ERRORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitERROR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLUS1Context extends ExprContext {
		public TerminalNode PLUS() { return getToken(DRAWParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PLUS1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitPLUS1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MINUS1Context extends ExprContext {
		public TerminalNode MINUS() { return getToken(DRAWParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MINUS1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitMINUS1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LRBACKContext extends ExprContext {
		public TerminalNode L_BACK() { return getToken(DRAWParser.L_BACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BACK() { return getToken(DRAWParser.R_BACK, 0); }
		public LRBACKContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitLRBACK(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PLUSContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DRAWParser.PLUS, 0); }
		public PLUSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitPLUS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MINUSContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(DRAWParser.MINUS, 0); }
		public MINUSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DRAWVisitor ) return ((DRAWVisitor<? extends T>)visitor).visitMINUS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new MINUS1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(MINUS);
				setState(73);
				expr(11);
				}
				break;
			case PLUS:
				{
				_localctx = new PLUS1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(PLUS);
				setState(75);
				expr(10);
				}
				break;
			case T:
				{
				_localctx = new TContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(T);
				}
				break;
			case CONST:
				{
				_localctx = new CONSTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(CONST);
				}
				break;
			case L_BACK:
				{
				_localctx = new LRBACKContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(L_BACK);
				setState(79);
				expr(0);
				setState(80);
				match(R_BACK);
				}
				break;
			case FUNC:
				{
				_localctx = new FUNCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(FUNC);
				setState(83);
				match(L_BACK);
				setState(84);
				expr(0);
				setState(85);
				match(R_BACK);
				}
				break;
			case ERROR:
				{
				_localctx = new ERRORContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(ERROR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new POWERContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(91);
						match(POWER);
						setState(92);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MULContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(94);
						match(MUL);
						setState(95);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new DIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(97);
						match(DIV);
						setState(98);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new PLUSContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						match(PLUS);
						setState(101);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new MINUSContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						match(MINUS);
						setState(104);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"[\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"l\n\4\f\4\16\4o\13\4\3\4\2\3\6\5\2\4\6\2\2\2~\2\13\3\2\2\2\4G\3\2\2\2"+
		"\6Z\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2"+
		"\2\2\f\16\3\2\2\2\r\13\3\2\2\2\16\17\7\2\2\3\17\3\3\2\2\2\20\21\7\f\2"+
		"\2\21\22\7\32\2\2\22\23\7\r\2\2\23\24\5\6\4\2\24\25\7\24\2\2\25\26\5\6"+
		"\4\2\26\27\7\16\2\2\27\30\5\6\4\2\30\31\7\25\2\2\31\32\7\5\2\2\32\33\5"+
		"\6\4\2\33\34\7\4\2\2\34\35\5\6\4\2\35\36\7\6\2\2\36\37\7\3\2\2\37H\3\2"+
		"\2\2 !\7\21\2\2!\"\7\22\2\2\"#\7\5\2\2#$\5\6\4\2$%\7\4\2\2%&\5\6\4\2&"+
		"\'\7\6\2\2\'(\7\3\2\2(H\3\2\2\2)*\7\26\2\2*+\7\22\2\2+,\7\5\2\2,-\5\6"+
		"\4\2-.\7\4\2\2./\5\6\4\2/\60\7\6\2\2\60\61\7\3\2\2\61H\3\2\2\2\62\63\7"+
		"\27\2\2\63\64\7\22\2\2\64\65\5\6\4\2\65\66\7\3\2\2\66H\3\2\2\2\678\7\20"+
		"\2\289\7\22\2\29:\7\5\2\2:;\5\6\4\2;<\7\4\2\2<=\5\6\4\2=>\7\4\2\2>?\5"+
		"\6\4\2?@\7\6\2\2@A\7\3\2\2AH\3\2\2\2BC\7\23\2\2CD\7\22\2\2DE\5\6\4\2E"+
		"F\7\3\2\2FH\3\2\2\2G\20\3\2\2\2G \3\2\2\2G)\3\2\2\2G\62\3\2\2\2G\67\3"+
		"\2\2\2GB\3\2\2\2H\5\3\2\2\2IJ\b\4\1\2JK\7\b\2\2K[\5\6\4\rLM\7\7\2\2M["+
		"\5\6\4\fN[\7\32\2\2O[\7\17\2\2PQ\7\5\2\2QR\5\6\4\2RS\7\6\2\2S[\3\2\2\2"+
		"TU\7\31\2\2UV\7\5\2\2VW\5\6\4\2WX\7\6\2\2X[\3\2\2\2Y[\7\35\2\2ZI\3\2\2"+
		"\2ZL\3\2\2\2ZN\3\2\2\2ZO\3\2\2\2ZP\3\2\2\2ZT\3\2\2\2ZY\3\2\2\2[m\3\2\2"+
		"\2\\]\f\16\2\2]^\7\13\2\2^l\5\6\4\16_`\f\13\2\2`a\7\t\2\2al\5\6\4\fbc"+
		"\f\n\2\2cd\7\n\2\2dl\5\6\4\13ef\f\t\2\2fg\7\7\2\2gl\5\6\4\nhi\f\b\2\2"+
		"ij\7\b\2\2jl\5\6\4\tk\\\3\2\2\2k_\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2"+
		"\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\7\3\2\2\2om\3\2\2\2\7\13GZkm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}