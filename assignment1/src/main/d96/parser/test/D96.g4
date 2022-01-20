/*
1915991
*/

grammar D96;



options {
	language = Java;
}

/*
program: mptype 'main' LB RB LP body? RP EOF;

mptype: INTTYPE | VOIDTYPE;

body: funcall SEMI;

exp: funcall | INTLIT;

funcall: ID LB exp? RB;

INTTYPE: 'int';

VOIDTYPE: 'void';

*/

/**
 *--------------------------- 2. Program structure-----------------------------------
 */
program: normal_class_or_non program_class normal_class_or_non EOF;
normal_class_or_non: normal_classes |  ;
normal_classes: normal_classes normal_class| normal_class;

program_class: CLASS PROGRAM LCB inside_program_class RCB;
normal_class: CLASS ID inherit_parent LCB inside_class RCB;

inherit_parent: COLON id_list | ;


inside_class: inside_program_class | inside_normal_class;

inside_program_class: inside_normal_class mainfunc non_destructor
                      | non_destructor mainfunc inside_normal_class;
inside_normal_class: method inside_normal_class | attribute inside_normal_class | destructor non_destructor |;
non_destructor: method non_destructor | attribute non_destructor | ;



//----------------------------------------
// METHOD:
method: static_method | non_static_method | constructor;
static_method: DOLLAR_ID LP parameter_list? RP LCB STATEMENT RCB;
non_static_method: ID LP parameter_list? RP LCB STATEMENT RCB;
constructor: CONSTRUCTOR LP parameter_list? RP LCB STATEMENT RCB;
destructor: DESTRUCTOR LP RP LCB STATEMENT RCB;
mainfunc: MAIN LP RP LCB STATEMENT RCB;

//----------------------------------------
// ATTRIBUTE:

attribute: (VAL|VAR) variable_list COLON data_type initialization? SEMI;

variable_list: (ID | DOLLAR_ID) COMMA variable_list|  (ID | DOLLAR_ID);
initialization: ASSIGN exp_list;

/*
express_list;
*/












parameter_list: id_list COLON data_type SEMI parameter_list| id_list COLON data_type;

id_list: ID COMMA id_list | ID;


/**
 * ---------------------------6. Statement---------------------------------------
 */
statement: var_const_declar_stment
           | assign_stment
           | if_stment
           | for_in_stment
           | break_stment
           | continue_stment
           | block_stment
           | method_invo_stment
           | return_stment;

var_const_declar_stment: (VAL|VAR) id_list COLON data_type initialization? SEMI;


assign_stment: lhs_assignment ASSIGN exp SEMI;
lhs_assignment: scalar_variable | index_expression;


if_stment: IF LP exp RP block_stment else_if;
else_if: ELSEIF LP exp RP block_stment else_if | ELSE block_stment | ;

for_in_stment: FOREACH LP scalar_variable IN exp DOTDOT exp (LSB BY exp RSB)? RP block_stment;

break_stment: BREAK SEMI;

continue_stment: CONTINUE SEMI;

return_stment: RETURN exp? SEMI;

method_invo_stment: (instance_invok_method | static_invok_method) SEMI;
instance_invok_method: exp DOT ID LP exp_list RP;
static_invok_method: ID DOUBCOLON static_func_call;



block_stment: LCB statement_list RCB;
statement_list:statement statement_list|;


//--------PlaceHolder-------------

index_expression : exp index_operators;
index_operators :  LSB exp RSB
                   | LSB exp RSB index_operators;

scalar_variable: ID | attribute_access | static_attribute_access;      // May add more
attribute_access: exp DOT ID;
static_attribute_access: ID DOUBCOLON DOLLAR_ID;

/**
 * ---------------------------4. TYPE AND VALUE---------------------------------------
 */
data_type: array_type | primitive_type | class_exp;
array_type: ARRAY LSB (primitive_type | array_type) COMMA DECIMAL_NO_ZERO RSB;
primitive_type: BOOLEAN | INT | FLOAT | STRING;
class_exp: NEW ID LP exp_list? RP;





/**
 * ---------------------------5. Expressions---------------------------------------
 */


exp: exp (CONCAT|STR_EQUAL) exp |exp1;
exp1: exp1 (EQUAL|NEQ|LT|GT|LTE|GTE) exp1 | exp2;
exp2: exp2 (AND | OR) exp3 | exp3;
exp3: exp3 ( ADD | SUB ) exp4 | exp4;
exp4: exp4 (MUL|DIV|REM) exp5 | exp5;
exp5: NOT exp5 | exp6;
exp6: SUB exp6 | exp7;
exp7: exp7 LSB exp RSB | exp8;
//index_operators: LSB exp RSB | LSB exp RSB index_operators;
exp8: exp8 DOT exp9  | ID DOUBCOLON static_operands |exp9;
exp9: class_exp |operands;







operands
	: literal
	| ID
	| func_call
	| LP exp RP
	| SELF
	;

static_operands: DOLLAR_ID | static_func_call;
static_func_call:DOLLAR_ID LP exp_list? RP;
func_call: ID LP exp_list? RP;
exp_list: exp COMMA exp_list |exp;




/**
 * ---------------------------3.Lexical structure------------------------------
 */

//  -------3.7. LITERAL---------

// ---5-6---

literal:integer_literal | FLOAT_LITERAL | boolean_literal | STRING_LITERAL;

indexed_array_literal: ARRAY LP exp_list RP;

