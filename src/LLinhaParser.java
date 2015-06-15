// Generated from LLinha.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLinhaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, FIM=26, DECIMAL=27, NUMERO=28, STRING=29, DO=30, FROM=31, TO=32, 
		FOR=33, END_FOR=34, WHILE=35, END_WHILE=36, ENTAO=37, SE=38, FIM_SE=39, 
		SENAO=40, FUNC=41, END_FUNC=42, ID=43, ENDLINE=44, WS=45, COMMENTS=46;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_comando = 2, RULE_condicao = 3, 
		RULE_expressao = 4, RULE_expressaoprec = 5, RULE_termo = 6, RULE_vetor = 7, 
		RULE_dclvetor = 8, RULE_params = 9, RULE_and = 10, RULE_or = 11, RULE_dif = 12, 
		RULE_menori = 13, RULE_maiori = 14, RULE_mult = 15, RULE_div = 16;
	public static final String[] ruleNames = {
		"programa", "comandos", "comando", "condicao", "expressao", "expressaoprec", 
		"termo", "vetor", "dclvetor", "params", "and", "or", "dif", "menori", 
		"maiori", "mult", "div"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'=='", "'<'", "'>'", "'+'", "'-'", "'verdadeiro'", 
		"'falso'", "'['", "']'", "','", "'e'", "'ou'", "'!='", "'=!'", "'<='", 
		"'=<'", "'>='", "'=>'", "'*'", "'x'", "':'", "'/'", "'fim'", null, null, 
		null, "'faca'", "'de'", "'ate'", "'para'", "'fim-para'", "'enquanto'", 
		"'fim-enquanto'", "'entao'", "'se'", "'fim-se'", "'senao'", "'funcao'", 
		"'fim-funcao'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "FIM", "DECIMAL", "NUMERO", "STRING", "DO", "FROM", "TO", 
		"FOR", "END_FOR", "WHILE", "END_WHILE", "ENTAO", "SE", "FIM_SE", "SENAO", 
		"FUNC", "END_FUNC", "ID", "ENDLINE", "WS", "COMMENTS"
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
	public String getGrammarFileName() { return "LLinha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LLinhaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM() { return getToken(LLinhaParser.FIM, 0); }
		public TerminalNode EOF() { return getToken(LLinhaParser.EOF, 0); }
		public List<TerminalNode> ENDLINE() { return getTokens(LLinhaParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(LLinhaParser.ENDLINE, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(34);
				match(ENDLINE);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			comandos();
			setState(41);
			match(FIM);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDLINE) {
				{
				{
				setState(42);
				match(ENDLINE);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(LLinhaParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(LLinhaParser.ENDLINE, i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			comando();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(ENDLINE);
					setState(52);
					comandos();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(ENDLINE);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(LLinhaParser.SE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(LLinhaParser.ENTAO, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode FIM_SE() { return getToken(LLinhaParser.FIM_SE, 0); }
		public TerminalNode SENAO() { return getToken(LLinhaParser.SENAO, 0); }
		public TerminalNode WHILE() { return getToken(LLinhaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(LLinhaParser.DO, 0); }
		public TerminalNode END_WHILE() { return getToken(LLinhaParser.END_WHILE, 0); }
		public TerminalNode FOR() { return getToken(LLinhaParser.FOR, 0); }
		public TerminalNode ID() { return getToken(LLinhaParser.ID, 0); }
		public TerminalNode FROM() { return getToken(LLinhaParser.FROM, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(LLinhaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LLinhaParser.NUMERO, i);
		}
		public TerminalNode TO() { return getToken(LLinhaParser.TO, 0); }
		public TerminalNode END_FOR() { return getToken(LLinhaParser.END_FOR, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode FUNC() { return getToken(LLinhaParser.FUNC, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode END_FUNC() { return getToken(LLinhaParser.END_FUNC, 0); }
		public DclvetorContext dclvetor() {
			return getRuleContext(DclvetorContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(SE);
				setState(65);
				condicao(0);
				setState(66);
				match(ENTAO);
				setState(67);
				comandos();
				setState(68);
				match(FIM_SE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(SE);
				setState(71);
				condicao(0);
				setState(72);
				match(ENTAO);
				setState(73);
				comandos();
				setState(74);
				match(SENAO);
				setState(75);
				comandos();
				setState(76);
				match(FIM_SE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(WHILE);
				setState(79);
				condicao(0);
				setState(80);
				match(DO);
				setState(81);
				comandos();
				setState(82);
				match(END_WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(FOR);
				setState(85);
				match(ID);
				setState(86);
				match(FROM);
				setState(87);
				match(NUMERO);
				setState(88);
				match(TO);
				setState(89);
				match(NUMERO);
				setState(90);
				match(DO);
				setState(91);
				comandos();
				setState(92);
				match(END_FOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(ID);
				setState(95);
				match(T__0);
				setState(96);
				condicao(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				vetor();
				setState(98);
				match(T__0);
				setState(99);
				condicao(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				match(FUNC);
				setState(102);
				match(ID);
				setState(103);
				match(T__1);
				setState(104);
				params();
				setState(105);
				match(T__2);
				setState(106);
				comandos();
				setState(107);
				match(END_FUNC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				dclvetor();
				}
				break;
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

	public static class CondicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public DifContext dif() {
			return getRuleContext(DifContext.class,0);
		}
		public MenoriContext menori() {
			return getRuleContext(MenoriContext.class,0);
		}
		public MaioriContext maiori() {
			return getRuleContext(MaioriContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		return condicao(0);
	}

	private CondicaoContext condicao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicaoContext _localctx = new CondicaoContext(_ctx, _parentState);
		CondicaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_condicao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			expressao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(115);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(116);
						and();
						setState(117);
						expressao(0);
						}
						break;
					case 2:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(119);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(120);
						or();
						setState(121);
						expressao(0);
						}
						break;
					case 3:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						match(T__3);
						setState(125);
						expressao(0);
						}
						break;
					case 4:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(126);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(127);
						dif();
						setState(128);
						expressao(0);
						}
						break;
					case 5:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(130);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(131);
						match(T__4);
						setState(132);
						expressao(0);
						}
						break;
					case 6:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(133);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(134);
						menori();
						setState(135);
						expressao(0);
						}
						break;
					case 7:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138);
						match(T__5);
						setState(139);
						expressao(0);
						}
						break;
					case 8:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						maiori();
						setState(142);
						expressao(0);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoprecContext expressaoprec() {
			return getRuleContext(ExpressaoprecContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			expressaoprec(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						match(T__6);
						setState(154);
						expressaoprec(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(155);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(156);
						match(T__7);
						setState(157);
						expressaoprec(0);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExpressaoprecContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExpressaoprecContext> expressaoprec() {
			return getRuleContexts(ExpressaoprecContext.class);
		}
		public ExpressaoprecContext expressaoprec(int i) {
			return getRuleContext(ExpressaoprecContext.class,i);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public ExpressaoprecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoprec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterExpressaoprec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitExpressaoprec(this);
		}
	}

	public final ExpressaoprecContext expressaoprec() throws RecognitionException {
		return expressaoprec(0);
	}

	private ExpressaoprecContext expressaoprec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoprecContext _localctx = new ExpressaoprecContext(_ctx, _parentState);
		ExpressaoprecContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressaoprec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(164);
				match(T__1);
				setState(165);
				expressao(0);
				setState(166);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(168);
				termo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoprecContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoprec);
						setState(171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(172);
						div();
						setState(173);
						expressaoprec(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoprecContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoprec);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						mult();
						setState(177);
						expressaoprec(3);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class TermoContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LLinhaParser.ID, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LLinhaParser.NUMERO, 0); }
		public TerminalNode DECIMAL() { return getToken(LLinhaParser.DECIMAL, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LLinhaParser.STRING, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termo);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__1);
				setState(185);
				condicao(0);
				setState(186);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				vetor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(NUMERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(DECIMAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(T__8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(T__9);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				match(ID);
				setState(195);
				match(T__1);
				setState(196);
				params();
				setState(197);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				match(STRING);
				}
				break;
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

	public static class VetorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LLinhaParser.ID, 0); }
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public VetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterVetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitVetor(this);
		}
	}

	public final VetorContext vetor() throws RecognitionException {
		VetorContext _localctx = new VetorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vetor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ID);
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(203);
					match(T__10);
					setState(204);
					condicao(0);
					setState(205);
					match(T__11);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DclvetorContext extends ParserRuleContext {
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode ID() { return getToken(LLinhaParser.ID, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(LLinhaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LLinhaParser.NUMERO, i);
		}
		public DclvetorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclvetor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterDclvetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitDclvetor(this);
		}
	}

	public final DclvetorContext dclvetor() throws RecognitionException {
		DclvetorContext _localctx = new DclvetorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dclvetor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			vetor();
			setState(212);
			match(ID);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(213);
				match(T__10);
				setState(214);
				match(NUMERO);
				setState(215);
				match(T__11);
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
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

	public static class ParamsContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			condicao(0);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					match(T__12);
					setState(222);
					params();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__13);
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__14);
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

	public static class DifContext extends ParserRuleContext {
		public DifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterDif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitDif(this);
		}
	}

	public final DifContext dif() throws RecognitionException {
		DifContext _localctx = new DifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MenoriContext extends ParserRuleContext {
		public MenoriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterMenori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitMenori(this);
		}
	}

	public final MenoriContext menori() throws RecognitionException {
		MenoriContext _localctx = new MenoriContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_menori);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MaioriContext extends ParserRuleContext {
		public MaioriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maiori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterMaiori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitMaiori(this);
		}
	}

	public final MaioriContext maiori() throws RecognitionException {
		MaioriContext _localctx = new MaioriContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_maiori);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return condicao_sempred((CondicaoContext)_localctx, predIndex);
		case 4:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 5:
			return expressaoprec_sempred((ExpressaoprecContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicao_sempred(CondicaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoprec_sempred(ExpressaoprecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00f5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cb\n\b\3\t\3\t\3\t\3\t\3\t\6"+
		"\t\u00d2\n\t\r\t\16\t\u00d3\3\n\3\n\3\n\3\n\3\n\6\n\u00db\n\n\r\n\16\n"+
		"\u00dc\3\13\3\13\3\13\7\13\u00e2\n\13\f\13\16\13\u00e5\13\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\5\b\n"+
		"\f\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\7\3\2\22\23\3\2\24\25"+
		"\3\2\26\27\3\2\30\31\3\2\32\33\u0106\2\'\3\2\2\2\4\64\3\2\2\2\6p\3\2\2"+
		"\2\br\3\2\2\2\n\u0097\3\2\2\2\f\u00ab\3\2\2\2\16\u00ca\3\2\2\2\20\u00cc"+
		"\3\2\2\2\22\u00d5\3\2\2\2\24\u00de\3\2\2\2\26\u00e6\3\2\2\2\30\u00e8\3"+
		"\2\2\2\32\u00ea\3\2\2\2\34\u00ec\3\2\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2"+
		"\2\"\u00f2\3\2\2\2$&\7.\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2"+
		"(*\3\2\2\2)\'\3\2\2\2*+\5\4\3\2+/\7\34\2\2,.\7.\2\2-,\3\2\2\2.\61\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63"+
		"\3\3\2\2\2\649\5\6\4\2\65\66\7.\2\2\668\5\4\3\2\67\65\3\2\2\28;\3\2\2"+
		"\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2<>\7.\2\2=<\3\2\2\2>A\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7(\2\2CD\5\b\5\2DE\7\'"+
		"\2\2EF\5\4\3\2FG\7)\2\2Gq\3\2\2\2HI\7(\2\2IJ\5\b\5\2JK\7\'\2\2KL\5\4\3"+
		"\2LM\7*\2\2MN\5\4\3\2NO\7)\2\2Oq\3\2\2\2PQ\7%\2\2QR\5\b\5\2RS\7 \2\2S"+
		"T\5\4\3\2TU\7&\2\2Uq\3\2\2\2VW\7#\2\2WX\7-\2\2XY\7!\2\2YZ\7\36\2\2Z[\7"+
		"\"\2\2[\\\7\36\2\2\\]\7 \2\2]^\5\4\3\2^_\7$\2\2_q\3\2\2\2`a\7-\2\2ab\7"+
		"\3\2\2bq\5\b\5\2cd\5\20\t\2de\7\3\2\2ef\5\b\5\2fq\3\2\2\2gh\7+\2\2hi\7"+
		"-\2\2ij\7\4\2\2jk\5\24\13\2kl\7\5\2\2lm\5\4\3\2mn\7,\2\2nq\3\2\2\2oq\5"+
		"\22\n\2pB\3\2\2\2pH\3\2\2\2pP\3\2\2\2pV\3\2\2\2p`\3\2\2\2pc\3\2\2\2pg"+
		"\3\2\2\2po\3\2\2\2q\7\3\2\2\2rs\b\5\1\2st\5\n\6\2t\u0094\3\2\2\2uv\f\13"+
		"\2\2vw\5\26\f\2wx\5\n\6\2x\u0093\3\2\2\2yz\f\n\2\2z{\5\30\r\2{|\5\n\6"+
		"\2|\u0093\3\2\2\2}~\f\t\2\2~\177\7\6\2\2\177\u0093\5\n\6\2\u0080\u0081"+
		"\f\b\2\2\u0081\u0082\5\32\16\2\u0082\u0083\5\n\6\2\u0083\u0093\3\2\2\2"+
		"\u0084\u0085\f\7\2\2\u0085\u0086\7\7\2\2\u0086\u0093\5\n\6\2\u0087\u0088"+
		"\f\6\2\2\u0088\u0089\5\34\17\2\u0089\u008a\5\n\6\2\u008a\u0093\3\2\2\2"+
		"\u008b\u008c\f\5\2\2\u008c\u008d\7\b\2\2\u008d\u0093\5\n\6\2\u008e\u008f"+
		"\f\4\2\2\u008f\u0090\5\36\20\2\u0090\u0091\5\n\6\2\u0091\u0093\3\2\2\2"+
		"\u0092u\3\2\2\2\u0092y\3\2\2\2\u0092}\3\2\2\2\u0092\u0080\3\2\2\2\u0092"+
		"\u0084\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008e\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\t\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\6\1\2\u0098\u0099\5\f\7\2"+
		"\u0099\u00a2\3\2\2\2\u009a\u009b\f\5\2\2\u009b\u009c\7\t\2\2\u009c\u00a1"+
		"\5\f\7\2\u009d\u009e\f\4\2\2\u009e\u009f\7\n\2\2\u009f\u00a1\5\f\7\2\u00a0"+
		"\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\b\7\1\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ac\5\16\b\2\u00ab\u00a5\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00b7\3\2\2\2\u00ad\u00ae\f\5\2\2\u00ae\u00af\5\"\22\2\u00af"+
		"\u00b0\5\f\7\6\u00b0\u00b6\3\2\2\2\u00b1\u00b2\f\4\2\2\u00b2\u00b3\5 "+
		"\21\2\u00b3\u00b4\5\f\7\5\u00b4\u00b6\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5"+
		"\u00b1\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\r\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc"+
		"\5\b\5\2\u00bc\u00bd\7\5\2\2\u00bd\u00cb\3\2\2\2\u00be\u00cb\7-\2\2\u00bf"+
		"\u00cb\5\20\t\2\u00c0\u00cb\7\36\2\2\u00c1\u00cb\7\35\2\2\u00c2\u00cb"+
		"\7\13\2\2\u00c3\u00cb\7\f\2\2\u00c4\u00c5\7-\2\2\u00c5\u00c6\7\4\2\2\u00c6"+
		"\u00c7\5\24\13\2\u00c7\u00c8\7\5\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\7"+
		"\37\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca"+
		"\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c3\3\2"+
		"\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\17\3\2\2\2\u00cc\u00d1"+
		"\7-\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\7\16\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\21\3\2\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00da"+
		"\7-\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00db\7\16\2\2"+
		"\u00da\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\23\3\2\2\2\u00de\u00e3\5\b\5\2\u00df\u00e0\7\17\2\2\u00e0"+
		"\u00e2\5\24\13\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\25\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7\20\2\2\u00e7\27\3\2\2\2\u00e8\u00e9\7\21\2\2\u00e9\31\3\2\2\2"+
		"\u00ea\u00eb\t\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed\35\3\2"+
		"\2\2\u00ee\u00ef\t\4\2\2\u00ef\37\3\2\2\2\u00f0\u00f1\t\5\2\2\u00f1!\3"+
		"\2\2\2\u00f2\u00f3\t\6\2\2\u00f3#\3\2\2\2\22\'/9?p\u0092\u0094\u00a0\u00a2"+
		"\u00ab\u00b5\u00b7\u00ca\u00d3\u00dc\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}