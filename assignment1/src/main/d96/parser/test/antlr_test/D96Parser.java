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
		STRING_LITERAL=7, STATEMENT=8, CONSTRUCTOR=9, DESTRUCTOR=10, CLASS=11, 
		SELF=12, IF=13, ELSEIF=14, ELSE=15, FOREACH=16, IN=17, BY=18, TRUE=19, 
		FALSE=20, NULL=21, ARRAY=22, INT=23, FLOAT=24, BOOLEAN=25, STRING=26, 
		VAL=27, VAR=28, RETURN=29, BREAK=30, CONTINUE=31, ADD=32, SUB=33, MUL=34, 
		DIV=35, REM=36, NOT=37, AND=38, OR=39, NEQ=40, EQUAL=41, GT=42, LTE=43, 
		LT=44, GTE=45, CONCAT=46, STR_EQUAL=47, DOUBCOLON=48, DOT=49, NEW=50, 
		ASSIGN=51, LP=52, RP=53, LCB=54, RCB=55, LSB=56, RSB=57, SEMI=58, COMMA=59, 
		COLON=60, DOLLAR_ID=61, ID=62, UNCLOSE_STRING=63, ILLEGAL_ESCAPE=64, COMMENT=65, 
		WS=66, ERROR_CHAR=67;
	public static final int
		RULE_program = 0, RULE_class_list = 1, RULE_class1 = 2, RULE_inherit_parent = 3, 
		RULE_inside_class = 4, RULE_method = 5, RULE_static_method = 6, RULE_non_static_method = 7, 
		RULE_constructor = 8, RULE_destructor = 9, RULE_attribute = 10, RULE_symmetric_var_exp = 11, 
		RULE_variable_list = 12, RULE_parameter_list = 13, RULE_id_list = 14, 
		RULE_statement = 15, RULE_statement_list = 16, RULE_var_const_declar_stment = 17, 
		RULE_symmetric_var_exp1 = 18, RULE_assign_stment = 19, RULE_lhs_assignment = 20, 
		RULE_index_expression = 21, RULE_index_operators = 22, RULE_scalar_variable = 23, 
		RULE_attribute_access = 24, RULE_static_attribute_access = 25, RULE_if_stment = 26, 
		RULE_else_if = 27, RULE_for_in_stment = 28, RULE_break_stment = 29, RULE_continue_stment = 30, 
		RULE_return_stment = 31, RULE_method_invo_stment = 32, RULE_instance_invok_method = 33, 
		RULE_static_invok_method = 34, RULE_block_stment = 35, RULE_data_type = 36, 
		RULE_array_type = 37, RULE_primitive_type = 38, RULE_class_exp = 39, RULE_exp = 40, 
		RULE_exp1 = 41, RULE_exp2 = 42, RULE_exp3 = 43, RULE_exp4 = 44, RULE_exp5 = 45, 
		RULE_exp6 = 46, RULE_exp7 = 47, RULE_exp8 = 48, RULE_exp9 = 49, RULE_exp10 = 50, 
		RULE_operands = 51, RULE_static_operands = 52, RULE_static_func_call = 53, 
		RULE_func_call = 54, RULE_exp_list = 55, RULE_literal = 56, RULE_indexed_array_literal = 57, 
		RULE_multi_array_literal = 58, RULE_integer_literal = 59, RULE_boolean_literal = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_list", "class1", "inherit_parent", "inside_class", 
			"method", "static_method", "non_static_method", "constructor", "destructor", 
			"attribute", "symmetric_var_exp", "variable_list", "parameter_list", 
			"id_list", "statement", "statement_list", "var_const_declar_stment", 
			"symmetric_var_exp1", "assign_stment", "lhs_assignment", "index_expression", 
			"index_operators", "scalar_variable", "attribute_access", "static_attribute_access", 
			"if_stment", "else_if", "for_in_stment", "break_stment", "continue_stment", 
			"return_stment", "method_invo_stment", "instance_invok_method", "static_invok_method", 
			"block_stment", "data_type", "array_type", "primitive_type", "class_exp", 
			"exp", "exp1", "exp2", "exp3", "exp4", "exp5", "exp6", "exp7", "exp8", 
			"exp9", "exp10", "operands", "static_operands", "static_func_call", "func_call", 
			"exp_list", "literal", "indexed_array_literal", "multi_array_literal", 
			"integer_literal", "boolean_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'statement'", "'Constructor'", 
			"'Destructor'", "'Class'", "'Self'", "'If'", "'Elseif'", "'Else'", "'Foreach'", 
			"'In'", "'By'", "'True'", "'False'", "'Null'", "'Array'", "'Int'", "'Float'", 
			"'Boolean'", "'String'", "'Val'", "'Var'", "'Return'", "'Break'", "'Continue'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'&&'", "'||'", "'!='", "'=='", 
			"'>'", "'<='", "'<'", "'>='", "'+.'", "'==.'", "'::'", "'.'", "'New'", 
			"'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECIMAL_NO_ZERO", "DECIMAL", "HEXA", "OCTAL", "BIN", "FLOAT_LITERAL", 
			"STRING_LITERAL", "STATEMENT", "CONSTRUCTOR", "DESTRUCTOR", "CLASS", 
			"SELF", "IF", "ELSEIF", "ELSE", "FOREACH", "IN", "BY", "TRUE", "FALSE", 
			"NULL", "ARRAY", "INT", "FLOAT", "BOOLEAN", "STRING", "VAL", "VAR", "RETURN", 
			"BREAK", "CONTINUE", "ADD", "SUB", "MUL", "DIV", "REM", "NOT", "AND", 
			"OR", "NEQ", "EQUAL", "GT", "LTE", "LT", "GTE", "CONCAT", "STR_EQUAL", 
			"DOUBCOLON", "DOT", "NEW", "ASSIGN", "LP", "RP", "LCB", "RCB", "LSB", 
			"RSB", "SEMI", "COMMA", "COLON", "DOLLAR_ID", "ID", "UNCLOSE_STRING", 
			"ILLEGAL_ESCAPE", "COMMENT", "WS", "ERROR_CHAR"
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
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
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
			setState(122);
			class_list();
			setState(123);
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

	public static class Class_listContext extends ParserRuleContext {
		public Class1Context class1() {
			return getRuleContext(Class1Context.class,0);
		}
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitClass_list(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_list);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				class1();
				setState(126);
				class_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				class1();
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

	public static class Class1Context extends ParserRuleContext {
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
		public Class1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterClass1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitClass1(this);
		}
	}

	public final Class1Context class1() throws RecognitionException {
		Class1Context _localctx = new Class1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_class1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CLASS);
			setState(132);
			match(ID);
			setState(133);
			inherit_parent();
			setState(134);
			match(LCB);
			setState(135);
			inside_class();
			setState(136);
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
		enterRule(_localctx, 6, RULE_inherit_parent);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(COLON);
				setState(139);
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
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Inside_classContext inside_class() {
			return getRuleContext(Inside_classContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
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
		enterRule(_localctx, 8, RULE_inside_class);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRUCTOR:
			case DESTRUCTOR:
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				method();
				setState(144);
				inside_class();
				}
				break;
			case VAL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				attribute();
				setState(147);
				inside_class();
				}
				break;
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
		public DestructorContext destructor() {
			return getRuleContext(DestructorContext.class,0);
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
		enterRule(_localctx, 10, RULE_method);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				static_method();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				non_static_method();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				constructor();
				}
				break;
			case DESTRUCTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				destructor();
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
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_static_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DOLLAR_ID);
			setState(159);
			match(LP);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(160);
				parameter_list();
				}
			}

			setState(163);
			match(RP);
			setState(164);
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

	public static class Non_static_methodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_non_static_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(LP);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(168);
				parameter_list();
				}
			}

			setState(171);
			match(RP);
			setState(172);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(D96Parser.CONSTRUCTOR, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CONSTRUCTOR);
			setState(175);
			match(LP);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
				parameter_list();
				}
			}

			setState(179);
			match(RP);
			setState(180);
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

	public static class DestructorContext extends ParserRuleContext {
		public TerminalNode DESTRUCTOR() { return getToken(D96Parser.DESTRUCTOR, 0); }
		public TerminalNode LP() { return getToken(D96Parser.LP, 0); }
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_destructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(DESTRUCTOR);
			setState(183);
			match(LP);
			setState(184);
			match(RP);
			setState(185);
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
		public Symmetric_var_expContext symmetric_var_exp() {
			return getRuleContext(Symmetric_var_expContext.class,0);
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
		enterRule(_localctx, 20, RULE_attribute);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				variable_list();
				setState(189);
				match(COLON);
				setState(190);
				data_type();
				setState(191);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(194);
				symmetric_var_exp();
				setState(195);
				match(SEMI);
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

	public static class Symmetric_var_expContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(D96Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(D96Parser.COMMA, i);
		}
		public Symmetric_var_expContext symmetric_var_exp() {
			return getRuleContext(Symmetric_var_expContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
		public TerminalNode COLON() { return getToken(D96Parser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(D96Parser.ASSIGN, 0); }
		public Symmetric_var_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symmetric_var_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterSymmetric_var_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitSymmetric_var_exp(this);
		}
	}

	public final Symmetric_var_expContext symmetric_var_exp() throws RecognitionException {
		Symmetric_var_expContext _localctx = new Symmetric_var_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_symmetric_var_exp);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==DOLLAR_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				match(COMMA);
				setState(201);
				symmetric_var_exp();
				setState(202);
				match(COMMA);
				setState(203);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==DOLLAR_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				match(COLON);
				setState(207);
				data_type();
				setState(208);
				match(ASSIGN);
				setState(209);
				exp();
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
		enterRule(_localctx, 24, RULE_variable_list);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==DOLLAR_ID || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				match(COMMA);
				setState(215);
				variable_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		enterRule(_localctx, 26, RULE_parameter_list);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				id_list();
				setState(220);
				match(COLON);
				setState(221);
				data_type();
				setState(222);
				match(SEMI);
				setState(223);
				parameter_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				id_list();
				setState(226);
				match(COLON);
				setState(227);
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
		enterRule(_localctx, 28, RULE_id_list);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ID);
				setState(232);
				match(COMMA);
				setState(233);
				id_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				var_const_declar_stment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				assign_stment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				if_stment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				for_in_stment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				break_stment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				continue_stment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				block_stment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				method_invo_stment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
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
		enterRule(_localctx, 32, RULE_statement_list);
		try {
			setState(252);
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
			case NULL:
			case ARRAY:
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
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				statement();
				setState(249);
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
		public Symmetric_var_exp1Context symmetric_var_exp1() {
			return getRuleContext(Symmetric_var_exp1Context.class,0);
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
		enterRule(_localctx, 34, RULE_var_const_declar_stment);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				id_list();
				setState(256);
				match(COLON);
				setState(257);
				data_type();
				setState(258);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				symmetric_var_exp1();
				setState(262);
				match(SEMI);
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

	public static class Symmetric_var_exp1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(D96Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(D96Parser.COMMA, i);
		}
		public Symmetric_var_exp1Context symmetric_var_exp1() {
			return getRuleContext(Symmetric_var_exp1Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLON() { return getToken(D96Parser.COLON, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(D96Parser.ASSIGN, 0); }
		public Symmetric_var_exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symmetric_var_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterSymmetric_var_exp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitSymmetric_var_exp1(this);
		}
	}

	public final Symmetric_var_exp1Context symmetric_var_exp1() throws RecognitionException {
		Symmetric_var_exp1Context _localctx = new Symmetric_var_exp1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_symmetric_var_exp1);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(ID);
				setState(267);
				match(COMMA);
				setState(268);
				symmetric_var_exp1();
				setState(269);
				match(COMMA);
				setState(270);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(ID);
				setState(273);
				match(COLON);
				setState(274);
				data_type();
				setState(275);
				match(ASSIGN);
				setState(276);
				exp();
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
		enterRule(_localctx, 38, RULE_assign_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			lhs_assignment();
			setState(281);
			match(ASSIGN);
			setState(282);
			exp();
			setState(283);
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
		enterRule(_localctx, 40, RULE_lhs_assignment);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				scalar_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
		enterRule(_localctx, 42, RULE_index_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			exp();
			setState(290);
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
		enterRule(_localctx, 44, RULE_index_operators);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(LSB);
				setState(293);
				exp();
				setState(294);
				match(RSB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(LSB);
				setState(297);
				exp();
				setState(298);
				match(RSB);
				setState(299);
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
		public TerminalNode DOLLAR_ID() { return getToken(D96Parser.DOLLAR_ID, 0); }
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
		enterRule(_localctx, 46, RULE_scalar_variable);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(DOLLAR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				attribute_access();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
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
		enterRule(_localctx, 48, RULE_attribute_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			exp();
			setState(310);
			match(DOT);
			setState(311);
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
		enterRule(_localctx, 50, RULE_static_attribute_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(ID);
			setState(314);
			match(DOUBCOLON);
			setState(315);
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
		enterRule(_localctx, 52, RULE_if_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(IF);
			setState(318);
			match(LP);
			setState(319);
			exp();
			setState(320);
			match(RP);
			setState(321);
			block_stment();
			setState(322);
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
		enterRule(_localctx, 54, RULE_else_if);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSEIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(ELSEIF);
				setState(325);
				match(LP);
				setState(326);
				exp();
				setState(327);
				match(RP);
				setState(328);
				block_stment();
				setState(329);
				else_if();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(ELSE);
				setState(332);
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
			case NULL:
			case ARRAY:
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
			case DOLLAR_ID:
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
		public List<TerminalNode> DOT() { return getTokens(D96Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(D96Parser.DOT, i);
		}
		public TerminalNode RP() { return getToken(D96Parser.RP, 0); }
		public Block_stmentContext block_stment() {
			return getRuleContext(Block_stmentContext.class,0);
		}
		public TerminalNode BY() { return getToken(D96Parser.BY, 0); }
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
		enterRule(_localctx, 56, RULE_for_in_stment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(FOREACH);
			setState(337);
			match(LP);
			setState(338);
			scalar_variable();
			setState(339);
			match(IN);
			setState(340);
			exp();
			setState(341);
			match(DOT);
			setState(342);
			match(DOT);
			setState(343);
			exp();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(344);
				match(BY);
				setState(345);
				exp();
				}
			}

			setState(348);
			match(RP);
			setState(349);
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
		enterRule(_localctx, 58, RULE_break_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(BREAK);
			setState(352);
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
		enterRule(_localctx, 60, RULE_continue_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(CONTINUE);
			setState(355);
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
		enterRule(_localctx, 62, RULE_return_stment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(RETURN);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ARRAY) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP) | (1L << DOLLAR_ID) | (1L << ID))) != 0)) {
				{
				setState(358);
				exp();
				}
			}

			setState(361);
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
		enterRule(_localctx, 64, RULE_method_invo_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(363);
				instance_invok_method();
				}
				break;
			case 2:
				{
				setState(364);
				static_invok_method();
				}
				break;
			}
			setState(367);
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
		enterRule(_localctx, 66, RULE_instance_invok_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			exp();
			setState(370);
			match(DOT);
			setState(371);
			match(ID);
			setState(372);
			match(LP);
			setState(373);
			exp_list();
			setState(374);
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
		enterRule(_localctx, 68, RULE_static_invok_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			setState(377);
			match(DOUBCOLON);
			setState(378);
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
		enterRule(_localctx, 70, RULE_block_stment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(LCB);
			setState(381);
			statement_list();
			setState(382);
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
		enterRule(_localctx, 72, RULE_data_type);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				array_type();
				}
				break;
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				primitive_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
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
		enterRule(_localctx, 74, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(ARRAY);
			setState(390);
			match(LSB);
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOLEAN:
			case STRING:
				{
				setState(391);
				primitive_type();
				}
				break;
			case ARRAY:
				{
				setState(392);
				array_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
			match(COMMA);
			setState(396);
			match(DECIMAL_NO_ZERO);
			setState(397);
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
		enterRule(_localctx, 76, RULE_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		public TerminalNode ID() { return getToken(D96Parser.ID, 0); }
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
		enterRule(_localctx, 78, RULE_class_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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

	public static class ExpContext extends ParserRuleContext {
		public List<Exp1Context> exp1() {
			return getRuleContexts(Exp1Context.class);
		}
		public Exp1Context exp1(int i) {
			return getRuleContext(Exp1Context.class,i);
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
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_exp);
		int _la;
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				exp1();
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==CONCAT || _la==STR_EQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(405);
				exp1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public List<Exp2Context> exp2() {
			return getRuleContexts(Exp2Context.class);
		}
		public Exp2Context exp2(int i) {
			return getRuleContext(Exp2Context.class,i);
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
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_exp1);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				exp2(0);
				setState(411);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << EQUAL) | (1L << GT) | (1L << LTE) | (1L << LT) | (1L << GTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				exp2(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				exp2(0);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_exp2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(418);
			exp3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp2);
					setState(420);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(421);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(422);
					exp3(0);
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_exp3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(429);
			exp4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp3);
					setState(431);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(432);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(433);
					exp4(0);
					}
					} 
				}
				setState(438);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_exp4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(440);
			exp5();
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp4);
					setState(442);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(443);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << REM))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(444);
					exp5();
					}
					} 
				}
				setState(449);
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
		enterRule(_localctx, 90, RULE_exp5);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(NOT);
				setState(451);
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
			case NULL:
			case ARRAY:
			case SUB:
			case NEW:
			case LP:
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
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
		enterRule(_localctx, 92, RULE_exp6);
		try {
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(SUB);
				setState(456);
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
			case NULL:
			case ARRAY:
			case NEW:
			case LP:
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_exp7, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			exp8(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp7Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp7);
					setState(463);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(464);
					match(LSB);
					setState(465);
					exp();
					setState(466);
					match(RSB);
					}
					} 
				}
				setState(472);
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

	public static class Exp8Context extends ParserRuleContext {
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_exp8, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(474);
			exp9();
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp8Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp8);
					setState(476);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(477);
					match(DOT);
					setState(478);
					exp9();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public List<Exp10Context> exp10() {
			return getRuleContexts(Exp10Context.class);
		}
		public Exp10Context exp10(int i) {
			return getRuleContext(Exp10Context.class,i);
		}
		public TerminalNode DOUBCOLON() { return getToken(D96Parser.DOUBCOLON, 0); }
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
		enterRule(_localctx, 98, RULE_exp9);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				exp10();
				setState(485);
				match(DOUBCOLON);
				setState(486);
				exp10();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				exp10();
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

	public static class Exp10Context extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(D96Parser.NEW, 0); }
		public Exp10Context exp10() {
			return getRuleContext(Exp10Context.class,0);
		}
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public Exp10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).enterExp10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof D96Listener ) ((D96Listener)listener).exitExp10(this);
		}
	}

	public final Exp10Context exp10() throws RecognitionException {
		Exp10Context _localctx = new Exp10Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp10);
		try {
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(NEW);
				setState(492);
				exp10();
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
			case NULL:
			case ARRAY:
			case LP:
			case DOLLAR_ID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
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
		public Static_operandsContext static_operands() {
			return getRuleContext(Static_operandsContext.class,0);
		}
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
		enterRule(_localctx, 102, RULE_operands);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				func_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(499);
				match(LP);
				setState(500);
				exp();
				setState(501);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				match(SELF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				static_operands();
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
		enterRule(_localctx, 104, RULE_static_operands);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(DOLLAR_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
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
		enterRule(_localctx, 106, RULE_static_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(DOLLAR_ID);
			setState(512);
			match(LP);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ARRAY) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP) | (1L << DOLLAR_ID) | (1L << ID))) != 0)) {
				{
				setState(513);
				exp_list();
				}
			}

			setState(516);
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
		enterRule(_localctx, 108, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(ID);
			setState(519);
			match(LP);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_NO_ZERO) | (1L << DECIMAL) | (1L << HEXA) | (1L << OCTAL) | (1L << BIN) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << SELF) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ARRAY) | (1L << SUB) | (1L << NOT) | (1L << NEW) | (1L << LP) | (1L << DOLLAR_ID) | (1L << ID))) != 0)) {
				{
				setState(520);
				exp_list();
				}
			}

			setState(523);
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
		enterRule(_localctx, 110, RULE_exp_list);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				exp();
				setState(526);
				match(COMMA);
				setState(527);
				exp_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				exp();
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
		public Indexed_array_literalContext indexed_array_literal() {
			return getRuleContext(Indexed_array_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(D96Parser.NULL, 0); }
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
		enterRule(_localctx, 112, RULE_literal);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_NO_ZERO:
			case DECIMAL:
			case HEXA:
			case OCTAL:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				integer_literal();
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(FLOAT_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				boolean_literal();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(STRING_LITERAL);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 5);
				{
				setState(536);
				indexed_array_literal();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(537);
				match(NULL);
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
		enterRule(_localctx, 114, RULE_indexed_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(ARRAY);
			setState(541);
			match(LP);
			setState(542);
			exp_list();
			setState(543);
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
		enterRule(_localctx, 116, RULE_multi_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(ARRAY);
			setState(546);
			match(LP);
			setState(547);
			indexed_array_literal();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(548);
				match(COMMA);
				setState(549);
				indexed_array_literal();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		enterRule(_localctx, 118, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		enterRule(_localctx, 120, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
		case 42:
			return exp2_sempred((Exp2Context)_localctx, predIndex);
		case 43:
			return exp3_sempred((Exp3Context)_localctx, predIndex);
		case 44:
			return exp4_sempred((Exp4Context)_localctx, predIndex);
		case 47:
			return exp7_sempred((Exp7Context)_localctx, predIndex);
		case 48:
			return exp8_sempred((Exp8Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp2_sempred(Exp2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp3_sempred(Exp3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp4_sempred(Exp4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp7_sempred(Exp7Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp8_sempred(Exp8Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0234\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099"+
		"\n\6\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b4\n\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00c8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00d6\n\r\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\20\3\20\3\20\3\20\5\20\u00ee"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f9\n\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u010b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0119\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
		"\u0122\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0130\n\30\3\31\3\31\3\31\3\31\5\31\u0136\n\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0151\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015d\n\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\5!\u016a\n!\3!\3!\3\"\3\"\5\"\u0170\n\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\5&\u0186\n"+
		"&\3\'\3\'\3\'\3\'\5\'\u018c\n\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3"+
		"*\3*\5*\u019b\n*\3+\3+\3+\3+\3+\5+\u01a2\n+\3,\3,\3,\3,\3,\3,\7,\u01aa"+
		"\n,\f,\16,\u01ad\13,\3-\3-\3-\3-\3-\3-\7-\u01b5\n-\f-\16-\u01b8\13-\3"+
		".\3.\3.\3.\3.\3.\7.\u01c0\n.\f.\16.\u01c3\13.\3/\3/\3/\5/\u01c8\n/\3\60"+
		"\3\60\3\60\5\60\u01cd\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u01d7\n\61\f\61\16\61\u01da\13\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u01e2\n\62\f\62\16\62\u01e5\13\62\3\63\3\63\3\63\3\63\3\63\5\63\u01ec"+
		"\n\63\3\64\3\64\3\64\5\64\u01f1\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u01fc\n\65\3\66\3\66\5\66\u0200\n\66\3\67\3\67\3\67\5"+
		"\67\u0205\n\67\3\67\3\67\38\38\38\58\u020c\n8\38\38\39\39\39\39\39\59"+
		"\u0215\n9\3:\3:\3:\3:\3:\3:\5:\u021d\n:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<"+
		"\7<\u0229\n<\f<\16<\u022c\13<\3<\3<\3=\3=\3>\3>\3>\2\7VXZ`b?\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz\2\f\3\2\35\36\3\2?@\3\2\31\34\3\2\60\61\3\2*/\3\2()\3"+
		"\2\"#\3\2$&\3\2\3\7\3\2\25\26\2\u0237\2|\3\2\2\2\4\u0083\3\2\2\2\6\u0085"+
		"\3\2\2\2\b\u008f\3\2\2\2\n\u0098\3\2\2\2\f\u009e\3\2\2\2\16\u00a0\3\2"+
		"\2\2\20\u00a8\3\2\2\2\22\u00b0\3\2\2\2\24\u00b8\3\2\2\2\26\u00c7\3\2\2"+
		"\2\30\u00d5\3\2\2\2\32\u00db\3\2\2\2\34\u00e7\3\2\2\2\36\u00ed\3\2\2\2"+
		" \u00f8\3\2\2\2\"\u00fe\3\2\2\2$\u010a\3\2\2\2&\u0118\3\2\2\2(\u011a\3"+
		"\2\2\2*\u0121\3\2\2\2,\u0123\3\2\2\2.\u012f\3\2\2\2\60\u0135\3\2\2\2\62"+
		"\u0137\3\2\2\2\64\u013b\3\2\2\2\66\u013f\3\2\2\28\u0150\3\2\2\2:\u0152"+
		"\3\2\2\2<\u0161\3\2\2\2>\u0164\3\2\2\2@\u0167\3\2\2\2B\u016f\3\2\2\2D"+
		"\u0173\3\2\2\2F\u017a\3\2\2\2H\u017e\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2"+
		"\2\2N\u0191\3\2\2\2P\u0193\3\2\2\2R\u019a\3\2\2\2T\u01a1\3\2\2\2V\u01a3"+
		"\3\2\2\2X\u01ae\3\2\2\2Z\u01b9\3\2\2\2\\\u01c7\3\2\2\2^\u01cc\3\2\2\2"+
		"`\u01ce\3\2\2\2b\u01db\3\2\2\2d\u01eb\3\2\2\2f\u01f0\3\2\2\2h\u01fb\3"+
		"\2\2\2j\u01ff\3\2\2\2l\u0201\3\2\2\2n\u0208\3\2\2\2p\u0214\3\2\2\2r\u021c"+
		"\3\2\2\2t\u021e\3\2\2\2v\u0223\3\2\2\2x\u022f\3\2\2\2z\u0231\3\2\2\2|"+
		"}\5\4\3\2}~\7\2\2\3~\3\3\2\2\2\177\u0080\5\6\4\2\u0080\u0081\5\4\3\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0084\5\6\4\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\5\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087\7@\2\2\u0087\u0088"+
		"\5\b\5\2\u0088\u0089\78\2\2\u0089\u008a\5\n\6\2\u008a\u008b\79\2\2\u008b"+
		"\7\3\2\2\2\u008c\u008d\7>\2\2\u008d\u0090\5\36\20\2\u008e\u0090\3\2\2"+
		"\2\u008f\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090\t\3\2\2\2\u0091\u0092"+
		"\5\f\7\2\u0092\u0093\5\n\6\2\u0093\u0099\3\2\2\2\u0094\u0095\5\26\f\2"+
		"\u0095\u0096\5\n\6\2\u0096\u0099\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0091"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a"+
		"\u009f\5\16\b\2\u009b\u009f\5\20\t\2\u009c\u009f\5\22\n\2\u009d\u009f"+
		"\5\24\13\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a3\7"+
		"\66\2\2\u00a2\u00a4\5\34\17\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\67\2\2\u00a6\u00a7\5H%\2\u00a7\17\3"+
		"\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00ab\7\66\2\2\u00aa\u00ac\5\34\17\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\67"+
		"\2\2\u00ae\u00af\5H%\2\u00af\21\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b3"+
		"\7\66\2\2\u00b2\u00b4\5\34\17\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\67\2\2\u00b6\u00b7\5H%\2\u00b7\23"+
		"\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\7\66\2\2\u00ba\u00bb\7\67\2\2"+
		"\u00bb\u00bc\5H%\2\u00bc\25\3\2\2\2\u00bd\u00be\t\2\2\2\u00be\u00bf\5"+
		"\32\16\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\5J&\2\u00c1\u00c2\7<\2\2\u00c2"+
		"\u00c8\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7"+
		"<\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8"+
		"\27\3\2\2\2\u00c9\u00ca\t\3\2\2\u00ca\u00cb\7=\2\2\u00cb\u00cc\5\30\r"+
		"\2\u00cc\u00cd\7=\2\2\u00cd\u00ce\5R*\2\u00ce\u00d6\3\2\2\2\u00cf\u00d0"+
		"\t\3\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\5J&\2\u00d2\u00d3\7\65\2\2\u00d3"+
		"\u00d4\5R*\2\u00d4\u00d6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cf\3\2\2"+
		"\2\u00d6\31\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00d9\7=\2\2\u00d9\u00dc"+
		"\5\32\16\2\u00da\u00dc\t\3\2\2\u00db\u00d7\3\2\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\33\3\2\2\2\u00dd\u00de\5\36\20\2\u00de\u00df\7>\2\2\u00df\u00e0"+
		"\5J&\2\u00e0\u00e1\7<\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e8\3\2\2\2\u00e3"+
		"\u00e4\5\36\20\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\5J&\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00ea"+
		"\7@\2\2\u00ea\u00eb\7=\2\2\u00eb\u00ee\5\36\20\2\u00ec\u00ee\7@\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\37\3\2\2\2\u00ef\u00f9\5$\23"+
		"\2\u00f0\u00f9\5(\25\2\u00f1\u00f9\5\66\34\2\u00f2\u00f9\5:\36\2\u00f3"+
		"\u00f9\5<\37\2\u00f4\u00f9\5> \2\u00f5\u00f9\5H%\2\u00f6\u00f9\5B\"\2"+
		"\u00f7\u00f9\5@!\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f1"+
		"\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9!\3\2\2\2"+
		"\u00fa\u00fb\5 \21\2\u00fb\u00fc\5\"\22\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff"+
		"\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff#\3\2\2\2\u0100"+
		"\u0101\t\2\2\2\u0101\u0102\5\36\20\2\u0102\u0103\7>\2\2\u0103\u0104\5"+
		"J&\2\u0104\u0105\7<\2\2\u0105\u010b\3\2\2\2\u0106\u0107\t\2\2\2\u0107"+
		"\u0108\5&\24\2\u0108\u0109\7<\2\2\u0109\u010b\3\2\2\2\u010a\u0100\3\2"+
		"\2\2\u010a\u0106\3\2\2\2\u010b%\3\2\2\2\u010c\u010d\7@\2\2\u010d\u010e"+
		"\7=\2\2\u010e\u010f\5&\24\2\u010f\u0110\7=\2\2\u0110\u0111\5R*\2\u0111"+
		"\u0119\3\2\2\2\u0112\u0113\7@\2\2\u0113\u0114\7>\2\2\u0114\u0115\5J&\2"+
		"\u0115\u0116\7\65\2\2\u0116\u0117\5R*\2\u0117\u0119\3\2\2\2\u0118\u010c"+
		"\3\2\2\2\u0118\u0112\3\2\2\2\u0119\'\3\2\2\2\u011a\u011b\5*\26\2\u011b"+
		"\u011c\7\65\2\2\u011c\u011d\5R*\2\u011d\u011e\7<\2\2\u011e)\3\2\2\2\u011f"+
		"\u0122\5\60\31\2\u0120\u0122\5,\27\2\u0121\u011f\3\2\2\2\u0121\u0120\3"+
		"\2\2\2\u0122+\3\2\2\2\u0123\u0124\5R*\2\u0124\u0125\5.\30\2\u0125-\3\2"+
		"\2\2\u0126\u0127\7:\2\2\u0127\u0128\5R*\2\u0128\u0129\7;\2\2\u0129\u0130"+
		"\3\2\2\2\u012a\u012b\7:\2\2\u012b\u012c\5R*\2\u012c\u012d\7;\2\2\u012d"+
		"\u012e\5.\30\2\u012e\u0130\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u012a\3\2"+
		"\2\2\u0130/\3\2\2\2\u0131\u0136\7?\2\2\u0132\u0136\7@\2\2\u0133\u0136"+
		"\5\62\32\2\u0134\u0136\5\64\33\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\61\3\2\2\2\u0137\u0138"+
		"\5R*\2\u0138\u0139\7\63\2\2\u0139\u013a\7@\2\2\u013a\63\3\2\2\2\u013b"+
		"\u013c\7@\2\2\u013c\u013d\7\62\2\2\u013d\u013e\7?\2\2\u013e\65\3\2\2\2"+
		"\u013f\u0140\7\17\2\2\u0140\u0141\7\66\2\2\u0141\u0142\5R*\2\u0142\u0143"+
		"\7\67\2\2\u0143\u0144\5H%\2\u0144\u0145\58\35\2\u0145\67\3\2\2\2\u0146"+
		"\u0147\7\20\2\2\u0147\u0148\7\66\2\2\u0148\u0149\5R*\2\u0149\u014a\7\67"+
		"\2\2\u014a\u014b\5H%\2\u014b\u014c\58\35\2\u014c\u0151\3\2\2\2\u014d\u014e"+
		"\7\21\2\2\u014e\u0151\5H%\2\u014f\u0151\3\2\2\2\u0150\u0146\3\2\2\2\u0150"+
		"\u014d\3\2\2\2\u0150\u014f\3\2\2\2\u01519\3\2\2\2\u0152\u0153\7\22\2\2"+
		"\u0153\u0154\7\66\2\2\u0154\u0155\5\60\31\2\u0155\u0156\7\23\2\2\u0156"+
		"\u0157\5R*\2\u0157\u0158\7\63\2\2\u0158\u0159\7\63\2\2\u0159\u015c\5R"+
		"*\2\u015a\u015b\7\24\2\2\u015b\u015d\5R*\2\u015c\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\67\2\2\u015f\u0160\5H%\2\u0160"+
		";\3\2\2\2\u0161\u0162\7 \2\2\u0162\u0163\7<\2\2\u0163=\3\2\2\2\u0164\u0165"+
		"\7!\2\2\u0165\u0166\7<\2\2\u0166?\3\2\2\2\u0167\u0169\7\37\2\2\u0168\u016a"+
		"\5R*\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\7<\2\2\u016cA\3\2\2\2\u016d\u0170\5D#\2\u016e\u0170\5F$\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7<"+
		"\2\2\u0172C\3\2\2\2\u0173\u0174\5R*\2\u0174\u0175\7\63\2\2\u0175\u0176"+
		"\7@\2\2\u0176\u0177\7\66\2\2\u0177\u0178\5p9\2\u0178\u0179\7\67\2\2\u0179"+
		"E\3\2\2\2\u017a\u017b\7@\2\2\u017b\u017c\7\62\2\2\u017c\u017d\5l\67\2"+
		"\u017dG\3\2\2\2\u017e\u017f\78\2\2\u017f\u0180\5\"\22\2\u0180\u0181\7"+
		"9\2\2\u0181I\3\2\2\2\u0182\u0186\5L\'\2\u0183\u0186\5N(\2\u0184\u0186"+
		"\5P)\2\u0185\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186"+
		"K\3\2\2\2\u0187\u0188\7\30\2\2\u0188\u018b\7:\2\2\u0189\u018c\5N(\2\u018a"+
		"\u018c\5L\'\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018e\7=\2\2\u018e\u018f\7\3\2\2\u018f\u0190\7;\2\2\u0190M"+
		"\3\2\2\2\u0191\u0192\t\4\2\2\u0192O\3\2\2\2\u0193\u0194\7@\2\2\u0194Q"+
		"\3\2\2\2\u0195\u0196\5T+\2\u0196\u0197\t\5\2\2\u0197\u0198\5T+\2\u0198"+
		"\u019b\3\2\2\2\u0199\u019b\5T+\2\u019a\u0195\3\2\2\2\u019a\u0199\3\2\2"+
		"\2\u019bS\3\2\2\2\u019c\u019d\5V,\2\u019d\u019e\t\6\2\2\u019e\u019f\5"+
		"V,\2\u019f\u01a2\3\2\2\2\u01a0\u01a2\5V,\2\u01a1\u019c\3\2\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2U\3\2\2\2\u01a3\u01a4\b,\1\2\u01a4\u01a5\5X-\2\u01a5\u01ab"+
		"\3\2\2\2\u01a6\u01a7\f\4\2\2\u01a7\u01a8\t\7\2\2\u01a8\u01aa\5X-\2\u01a9"+
		"\u01a6\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01acW\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\b-\1\2\u01af\u01b0"+
		"\5Z.\2\u01b0\u01b6\3\2\2\2\u01b1\u01b2\f\4\2\2\u01b2\u01b3\t\b\2\2\u01b3"+
		"\u01b5\5Z.\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2"+
		"\2\u01b6\u01b7\3\2\2\2\u01b7Y\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba"+
		"\b.\1\2\u01ba\u01bb\5\\/\2\u01bb\u01c1\3\2\2\2\u01bc\u01bd\f\4\2\2\u01bd"+
		"\u01be\t\t\2\2\u01be\u01c0\5\\/\2\u01bf\u01bc\3\2\2\2\u01c0\u01c3\3\2"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2[\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01c5\7\'\2\2\u01c5\u01c8\5\\/\2\u01c6\u01c8\5^\60\2\u01c7"+
		"\u01c4\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8]\3\2\2\2\u01c9\u01ca\7#\2\2\u01ca"+
		"\u01cd\5^\60\2\u01cb\u01cd\5`\61\2\u01cc\u01c9\3\2\2\2\u01cc\u01cb\3\2"+
		"\2\2\u01cd_\3\2\2\2\u01ce\u01cf\b\61\1\2\u01cf\u01d0\5b\62\2\u01d0\u01d8"+
		"\3\2\2\2\u01d1\u01d2\f\4\2\2\u01d2\u01d3\7:\2\2\u01d3\u01d4\5R*\2\u01d4"+
		"\u01d5\7;\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d7\u01da\3\2"+
		"\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9a\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01db\u01dc\b\62\1\2\u01dc\u01dd\5d\63\2\u01dd\u01e3\3\2\2\2"+
		"\u01de\u01df\f\4\2\2\u01df\u01e0\7\63\2\2\u01e0\u01e2\5d\63\2\u01e1\u01de"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"c\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\5f\64\2\u01e7\u01e8\7\62\2\2"+
		"\u01e8\u01e9\5f\64\2\u01e9\u01ec\3\2\2\2\u01ea\u01ec\5f\64\2\u01eb\u01e6"+
		"\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ece\3\2\2\2\u01ed\u01ee\7\64\2\2\u01ee"+
		"\u01f1\5f\64\2\u01ef\u01f1\5h\65\2\u01f0\u01ed\3\2\2\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1g\3\2\2\2\u01f2\u01fc\5r:\2\u01f3\u01fc\7@\2\2\u01f4\u01fc\5"+
		"n8\2\u01f5\u01f6\7\66\2\2\u01f6\u01f7\5R*\2\u01f7\u01f8\7\67\2\2\u01f8"+
		"\u01fc\3\2\2\2\u01f9\u01fc\7\16\2\2\u01fa\u01fc\5j\66\2\u01fb\u01f2\3"+
		"\2\2\2\u01fb\u01f3\3\2\2\2\u01fb\u01f4\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fci\3\2\2\2\u01fd\u0200\7?\2\2\u01fe"+
		"\u0200\5l\67\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200k\3\2\2\2"+
		"\u0201\u0202\7?\2\2\u0202\u0204\7\66\2\2\u0203\u0205\5p9\2\u0204\u0203"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7\67\2\2"+
		"\u0207m\3\2\2\2\u0208\u0209\7@\2\2\u0209\u020b\7\66\2\2\u020a\u020c\5"+
		"p9\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\7\67\2\2\u020eo\3\2\2\2\u020f\u0210\5R*\2\u0210\u0211\7=\2\2\u0211"+
		"\u0212\5p9\2\u0212\u0215\3\2\2\2\u0213\u0215\5R*\2\u0214\u020f\3\2\2\2"+
		"\u0214\u0213\3\2\2\2\u0215q\3\2\2\2\u0216\u021d\5x=\2\u0217\u021d\7\b"+
		"\2\2\u0218\u021d\5z>\2\u0219\u021d\7\t\2\2\u021a\u021d\5t;\2\u021b\u021d"+
		"\7\27\2\2\u021c\u0216\3\2\2\2\u021c\u0217\3\2\2\2\u021c\u0218\3\2\2\2"+
		"\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021ds\3"+
		"\2\2\2\u021e\u021f\7\30\2\2\u021f\u0220\7\66\2\2\u0220\u0221\5p9\2\u0221"+
		"\u0222\7\67\2\2\u0222u\3\2\2\2\u0223\u0224\7\30\2\2\u0224\u0225\7\66\2"+
		"\2\u0225\u022a\5t;\2\u0226\u0227\7=\2\2\u0227\u0229\5t;\2\u0228\u0226"+
		"\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b"+
		"\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\67\2\2\u022ew\3\2\2\2"+
		"\u022f\u0230\t\n\2\2\u0230y\3\2\2\2\u0231\u0232\t\13\2\2\u0232{\3\2\2"+
		"\2-\u0083\u008f\u0098\u009e\u00a3\u00ab\u00b3\u00c7\u00d5\u00db\u00e7"+
		"\u00ed\u00f8\u00fe\u010a\u0118\u0121\u012f\u0135\u0150\u015c\u0169\u016f"+
		"\u0185\u018b\u019a\u01a1\u01ab\u01b6\u01c1\u01c7\u01cc\u01d8\u01e3\u01eb"+
		"\u01f0\u01fb\u01ff\u0204\u020b\u0214\u021c\u022a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}