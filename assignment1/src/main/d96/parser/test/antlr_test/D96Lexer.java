// Generated from D96.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class D96Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECIMAL_NO_ZERO=1, DECIMAL=2, HEXA=3, OCTAL=4, BIN=5, FLOAT_LITERAL=6, 
		STRING_LITERAL=7, PROGRAM=8, MAIN=9, STATEMENT=10, CONSTRUCTOR=11, DESTRUCTOR=12, 
		CLASS=13, SELF=14, IF=15, ELSEIF=16, ELSE=17, FOREACH=18, IN=19, BY=20, 
		TRUE=21, FALSE=22, NULL=23, ARRAY=24, INT=25, FLOAT=26, BOOLEAN=27, STRING=28, 
		VAL=29, VAR=30, RETURN=31, BREAK=32, CONTINUE=33, ADD=34, SUB=35, MUL=36, 
		DIV=37, REM=38, NOT=39, AND=40, OR=41, NEQ=42, EQUAL=43, GT=44, LTE=45, 
		LT=46, GTE=47, CONCAT=48, STR_EQUAL=49, DOUBCOLON=50, DOT=51, NEW=52, 
		ASSIGN=53, LP=54, RP=55, LCB=56, RCB=57, LSB=58, RSB=59, SEMI=60, COMMA=61, 
		COLON=62, DOTDOT=63, DOLLAR=64, DOLLAR_ID=65, ID=66, UNCLOSE_STRING=67, 
		ILLEGAL_ESCAPE=68, COMMENT=69, WS=70, ERROR_CHAR=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DECIMAL_NO_ZERO", "DECIMAL", "HEXA", "OCTAL", "BIN", "FLOAT_LITERAL", 
			"INTEGER_PART", "EXPONENT_PART", "DECIMAL_PART", "STRING_LITERAL", "STR_CHAR", 
			"ESC_SEQ", "PROGRAM", "MAIN", "STATEMENT", "CONSTRUCTOR", "DESTRUCTOR", 
			"CLASS", "SELF", "IF", "ELSEIF", "ELSE", "FOREACH", "IN", "BY", "TRUE", 
			"FALSE", "NULL", "ARRAY", "INT", "FLOAT", "BOOLEAN", "STRING", "VAL", 
			"VAR", "RETURN", "BREAK", "CONTINUE", "ADD", "SUB", "MUL", "DIV", "REM", 
			"NOT", "AND", "OR", "NEQ", "EQUAL", "GT", "LTE", "LT", "GTE", "CONCAT", 
			"STR_EQUAL", "DOUBCOLON", "DOT", "NEW", "ASSIGN", "LP", "RP", "LCB", 
			"RCB", "LSB", "RSB", "SEMI", "COMMA", "COLON", "DOTDOT", "DOLLAR", "DOLLAR_ID", 
			"ID", "UNCLOSE_STRING", "ILLEGAL_ESCAPE", "ESC_ILLEGAL", "COMMENT", "WS", 
			"ERROR_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'Program'", "'main'", 
			"'statement'", "'Constructor'", "'Destructor'", "'Class'", "'Self'", 
			"'If'", "'Elseif'", "'Else'", "'Foreach'", "'In'", "'By'", "'True'", 
			"'False'", "'Null'", "'Array'", "'Int'", "'Float'", "'Boolean'", "'String'", 
			"'Val'", "'Var'", "'Return'", "'Break'", "'Continue'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'!'", "'&&'", "'||'", "'!='", "'=='", "'>'", "'<='", 
			"'<'", "'>='", "'+.'", "'==.'", "'::'", "'.'", "'New'", "'='", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "':'", "'..'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECIMAL_NO_ZERO", "DECIMAL", "HEXA", "OCTAL", "BIN", "FLOAT_LITERAL", 
			"STRING_LITERAL", "PROGRAM", "MAIN", "STATEMENT", "CONSTRUCTOR", "DESTRUCTOR", 
			"CLASS", "SELF", "IF", "ELSEIF", "ELSE", "FOREACH", "IN", "BY", "TRUE", 
			"FALSE", "NULL", "ARRAY", "INT", "FLOAT", "BOOLEAN", "STRING", "VAL", 
			"VAR", "RETURN", "BREAK", "CONTINUE", "ADD", "SUB", "MUL", "DIV", "REM", 
			"NOT", "AND", "OR", "NEQ", "EQUAL", "GT", "LTE", "LT", "GTE", "CONCAT", 
			"STR_EQUAL", "DOUBCOLON", "DOT", "NEW", "ASSIGN", "LP", "RP", "LCB", 
			"RCB", "LSB", "RSB", "SEMI", "COMMA", "COLON", "DOTDOT", "DOLLAR", "DOLLAR_ID", 
			"ID", "UNCLOSE_STRING", "ILLEGAL_ESCAPE", "COMMENT", "WS", "ERROR_CHAR"
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


	public D96Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "D96.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u0276\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\7\2\u00a0\n\2\f\2\16\2\u00a3"+
		"\13\2\3\2\3\2\6\2\u00a7\n\2\r\2\16\2\u00a8\7\2\u00ab\n\2\f\2\16\2\u00ae"+
		"\13\2\3\3\3\3\3\3\7\3\u00b3\n\3\f\3\16\3\u00b6\13\3\5\3\u00b8\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\3\4\6\4\u00c7"+
		"\n\4\r\4\16\4\u00c8\7\4\u00cb\n\4\f\4\16\4\u00ce\13\4\5\4\u00d0\n\4\3"+
		"\5\3\5\3\5\3\5\7\5\u00d6\n\5\f\5\16\5\u00d9\13\5\3\5\3\5\6\5\u00dd\n\5"+
		"\r\5\16\5\u00de\7\5\u00e1\n\5\f\5\16\5\u00e4\13\5\5\5\u00e6\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u00ed\n\6\f\6\16\6\u00f0\13\6\3\6\3\6\6\6\u00f4\n\6"+
		"\r\6\16\6\u00f5\7\6\u00f8\n\6\f\6\16\6\u00fb\13\6\5\6\u00fd\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u010c\n\7\3\b\3\b\3"+
		"\b\7\b\u0111\n\b\f\b\16\b\u0114\13\b\3\b\3\b\6\b\u0118\n\b\r\b\16\b\u0119"+
		"\7\b\u011c\n\b\f\b\16\b\u011f\13\b\5\b\u0121\n\b\3\t\3\t\5\t\u0125\n\t"+
		"\3\t\3\t\3\n\3\n\6\n\u012b\n\n\r\n\16\n\u012c\3\n\7\n\u0130\n\n\f\n\16"+
		"\n\u0133\13\n\3\n\7\n\u0136\n\n\f\n\16\n\u0139\13\n\3\n\3\n\3\13\3\13"+
		"\7\13\u013f\n\13\f\13\16\13\u0142\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u014a\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\39\39\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?"+
		"\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3G\3G\6G\u023f\nG\rG"+
		"\16G\u0240\3H\3H\7H\u0245\nH\fH\16H\u0248\13H\3I\3I\7I\u024c\nI\fI\16"+
		"I\u024f\13I\3I\5I\u0252\nI\3J\3J\7J\u0256\nJ\fJ\16J\u0259\13J\3J\3J\3"+
		"K\3K\3K\3L\3L\3L\3L\7L\u0264\nL\fL\16L\u0267\13L\3L\3L\3L\3L\3L\3M\6M"+
		"\u026f\nM\rM\16M\u0270\3M\3M\3N\3N\3\u0265\2O\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\2\21\2\23\2\25\t\27\2\31\2\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22"+
		"-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#"+
		"O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177"+
		"<\u0081=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\u008fD\u0091E\u0093"+
		"F\u0095\2\u0097G\u0099H\u009bI\3\2\22\3\2\63;\3\2\62;\4\2\63;CH\4\2\62"+
		";CH\3\2\639\3\2\629\5\2DDdd~~\3\2\62\63\4\2GGgg\4\2--//\7\2\n\f\16\17"+
		"$$))^^\t\2))^^ddhhppttvv\6\2\62;C\\aac|\5\2C\\aac|\4\3\n\f\16\17\5\2\n"+
		"\f\16\17\"\"\2\u0294\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\3\u009d\3\2\2"+
		"\2\5\u00b7\3\2\2\2\7\u00b9\3\2\2\2\t\u00d1\3\2\2\2\13\u00e7\3\2\2\2\r"+
		"\u010b\3\2\2\2\17\u0120\3\2\2\2\21\u0122\3\2\2\2\23\u0128\3\2\2\2\25\u013c"+
		"\3\2\2\2\27\u0149\3\2\2\2\31\u014b\3\2\2\2\33\u014e\3\2\2\2\35\u0156\3"+
		"\2\2\2\37\u015b\3\2\2\2!\u0165\3\2\2\2#\u0171\3\2\2\2%\u017c\3\2\2\2\'"+
		"\u0182\3\2\2\2)\u0187\3\2\2\2+\u018a\3\2\2\2-\u0191\3\2\2\2/\u0196\3\2"+
		"\2\2\61\u019e\3\2\2\2\63\u01a1\3\2\2\2\65\u01a4\3\2\2\2\67\u01a9\3\2\2"+
		"\29\u01af\3\2\2\2;\u01b4\3\2\2\2=\u01ba\3\2\2\2?\u01be\3\2\2\2A\u01c4"+
		"\3\2\2\2C\u01cc\3\2\2\2E\u01d3\3\2\2\2G\u01d7\3\2\2\2I\u01db\3\2\2\2K"+
		"\u01e2\3\2\2\2M\u01e8\3\2\2\2O\u01f1\3\2\2\2Q\u01f3\3\2\2\2S\u01f5\3\2"+
		"\2\2U\u01f7\3\2\2\2W\u01f9\3\2\2\2Y\u01fb\3\2\2\2[\u01fd\3\2\2\2]\u0200"+
		"\3\2\2\2_\u0203\3\2\2\2a\u0206\3\2\2\2c\u0209\3\2\2\2e\u020b\3\2\2\2g"+
		"\u020e\3\2\2\2i\u0210\3\2\2\2k\u0213\3\2\2\2m\u0216\3\2\2\2o\u021a\3\2"+
		"\2\2q\u021d\3\2\2\2s\u021f\3\2\2\2u\u0223\3\2\2\2w\u0225\3\2\2\2y\u0227"+
		"\3\2\2\2{\u0229\3\2\2\2}\u022b\3\2\2\2\177\u022d\3\2\2\2\u0081\u022f\3"+
		"\2\2\2\u0083\u0231\3\2\2\2\u0085\u0233\3\2\2\2\u0087\u0235\3\2\2\2\u0089"+
		"\u0237\3\2\2\2\u008b\u023a\3\2\2\2\u008d\u023c\3\2\2\2\u008f\u0242\3\2"+
		"\2\2\u0091\u0249\3\2\2\2\u0093\u0253\3\2\2\2\u0095\u025c\3\2\2\2\u0097"+
		"\u025f\3\2\2\2\u0099\u026e\3\2\2\2\u009b\u0274\3\2\2\2\u009d\u00a1\t\2"+
		"\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ac\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a6\7a\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\4\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b8\7\62\2"+
		"\2\u00b0\u00b4\t\2\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b8\6\3\2\2\2"+
		"\u00b9\u00ba\7\62\2\2\u00ba\u00bb\7z\2\2\u00bb\u00cf\3\2\2\2\u00bc\u00d0"+
		"\7\62\2\2\u00bd\u00c1\t\4\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cc"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7a\2\2\u00c5\u00c7\t\5\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c4\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00bc\3\2\2\2\u00cf\u00bd\3\2\2\2\u00d0\b\3\2\2\2\u00d1\u00e5"+
		"\7\62\2\2\u00d2\u00e6\7\62\2\2\u00d3\u00d7\t\6\2\2\u00d4\u00d6\t\7\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00e2\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\7a\2\2\u00db"+
		"\u00dd\t\7\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00da\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00d2\3\2\2\2\u00e5\u00d3\3\2\2\2\u00e6"+
		"\n\3\2\2\2\u00e7\u00e8\7\62\2\2\u00e8\u00fc\t\b\2\2\u00e9\u00fd\7\62\2"+
		"\2\u00ea\u00ee\7\63\2\2\u00eb\u00ed\t\t\2\2\u00ec\u00eb\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f9\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\7a\2\2\u00f2\u00f4\t\t\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u00e9\3\2\2\2\u00fc\u00ea\3\2\2\2\u00fd\f\3\2\2\2\u00fe\u00ff"+
		"\5\17\b\2\u00ff\u0100\5\23\n\2\u0100\u0101\5\21\t\2\u0101\u010c\3\2\2"+
		"\2\u0102\u0103\5\17\b\2\u0103\u0104\5\23\n\2\u0104\u010c\3\2\2\2\u0105"+
		"\u0106\5\23\n\2\u0106\u0107\5\21\t\2\u0107\u010c\3\2\2\2\u0108\u0109\5"+
		"\17\b\2\u0109\u010a\5\21\t\2\u010a\u010c\3\2\2\2\u010b\u00fe\3\2\2\2\u010b"+
		"\u0102\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0108\3\2\2\2\u010c\16\3\2\2"+
		"\2\u010d\u0121\7\62\2\2\u010e\u0112\t\2\2\2\u010f\u0111\t\3\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u011d\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7a\2\2\u0116"+
		"\u0118\t\3\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0115\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u010d\3\2\2\2\u0120\u010e\3\2\2\2\u0121"+
		"\20\3\2\2\2\u0122\u0124\t\n\2\2\u0123\u0125\t\13\2\2\u0124\u0123\3\2\2"+
		"\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\5\17\b\2\u0127"+
		"\22\3\2\2\2\u0128\u0131\7\60\2\2\u0129\u012b\t\3\2\2\u012a\u0129\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\7a\2\2\u012f\u012a\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0137\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0136\t\3\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013b\t\2\2\2\u013b\24\3\2\2\2\u013c\u0140\7$\2\2\u013d\u013f"+
		"\5\27\f\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144"+
		"\7$\2\2\u0144\26\3\2\2\2\u0145\u014a\n\f\2\2\u0146\u014a\5\31\r\2\u0147"+
		"\u0148\7)\2\2\u0148\u014a\7$\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2"+
		"\2\u0149\u0147\3\2\2\2\u014a\30\3\2\2\2\u014b\u014c\7^\2\2\u014c\u014d"+
		"\t\r\2\2\u014d\32\3\2\2\2\u014e\u014f\7R\2\2\u014f\u0150\7t\2\2\u0150"+
		"\u0151\7q\2\2\u0151\u0152\7i\2\2\u0152\u0153\7t\2\2\u0153\u0154\7c\2\2"+
		"\u0154\u0155\7o\2\2\u0155\34\3\2\2\2\u0156\u0157\7o\2\2\u0157\u0158\7"+
		"c\2\2\u0158\u0159\7k\2\2\u0159\u015a\7p\2\2\u015a\36\3\2\2\2\u015b\u015c"+
		"\7u\2\2\u015c\u015d\7v\2\2\u015d\u015e\7c\2\2\u015e\u015f\7v\2\2\u015f"+
		"\u0160\7g\2\2\u0160\u0161\7o\2\2\u0161\u0162\7g\2\2\u0162\u0163\7p\2\2"+
		"\u0163\u0164\7v\2\2\u0164 \3\2\2\2\u0165\u0166\7E\2\2\u0166\u0167\7q\2"+
		"\2\u0167\u0168\7p\2\2\u0168\u0169\7u\2\2\u0169\u016a\7v\2\2\u016a\u016b"+
		"\7t\2\2\u016b\u016c\7w\2\2\u016c\u016d\7e\2\2\u016d\u016e\7v\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0170\7t\2\2\u0170\"\3\2\2\2\u0171\u0172\7F\2\2\u0172"+
		"\u0173\7g\2\2\u0173\u0174\7u\2\2\u0174\u0175\7v\2\2\u0175\u0176\7t\2\2"+
		"\u0176\u0177\7w\2\2\u0177\u0178\7e\2\2\u0178\u0179\7v\2\2\u0179\u017a"+
		"\7q\2\2\u017a\u017b\7t\2\2\u017b$\3\2\2\2\u017c\u017d\7E\2\2\u017d\u017e"+
		"\7n\2\2\u017e\u017f\7c\2\2\u017f\u0180\7u\2\2\u0180\u0181\7u\2\2\u0181"+
		"&\3\2\2\2\u0182\u0183\7U\2\2\u0183\u0184\7g\2\2\u0184\u0185\7n\2\2\u0185"+
		"\u0186\7h\2\2\u0186(\3\2\2\2\u0187\u0188\7K\2\2\u0188\u0189\7h\2\2\u0189"+
		"*\3\2\2\2\u018a\u018b\7G\2\2\u018b\u018c\7n\2\2\u018c\u018d\7u\2\2\u018d"+
		"\u018e\7g\2\2\u018e\u018f\7k\2\2\u018f\u0190\7h\2\2\u0190,\3\2\2\2\u0191"+
		"\u0192\7G\2\2\u0192\u0193\7n\2\2\u0193\u0194\7u\2\2\u0194\u0195\7g\2\2"+
		"\u0195.\3\2\2\2\u0196\u0197\7H\2\2\u0197\u0198\7q\2\2\u0198\u0199\7t\2"+
		"\2\u0199\u019a\7g\2\2\u019a\u019b\7c\2\2\u019b\u019c\7e\2\2\u019c\u019d"+
		"\7j\2\2\u019d\60\3\2\2\2\u019e\u019f\7K\2\2\u019f\u01a0\7p\2\2\u01a0\62"+
		"\3\2\2\2\u01a1\u01a2\7D\2\2\u01a2\u01a3\7{\2\2\u01a3\64\3\2\2\2\u01a4"+
		"\u01a5\7V\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7w\2\2\u01a7\u01a8\7g\2\2"+
		"\u01a8\66\3\2\2\2\u01a9\u01aa\7H\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7"+
		"n\2\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7g\2\2\u01ae8\3\2\2\2\u01af\u01b0"+
		"\7P\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7n\2\2\u01b3"+
		":\3\2\2\2\u01b4\u01b5\7C\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7t\2\2\u01b7"+
		"\u01b8\7c\2\2\u01b8\u01b9\7{\2\2\u01b9<\3\2\2\2\u01ba\u01bb\7K\2\2\u01bb"+
		"\u01bc\7p\2\2\u01bc\u01bd\7v\2\2\u01bd>\3\2\2\2\u01be\u01bf\7H\2\2\u01bf"+
		"\u01c0\7n\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7c\2\2\u01c2\u01c3\7v\2\2"+
		"\u01c3@\3\2\2\2\u01c4\u01c5\7D\2\2\u01c5\u01c6\7q\2\2\u01c6\u01c7\7q\2"+
		"\2\u01c7\u01c8\7n\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb"+
		"\7p\2\2\u01cbB\3\2\2\2\u01cc\u01cd\7U\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf"+
		"\7t\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7i\2\2\u01d2"+
		"D\3\2\2\2\u01d3\u01d4\7X\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7n\2\2\u01d6"+
		"F\3\2\2\2\u01d7\u01d8\7X\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7t\2\2\u01da"+
		"H\3\2\2\2\u01db\u01dc\7T\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7v\2\2\u01de"+
		"\u01df\7w\2\2\u01df\u01e0\7t\2\2\u01e0\u01e1\7p\2\2\u01e1J\3\2\2\2\u01e2"+
		"\u01e3\7D\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7c\2\2"+
		"\u01e6\u01e7\7m\2\2\u01e7L\3\2\2\2\u01e8\u01e9\7E\2\2\u01e9\u01ea\7q\2"+
		"\2\u01ea\u01eb\7p\2\2\u01eb\u01ec\7v\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee"+
		"\7p\2\2\u01ee\u01ef\7w\2\2\u01ef\u01f0\7g\2\2\u01f0N\3\2\2\2\u01f1\u01f2"+
		"\7-\2\2\u01f2P\3\2\2\2\u01f3\u01f4\7/\2\2\u01f4R\3\2\2\2\u01f5\u01f6\7"+
		",\2\2\u01f6T\3\2\2\2\u01f7\u01f8\7\61\2\2\u01f8V\3\2\2\2\u01f9\u01fa\7"+
		"\'\2\2\u01faX\3\2\2\2\u01fb\u01fc\7#\2\2\u01fcZ\3\2\2\2\u01fd\u01fe\7"+
		"(\2\2\u01fe\u01ff\7(\2\2\u01ff\\\3\2\2\2\u0200\u0201\7~\2\2\u0201\u0202"+
		"\7~\2\2\u0202^\3\2\2\2\u0203\u0204\7#\2\2\u0204\u0205\7?\2\2\u0205`\3"+
		"\2\2\2\u0206\u0207\7?\2\2\u0207\u0208\7?\2\2\u0208b\3\2\2\2\u0209\u020a"+
		"\7@\2\2\u020ad\3\2\2\2\u020b\u020c\7>\2\2\u020c\u020d\7?\2\2\u020df\3"+
		"\2\2\2\u020e\u020f\7>\2\2\u020fh\3\2\2\2\u0210\u0211\7@\2\2\u0211\u0212"+
		"\7?\2\2\u0212j\3\2\2\2\u0213\u0214\7-\2\2\u0214\u0215\7\60\2\2\u0215l"+
		"\3\2\2\2\u0216\u0217\7?\2\2\u0217\u0218\7?\2\2\u0218\u0219\7\60\2\2\u0219"+
		"n\3\2\2\2\u021a\u021b\7<\2\2\u021b\u021c\7<\2\2\u021cp\3\2\2\2\u021d\u021e"+
		"\7\60\2\2\u021er\3\2\2\2\u021f\u0220\7P\2\2\u0220\u0221\7g\2\2\u0221\u0222"+
		"\7y\2\2\u0222t\3\2\2\2\u0223\u0224\7?\2\2\u0224v\3\2\2\2\u0225\u0226\7"+
		"*\2\2\u0226x\3\2\2\2\u0227\u0228\7+\2\2\u0228z\3\2\2\2\u0229\u022a\7}"+
		"\2\2\u022a|\3\2\2\2\u022b\u022c\7\177\2\2\u022c~\3\2\2\2\u022d\u022e\7"+
		"]\2\2\u022e\u0080\3\2\2\2\u022f\u0230\7_\2\2\u0230\u0082\3\2\2\2\u0231"+
		"\u0232\7=\2\2\u0232\u0084\3\2\2\2\u0233\u0234\7.\2\2\u0234\u0086\3\2\2"+
		"\2\u0235\u0236\7<\2\2\u0236\u0088\3\2\2\2\u0237\u0238\7\60\2\2\u0238\u0239"+
		"\7\60\2\2\u0239\u008a\3\2\2\2\u023a\u023b\7&\2\2\u023b\u008c\3\2\2\2\u023c"+
		"\u023e\7&\2\2\u023d\u023f\t\16\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u008e\3\2\2\2\u0242"+
		"\u0246\t\17\2\2\u0243\u0245\t\16\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3"+
		"\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0090\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024d\7$\2\2\u024a\u024c\5\27\f\2\u024b\u024a\3\2"+
		"\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\t\20\2\2\u0251\u0250\3"+
		"\2\2\2\u0252\u0092\3\2\2\2\u0253\u0257\7$\2\2\u0254\u0256\5\27\f\2\u0255"+
		"\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\5\u0095K\2\u025b"+
		"\u0094\3\2\2\2\u025c\u025d\7^\2\2\u025d\u025e\n\r\2\2\u025e\u0096\3\2"+
		"\2\2\u025f\u0260\7%\2\2\u0260\u0261\7%\2\2\u0261\u0265\3\2\2\2\u0262\u0264"+
		"\13\2\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0266\3\2\2\2"+
		"\u0265\u0263\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269"+
		"\7%\2\2\u0269\u026a\7%\2\2\u026a\u026b\3\2\2\2\u026b\u026c\bL\2\2\u026c"+
		"\u0098\3\2\2\2\u026d\u026f\t\21\2\2\u026e\u026d\3\2\2\2\u026f\u0270\3"+
		"\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0273\bM\2\2\u0273\u009a\3\2\2\2\u0274\u0275\13\2\2\2\u0275\u009c\3\2"+
		"\2\2&\2\u00a1\u00a8\u00ac\u00b4\u00b7\u00c1\u00c8\u00cc\u00cf\u00d7\u00de"+
		"\u00e2\u00e5\u00ee\u00f5\u00f9\u00fc\u010b\u0112\u0119\u011d\u0120\u0124"+
		"\u012c\u0131\u0137\u0140\u0149\u0240\u0246\u024d\u0251\u0257\u0265\u0270"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}