// Generated from D96.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class D96Parser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_normal_class_or_non = 1, RULE_normal_classes = 2, 
		RULE_program_class = 3, RULE_normal_class = 4, RULE_inherit_parent = 5, 
		RULE_inside_class = 6, RULE_inside_program_class = 7, RULE_inside_normal_class = 8, 
		RULE_non_destructor = 9, RULE_method = 10, RULE_static_method = 11, RULE_non_static_method = 12, 
		RULE_constructor = 13, RULE_destructor = 14, RULE_mainfunc = 15, RULE_attribute = 16, 
		RULE_variable_list = 17, RULE_initialization = 18, RULE_parameter_list = 19, 
		RULE_id_list = 20, RULE_statement = 21, RULE_var_const_declar_stment = 22, 
		RULE_assign_stment = 23, RULE_lhs_assignment = 24, RULE_if_stment = 25, 
		RULE_else_if = 26, RULE_for_in_stment = 27, RULE_break_stment = 28, RULE_continue_stment = 29, 
		RULE_return_stment = 30, RULE_method_invo_stment = 31, RULE_instance_invok_method = 32, 
		RULE_static_invok_method = 33, RULE_block_stment = 34, RULE_statement_list = 35, 
		RULE_index_expression = 36, RULE_index_operators = 37, RULE_scalar_variable = 38, 
		RULE_attribute_access = 39, RULE_static_attribute_access = 40, RULE_data_type = 41, 
		RULE_array_type = 42, RULE_primitive_type = 43, RULE_class_exp = 44, RULE_exp = 45, 
		RULE_exp1 = 46, RULE_exp2 = 47, RULE_exp3 = 48, RULE_exp4 = 49, RULE_exp5 = 50, 
		RULE_exp6 = 51, RULE_exp7 = 52, RULE_exp8 = 53, RULE_exp9 = 54, RULE_operands = 55, 
		RULE_static_operands = 56, RULE_static_func_call = 57, RULE_func_call = 58, 
		RULE_exp_list = 59, RULE_literal = 60, RULE_indexed_array_literal = 61, 
		RULE_multi_array_literal = 62, RULE_integer_literal = 63, RULE_boolean_literal = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "normal_class_or_non", "normal_classes", "program_class", 
			"normal_class", "inherit_parent", "inside_class", "inside_program_class", 
			"inside_normal_class", "non_destructor", "method", "static_method", "non_static_method", 
			"constructor", "destructor", "mainfunc", "attribute", "variable_list", 
			"initialization", "parameter_list", "id_list", "statement", "var_const_declar_stment", 
			"assign_stment", "lhs_assignment", "if_stment", "else_if", "for_in_stment", 
			"break_stment", "continue_stment", "return_stment", "method_invo_stment", 
			"instance_invok_method", "static_invok_method", "block_stment", "statement_list", 
			"index_expression", "index_operators", "scalar_variable", "attribute_access", 
			"static_attribute_access", "data_type", "array_type", "primitive_type", 
			"class_exp", "exp", "exp1", "exp2", "exp3", "exp4", "exp5", "exp6", "exp7", 
			"exp8", "exp9", "operands", "static_operands", "static_func_call", "func_call", 
			"exp_list", "literal", "indexed_array_literal", "multi_array_literal", 
			"integer_literal", "boolean_literal"
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

	@Override
	public String getGrammarFileName() { return "D96.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public D96Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Normal_class_or_nonContext> normal_class_or_non() {
			return getRuleContexts(Normal_class_or_nonContext.class);
		}
		public Normal_class_or_nonContext normal_class_or_non(int i) {
			return getRuleContext(Normal_class_or_nonContext.class,i);
		}
		public Program_classContext program_class() {
			return getRuleContext(Program_classContext.class,0);
		}
		public TerminalNode EOF() { return getToken(D96Parser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			normal_class_or_non();
			setState(131);
			program_class();
			setState(132);
			normal_class_or_non();
			setState(133);
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

	public static class Normal_class_or_nonContext extends ParserRuleContext {
		public Normal_classesContext normal_classes() {
			return getRuleContext(Normal_classesContext.class,0);
		}
		public Normal_class_or_nonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_class_or_non; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterNormal_class_or_non(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitNormal_class_or_non(this);
		}
	}

	public final Normal_class_or_nonContext normal_class_or_non() throws RecognitionException {
		Normal_class_or_nonContext _localctx = new Normal_class_or_nonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_normal_class_or_non);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				normal_classes(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Normal_classesContext extends ParserRuleContext {
		public Normal_classContext normal_class() {
			return getRuleContext(Normal_classContext.class,0);
		}
		public Normal_classesContext normal_classes() {
			return getRuleContext(Normal_classesContext.class,0);
		}
		public Normal_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterNormal_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitNormal_classes(this);
		}
	}

	public final Normal_classesContext normal_classes() throws RecognitionException {
		return normal_classes(0);
	}

	private Normal_classesContext normal_classes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Normal_classesContext _localctx = new Normal_classesContext(_ctx, _parentState);
		Normal_classesContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_normal_classes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			normal_class();
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Normal_classesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_normal_classes);
					setState(142);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(143);
					normal_class();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Program_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(D96Parser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(D96Parser.PROGRAM, 0); }
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public Inside_program_classContext inside_program_class() {
			return getRuleContext(Inside_program_classContext.class,0);
		}
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public Program_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterProgram_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitProgram_class(this);
		}
	}

	public final Program_classContext program_class() throws RecognitionException {
		Program_classContext _localctx = new Program_classContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_program_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CLASS);
			setState(150);
			match(PROGRAM);
			setState(151);
			match(LCB);
			setState(152);
			inside_program_class();
			setState(153);
			match(RCB);
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

	public static class Normal_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(D96Parser.CLASS, 0); }
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public Inherit_parentContext inherit_parent() {
			return getRuleContext(Inherit_parentContext.class,0);
		}
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public Inside_classContext inside_class() {
			return getRuleContext(Inside_classContext.class,0);
		}
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public Normal_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterNormal_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitNormal_class(this);
		}
	}

	public final Normal_classContext normal_class() throws RecognitionException {
		Normal_classContext _localctx = new Normal_classContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_normal_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(CLASS);
			setState(156);
			match(ID);
			setState(157);
			inherit_parent();
			setState(158);
			match(LCB);
			setState(159);
			inside_class();
			setState(160);
			match(RCB);
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

	public static class Inherit_parentContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(D96Parser.COLON, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Inherit_parentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInherit_parent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInherit_parent(this);
		}
	}

	public final Inherit_parentContext inherit_parent() throws RecognitionException {
		Inherit_parentContext _localctx = new Inherit_parentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inherit_parent);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(COLON);
				setState(163);
				id_list();
				}
				break;
			case LCB:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Inside_classContext extends ParserRuleContext {
		public Inside_program_classContext inside_program_class() {
			return getRuleContext(Inside_program_classContext.class,0);
		}
		public Inside_normal_classContext inside_normal_class() {
			return getRuleContext(Inside_normal_classContext.class,0);
		}
		public Inside_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInside_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInside_class(this);
		}
	}

	public final Inside_classContext inside_class() throws RecognitionException {
		Inside_classContext _localctx = new Inside_classContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inside_class);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				inside_program_class();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				inside_normal_class();
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

	public static class Inside_program_classContext extends ParserRuleContext {
		public Inside_normal_classContext inside_normal_class() {
			return getRuleContext(Inside_normal_classContext.class,0);
		}
		public MainfuncContext mainfunc() {
			return getRuleContext(MainfuncContext.class,0);
		}
		public Non_destructorContext non_destructor() {
			return getRuleContext(Non_destructorContext.class,0);
		}
		public Inside_program_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_program_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInside_program_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInside_program_class(this);
		}
	}

	public final Inside_program_classContext inside_program_class() throws RecognitionException {
		Inside_program_classContext _localctx = new Inside_program_classContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inside_program_class);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				inside_normal_class();
				setState(172);
				mainfunc();
				setState(173);
				non_destructor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				non_destructor();
				setState(176);
				mainfunc();
				setState(177);
				inside_normal_class();
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

	public static class Inside_normal_classContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Inside_normal_classContext inside_normal_class() {
			return getRuleContext(Inside_normal_classContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public DestructorContext destructor() {
			return getRuleContext(DestructorContext.class,0);
		}
		public Non_destructorContext non_destructor() {
			return getRuleContext(Non_destructorContext.class,0);
		}
		public Inside_normal_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_normal_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInside_normal_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInside_normal_class(this);
		}
	}

	public final Inside_normal_classContext inside_normal_class() throws RecognitionException {
		Inside_normal_classContext _localctx = new Inside_normal_classContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inside_normal_class);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				method();
				setState(182);
				inside_normal_class();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				attribute();
				setState(185);
				inside_normal_class();
				}
				break;
			case DESTRUCTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				destructor();
				setState(188);
				non_destructor();
				}
				break;
			case MAIN:
			case RCB:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Non_destructorContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Non_destructorContext non_destructor() {
			return getRuleContext(Non_destructorContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Non_destructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_destructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterNon_destructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitNon_destructor(this);
		}
	}

	public final Non_destructorContext non_destructor() throws RecognitionException {
		Non_destructorContext _localctx = new Non_destructorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_non_destructor);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				method();
				setState(194);
				non_destructor();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				attribute();
				setState(197);
				non_destructor();
				}
				break;
			case MAIN:
			case RCB:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class MethodContext extends ParserRuleContext {
		public Static_methodContext static_method() {
			return getRuleContext(Static_methodContext.class,0);
		}
		public Non_static_methodContext non_static_method() {
			return getRuleContext(Non_static_methodContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				static_method();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				non_static_method();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				constructor();
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

	public static class Static_methodContext extends ParserRuleContext {
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public TerminalNode STATEMENT() { return getToken(D96Parser.STATEMENT, 0); }
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Static_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatic_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatic_method(this);
		}
	}

	public final Static_methodContext static_method() throws RecognitionException {
		Static_methodContext _localctx = new Static_methodContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_static_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(DOLLAR_ID);
			setState(208);
			match(LP);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(209);
				parameter_list();
				}
			}

			setState(212);
			match(RP);
			setState(213);
			match(LCB);
			setState(214);
			match(STATEMENT);
			setState(215);
			match(RCB);
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

	public static class Non_static_methodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public TerminalNode STATEMENT() { return getToken(D96Parser.STATEMENT, 0); }
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Non_static_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_static_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterNon_static_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitNon_static_method(this);
		}
	}

	public final Non_static_methodContext non_static_method() throws RecognitionException {
		Non_static_methodContext _localctx = new Non_static_methodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_non_static_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ID);
			setState(218);
			match(LP);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(219);
				parameter_list();
				}
			}

			setState(222);
			match(RP);
			setState(223);
			match(LCB);
			setState(224);
			match(STATEMENT);
			setState(225);
			match(RCB);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(D96Parser.CONSTRUCTOR, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public TerminalNode STATEMENT() { return getToken(D96Parser.STATEMENT, 0); }
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(CONSTRUCTOR);
			setState(228);
			match(LP);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(229);
				parameter_list();
				}
			}

			setState(232);
			match(RP);
			setState(233);
			match(LCB);
			setState(234);
			match(STATEMENT);
			setState(235);
			match(RCB);
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

	public static class DestructorContext extends ParserRuleContext {
		public TerminalNode DESTRUCTOR() { return getToken(D96Parser.DESTRUCTOR, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public TerminalNode STATEMENT() { return getToken(D96Parser.STATEMENT, 0); }
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public DestructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterDestructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitDestructor(this);
		}
	}

	public final DestructorContext destructor() throws RecognitionException {
		DestructorContext _localctx = new DestructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_destructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(DESTRUCTOR);
			setState(238);
			match(LP);
			setState(239);
			match(RP);
			setState(240);
			match(LCB);
			setState(241);
			match(STATEMENT);
			setState(242);
			match(RCB);
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

	public static class MainfuncContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(D96Parser.MAIN, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public TerminalNode STATEMENT() { return getToken(D96Parser.STATEMENT, 0); }
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public MainfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterMainfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitMainfunc(this);
		}
	}

	public final MainfuncContext mainfunc() throws RecognitionException {
		MainfuncContext _localctx = new MainfuncContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mainfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(MAIN);
			setState(245);
			match(LP);
			setState(246);
			match(RP);
			setState(247);
			match(LCB);
			setState(248);
			match(STATEMENT);
			setState(249);
			match(RCB);
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

	public static class AttributeContext extends ParserRuleContext {
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(D96Parser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public TerminalNode VAL() { return getToken(D96Parser.VAL, 0); }
		public TerminalNode VAR() { return getToken(D96Parser.VAR, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
			variable_list();
			setState(253);
			match(COLON);
			setState(254);
			data_type();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(255);
				initialization();
				}
			}

			setState(258);
			match(SEMI);
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

	public static class Variable_listContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(D96Parser.COMMA, 0); }
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitVariable_list(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable_list);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==DOLLAR_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				match(COMMA);
				setState(262);
				variable_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==DOLLAR_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(D96Parser.ASSIGN, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ASSIGN);
			setState(267);
			exp_list();
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(D96Parser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter_list);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				id_list();
				setState(270);
				match(COLON);
				setState(271);
				data_type();
				setState(272);
				match(SEMI);
				setState(273);
				parameter_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				id_list();
				setState(276);
				match(COLON);
				setState(277);
				data_type();
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode COMMA() { return getToken(D96Parser.COMMA, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_id_list);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(ID);
				setState(282);
				match(COMMA);
				setState(283);
				id_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public Var_const_declar_stmentContext var_const_declar_stment() {
			return getRuleContext(Var_const_declar_stmentContext.class,0);
		}
		public Assign_stmentContext assign_stment() {
			return getRuleContext(Assign_stmentContext.class,0);
		}
		public If_stmentContext if_stment() {
			return getRuleContext(If_stmentContext.class,0);
		}
		public For_in_stmentContext for_in_stment() {
			return getRuleContext(For_in_stmentContext.class,0);
		}
		public Break_stmentContext break_stment() {
			return getRuleContext(Break_stmentContext.class,0);
		}
		public Continue_stmentContext continue_stment() {
			return getRuleContext(Continue_stmentContext.class,0);
		}
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
		public Method_invo_stmentContext method_invo_stment() {
			return getRuleContext(Method_invo_stmentContext.class,0);
		}
		public Return_stmentContext return_stment() {
			return getRuleContext(Return_stmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statement);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				var_const_declar_stment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				assign_stment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				if_stment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				for_in_stment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				break_stment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				continue_stment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				block_stment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				method_invo_stment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
				return_stment();
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

	public static class Var_const_declar_stmentContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(D96Parser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public TerminalNode VAL() { return getToken(D96Parser.VAL, 0); }
		public TerminalNode VAR() { return getToken(D96Parser.VAR, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public Var_const_declar_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_const_declar_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterVar_const_declar_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitVar_const_declar_stment(this);
		}
	}

	public final Var_const_declar_stmentContext var_const_declar_stment() throws RecognitionException {
		Var_const_declar_stmentContext _localctx = new Var_const_declar_stmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_const_declar_stment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(299);
			id_list();
			setState(300);
			match(COLON);
			setState(301);
			data_type();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(302);
				initialization();
				}
			}

			setState(305);
			match(SEMI);
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

	public static class Assign_stmentContext extends ParserRuleContext {
		public Lhs_assignmentContext lhs_assignment() {
			return getRuleContext(Lhs_assignmentContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(D96Parser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public Assign_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterAssign_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitAssign_stment(this);
		}
	}

	public final Assign_stmentContext assign_stment() throws RecognitionException {
		Assign_stmentContext _localctx = new Assign_stmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			lhs_assignment();
			setState(308);
			match(ASSIGN);
			setState(309);
			exp(0);
			setState(310);
			match(SEMI);
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

	public static class Lhs_assignmentContext extends ParserRuleContext {
		public Scalar_variableContext scalar_variable() {
			return getRuleContext(Scalar_variableContext.class,0);
		}
		public Index_expressionContext index_expression() {
			return getRuleContext(Index_expressionContext.class,0);
		}
		public Lhs_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterLhs_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitLhs_assignment(this);
		}
	}

	public final Lhs_assignmentContext lhs_assignment() throws RecognitionException {
		Lhs_assignmentContext _localctx = new Lhs_assignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lhs_assignment);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				scalar_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				index_expression();
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

	public static class If_stmentContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(D96Parser.IF, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public If_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterIf_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitIf_stment(this);
		}
	}

	public final If_stmentContext if_stment() throws RecognitionException {
		If_stmentContext _localctx = new If_stmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(IF);
			setState(317);
			match(LP);
			setState(318);
			exp(0);
			setState(319);
			match(RP);
			setState(320);
			block_stment();
			setState(321);
			else_if();
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

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(D96Parser.ELSEIF, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
		public Else_ifContext else_if() {
			return getRuleContext(Else_ifContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(D96Parser.ELSE, 0); }
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitElse_if(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_if);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSEIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(ELSEIF);
				setState(324);
				match(LP);
				setState(325);
				exp(0);
				setState(326);
				match(RP);
				setState(327);
				block_stment();
				setState(328);
				else_if();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(ELSE);
				setState(331);
				block_stment();
				}
				break;
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SELF:
			case IF:
			case FOREACH:
			case TRUE:
			case FALSE:
			case VAL:
			case VAR:
			case RETURN:
			case BREAK:
			case CONTINUE:
			case SUB:
			case NOT:
			case NEW:
			case LP:
			case LCB:
			case RCB:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class For_in_stmentContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(D96Parser.FOREACH, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public Scalar_variableContext scalar_variable() {
			return getRuleContext(Scalar_variableContext.class,0);
		}
		public TerminalNode IN() { return getToken(D96Parser.IN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(D96Parser.DOTDOT, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
		public TerminalNode LSB() { return getToken(D96Parser.LSB, 0); }
		public TerminalNode BY() { return getToken(D96Parser.BY, 0); }
		public TerminalNode RSB() { return getToken(D96Parser.RSB, 0); }
		public For_in_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterFor_in_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitFor_in_stment(this);
		}
	}

	public final For_in_stmentContext for_in_stment() throws RecognitionException {
		For_in_stmentContext _localctx = new For_in_stmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_in_stment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(FOREACH);
			setState(336);
			match(LP);
			setState(337);
			scalar_variable();
			setState(338);
			match(IN);
			setState(339);
			exp(0);
			setState(340);
			match(DOTDOT);
			setState(341);
			exp(0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(342);
				match(LSB);
				setState(343);
				match(BY);
				setState(344);
				exp(0);
				setState(345);
				match(RSB);
				}
			}

			setState(349);
			match(RP);
			setState(350);
			block_stment();
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

	public static class Break_stmentContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(D96Parser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public Break_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterBreak_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitBreak_stment(this);
		}
	}

	public final Break_stmentContext break_stment() throws RecognitionException {
		Break_stmentContext _localctx = new Break_stmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_break_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(BREAK);
			setState(353);
			match(SEMI);
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

	public static class Continue_stmentContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(D96Parser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public Continue_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterContinue_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitContinue_stment(this);
		}
	}

	public final Continue_stmentContext continue_stment() throws RecognitionException {
		Continue_stmentContext _localctx = new Continue_stmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continue_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(CONTINUE);
			setState(356);
			match(SEMI);
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

	public static class Return_stmentContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(D96Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterReturn_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitReturn_stment(this);
		}
	}

	public final Return_stmentContext return_stment() throws RecognitionException {
		Return_stmentContext _localctx = new Return_stmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_return_stment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(RETURN);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP))) != 0) || _la==ID) {
				{
				setState(359);
				exp(0);
				}
			}

			setState(362);
			match(SEMI);
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

	public static class Method_invo_stmentContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(D96Parser.SEMI, 0); }
		public Instance_invok_methodContext instance_invok_method() {
			return getRuleContext(Instance_invok_methodContext.class,0);
		}
		public Static_invok_methodContext static_invok_method() {
			return getRuleContext(Static_invok_methodContext.class,0);
		}
		public Method_invo_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invo_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterMethod_invo_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitMethod_invo_stment(this);
		}
	}

	public final Method_invo_stmentContext method_invo_stment() throws RecognitionException {
		Method_invo_stmentContext _localctx = new Method_invo_stmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_method_invo_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(364);
				instance_invok_method();
				}
				break;
			case 2:
				{
				setState(365);
				static_invok_method();
				}
				break;
			}
			setState(368);
			match(SEMI);
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

	public static class Instance_invok_methodContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(D96Parser.DOT, 0); }
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Instance_invok_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_invok_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInstance_invok_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInstance_invok_method(this);
		}
	}

	public final Instance_invok_methodContext instance_invok_method() throws RecognitionException {
		Instance_invok_methodContext _localctx = new Instance_invok_methodContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_instance_invok_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			exp(0);
			setState(371);
			match(DOT);
			setState(372);
			match(ID);
			setState(373);
			match(LP);
			setState(374);
			exp_list();
			setState(375);
			match(RP);
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

	public static class Static_invok_methodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode DOUBCOLON() { return getToken(D96Parser.DOUBCOLON, 0); }
		public Static_func_callContext static_func_call() {
			return getRuleContext(Static_func_callContext.class,0);
		}
		public Static_invok_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_invok_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatic_invok_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatic_invok_method(this);
		}
	}

	public final Static_invok_methodContext static_invok_method() throws RecognitionException {
		Static_invok_methodContext _localctx = new Static_invok_methodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_static_invok_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(ID);
			setState(378);
			match(DOUBCOLON);
			setState(379);
			static_func_call();
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

	public static class Block_stmentContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(D96Parser.LCB, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode RCB() { return getToken(D96Parser.RCB, 0); }
		public Block_stmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterBlock_stment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitBlock_stment(this);
		}
	}

	public final Block_stmentContext block_stment() throws RecognitionException {
		Block_stmentContext _localctx = new Block_stmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LCB);
			setState(382);
			statement_list();
			setState(383);
			match(RCB);
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement_list);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SELF:
			case IF:
			case FOREACH:
			case TRUE:
			case FALSE:
			case VAL:
			case VAR:
			case RETURN:
			case BREAK:
			case CONTINUE:
			case SUB:
			case NOT:
			case NEW:
			case LP:
			case LCB:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				statement();
				setState(386);
				statement_list();
				}
				break;
			case RCB:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Index_expressionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Index_operatorsContext index_operators() {
			return getRuleContext(Index_operatorsContext.class,0);
		}
		public Index_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterIndex_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitIndex_expression(this);
		}
	}

	public final Index_expressionContext index_expression() throws RecognitionException {
		Index_expressionContext _localctx = new Index_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_index_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			exp(0);
			setState(392);
			index_operators();
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

	public static class Index_operatorsContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(D96Parser.LSB, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RSB() { return getToken(D96Parser.RSB, 0); }
		public Index_operatorsContext index_operators() {
			return getRuleContext(Index_operatorsContext.class,0);
		}
		public Index_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterIndex_operators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitIndex_operators(this);
		}
	}

	public final Index_operatorsContext index_operators() throws RecognitionException {
		Index_operatorsContext _localctx = new Index_operatorsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_index_operators);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(LSB);
				setState(395);
				exp(0);
				setState(396);
				match(RSB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(LSB);
				setState(399);
				exp(0);
				setState(400);
				match(RSB);
				setState(401);
				index_operators();
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

	public static class Scalar_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public Attribute_accessContext attribute_access() {
			return getRuleContext(Attribute_accessContext.class,0);
		}
		public Static_attribute_accessContext static_attribute_access() {
			return getRuleContext(Static_attribute_accessContext.class,0);
		}
		public Scalar_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterScalar_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitScalar_variable(this);
		}
	}

	public final Scalar_variableContext scalar_variable() throws RecognitionException {
		Scalar_variableContext _localctx = new Scalar_variableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scalar_variable);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				attribute_access();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				static_attribute_access();
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

	public static class Attribute_accessContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(D96Parser.DOT, 0); }
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public Attribute_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterAttribute_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitAttribute_access(this);
		}
	}

	public final Attribute_accessContext attribute_access() throws RecognitionException {
		Attribute_accessContext _localctx = new Attribute_accessContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_attribute_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			exp(0);
			setState(411);
			match(DOT);
			setState(412);
			match(ID);
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

	public static class Static_attribute_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode DOUBCOLON() { return getToken(D96Parser.DOUBCOLON, 0); }
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
		public Static_attribute_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_attribute_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatic_attribute_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatic_attribute_access(this);
		}
	}

	public final Static_attribute_accessContext static_attribute_access() throws RecognitionException {
		Static_attribute_accessContext _localctx = new Static_attribute_accessContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_static_attribute_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(ID);
			setState(415);
			match(DOUBCOLON);
			setState(416);
			match(DOLLAR_ID);
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

	public static class Data_typeContext extends ParserRuleContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Class_expContext class_exp() {
			return getRuleContext(Class_expContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_data_type);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				array_type();
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				primitive_type();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				class_exp();
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(D96Parser.ARRAY, 0); }
		public TerminalNode LSB() { return getToken(D96Parser.LSB, 0); }
		public TerminalNode COMMA() { return getToken(D96Parser.COMMA, 0); }
		public TerminalNode DECIMAL_NO_ZERO() { return getToken(D96Parser.DECIMAL_NO_ZERO, 0); }
		public TerminalNode RSB() { return getToken(D96Parser.RSB, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitArray_type(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(ARRAY);
			setState(424);
			match(LSB);
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				{
				setState(425);
				primitive_type();
				}
				break;
			case ARRAY:
				{
				setState(426);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			match(COMMA);
			setState(430);
			match(DECIMAL_NO_ZERO);
			setState(431);
			match(RSB);
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(D96Parser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(D96Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(D96Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(D96Parser.STRING, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterPrimitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitPrimitive_type(this);
		}
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class Class_expContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(D96Parser.NEW, 0); }
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Class_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterClass_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitClass_exp(this);
		}
	}

	public final Class_expContext class_exp() throws RecognitionException {
		Class_expContext _localctx = new Class_expContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_class_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(NEW);
			setState(436);
			match(ID);
			setState(437);
			match(LP);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP))) != 0) || _la==ID) {
				{
				setState(438);
				exp_list();
				}
			}

			setState(441);
			match(RP);
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

	public static class ExpContext extends ParserRuleContext {
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode CONCAT() { return getToken(D96Parser.CONCAT, 0); }
		public TerminalNode STR_EQUAL() { return getToken(D96Parser.STR_EQUAL, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			exp1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(446);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(447);
					_la = _input.LA(1);
					if ( !(_la==CONCAT || _la==STR_EQUAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(448);
					exp(3);
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Exp1Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public List<Exp1Context> exp1() {
			return getRuleContexts(Exp1Context.class);
		}
		public Exp1Context exp1(int i) {
			return getRuleContext(Exp1Context.class,i);
		}
		public TerminalNode EQUAL() { return getToken(D96Parser.EQUAL, 0); }
		public TerminalNode NEQ() { return getToken(D96Parser.NEQ, 0); }
		public TerminalNode LT() { return getToken(D96Parser.LT, 0); }
		public TerminalNode GT() { return getToken(D96Parser.GT, 0); }
		public TerminalNode LTE() { return getToken(D96Parser.LTE, 0); }
		public TerminalNode GTE() { return getToken(D96Parser.GTE, 0); }
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		return exp1(0);
	}

	private Exp1Context exp1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp1Context _localctx = new Exp1Context(_ctx, _parentState);
		Exp1Context _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_exp1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(455);
			exp2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp1);
					setState(457);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(458);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << EQUAL) | (1L << GT) | (1L << LTE) | (1L << LT) | (1L << GTE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(459);
					exp1(3);
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Exp2Context extends ParserRuleContext {
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminalNode AND() { return getToken(D96Parser.AND, 0); }
		public TerminalNode OR() { return getToken(D96Parser.OR, 0); }
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		return exp2(0);
	}

	private Exp2Context exp2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp2Context _localctx = new Exp2Context(_ctx, _parentState);
		Exp2Context _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_exp2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(468);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(469);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(470);
					exp3(0);
					}
					} 
				}
				setState(475);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp3Context extends ParserRuleContext {
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public Exp3Context exp3() {
			return getRuleContext(Exp3Context.class,0);
		}
		public TerminalNode ADD() { return getToken(D96Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(D96Parser.SUB, 0); }
		public Exp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp3(this);
		}
	}

	public final Exp3Context exp3() throws RecognitionException {
		return exp3(0);
	}

	private Exp3Context exp3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp3Context _localctx = new Exp3Context(_ctx, _parentState);
		Exp3Context _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_exp3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(477);
			exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(479);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(480);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(481);
					exp4(0);
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Exp4Context extends ParserRuleContext {
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Exp4Context exp4() {
			return getRuleContext(Exp4Context.class,0);
		}
		public TerminalNode MUL() { return getToken(D96Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(D96Parser.DIV, 0); }
		public TerminalNode REM() { return getToken(D96Parser.REM, 0); }
		public Exp4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp4(this);
		}
	}

	public final Exp4Context exp4() throws RecognitionException {
		return exp4(0);
	}

	private Exp4Context exp4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp4Context _localctx = new Exp4Context(_ctx, _parentState);
		Exp4Context _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_exp4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(488);
			exp5();
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(490);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(491);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << REM))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(492);
					exp5();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Exp5Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(D96Parser.NOT, 0); }
		public Exp5Context exp5() {
			return getRuleContext(Exp5Context.class,0);
		}
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public Exp5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp5(this);
		}
	}

	public final Exp5Context exp5() throws RecognitionException {
		Exp5Context _localctx = new Exp5Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp5);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(NOT);
				setState(499);
				exp5();
				}
				break;
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SELF:
			case TRUE:
			case FALSE:
			case SUB:
			case NEW:
			case LP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				exp6();
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

	public static class Exp6Context extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(D96Parser.SUB, 0); }
		public Exp6Context exp6() {
			return getRuleContext(Exp6Context.class,0);
		}
		public Exp7Context exp7() {
			return getRuleContext(Exp7Context.class,0);
		}
		public Exp6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp6(this);
		}
	}

	public final Exp6Context exp6() throws RecognitionException {
		Exp6Context _localctx = new Exp6Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_exp6);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(SUB);
				setState(504);
				exp6();
				}
				break;
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SELF:
			case TRUE:
			case FALSE:
			case NEW:
			case LP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				exp7(0);
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

	public static class Exp7Context extends ParserRuleContext {
		public Exp8Context exp8() {
			return getRuleContext(Exp8Context.class,0);
		}
		public Exp7Context exp7() {
			return getRuleContext(Exp7Context.class,0);
		}
		public TerminalNode LSB() { return getToken(D96Parser.LSB, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RSB() { return getToken(D96Parser.RSB, 0); }
		public Exp7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp7(this);
		}
	}

	public final Exp7Context exp7() throws RecognitionException {
		return exp7(0);
	}

	private Exp7Context exp7(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp7Context _localctx = new Exp7Context(_ctx, _parentState);
		Exp7Context _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_exp7, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(509);
			exp8(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp7Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp7);
					setState(511);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(512);
					match(LSB);
					setState(513);
					exp(0);
					setState(514);
					match(RSB);
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Exp8Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode DOUBCOLON() { return getToken(D96Parser.DOUBCOLON, 0); }
		public Static_operandsContext static_operands() {
			return getRuleContext(Static_operandsContext.class,0);
		}
		public Exp9Context exp9() {
			return getRuleContext(Exp9Context.class,0);
		}
		public Exp8Context exp8() {
			return getRuleContext(Exp8Context.class,0);
		}
		public TerminalNode DOT() { return getToken(D96Parser.DOT, 0); }
		public Exp8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp8(this);
		}
	}

	public final Exp8Context exp8() throws RecognitionException {
		return exp8(0);
	}

	private Exp8Context exp8(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp8Context _localctx = new Exp8Context(_ctx, _parentState);
		Exp8Context _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_exp8, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(522);
				match(ID);
				setState(523);
				match(DOUBCOLON);
				setState(524);
				static_operands();
				}
				break;
			case 2:
				{
				setState(525);
				exp9();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp8Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp8);
					setState(528);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(529);
					match(DOT);
					setState(530);
					exp9();
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class Exp9Context extends ParserRuleContext {
		public Class_expContext class_exp() {
			return getRuleContext(Class_expContext.class,0);
		}
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public Exp9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp9(this);
		}
	}

	public final Exp9Context exp9() throws RecognitionException {
		Exp9Context _localctx = new Exp9Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_exp9);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				class_exp();
				}
				break;
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case SELF:
			case TRUE:
			case FALSE:
			case LP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				operands();
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

	public static class OperandsContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public TerminalNode SELF() { return getToken(D96Parser.SELF, 0); }
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterOperands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitOperands(this);
		}
	}

	public final OperandsContext operands() throws RecognitionException {
		OperandsContext _localctx = new OperandsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operands);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				func_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				match(LP);
				setState(544);
				exp(0);
				setState(545);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(547);
				match(SELF);
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

	public static class Static_operandsContext extends ParserRuleContext {
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
		public Static_func_callContext static_func_call() {
			return getRuleContext(Static_func_callContext.class,0);
		}
		public Static_operandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_operands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatic_operands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatic_operands(this);
		}
	}

	public final Static_operandsContext static_operands() throws RecognitionException {
		Static_operandsContext _localctx = new Static_operandsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_static_operands);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(DOLLAR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				static_func_call();
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

	public static class Static_func_callContext extends ParserRuleContext {
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Static_func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterStatic_func_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitStatic_func_call(this);
		}
	}

	public final Static_func_callContext static_func_call() throws RecognitionException {
		Static_func_callContext _localctx = new Static_func_callContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_static_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(DOLLAR_ID);
			setState(555);
			match(LP);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP))) != 0) || _la==ID) {
				{
				setState(556);
				exp_list();
				}
			}

			setState(559);
			match(RP);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ID);
			setState(562);
			match(LP);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP))) != 0) || _la==ID) {
				{
				setState(563);
				exp_list();
				}
			}

			setState(566);
			match(RP);
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

	public static class Exp_listContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(D96Parser.COMMA, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp_list(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_exp_list);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				exp(0);
				setState(569);
				match(COMMA);
				setState(570);
				exp_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				exp(0);
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

	public static class LiteralContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode FLOAT_LITERAL() { return getToken(D96Parser.FLOAT_LITERAL, 0); }
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(D96Parser.STRING_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				integer_literal();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(FLOAT_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(577);
				boolean_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(STRING_LITERAL);
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

	public static class Indexed_array_literalContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(D96Parser.ARRAY, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Indexed_array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterIndexed_array_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitIndexed_array_literal(this);
		}
	}

	public final Indexed_array_literalContext indexed_array_literal() throws RecognitionException {
		Indexed_array_literalContext _localctx = new Indexed_array_literalContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_indexed_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(ARRAY);
			setState(582);
			match(LP);
			setState(583);
			exp_list();
			setState(584);
			match(RP);
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

	public static class Multi_array_literalContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(D96Parser.ARRAY, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public List<Indexed_array_literalContext> indexed_array_literal() {
			return getRuleContexts(Indexed_array_literalContext.class);
		}
		public Indexed_array_literalContext indexed_array_literal(int i) {
			return getRuleContext(Indexed_array_literalContext.class,i);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(D96Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(D96Parser.COMMA, i);
		}
		public Multi_array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterMulti_array_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitMulti_array_literal(this);
		}
	}

	public final Multi_array_literalContext multi_array_literal() throws RecognitionException {
		Multi_array_literalContext _localctx = new Multi_array_literalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_multi_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(ARRAY);
			setState(587);
			match(LP);
			setState(588);
			indexed_array_literal();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(589);
				match(COMMA);
				setState(590);
				indexed_array_literal();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			match(RP);
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode DECIMAL_NO_ZERO() { return getToken(D96Parser.DECIMAL_NO_ZERO, 0); }
		public TerminalNode DECIMAL() { return getToken(D96Parser.DECIMAL, 0); }
		public TerminalNode HEXA() { return getToken(D96Parser.HEXA, 0); }
		public TerminalNode OCTAL() { return getToken(D96Parser.OCTAL, 0); }
		public TerminalNode BIN() { return getToken(D96Parser.BIN, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN))) != 0)) ) {
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(D96Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(D96Parser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitBoolean_literal(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return normal_classes_sempred((Normal_classesContext)_localctx, predIndex);
		case 45:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 46:
			return exp1_sempred((Exp1Context)_localctx, predIndex);
		case 47:
			return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 48:
			return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 49:
			return exp4_sempred((Exp4Context)_localctx, predIndex);
		case 52:
			return exp7_sempred((Exp7Context)_localctx, predIndex);
		case 53:
			return exp8_sempred((Exp8Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean normal_classes_sempred(Normal_classesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp1_sempred(Exp1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp3_sempred(Exp3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp4_sempred(Exp4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp7_sempred(Exp7Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp8_sempred(Exp8Context _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u025d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u008c\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\7\4\u0093\n\4\f\4\16\4\u0096\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u00a8\n\7\3\b\3"+
		"\b\5\b\u00ac\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00cb\n\13\3\f\3\f\3\f\5\f\u00d0\n\f\3\r\3\r\3\r\5\r\u00d5"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00df\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u00e9\n\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0103\n\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23"+
		"\u010b\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u011a\n\25\3\26\3\26\3\26\3\26\5\26\u0120\n\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012b\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0132\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32"+
		"\u013d\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0150\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u015e\n\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \5 \u016b\n \3 \3 \3!\3!\5!\u0171\n!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u0188"+
		"\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0196\n\'\3(\3(\3"+
		"(\5(\u019b\n(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\5+\u01a8\n+\3,\3,\3,\3"+
		",\5,\u01ae\n,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\5.\u01ba\n.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\7/\u01c4\n/\f/\16/\u01c7\13/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u01cf\n\60\f\60\16\60\u01d2\13\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\7\61\u01da\n\61\f\61\16\61\u01dd\13\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\7\62\u01e5\n\62\f\62\16\62\u01e8\13\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\7\63\u01f0\n\63\f\63\16\63\u01f3\13\63\3\64\3\64\3\64\5\64\u01f8\n\64"+
		"\3\65\3\65\3\65\5\65\u01fd\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u0207\n\66\f\66\16\66\u020a\13\66\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u0211\n\67\3\67\3\67\3\67\7\67\u0216\n\67\f\67\16\67\u0219\13\67\38\3"+
		"8\58\u021d\n8\39\39\39\39\39\39\39\39\59\u0227\n9\3:\3:\5:\u022b\n:\3"+
		";\3;\3;\5;\u0230\n;\3;\3;\3<\3<\3<\5<\u0237\n<\3<\3<\3=\3=\3=\3=\3=\5"+
		"=\u0240\n=\3>\3>\3>\3>\5>\u0246\n>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\7@\u0252"+
		"\n@\f@\16@\u0255\13@\3@\3@\3A\3A\3B\3B\3B\2\n\6\\^`bdjlC\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\2\f\3\2\37 \3\2CD\3\2\33\36\3\2\62\63\3\2,\61"+
		"\3\2*+\3\2$%\3\2&(\3\2\3\7\3\2\27\30\2\u025c\2\u0084\3\2\2\2\4\u008b\3"+
		"\2\2\2\6\u008d\3\2\2\2\b\u0097\3\2\2\2\n\u009d\3\2\2\2\f\u00a7\3\2\2\2"+
		"\16\u00ab\3\2\2\2\20\u00b5\3\2\2\2\22\u00c1\3\2\2\2\24\u00ca\3\2\2\2\26"+
		"\u00cf\3\2\2\2\30\u00d1\3\2\2\2\32\u00db\3\2\2\2\34\u00e5\3\2\2\2\36\u00ef"+
		"\3\2\2\2 \u00f6\3\2\2\2\"\u00fd\3\2\2\2$\u010a\3\2\2\2&\u010c\3\2\2\2"+
		"(\u0119\3\2\2\2*\u011f\3\2\2\2,\u012a\3\2\2\2.\u012c\3\2\2\2\60\u0135"+
		"\3\2\2\2\62\u013c\3\2\2\2\64\u013e\3\2\2\2\66\u014f\3\2\2\28\u0151\3\2"+
		"\2\2:\u0162\3\2\2\2<\u0165\3\2\2\2>\u0168\3\2\2\2@\u0170\3\2\2\2B\u0174"+
		"\3\2\2\2D\u017b\3\2\2\2F\u017f\3\2\2\2H\u0187\3\2\2\2J\u0189\3\2\2\2L"+
		"\u0195\3\2\2\2N\u019a\3\2\2\2P\u019c\3\2\2\2R\u01a0\3\2\2\2T\u01a7\3\2"+
		"\2\2V\u01a9\3\2\2\2X\u01b3\3\2\2\2Z\u01b5\3\2\2\2\\\u01bd\3\2\2\2^\u01c8"+
		"\3\2\2\2`\u01d3\3\2\2\2b\u01de\3\2\2\2d\u01e9\3\2\2\2f\u01f7\3\2\2\2h"+
		"\u01fc\3\2\2\2j\u01fe\3\2\2\2l\u0210\3\2\2\2n\u021c\3\2\2\2p\u0226\3\2"+
		"\2\2r\u022a\3\2\2\2t\u022c\3\2\2\2v\u0233\3\2\2\2x\u023f\3\2\2\2z\u0245"+
		"\3\2\2\2|\u0247\3\2\2\2~\u024c\3\2\2\2\u0080\u0258\3\2\2\2\u0082\u025a"+
		"\3\2\2\2\u0084\u0085\5\4\3\2\u0085\u0086\5\b\5\2\u0086\u0087\5\4\3\2\u0087"+
		"\u0088\7\2\2\3\u0088\3\3\2\2\2\u0089\u008c\5\6\4\2\u008a\u008c\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\5\3\2\2\2\u008d\u008e\b"+
		"\4\1\2\u008e\u008f\5\n\6\2\u008f\u0094\3\2\2\2\u0090\u0091\f\4\2\2\u0091"+
		"\u0093\5\n\6\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\7\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098"+
		"\7\17\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7:\2\2\u009a\u009b\5\20\t\2"+
		"\u009b\u009c\7;\2\2\u009c\t\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\7"+
		"D\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\7:\2\2\u00a1\u00a2\5\16\b\2\u00a2"+
		"\u00a3\7;\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a8\5*\26\2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\r\3"+
		"\2\2\2\u00a9\u00ac\5\20\t\2\u00aa\u00ac\5\22\n\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\5 \21"+
		"\2\u00af\u00b0\5\24\13\2\u00b0\u00b6\3\2\2\2\u00b1\u00b2\5\24\13\2\u00b2"+
		"\u00b3\5 \21\2\u00b3\u00b4\5\22\n\2\u00b4\u00b6\3\2\2\2\u00b5\u00ad\3"+
		"\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\21\3\2\2\2\u00b7\u00b8\5\26\f\2\u00b8"+
		"\u00b9\5\22\n\2\u00b9\u00c2\3\2\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\5"+
		"\22\n\2\u00bc\u00c2\3\2\2\2\u00bd\u00be\5\36\20\2\u00be\u00bf\5\24\13"+
		"\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00ba"+
		"\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\23\3\2\2\2\u00c3"+
		"\u00c4\5\26\f\2\u00c4\u00c5\5\24\13\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7"+
		"\5\"\22\2\u00c7\u00c8\5\24\13\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\3\2\2"+
		"\2\u00ca\u00c3\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\25"+
		"\3\2\2\2\u00cc\u00d0\5\30\r\2\u00cd\u00d0\5\32\16\2\u00ce\u00d0\5\34\17"+
		"\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\27"+
		"\3\2\2\2\u00d1\u00d2\7C\2\2\u00d2\u00d4\78\2\2\u00d3\u00d5\5(\25\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\79"+
		"\2\2\u00d7\u00d8\7:\2\2\u00d8\u00d9\7\f\2\2\u00d9\u00da\7;\2\2\u00da\31"+
		"\3\2\2\2\u00db\u00dc\7D\2\2\u00dc\u00de\78\2\2\u00dd\u00df\5(\25\2\u00de"+
		"\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\79"+
		"\2\2\u00e1\u00e2\7:\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\7;\2\2\u00e4\33"+
		"\3\2\2\2\u00e5\u00e6\7\r\2\2\u00e6\u00e8\78\2\2\u00e7\u00e9\5(\25\2\u00e8"+
		"\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\79"+
		"\2\2\u00eb\u00ec\7:\2\2\u00ec\u00ed\7\f\2\2\u00ed\u00ee\7;\2\2\u00ee\35"+
		"\3\2\2\2\u00ef\u00f0\7\16\2\2\u00f0\u00f1\78\2\2\u00f1\u00f2\79\2\2\u00f2"+
		"\u00f3\7:\2\2\u00f3\u00f4\7\f\2\2\u00f4\u00f5\7;\2\2\u00f5\37\3\2\2\2"+
		"\u00f6\u00f7\7\13\2\2\u00f7\u00f8\78\2\2\u00f8\u00f9\79\2\2\u00f9\u00fa"+
		"\7:\2\2\u00fa\u00fb\7\f\2\2\u00fb\u00fc\7;\2\2\u00fc!\3\2\2\2\u00fd\u00fe"+
		"\t\2\2\2\u00fe\u00ff\5$\23\2\u00ff\u0100\7@\2\2\u0100\u0102\5T+\2\u0101"+
		"\u0103\5&\24\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\7>\2\2\u0105#\3\2\2\2\u0106\u0107\t\3\2\2\u0107\u0108"+
		"\7?\2\2\u0108\u010b\5$\23\2\u0109\u010b\t\3\2\2\u010a\u0106\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b%\3\2\2\2\u010c\u010d\7\67\2\2\u010d\u010e\5x=\2\u010e"+
		"\'\3\2\2\2\u010f\u0110\5*\26\2\u0110\u0111\7@\2\2\u0111\u0112\5T+\2\u0112"+
		"\u0113\7>\2\2\u0113\u0114\5(\25\2\u0114\u011a\3\2\2\2\u0115\u0116\5*\26"+
		"\2\u0116\u0117\7@\2\2\u0117\u0118\5T+\2\u0118\u011a\3\2\2\2\u0119\u010f"+
		"\3\2\2\2\u0119\u0115\3\2\2\2\u011a)\3\2\2\2\u011b\u011c\7D\2\2\u011c\u011d"+
		"\7?\2\2\u011d\u0120\5*\26\2\u011e\u0120\7D\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120+\3\2\2\2\u0121\u012b\5.\30\2\u0122\u012b\5\60\31"+
		"\2\u0123\u012b\5\64\33\2\u0124\u012b\58\35\2\u0125\u012b\5:\36\2\u0126"+
		"\u012b\5<\37\2\u0127\u012b\5F$\2\u0128\u012b\5@!\2\u0129\u012b\5> \2\u012a"+
		"\u0121\3\2\2\2\u012a\u0122\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0124\3\2"+
		"\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b-\3\2\2\2\u012c\u012d\t\2\2\2"+
		"\u012d\u012e\5*\26\2\u012e\u012f\7@\2\2\u012f\u0131\5T+\2\u0130\u0132"+
		"\5&\24\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7>\2\2\u0134/\3\2\2\2\u0135\u0136\5\62\32\2\u0136\u0137\7\67\2"+
		"\2\u0137\u0138\5\\/\2\u0138\u0139\7>\2\2\u0139\61\3\2\2\2\u013a\u013d"+
		"\5N(\2\u013b\u013d\5J&\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\63\3\2\2\2\u013e\u013f\7\21\2\2\u013f\u0140\78\2\2\u0140\u0141\5\\/\2"+
		"\u0141\u0142\79\2\2\u0142\u0143\5F$\2\u0143\u0144\5\66\34\2\u0144\65\3"+
		"\2\2\2\u0145\u0146\7\22\2\2\u0146\u0147\78\2\2\u0147\u0148\5\\/\2\u0148"+
		"\u0149\79\2\2\u0149\u014a\5F$\2\u014a\u014b\5\66\34\2\u014b\u0150\3\2"+
		"\2\2\u014c\u014d\7\23\2\2\u014d\u0150\5F$\2\u014e\u0150\3\2\2\2\u014f"+
		"\u0145\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014e\3\2\2\2\u0150\67\3\2\2"+
		"\2\u0151\u0152\7\24\2\2\u0152\u0153\78\2\2\u0153\u0154\5N(\2\u0154\u0155"+
		"\7\25\2\2\u0155\u0156\5\\/\2\u0156\u0157\7A\2\2\u0157\u015d\5\\/\2\u0158"+
		"\u0159\7<\2\2\u0159\u015a\7\26\2\2\u015a\u015b\5\\/\2\u015b\u015c\7=\2"+
		"\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0160\79\2\2\u0160\u0161\5F$\2\u01619\3\2\2\2\u0162\u0163"+
		"\7\"\2\2\u0163\u0164\7>\2\2\u0164;\3\2\2\2\u0165\u0166\7#\2\2\u0166\u0167"+
		"\7>\2\2\u0167=\3\2\2\2\u0168\u016a\7!\2\2\u0169\u016b\5\\/\2\u016a\u0169"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7>\2\2\u016d"+
		"?\3\2\2\2\u016e\u0171\5B\"\2\u016f\u0171\5D#\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7>\2\2\u0173A\3\2\2\2\u0174"+
		"\u0175\5\\/\2\u0175\u0176\7\65\2\2\u0176\u0177\7D\2\2\u0177\u0178\78\2"+
		"\2\u0178\u0179\5x=\2\u0179\u017a\79\2\2\u017aC\3\2\2\2\u017b\u017c\7D"+
		"\2\2\u017c\u017d\7\64\2\2\u017d\u017e\5t;\2\u017eE\3\2\2\2\u017f\u0180"+
		"\7:\2\2\u0180\u0181\5H%\2\u0181\u0182\7;\2\2\u0182G\3\2\2\2\u0183\u0184"+
		"\5,\27\2\u0184\u0185\5H%\2\u0185\u0188\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0183\3\2\2\2\u0187\u0186\3\2\2\2\u0188I\3\2\2\2\u0189\u018a\5\\/\2\u018a"+
		"\u018b\5L\'\2\u018bK\3\2\2\2\u018c\u018d\7<\2\2\u018d\u018e\5\\/\2\u018e"+
		"\u018f\7=\2\2\u018f\u0196\3\2\2\2\u0190\u0191\7<\2\2\u0191\u0192\5\\/"+
		"\2\u0192\u0193\7=\2\2\u0193\u0194\5L\'\2\u0194\u0196\3\2\2\2\u0195\u018c"+
		"\3\2\2\2\u0195\u0190\3\2\2\2\u0196M\3\2\2\2\u0197\u019b\7D\2\2\u0198\u019b"+
		"\5P)\2\u0199\u019b\5R*\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u0199\3\2\2\2\u019bO\3\2\2\2\u019c\u019d\5\\/\2\u019d\u019e\7\65\2\2"+
		"\u019e\u019f\7D\2\2\u019fQ\3\2\2\2\u01a0\u01a1\7D\2\2\u01a1\u01a2\7\64"+
		"\2\2\u01a2\u01a3\7C\2\2\u01a3S\3\2\2\2\u01a4\u01a8\5V,\2\u01a5\u01a8\5"+
		"X-\2\u01a6\u01a8\5Z.\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8U\3\2\2\2\u01a9\u01aa\7\32\2\2\u01aa\u01ad\7<\2\2\u01ab"+
		"\u01ae\5X-\2\u01ac\u01ae\5V,\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2"+
		"\u01ae\u01af\3\2\2\2\u01af\u01b0\7?\2\2\u01b0\u01b1\7\3\2\2\u01b1\u01b2"+
		"\7=\2\2\u01b2W\3\2\2\2\u01b3\u01b4\t\4\2\2\u01b4Y\3\2\2\2\u01b5\u01b6"+
		"\7\66\2\2\u01b6\u01b7\7D\2\2\u01b7\u01b9\78\2\2\u01b8\u01ba\5x=\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\79"+
		"\2\2\u01bc[\3\2\2\2\u01bd\u01be\b/\1\2\u01be\u01bf\5^\60\2\u01bf\u01c5"+
		"\3\2\2\2\u01c0\u01c1\f\4\2\2\u01c1\u01c2\t\5\2\2\u01c2\u01c4\5\\/\5\u01c3"+
		"\u01c0\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6]\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\b\60\1\2\u01c9\u01ca"+
		"\5`\61\2\u01ca\u01d0\3\2\2\2\u01cb\u01cc\f\4\2\2\u01cc\u01cd\t\6\2\2\u01cd"+
		"\u01cf\5^\60\5\u01ce\u01cb\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1_\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4"+
		"\b\61\1\2\u01d4\u01d5\5b\62\2\u01d5\u01db\3\2\2\2\u01d6\u01d7\f\4\2\2"+
		"\u01d7\u01d8\t\7\2\2\u01d8\u01da\5b\62\2\u01d9\u01d6\3\2\2\2\u01da\u01dd"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dca\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01df\b\62\1\2\u01df\u01e0\5d\63\2\u01e0\u01e6\3"+
		"\2\2\2\u01e1\u01e2\f\4\2\2\u01e2\u01e3\t\b\2\2\u01e3\u01e5\5d\63\2\u01e4"+
		"\u01e1\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7c\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\b\63\1\2\u01ea\u01eb"+
		"\5f\64\2\u01eb\u01f1\3\2\2\2\u01ec\u01ed\f\4\2\2\u01ed\u01ee\t\t\2\2\u01ee"+
		"\u01f0\5f\64\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2e\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5"+
		"\7)\2\2\u01f5\u01f8\5f\64\2\u01f6\u01f8\5h\65\2\u01f7\u01f4\3\2\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8g\3\2\2\2\u01f9\u01fa\7%\2\2\u01fa\u01fd\5h\65\2\u01fb"+
		"\u01fd\5j\66\2\u01fc\u01f9\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdi\3\2\2\2"+
		"\u01fe\u01ff\b\66\1\2\u01ff\u0200\5l\67\2\u0200\u0208\3\2\2\2\u0201\u0202"+
		"\f\4\2\2\u0202\u0203\7<\2\2\u0203\u0204\5\\/\2\u0204\u0205\7=\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0201\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209k\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c"+
		"\b\67\1\2\u020c\u020d\7D\2\2\u020d\u020e\7\64\2\2\u020e\u0211\5r:\2\u020f"+
		"\u0211\5n8\2\u0210\u020b\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0217\3\2\2"+
		"\2\u0212\u0213\f\5\2\2\u0213\u0214\7\65\2\2\u0214\u0216\5n8\2\u0215\u0212"+
		"\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"m\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021d\5Z.\2\u021b\u021d\5p9\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021do\3\2\2\2\u021e\u0227\5z>\2\u021f"+
		"\u0227\7D\2\2\u0220\u0227\5v<\2\u0221\u0222\78\2\2\u0222\u0223\5\\/\2"+
		"\u0223\u0224\79\2\2\u0224\u0227\3\2\2\2\u0225\u0227\7\20\2\2\u0226\u021e"+
		"\3\2\2\2\u0226\u021f\3\2\2\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2\2\2\u0226"+
		"\u0225\3\2\2\2\u0227q\3\2\2\2\u0228\u022b\7C\2\2\u0229\u022b\5t;\2\u022a"+
		"\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022bs\3\2\2\2\u022c\u022d\7C\2\2\u022d"+
		"\u022f\78\2\2\u022e\u0230\5x=\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2"+
		"\2\u0230\u0231\3\2\2\2\u0231\u0232\79\2\2\u0232u\3\2\2\2\u0233\u0234\7"+
		"D\2\2\u0234\u0236\78\2\2\u0235\u0237\5x=\2\u0236\u0235\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\79\2\2\u0239w\3\2\2\2\u023a\u023b"+
		"\5\\/\2\u023b\u023c\7?\2\2\u023c\u023d\5x=\2\u023d\u0240\3\2\2\2\u023e"+
		"\u0240\5\\/\2\u023f\u023a\3\2\2\2\u023f\u023e\3\2\2\2\u0240y\3\2\2\2\u0241"+
		"\u0246\5\u0080A\2\u0242\u0246\7\b\2\2\u0243\u0246\5\u0082B\2\u0244\u0246"+
		"\7\t\2\2\u0245\u0241\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0244\3\2\2\2\u0246{\3\2\2\2\u0247\u0248\7\32\2\2\u0248\u0249\78\2\2"+
		"\u0249\u024a\5x=\2\u024a\u024b\79\2\2\u024b}\3\2\2\2\u024c\u024d\7\32"+
		"\2\2\u024d\u024e\78\2\2\u024e\u0253\5|?\2\u024f\u0250\7?\2\2\u0250\u0252"+
		"\5|?\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\79"+
		"\2\2\u0257\177\3\2\2\2\u0258\u0259\t\n\2\2\u0259\u0081\3\2\2\2\u025a\u025b"+
		"\t\13\2\2\u025b\u0083\3\2\2\2\60\u008b\u0094\u00a7\u00ab\u00b5\u00c1\u00ca"+
		"\u00cf\u00d4\u00de\u00e8\u0102\u010a\u0119\u011f\u012a\u0131\u013c\u014f"+
		"\u015d\u016a\u0170\u0187\u0195\u019a\u01a7\u01ad\u01b9\u01c5\u01d0\u01db"+
		"\u01e6\u01f1\u01f7\u01fc\u0208\u0210\u0217\u021c\u0226\u022a\u022f\u0236"+
		"\u023f\u0245\u0253";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}