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
		T__24=25, DECIMAL=26, NUMERO=27, STRING=28, DO=29, FROM=30, TO=31, FOR=32, 
		END_FOR=33, WHILE=34, END_WHILE=35, ENTAO=36, SE=37, FIM_SE=38, SENAO=39, 
		FUNC=40, END_FUNC=41, FIM=42, ID=43, ENDLINE=44, WS=45, COMMENTS=46;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_comando = 2, RULE_condicao = 3, 
		RULE_expressao = 4, RULE_expressaoprec = 5, RULE_termo = 6, RULE_vetor = 7, 
		RULE_dclvetor = 8, RULE_params = 9, RULE_and = 10, RULE_or = 11, RULE_maior = 12, 
		RULE_menor = 13, RULE_igual = 14, RULE_menori = 15, RULE_maiori = 16, 
		RULE_dif = 17, RULE_add = 18, RULE_sub = 19, RULE_mult = 20, RULE_div = 21;
	public static final String[] ruleNames = {
		"programa", "comandos", "comando", "condicao", "expressao", "expressaoprec", 
		"termo", "vetor", "dclvetor", "params", "and", "or", "maior", "menor", 
		"igual", "menori", "maiori", "dif", "add", "sub", "mult", "div"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'verdadeiro'", "'falso'", "'['", "']'", "','", 
		"'e'", "'ou'", "'>'", "'<'", "'=='", "'<='", "'=<'", "'>='", "'=>'", "'!='", 
		"'=!'", "'+'", "'-'", "'*'", "'x'", "':'", "'/'", null, null, null, "'faca'", 
		"'de'", "'ate'", "'para'", "'fim-para'", "'enquanto'", "'fim-enquanto'", 
		"'entao'", "'se'", "'fim-se'", "'senao'", "'funcao'", "'fim-funcao'", 
		"'fim'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DECIMAL", "NUMERO", "STRING", "DO", "FROM", "TO", "FOR", 
		"END_FOR", "WHILE", "END_WHILE", "ENTAO", "SE", "FIM_SE", "SENAO", "FUNC", 
		"END_FUNC", "FIM", "ID", "ENDLINE", "WS", "COMMENTS"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			comandos();
			setState(45);
			match(FIM);
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
			setState(47);
			comando();
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(ENDLINE);
					setState(49);
					comandos();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(SE);
				setState(56);
				condicao(0);
				setState(57);
				match(ENTAO);
				setState(58);
				comandos();
				setState(59);
				match(FIM_SE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(SE);
				setState(62);
				condicao(0);
				setState(63);
				match(ENTAO);
				setState(64);
				comandos();
				setState(65);
				match(SENAO);
				setState(66);
				comandos();
				setState(67);
				match(FIM_SE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(WHILE);
				setState(70);
				condicao(0);
				setState(71);
				match(DO);
				setState(72);
				comandos();
				setState(73);
				match(END_WHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(FOR);
				setState(76);
				match(ID);
				setState(77);
				match(FROM);
				setState(78);
				match(NUMERO);
				setState(79);
				match(TO);
				setState(80);
				match(NUMERO);
				setState(81);
				match(DO);
				setState(82);
				comandos();
				setState(83);
				match(END_FOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(ID);
				setState(86);
				match(T__0);
				setState(87);
				condicao(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				vetor();
				setState(89);
				match(T__0);
				setState(90);
				condicao(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(FUNC);
				setState(93);
				match(ID);
				setState(94);
				match(T__1);
				setState(95);
				params();
				setState(96);
				match(T__2);
				setState(97);
				comandos();
				setState(98);
				match(END_FUNC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
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
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public DifContext dif() {
			return getRuleContext(DifContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public MenoriContext menori() {
			return getRuleContext(MenoriContext.class,0);
		}
		public MaiorContext maior() {
			return getRuleContext(MaiorContext.class,0);
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
			setState(104);
			expressao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(106);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(107);
						and();
						setState(108);
						expressao(0);
						}
						break;
					case 2:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(110);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(111);
						or();
						setState(112);
						expressao(0);
						}
						break;
					case 3:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(115);
						igual();
						setState(116);
						expressao(0);
						}
						break;
					case 4:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(118);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(119);
						dif();
						setState(120);
						expressao(0);
						}
						break;
					case 5:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(122);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(123);
						menor();
						setState(124);
						expressao(0);
						}
						break;
					case 6:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127);
						menori();
						setState(128);
						expressao(0);
						}
						break;
					case 7:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						maior();
						setState(132);
						expressao(0);
						}
						break;
					case 8:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						maiori();
						setState(136);
						expressao(0);
						}
						break;
					}
					} 
				}
				setState(142);
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
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
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
			setState(144);
			expressaoprec(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147);
						add();
						setState(148);
						expressaoprec(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(151);
						sub();
						setState(152);
						expressaoprec(0);
						}
						break;
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(160);
				match(T__1);
				setState(161);
				expressao(0);
				setState(162);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(164);
				termo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoprecContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoprec);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						div();
						setState(169);
						expressaoprec(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoprecContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoprec);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
						mult();
						setState(173);
						expressaoprec(3);
						}
						break;
					}
					} 
				}
				setState(179);
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

	public static class TermoContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LLinhaParser.ID, 0); }
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(LLinhaParser.NUMERO, 0); }
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__1);
				setState(181);
				condicao(0);
				setState(182);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				vetor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(NUMERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__1);
				setState(191);
				params();
				setState(192);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
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
			setState(197);
			match(ID);
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(198);
					match(T__5);
					setState(199);
					condicao(0);
					setState(200);
					match(T__6);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(206);
			vetor();
			setState(207);
			match(ID);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				match(T__5);
				setState(209);
				match(NUMERO);
				setState(210);
				match(T__6);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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
			setState(215);
			condicao(0);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(T__7);
					setState(217);
					params();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(223);
			match(T__8);
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
			setState(225);
			match(T__9);
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

	public static class MaiorContext extends ParserRuleContext {
		public MaiorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitMaior(this);
		}
	}

	public final MaiorContext maior() throws RecognitionException {
		MaiorContext _localctx = new MaiorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_maior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__10);
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

	public static class MenorContext extends ParserRuleContext {
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitMenor(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__11);
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

	public static class IgualContext extends ParserRuleContext {
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__12);
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
		enterRule(_localctx, 30, RULE_menori);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
		enterRule(_localctx, 32, RULE_maiori);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 34, RULE_dif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__19);
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__20);
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
		enterRule(_localctx, 40, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		enterRule(_localctx, 42, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u00fa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00a8\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b2\n\7"+
		"\f\7\16\7\u00b5\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00c6\n\b\3\t\3\t\3\t\3\t\3\t\6\t\u00cd\n\t\r\t\16\t\u00ce"+
		"\3\n\3\n\3\n\3\n\3\n\6\n\u00d6\n\n\r\n\16\n\u00d7\3\13\3\13\3\13\7\13"+
		"\u00dd\n\13\f\13\16\13\u00e0\13\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\2\5\b\n\f\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,\2\7\3\2\20\21\3\2\22\23\3\2\24\25\3\2\30\31\3\2\32\33\u0102\2.\3"+
		"\2\2\2\4\61\3\2\2\2\6g\3\2\2\2\bi\3\2\2\2\n\u0091\3\2\2\2\f\u00a7\3\2"+
		"\2\2\16\u00c5\3\2\2\2\20\u00c7\3\2\2\2\22\u00d0\3\2\2\2\24\u00d9\3\2\2"+
		"\2\26\u00e1\3\2\2\2\30\u00e3\3\2\2\2\32\u00e5\3\2\2\2\34\u00e7\3\2\2\2"+
		"\36\u00e9\3\2\2\2 \u00eb\3\2\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00f1"+
		"\3\2\2\2(\u00f3\3\2\2\2*\u00f5\3\2\2\2,\u00f7\3\2\2\2./\5\4\3\2/\60\7"+
		",\2\2\60\3\3\2\2\2\61\66\5\6\4\2\62\63\7.\2\2\63\65\5\4\3\2\64\62\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66\3\2\2\2"+
		"9:\7\'\2\2:;\5\b\5\2;<\7&\2\2<=\5\4\3\2=>\7(\2\2>h\3\2\2\2?@\7\'\2\2@"+
		"A\5\b\5\2AB\7&\2\2BC\5\4\3\2CD\7)\2\2DE\5\4\3\2EF\7(\2\2Fh\3\2\2\2GH\7"+
		"$\2\2HI\5\b\5\2IJ\7\37\2\2JK\5\4\3\2KL\7%\2\2Lh\3\2\2\2MN\7\"\2\2NO\7"+
		"-\2\2OP\7 \2\2PQ\7\35\2\2QR\7!\2\2RS\7\35\2\2ST\7\37\2\2TU\5\4\3\2UV\7"+
		"#\2\2Vh\3\2\2\2WX\7-\2\2XY\7\3\2\2Yh\5\b\5\2Z[\5\20\t\2[\\\7\3\2\2\\]"+
		"\5\b\5\2]h\3\2\2\2^_\7*\2\2_`\7-\2\2`a\7\4\2\2ab\5\24\13\2bc\7\5\2\2c"+
		"d\5\4\3\2de\7+\2\2eh\3\2\2\2fh\5\22\n\2g9\3\2\2\2g?\3\2\2\2gG\3\2\2\2"+
		"gM\3\2\2\2gW\3\2\2\2gZ\3\2\2\2g^\3\2\2\2gf\3\2\2\2h\7\3\2\2\2ij\b\5\1"+
		"\2jk\5\n\6\2k\u008e\3\2\2\2lm\f\13\2\2mn\5\26\f\2no\5\n\6\2o\u008d\3\2"+
		"\2\2pq\f\n\2\2qr\5\30\r\2rs\5\n\6\2s\u008d\3\2\2\2tu\f\t\2\2uv\5\36\20"+
		"\2vw\5\n\6\2w\u008d\3\2\2\2xy\f\b\2\2yz\5$\23\2z{\5\n\6\2{\u008d\3\2\2"+
		"\2|}\f\7\2\2}~\5\34\17\2~\177\5\n\6\2\177\u008d\3\2\2\2\u0080\u0081\f"+
		"\6\2\2\u0081\u0082\5 \21\2\u0082\u0083\5\n\6\2\u0083\u008d\3\2\2\2\u0084"+
		"\u0085\f\5\2\2\u0085\u0086\5\32\16\2\u0086\u0087\5\n\6\2\u0087\u008d\3"+
		"\2\2\2\u0088\u0089\f\4\2\2\u0089\u008a\5\"\22\2\u008a\u008b\5\n\6\2\u008b"+
		"\u008d\3\2\2\2\u008cl\3\2\2\2\u008cp\3\2\2\2\u008ct\3\2\2\2\u008cx\3\2"+
		"\2\2\u008c|\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\t\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\b\6\1\2\u0092\u0093\5\f\7\2"+
		"\u0093\u009e\3\2\2\2\u0094\u0095\f\5\2\2\u0095\u0096\5&\24\2\u0096\u0097"+
		"\5\f\7\2\u0097\u009d\3\2\2\2\u0098\u0099\f\4\2\2\u0099\u009a\5(\25\2\u009a"+
		"\u009b\5\f\7\2\u009b\u009d\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0098\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\13\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\b\7\1\2\u00a2\u00a3\7\4\2"+
		"\2\u00a3\u00a4\5\n\6\2\u00a4\u00a5\7\5\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8"+
		"\5\16\b\2\u00a7\u00a1\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00b3\3\2\2\2"+
		"\u00a9\u00aa\f\5\2\2\u00aa\u00ab\5,\27\2\u00ab\u00ac\5\f\7\6\u00ac\u00b2"+
		"\3\2\2\2\u00ad\u00ae\f\4\2\2\u00ae\u00af\5*\26\2\u00af\u00b0\5\f\7\5\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\r\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8\5\b\5\2\u00b8\u00b9\7\5\2\2\u00b9"+
		"\u00c6\3\2\2\2\u00ba\u00c6\7-\2\2\u00bb\u00c6\5\20\t\2\u00bc\u00c6\7\35"+
		"\2\2\u00bd\u00c6\7\6\2\2\u00be\u00c6\7\7\2\2\u00bf\u00c0\7-\2\2\u00c0"+
		"\u00c1\7\4\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\5\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c6\7\36\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00cc"+
		"\7-\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\7\t\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d5"+
		"\7-\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4\7\35\2\2\u00d4\u00d6\7\t\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\23\3\2\2\2\u00d9\u00de\5\b\5\2\u00da\u00db\7\n\2\2\u00db\u00dd"+
		"\5\24\13\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\25\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\7\13\2\2\u00e2\27\3\2\2\2\u00e3\u00e4\7\f\2\2\u00e4\31\3\2\2\2\u00e5"+
		"\u00e6\7\r\2\2\u00e6\33\3\2\2\2\u00e7\u00e8\7\16\2\2\u00e8\35\3\2\2\2"+
		"\u00e9\u00ea\7\17\2\2\u00ea\37\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ec!\3\2"+
		"\2\2\u00ed\u00ee\t\3\2\2\u00ee#\3\2\2\2\u00ef\u00f0\t\4\2\2\u00f0%\3\2"+
		"\2\2\u00f1\u00f2\7\26\2\2\u00f2\'\3\2\2\2\u00f3\u00f4\7\27\2\2\u00f4)"+
		"\3\2\2\2\u00f5\u00f6\t\5\2\2\u00f6+\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8"+
		"-\3\2\2\2\17\66g\u008c\u008e\u009c\u009e\u00a7\u00b1\u00b3\u00c5\u00ce"+
		"\u00d7\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}