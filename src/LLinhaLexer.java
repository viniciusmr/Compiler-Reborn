// Generated from LLinha.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LLinhaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"FIM", "DECIMAL", "NUMERO", "STRING", "DO", "FROM", "TO", "FOR", "END_FOR", 
		"WHILE", "END_WHILE", "ENTAO", "SE", "FIM_SE", "SENAO", "FUNC", "END_FUNC", 
		"ID", "ENDLINE", "WS", "COMMENTS"
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


	public LLinhaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LLinha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0132\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\6\34\u00ae\n\34\r\34\16\34\u00af\3"+
		"\35\6\35\u00b3\n\35\r\35\16\35\u00b4\3\36\3\36\7\36\u00b9\n\36\f\36\16"+
		"\36\u00bc\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\7,\u011a\n,\f,\16,\u011d\13,\3-\3"+
		"-\3.\6.\u0122\n.\r.\16.\u0123\3.\3.\3/\3/\7/\u012a\n/\f/\16/\u012d\13"+
		"/\3/\3/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\4\2."+
		".\60\60\3\2$$\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\13\16\16\""+
		"\"\3\2%%\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13h\3\2\2\2\rj\3\2\2\2\17l"+
		"\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25{\3\2\2\2\27\u0081\3\2\2\2\31\u0083"+
		"\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u0089\3\2\2\2!\u008c\3\2"+
		"\2\2#\u008f\3\2\2\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u0098\3\2\2\2+\u009b"+
		"\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a4\3\2\2"+
		"\2\65\u00a6\3\2\2\2\67\u00aa\3\2\2\29\u00b2\3\2\2\2;\u00b6\3\2\2\2=\u00bf"+
		"\3\2\2\2?\u00c4\3\2\2\2A\u00c7\3\2\2\2C\u00cb\3\2\2\2E\u00d0\3\2\2\2G"+
		"\u00d9\3\2\2\2I\u00e2\3\2\2\2K\u00ef\3\2\2\2M\u00f5\3\2\2\2O\u00f8\3\2"+
		"\2\2Q\u00ff\3\2\2\2S\u0105\3\2\2\2U\u010c\3\2\2\2W\u0117\3\2\2\2Y\u011e"+
		"\3\2\2\2[\u0121\3\2\2\2]\u0127\3\2\2\2_`\7?\2\2`\4\3\2\2\2ab\7*\2\2b\6"+
		"\3\2\2\2cd\7+\2\2d\b\3\2\2\2ef\7?\2\2fg\7?\2\2g\n\3\2\2\2hi\7>\2\2i\f"+
		"\3\2\2\2jk\7@\2\2k\16\3\2\2\2lm\7-\2\2m\20\3\2\2\2no\7/\2\2o\22\3\2\2"+
		"\2pq\7x\2\2qr\7g\2\2rs\7t\2\2st\7f\2\2tu\7c\2\2uv\7f\2\2vw\7g\2\2wx\7"+
		"k\2\2xy\7t\2\2yz\7q\2\2z\24\3\2\2\2{|\7h\2\2|}\7c\2\2}~\7n\2\2~\177\7"+
		"u\2\2\177\u0080\7q\2\2\u0080\26\3\2\2\2\u0081\u0082\7]\2\2\u0082\30\3"+
		"\2\2\2\u0083\u0084\7_\2\2\u0084\32\3\2\2\2\u0085\u0086\7.\2\2\u0086\34"+
		"\3\2\2\2\u0087\u0088\7g\2\2\u0088\36\3\2\2\2\u0089\u008a\7q\2\2\u008a"+
		"\u008b\7w\2\2\u008b \3\2\2\2\u008c\u008d\7#\2\2\u008d\u008e\7?\2\2\u008e"+
		"\"\3\2\2\2\u008f\u0090\7?\2\2\u0090\u0091\7#\2\2\u0091$\3\2\2\2\u0092"+
		"\u0093\7>\2\2\u0093\u0094\7?\2\2\u0094&\3\2\2\2\u0095\u0096\7?\2\2\u0096"+
		"\u0097\7>\2\2\u0097(\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a"+
		"*\3\2\2\2\u009b\u009c\7?\2\2\u009c\u009d\7@\2\2\u009d,\3\2\2\2\u009e\u009f"+
		"\7,\2\2\u009f.\3\2\2\2\u00a0\u00a1\7z\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7<\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\64\3\2\2\2\u00a6\u00a7"+
		"\7h\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9\66\3\2\2\2\u00aa\u00ab"+
		"\59\35\2\u00ab\u00ad\t\2\2\2\u00ac\u00ae\59\35\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b08\3\2\2\2"+
		"\u00b1\u00b3\4\62;\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5:\3\2\2\2\u00b6\u00ba\7$\2\2\u00b7\u00b9"+
		"\n\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7$"+
		"\2\2\u00be<\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7e\2\2\u00c2\u00c3\7c\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6@\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca"+
		"\7g\2\2\u00caB\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7c\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7/\2\2\u00d4\u00d5\7r\2\2\u00d5"+
		"\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8F\3\2\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7s\2\2\u00dc\u00dd\7w\2\2"+
		"\u00dd\u00de\7c\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1"+
		"\7q\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5"+
		"\7o\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7s\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7p\2\2"+
		"\u00ec\u00ed\7v\2\2\u00ed\u00ee\7q\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7g\2"+
		"\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7N\3"+
		"\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7o\2\2\u00fb"+
		"\u00fc\7/\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2\u00feP\3\2\2\2\u00ff"+
		"\u0100\7u\2\2\u0100\u0101\7g\2\2\u0101\u0102\7p\2\2\u0102\u0103\7c\2\2"+
		"\u0103\u0104\7q\2\2\u0104R\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7w\2"+
		"\2\u0107\u0108\7p\2\2\u0108\u0109\7e\2\2\u0109\u010a\7c\2\2\u010a\u010b"+
		"\7q\2\2\u010bT\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7k\2\2\u010e\u010f"+
		"\7o\2\2\u010f\u0110\7/\2\2\u0110\u0111\7h\2\2\u0111\u0112\7w\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7e\2\2\u0114\u0115\7c\2\2\u0115\u0116\7q\2\2"+
		"\u0116V\3\2\2\2\u0117\u011b\t\4\2\2\u0118\u011a\t\5\2\2\u0119\u0118\3"+
		"\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"X\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\t\6\2\2\u011fZ\3\2\2\2\u0120"+
		"\u0122\t\7\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b.\2\2\u0126"+
		"\\\3\2\2\2\u0127\u012b\7%\2\2\u0128\u012a\n\b\2\2\u0129\u0128\3\2\2\2"+
		"\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7%\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\b/\2\2\u0131^\3\2\2\2\t\2\u00af\u00b4\u00ba\u011b\u0123\u012b\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}