/*
sametype_list: integer_literal (COMMA integer_literal)*
               | FLOAT_LITERAL (COMMA FLOAT_LITERAL)*
               | STRING_LITERAL (COMMA STRING_LITERAL)*
               | boolean_literal (COMMA boolean_literal)*
               ;
*/

multi_array_literal: ARRAY LP indexed_array_literal (COMMA indexed_array_literal)* RP;

// ---1-4---
integer_literal: DECIMAL_NO_ZERO | DECIMAL | HEXA | OCTAL | BIN ;

//DECIMAL_NO_ZERO:[1-9] [0-9]* ('_' [0-9]+)* { self.text = self.text.replace("_", "") };
DECIMAL_NO_ZERO:[1-9] [0-9]* ('_' [0-9]+)* ;
DECIMAL: '0'|[1-9][0-9]*;

//HEXA: '0x'('0'|[1-9A-F][0-9A-F]* ('_'[0-9A-F]+)* { self.text = self.text.replace("_", "") });
HEXA: '0x'('0'|[1-9A-F][0-9A-F]*('_'[0-9A-F]+)*);

//OCTAL: '0'('0'|[1-7][0-7]*('_'[0-7]+)*) ;
OCTAL: '0'('0'|[1-7][0-7]*('_'[0-7]+)*);

BIN: '0'[b|B]('0'|'1'[01]*('_'[01]+)*);

FLOAT_LITERAL:INTEGER_PART DECIMAL_PART EXPONENT_PART | INTEGER_PART DECIMAL_PART | DECIMAL_PART EXPONENT_PART | INTEGER_PART EXPONENT_PART ;
fragment INTEGER_PART: '0'|[1-9][0-9]*('_'[0-9]+)*;
fragment EXPONENT_PART: [eE][-+]? INTEGER_PART;
fragment DECIMAL_PART: '.'([0-9]+'_')*[0-9]*[1-9];   // Propaly will be fixed

boolean_literal: TRUE | FALSE;

STRING_LITERAL: '"' STR_CHAR* '"';
/*              {
		            y = str(self.text)
		            self.text = y[1:-1]
	           }
	           ;
*/
fragment STR_CHAR: ~[\b\t\n\f\r"'\\] | ESC_SEQ | '\'"';
fragment ESC_SEQ: '\\' [btnfr'\\];

//--------------------------------------------------------------------

/**
 * Ulities
 */

PROGRAM: 'Program';
MAIN: 'main';
STATEMENT: 'statement'; //STATEMENT placeholder



/**
 * Keywords
 */

// Class
CONSTRUCTOR : 'Constructor' ;
DESTRUCTOR: 'Destructor' ;
CLASS: 'Class';
SELF: 'Self';


// Flow keywork
IF: 'If' ;
ELSEIF  : 'Elseif' ;
ELSE  : 'Else' ;

// Loop keywork
FOREACH: 'Foreach';
IN: 'In';
BY: 'By';

// Value
TRUE: 'True';
FALSE: 'False';
NULL: 'Null';

// TYPE
ARRAY: 'Array';
INT: 'Int';
FLOAT: 'Float';
BOOLEAN: 'Boolean';
STRING: 'String';

// DECLARATION
VAL: 'Val';    // Inmutable
VAR: 'Var';  //Mutable

// STOP STATEMENT
RETURN: 'Return';
BREAK: 'Break';
CONTINUE: 'Continue';



/**
 * Operators
 */

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
REM: '%';

// BOOLEAN
NOT: '!';
AND: '&&';
OR: '||';


// RELATIONAL
NEQ: '!=';
EQUAL: '==';
GT : '>' ;
LTE: '<=';
LT : '<' ;
GTE: '>=';

// STRING
CONCAT: '+.';
STR_EQUAL: '==.';    //Compare two same strings

//MEMBER CLASS ACCESS
DOUBCOLON: '::';  // Static
DOT: '.';

// OBJECT CREATION
NEW: 'New';


// OTHER
ASSIGN: '=';





/**
 * Special Characters
 * Please search name for characters here
 * https://www.compart.com
*/

LP: '('; // Left Parenthesis
RP: ')'; // Right Parenthesis
LCB: '{'; // Left Curly Bracket
RCB: '}'; // Right Curly Bracket

LSB: '['; // Left Square Bracket
RSB: ']'; // Right Square Bracket

SEMI: ';'; // Semicolon
COMMA: ','; // Comma
COLON: ':'; // Colon
DOTDOT: '..'; // Dot Dot should be before Dot

DOLLAR: '$'; // Dollar sign

DOLLAR_ID: '$'[a-zA-Z0-9_]+;
ID: [a-zA-Z_][a-zA-Z_0-9]*;



UNCLOSE_STRING: '"' STR_CHAR* ( [\n\f\r] | EOF );
/*	{
		y = str(self.text)
		possible = ['\b', '\t', '\n', '\f', '\r', '"', "'", '\\']
		if y[-1] in possible:
			raise UncloseString(y[1:-1])
		else:
			raise UncloseString(y[1:])
	}
	;
*/

ILLEGAL_ESCAPE: '"' STR_CHAR* ESC_ILLEGAL;
/*
	{
		y = str(self.text)
		raise IllegalEscape(y[1:])
	}
	;
*/
fragment ESC_ILLEGAL: '\\' ~[btnfr'\\]  ;




// Skip comments
COMMENT: '##' .*? '##' -> skip;

WS: [ \t\b\f\r\n]+ -> skip; // skip spaces, tabs, newlines

ERROR_CHAR: .;
/*	{
		raise ErrorToken(self.text)
	}
	;
*/