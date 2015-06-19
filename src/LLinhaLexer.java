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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, DECIMAL=41, NUMERO=42, STRING=43, ID=44, ENDLINE=45, 
		DEVOURER=46, WS=47, COMMENTS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "DECIMAL", 
		"NUMERO", "STRING", "ID", "ENDLINE", "DEVOURER", "WS", "COMMENTS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0140\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3*\6*\u0110\n*\r*\16*\u0111\3+\6+\u0115\n+\r"+
		"+\16+\u0116\3,\3,\7,\u011b\n,\f,\16,\u011e\13,\3,\3,\3-\3-\7-\u0124\n"+
		"-\f-\16-\u0127\13-\3.\3.\3/\3/\3/\3/\3\60\6\60\u0130\n\60\r\60\16\60\u0131"+
		"\3\60\3\60\3\61\3\61\7\61\u0138\n\61\f\61\16\61\u013b\13\61\3\61\3\61"+
		"\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\t"+
		"\4\2..\60\60\3\2$$\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\13\16"+
		"\16\"\"\3\2%%\u0145\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5g\3\2\2\2\7p\3\2\2\2\tu\3\2\2\2"+
		"\13\u0082\3\2\2\2\r\u0087\3\2\2\2\17\u008a\3\2\2\2\21\u008e\3\2\2\2\23"+
		"\u0097\3\2\2\2\25\u0099\3\2\2\2\27\u00a0\3\2\2\2\31\u00a2\3\2\2\2\33\u00a4"+
		"\3\2\2\2\35\u00af\3\2\2\2\37\u00b1\3\2\2\2!\u00b3\3\2\2\2#\u00b6\3\2\2"+
		"\2%\u00bc\3\2\2\2\'\u00c2\3\2\2\2)\u00c9\3\2\2\2+\u00cc\3\2\2\2-\u00cf"+
		"\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2\65\u00d7\3\2"+
		"\2\2\67\u00e2\3\2\2\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ec\3\2\2\2?\u00f2"+
		"\3\2\2\2A\u00f4\3\2\2\2C\u00f7\3\2\2\2E\u00fa\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u0100\3\2\2\2K\u0103\3\2\2\2M\u0106\3\2\2\2O\u0108\3\2\2\2Q\u010a\3\2"+
		"\2\2S\u010c\3\2\2\2U\u0114\3\2\2\2W\u0118\3\2\2\2Y\u0121\3\2\2\2[\u0128"+
		"\3\2\2\2]\u012a\3\2\2\2_\u012f\3\2\2\2a\u0135\3\2\2\2cd\7h\2\2de\7k\2"+
		"\2ef\7o\2\2f\4\3\2\2\2gh\7g\2\2hi\7p\2\2ij\7s\2\2jk\7w\2\2kl\7c\2\2lm"+
		"\7p\2\2mn\7v\2\2no\7q\2\2o\6\3\2\2\2pq\7h\2\2qr\7c\2\2rs\7e\2\2st\7c\2"+
		"\2t\b\3\2\2\2uv\7h\2\2vw\7k\2\2wx\7o\2\2xy\7/\2\2yz\7g\2\2z{\7p\2\2{|"+
		"\7s\2\2|}\7w\2\2}~\7c\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7q"+
		"\2\2\u0081\n\3\2\2\2\u0082\u0083\7r\2\2\u0083\u0084\7c\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7c\2\2\u0086\f\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089"+
		"\7g\2\2\u0089\16\3\2\2\2\u008a\u008b\7c\2\2\u008b\u008c\7v\2\2\u008c\u008d"+
		"\7g\2\2\u008d\20\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7o\2\2\u0091\u0092\7/\2\2\u0092\u0093\7r\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7t\2\2\u0095\u0096\7c\2\2\u0096\22\3\2\2\2\u0097\u0098\7?\2\2\u0098"+
		"\24\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7w\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7c\2\2\u009e\u009f\7q\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7*\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7+\2\2\u00a3\32\3\2\2\2\u00a4"+
		"\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7/\2\2"+
		"\u00a8\u00a9\7h\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac"+
		"\7e\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7q\2\2\u00ae\34\3\2\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7z\2\2\u00b2 \3\2\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\"\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7p\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7q\2\2\u00bb"+
		"$\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7q\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7/\2\2\u00c6\u00c7\7u\2\2"+
		"\u00c7\u00c8\7g\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7w\2"+
		"\2\u00cb*\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\7?\2\2\u00ce,\3\2\2\2"+
		"\u00cf\u00d0\7>\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2\60\3\2\2\2"+
		"\u00d3\u00d4\7-\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6\64\3\2\2"+
		"\2\u00d7\u00d8\7x\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7t\2\2\u00da\u00db"+
		"\7f\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7q\2\2\u00e1\66\3\2\2\2\u00e2"+
		"\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2"+
		"\u00e6\u00e7\7q\2\2\u00e78\3\2\2\2\u00e8\u00e9\7]\2\2\u00e9:\3\2\2\2\u00ea"+
		"\u00eb\7_\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7x\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1>\3\2\2\2\u00f2"+
		"\u00f3\7.\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\7?\2\2\u00f6"+
		"B\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\7#\2\2\u00f9D\3\2\2\2\u00fa\u00fb"+
		"\7>\2\2\u00fb\u00fc\7?\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe\u00ff"+
		"\7>\2\2\u00ffH\3\2\2\2\u0100\u0101\7@\2\2\u0101\u0102\7?\2\2\u0102J\3"+
		"\2\2\2\u0103\u0104\7?\2\2\u0104\u0105\7@\2\2\u0105L\3\2\2\2\u0106\u0107"+
		"\7,\2\2\u0107N\3\2\2\2\u0108\u0109\7<\2\2\u0109P\3\2\2\2\u010a\u010b\7"+
		"\61\2\2\u010bR\3\2\2\2\u010c\u010d\5U+\2\u010d\u010f\t\2\2\2\u010e\u0110"+
		"\5U+\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112T\3\2\2\2\u0113\u0115\4\62;\2\u0114\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117V\3"+
		"\2\2\2\u0118\u011c\7$\2\2\u0119\u011b\n\3\2\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7$\2\2\u0120X\3\2\2\2\u0121\u0125"+
		"\t\4\2\2\u0122\u0124\t\5\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126Z\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u0129\t\6\2\2\u0129\\\3\2\2\2\u012a\u012b\t\6\2\2\u012b\u012c\3"+
		"\2\2\2\u012c\u012d\b/\2\2\u012d^\3\2\2\2\u012e\u0130\t\7\2\2\u012f\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\b\60\2\2\u0134`\3\2\2\2\u0135\u0139\7%\2\2"+
		"\u0136\u0138\n\b\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\7%\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b\61\2\2\u013fb\3\2\2\2"+
		"\t\2\u0111\u0116\u011c\u0125\u0131\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}