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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, DECIMAL=41, NUMERO=42, STRING=43, ID=44, ENDLINE=45, 
		DEVOURER=46, WS=47, COMMENTS=48;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_comando = 2, RULE_se = 3, RULE_condicao = 4, 
		RULE_expressao = 5, RULE_expressaoprec = 6, RULE_termo = 7, RULE_vetor = 8, 
		RULE_dclvetor = 9, RULE_params = 10, RULE_dif = 11, RULE_menori = 12, 
		RULE_maiori = 13, RULE_mult = 14, RULE_div = 15;
	public static final String[] ruleNames = {
		"programa", "comandos", "comando", "se", "condicao", "expressao", "expressaoprec", 
		"termo", "vetor", "dclvetor", "params", "dif", "menori", "maiori", "mult", 
		"div"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fim'", "'enquanto'", "'faca'", "'fim-enquanto'", "'para'", "'de'", 
		"'ate'", "'fim-para'", "'='", "'funcao'", "'('", "')'", "'fim-funcao'", 
		"'e'", "'x'", "'se'", "'entao'", "'senao'", "'fim-se'", "'ou'", "'=='", 
		"'<'", "'>'", "'+'", "'-'", "'verdadeiro'", "'falso'", "'['", "']'", "'vetor'", 
		"','", "'!='", "'=!'", "'<='", "'=<'", "'>='", "'=>'", "'*'", "':'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "DECIMAL", "NUMERO", "STRING", "ID", "ENDLINE", 
		"DEVOURER", "WS", "COMMENTS"
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
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(32);
					match(ENDLINE);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				comandos();
				setState(39);
				match(T__0);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(40);
					match(ENDLINE);
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(48);
					match(ENDLINE);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				comandos();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(55);
					match(ENDLINE);
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(EOF);
				notifyErrorListeners("'fim' Nao encontrado."); System.exit(1);
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
			setState(66);
			comando();
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67);
					match(ENDLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					comandos();
					}
					} 
				}
				setState(77);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(LLinhaParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(LLinhaParser.ENDLINE, i);
		}
		public TerminalNode ID() { return getToken(LLinhaParser.ID, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(LLinhaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LLinhaParser.NUMERO, i);
		}
		public VetorContext vetor() {
			return getRuleContext(VetorContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
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
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				se();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__1);
				setState(80);
				condicao(0);
				setState(81);
				match(T__2);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(82);
					match(ENDLINE);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				comandos();
				setState(89);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__4);
				setState(92);
				match(ID);
				setState(93);
				match(T__5);
				setState(94);
				match(NUMERO);
				setState(95);
				match(T__6);
				setState(96);
				match(NUMERO);
				setState(97);
				match(T__2);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(98);
					match(ENDLINE);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				comandos();
				setState(105);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__8);
				setState(109);
				condicao(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				vetor();
				setState(111);
				match(T__8);
				setState(112);
				condicao(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(T__9);
				setState(115);
				match(ID);
				setState(116);
				match(T__10);
				setState(117);
				params();
				setState(118);
				match(T__11);
				setState(119);
				comandos();
				setState(120);
				match(T__12);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(ID);
				setState(123);
				match(T__10);
				setState(124);
				params();
				setState(125);
				match(T__11);
				notifyErrorListeners("A gramatica nao aceita chamada de funcoes."); System.exit(1);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				dclvetor();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				match(T__13);
				setState(130);
				match(T__8);
				setState(131);
				condicao(0);
				notifyErrorListeners("Caracter reservado: 'e'"); System.exit(1);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(134);
				match(T__14);
				setState(135);
				match(T__8);
				setState(136);
				condicao(0);
				notifyErrorListeners("Caracter reservado: 'x'"); System.exit(1);
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

	public static class SeContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(LLinhaParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(LLinhaParser.ENDLINE, i);
		}
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LLinhaListener ) ((LLinhaListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_se);
		int _la;
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(T__15);
				setState(142);
				condicao(0);
				setState(143);
				match(T__16);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(144);
					match(ENDLINE);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				comandos();
				setState(159);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(151);
					match(T__17);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(152);
						match(ENDLINE);
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(158);
					comandos();
					}
				}

				setState(161);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__15);
				setState(164);
				condicao(0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(165);
					match(ENDLINE);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				comandos();
				setState(180);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(172);
					match(T__17);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(173);
						match(ENDLINE);
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(179);
					comandos();
					}
				}

				setState(182);
				match(T__18);
				notifyErrorListeners("O 'entao' do 'se' nao foi encontrado. "); System.exit(1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(T__15);
				setState(186);
				condicao(0);
				setState(187);
				match(T__16);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDLINE) {
					{
					{
					setState(188);
					match(ENDLINE);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				comandos();
				setState(203);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(195);
					match(T__17);
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ENDLINE) {
						{
						{
						setState(196);
						match(ENDLINE);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(202);
					comandos();
					}
				}

				notifyErrorListeners("O 'fim-se' do 'se' nao foi encontrado. "); System.exit(1);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_condicao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(210);
			expressao(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(212);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(213);
						match(T__13);
						setState(214);
						expressao(0);
						}
						break;
					case 2:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(215);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(216);
						match(T__19);
						setState(217);
						expressao(0);
						}
						break;
					case 3:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(218);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(219);
						match(T__20);
						setState(220);
						expressao(0);
						}
						break;
					case 4:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(221);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(222);
						dif();
						setState(223);
						expressao(0);
						}
						break;
					case 5:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(226);
						match(T__21);
						setState(227);
						expressao(0);
						}
						break;
					case 6:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(229);
						menori();
						setState(230);
						expressao(0);
						}
						break;
					case 7:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(232);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(233);
						match(T__22);
						setState(234);
						expressao(0);
						}
						break;
					case 8:
						{
						_localctx = new CondicaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicao);
						setState(235);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(236);
						maiori();
						setState(237);
						expressao(0);
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(245);
			expressaoprec(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(T__23);
						setState(249);
						expressaoprec(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
						match(T__24);
						setState(252);
						expressaoprec(0);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressaoprec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(259);
				match(T__10);
				setState(260);
				expressao(0);
				setState(261);
				match(T__11);
				}
				break;
			case 2:
				{
				setState(263);
				termo();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoprecContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoprec);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						div();
						setState(268);
						expressaoprec(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoprecContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoprec);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						mult();
						setState(272);
						expressaoprec(3);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 14, RULE_termo);
		try {
			setState(295);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__10);
				setState(280);
				condicao(0);
				setState(281);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				vetor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(NUMERO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(DECIMAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(T__25);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(T__26);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				match(ID);
				setState(290);
				match(T__10);
				setState(291);
				params();
				setState(292);
				match(T__11);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
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
		enterRule(_localctx, 16, RULE_vetor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ID);
			setState(302); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(298);
					match(T__27);
					setState(299);
					condicao(0);
					setState(300);
					match(T__28);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(304); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 18, RULE_dclvetor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__29);
			setState(307);
			match(ID);
			setState(311); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(308);
				match(T__27);
				setState(309);
				match(NUMERO);
				setState(310);
				match(T__28);
				}
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
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
		enterRule(_localctx, 20, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			condicao(0);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					match(T__30);
					setState(317);
					params();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 22, RULE_dif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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
		enterRule(_localctx, 24, RULE_menori);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
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
		enterRule(_localctx, 26, RULE_maiori);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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
		enterRule(_localctx, 28, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__37) ) {
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
		enterRule(_localctx, 30, RULE_div);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
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
		case 4:
			return condicao_sempred((CondicaoContext)_localctx, predIndex);
		case 5:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 6:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0150\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2"+
		"\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\2\5\2C\n\2\3\3\3\3\6\3G\n\3\r\3\16\3H\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008e\n\4\3\5\3\5\3\5\3\5\7"+
		"\5\u0094\n\5\f\5\16\5\u0097\13\5\3\5\3\5\3\5\7\5\u009c\n\5\f\5\16\5\u009f"+
		"\13\5\3\5\5\5\u00a2\n\5\3\5\3\5\3\5\3\5\3\5\7\5\u00a9\n\5\f\5\16\5\u00ac"+
		"\13\5\3\5\3\5\3\5\7\5\u00b1\n\5\f\5\16\5\u00b4\13\5\3\5\5\5\u00b7\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c0\n\5\f\5\16\5\u00c3\13\5\3\5\3\5"+
		"\3\5\7\5\u00c8\n\5\f\5\16\5\u00cb\13\5\3\5\5\5\u00ce\n\5\3\5\3\5\5\5\u00d2"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f2\n\6\f"+
		"\6\16\6\u00f5\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0100\n\7\f"+
		"\7\16\7\u0103\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u010b\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0115\n\b\f\b\16\b\u0118\13\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u012a\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\6\n\u0131\n\n\r\n\16\n\u0132\3\13\3\13\3\13\3\13\3\13\6\13"+
		"\u013a\n\13\r\13\16\13\u013b\3\f\3\f\3\f\7\f\u0141\n\f\f\f\16\f\u0144"+
		"\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\5\n\f\16"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\3\2\"#\3\2$%\3\2&\'\4"+
		"\2\21\21((\3\2)*\u0174\2B\3\2\2\2\4D\3\2\2\2\6\u008d\3\2\2\2\b\u00d1\3"+
		"\2\2\2\n\u00d3\3\2\2\2\f\u00f6\3\2\2\2\16\u010a\3\2\2\2\20\u0129\3\2\2"+
		"\2\22\u012b\3\2\2\2\24\u0134\3\2\2\2\26\u013d\3\2\2\2\30\u0145\3\2\2\2"+
		"\32\u0147\3\2\2\2\34\u0149\3\2\2\2\36\u014b\3\2\2\2 \u014d\3\2\2\2\"$"+
		"\7/\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2"+
		"()\5\4\3\2)-\7\3\2\2*,\7/\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61C\3\2\2\2\62\64\7/\2\2\63\62\3"+
		"\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2"+
		"\2\28<\5\4\3\29;\7/\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2"+
		"\2\2><\3\2\2\2?@\7\2\2\3@A\b\2\1\2AC\3\2\2\2B%\3\2\2\2B\65\3\2\2\2C\3"+
		"\3\2\2\2DF\5\6\4\2EG\7/\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IM"+
		"\3\2\2\2JL\5\4\3\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2"+
		"OM\3\2\2\2P\u008e\5\b\5\2QR\7\4\2\2RS\5\n\6\2SW\7\5\2\2TV\7/\2\2UT\3\2"+
		"\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5\4\3\2[\\\7"+
		"\6\2\2\\\u008e\3\2\2\2]^\7\7\2\2^_\7.\2\2_`\7\b\2\2`a\7,\2\2ab\7\t\2\2"+
		"bc\7,\2\2cg\7\5\2\2df\7/\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h"+
		"j\3\2\2\2ig\3\2\2\2jk\5\4\3\2kl\7\n\2\2l\u008e\3\2\2\2mn\7.\2\2no\7\13"+
		"\2\2o\u008e\5\n\6\2pq\5\22\n\2qr\7\13\2\2rs\5\n\6\2s\u008e\3\2\2\2tu\7"+
		"\f\2\2uv\7.\2\2vw\7\r\2\2wx\5\26\f\2xy\7\16\2\2yz\5\4\3\2z{\7\17\2\2{"+
		"\u008e\3\2\2\2|}\7.\2\2}~\7\r\2\2~\177\5\26\f\2\177\u0080\7\16\2\2\u0080"+
		"\u0081\b\4\1\2\u0081\u008e\3\2\2\2\u0082\u008e\5\24\13\2\u0083\u0084\7"+
		"\20\2\2\u0084\u0085\7\13\2\2\u0085\u0086\5\n\6\2\u0086\u0087\b\4\1\2\u0087"+
		"\u008e\3\2\2\2\u0088\u0089\7\21\2\2\u0089\u008a\7\13\2\2\u008a\u008b\5"+
		"\n\6\2\u008b\u008c\b\4\1\2\u008c\u008e\3\2\2\2\u008dP\3\2\2\2\u008dQ\3"+
		"\2\2\2\u008d]\3\2\2\2\u008dm\3\2\2\2\u008dp\3\2\2\2\u008dt\3\2\2\2\u008d"+
		"|\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u0088\3\2\2\2"+
		"\u008e\7\3\2\2\2\u008f\u0090\7\22\2\2\u0090\u0091\5\n\6\2\u0091\u0095"+
		"\7\23\2\2\u0092\u0094\7/\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u00a1\5\4\3\2\u0099\u009d\7\24\2\2\u009a\u009c\7/\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5\4\3\2\u00a1"+
		"\u0099\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\25"+
		"\2\2\u00a4\u00d2\3\2\2\2\u00a5\u00a6\7\22\2\2\u00a6\u00aa\5\n\6\2\u00a7"+
		"\u00a9\7/\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b6\5\4\3\2\u00ae\u00b2\7\24\2\2\u00af\u00b1\7/\2\2\u00b0\u00af\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5\4\3\2\u00b6\u00ae\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9"+
		"\u00ba\b\5\1\2\u00ba\u00d2\3\2\2\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd\5"+
		"\n\6\2\u00bd\u00c1\7\23\2\2\u00be\u00c0\7/\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cd\5\4\3\2\u00c5\u00c9\7\24\2\2\u00c6"+
		"\u00c8\7/\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00ce\5\4\3\2\u00cd\u00c5\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\b\5\1\2\u00d0\u00d2\3\2\2\2\u00d1\u008f\3\2\2\2\u00d1"+
		"\u00a5\3\2\2\2\u00d1\u00bb\3\2\2\2\u00d2\t\3\2\2\2\u00d3\u00d4\b\6\1\2"+
		"\u00d4\u00d5\5\f\7\2\u00d5\u00f3\3\2\2\2\u00d6\u00d7\f\13\2\2\u00d7\u00d8"+
		"\7\20\2\2\u00d8\u00f2\5\f\7\2\u00d9\u00da\f\n\2\2\u00da\u00db\7\26\2\2"+
		"\u00db\u00f2\5\f\7\2\u00dc\u00dd\f\t\2\2\u00dd\u00de\7\27\2\2\u00de\u00f2"+
		"\5\f\7\2\u00df\u00e0\f\b\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e2\5\f\7\2"+
		"\u00e2\u00f2\3\2\2\2\u00e3\u00e4\f\7\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00f2"+
		"\5\f\7\2\u00e6\u00e7\f\6\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\5\f\7\2"+
		"\u00e9\u00f2\3\2\2\2\u00ea\u00eb\f\5\2\2\u00eb\u00ec\7\31\2\2\u00ec\u00f2"+
		"\5\f\7\2\u00ed\u00ee\f\4\2\2\u00ee\u00ef\5\34\17\2\u00ef\u00f0\5\f\7\2"+
		"\u00f0\u00f2\3\2\2\2\u00f1\u00d6\3\2\2\2\u00f1\u00d9\3\2\2\2\u00f1\u00dc"+
		"\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1\u00e3\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1"+
		"\u00ea\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\13\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7"+
		"\b\7\1\2\u00f7\u00f8\5\16\b\2\u00f8\u0101\3\2\2\2\u00f9\u00fa\f\5\2\2"+
		"\u00fa\u00fb\7\32\2\2\u00fb\u0100\5\16\b\2\u00fc\u00fd\f\4\2\2\u00fd\u00fe"+
		"\7\33\2\2\u00fe\u0100\5\16\b\2\u00ff\u00f9\3\2\2\2\u00ff\u00fc\3\2\2\2"+
		"\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\r\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\b\b\1\2\u0105\u0106\7\r\2\2\u0106"+
		"\u0107\5\f\7\2\u0107\u0108\7\16\2\2\u0108\u010b\3\2\2\2\u0109\u010b\5"+
		"\20\t\2\u010a\u0104\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u0116\3\2\2\2\u010c"+
		"\u010d\f\5\2\2\u010d\u010e\5 \21\2\u010e\u010f\5\16\b\6\u010f\u0115\3"+
		"\2\2\2\u0110\u0111\f\4\2\2\u0111\u0112\5\36\20\2\u0112\u0113\5\16\b\5"+
		"\u0113\u0115\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\17\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\7\r\2\2\u011a\u011b\5\n\6\2\u011b\u011c\7\16"+
		"\2\2\u011c\u012a\3\2\2\2\u011d\u012a\7.\2\2\u011e\u012a\5\22\n\2\u011f"+
		"\u012a\7,\2\2\u0120\u012a\7+\2\2\u0121\u012a\7\34\2\2\u0122\u012a\7\35"+
		"\2\2\u0123\u0124\7.\2\2\u0124\u0125\7\r\2\2\u0125\u0126\5\26\f\2\u0126"+
		"\u0127\7\16\2\2\u0127\u012a\3\2\2\2\u0128\u012a\7-\2\2\u0129\u0119\3\2"+
		"\2\2\u0129\u011d\3\2\2\2\u0129\u011e\3\2\2\2\u0129\u011f\3\2\2\2\u0129"+
		"\u0120\3\2\2\2\u0129\u0121\3\2\2\2\u0129\u0122\3\2\2\2\u0129\u0123\3\2"+
		"\2\2\u0129\u0128\3\2\2\2\u012a\21\3\2\2\2\u012b\u0130\7.\2\2\u012c\u012d"+
		"\7\36\2\2\u012d\u012e\5\n\6\2\u012e\u012f\7\37\2\2\u012f\u0131\3\2\2\2"+
		"\u0130\u012c\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\23\3\2\2\2\u0134\u0135\7 \2\2\u0135\u0139\7.\2\2\u0136"+
		"\u0137\7\36\2\2\u0137\u0138\7,\2\2\u0138\u013a\7\37\2\2\u0139\u0136\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\25\3\2\2\2\u013d\u0142\5\n\6\2\u013e\u013f\7!\2\2\u013f\u0141\5\26\f"+
		"\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\27\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\t\2\2\2\u0146"+
		"\31\3\2\2\2\u0147\u0148\t\3\2\2\u0148\33\3\2\2\2\u0149\u014a\t\4\2\2\u014a"+
		"\35\3\2\2\2\u014b\u014c\t\5\2\2\u014c\37\3\2\2\2\u014d\u014e\t\6\2\2\u014e"+
		"!\3\2\2\2!%-\65<BHMWg\u008d\u0095\u009d\u00a1\u00aa\u00b2\u00b6\u00c1"+
		"\u00c9\u00cd\u00d1\u00f1\u00f3\u00ff\u0101\u010a\u0114\u0116\u0129\u0132"+
		"\u013b\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}