/*
1915991
*/

grammar D96;

@lexer::header {
from lexererr import *
}

options {
	language = Python3;
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
 * 2. Program structure
 */


program: normal_class* program_class normal_class* EOF;

program_class: CLASS PROGRAM LCB inside_class RCB;

inside_class: member* destructor? member* mainfunc member* | member* mainfunc member* destructor? member*;

member: method|attribute;


//----------------------------------------
// METHOD:

method: static_method | nor_method | constructor;


static_method: DOLLAR ID LP parameter_list RP LCB STATEMENT RCB;
nor_method: ID LP parameter_list RP LCB STATEMENT RCB;
constructor: CONSTRUCTOR LP parameter_list RP LCB STATEMENT RCB;
destructor: DESTRUCTOR LP RP LCB STATEMENT RCB;


/*
parameter_list: id_list COLON
statement:
*/


//normal_class: CLASS ID (COLON id_list)? LCB norfunc* RCB;






mainfunc: MAIN LP RP LCB STATEMENT RCB;



PROGRAM: 'Program';
MAIN: 'main';
STATEMENT: 'statement'; //STATEMENT placeholder


/*
------------------Data type
*/


data_type: primitive_type | array_type | class_type;

primitive_type: BOOLEAN | INT | FLOAT | STRING;

array_type: ARRAY LSB primitive_type COMMA INTLIT RSB;

class_type: NEW ID LP id_list RP;

passed_parameter: id_list | num_list;



id_list: ID (COMMA ID)*;
/**
 * Keywords
 */

// Class
CONSTRUCTOR : 'Constructor' ;
DESTRUCTOR: 'Destructor' ;
CLASS: 'Class';


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
STREQUAL: '==.';    //Compare two same strings

//MEMBER CLASS ACCESS
DOUBSEMI: '::';  // Static
DOT: '.';

// OBJECT CREATION
NEW: 'New';


// OTHER
ASSIGN: '=';

//------------------------------------------------------------------
/**
 * LITERAL
 */
integer_literal: DECIMAL | HEXA | OCTAL | BIN ;

DECIMAL: '0'|[1-9][0-9]*;
HEXA: '0x'('0'|[1-9A-F][0-9A-F]*);
OCTAL: '0'('0'|[1-7][0-7]*);
BIN: '0'[b|B]('0'|'1'[01]*);


//--------------------------------------------------------------------
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


ID: [a-zA-Z_][a-zA-Z_0-9]*;






WS: [ \t\b\f\r\n]+ -> skip; // skip spaces, tabs, newlines

ERROR_CHAR: .;
UNCLOSE_STRING: .;
ILLEGAL_ESCAPE: .;

