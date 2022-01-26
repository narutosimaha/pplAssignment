//ID: 1913713
grammar D96;

@lexer::header {
from lexererr import *
}

options {
	language = Python3;
}
program: (class_declare)+ EOF;
/* PARSER */
/* Type */
array_type: ARRAY LSB (typ | array_type) COMMA INT_LIT RSB;
typ: INT | FLOAT | BOOLEAN | STR ;
/*------------------------- Declare --------------------------*/
class_declare: CLASS ID (':' ID | ) LCB (mem_list | ) RCB;
mem_list: mem mem_list| mem;
mem: attr_declare | method_declare;

attr_declare: attr_notarray | attr_array;
attr_notarray: (VAL | VAR) id_list ':' typ (SEMI | ASSIGN expr_list SEMI);
attr_array: (VAL | VAR) id_list ':' array_type (SEMI | ASSIGN array_lst SEMI);
id_list: (ID | STATIC_ID) COMMA id_list | (ID | STATIC_ID);
expr_list: expr_1 COMMA expr_list | expr_1;
array_lst: array COMMA array_lst | array;

method_declare: general_method | constructor_method | destructor_method;
general_method: (ID | STATIC_ID) LP (param_list | ) RP LCB (stmt_list | ) RCB;
param_list: param SEMI param_list | param;
param: param_id_lst ':' (typ | array_type);
param_id_lst: ID COMMA param_id_lst | ID;

constructor_method: CONSTRUCTOR LP (param_list | ) RP LCB (stmt_list | ) RCB;
destructor_method: DESTRUCTOR LP RP LCB (stmt_list | ) RCB;

/* ---------------------- Expression -------------------------*/
expr_1: expr_2 op_string expr_2 | expr_2;
expr_2: expr_3 op_relational expr_3 | expr_3;
expr_3: expr_3 op_logical expr_4 | expr_4;
expr_4: expr_4 op_adding expr_5 | expr_5;
expr_5: expr_5 op_multiplying expr_6 | expr_6;
expr_6: NOT expr_6 | expr_7;
expr_7: SUB expr_7 | expr_8;
expr_8: expr_8 op_index | expr_9;
expr_9: expr_9 INST_ATT_ACCESS expr_10 | expr_9 STAT_ATT_ACCESS expr_10| expr_10;
expr_10: op_new expr_10 | expr_11;
expr_11: LP expr_1 RP | operand;


/*---------------------- Operator -----------------------------*/
op_string: CONCAT_STR | COMP_ESTR;
op_relational: EQUAL | NOT_EQUAL | LT | LTE | GT | GTE;
op_logical: AND | OR;
op_adding: ADD | SUB;
op_multiplying: MUL | DIV | MOD;

op_index: LSB expr_1 RSB op_index| LSB expr_1 RSB;



op_new: NEW ID LP expr_list RP;

/* ----------------------Operand----------------------- */
operand: literal | STATIC_ID | ID | func_call | SELF | array;
literal: INT_LIT | FLOAT_LIT | STRING_LIT | BOOL_LIT;
func_call: instant_method | static_method;
instant_method: ID LP (expr_list | ) RP;
static_method: STATIC_ID LP (expr_list | ) RP;

/*------------------- Statement ----------------------*/
stmt_list: stmt stmt_list | stmt;
stmt: stmt_assign | stmt_if | stmt_forin | stmt_break | stmt_continue | stmt_return | stmt_method_invo | stmt_decl;
/* Variable/constant Declare */
stmt_decl: stmt_delc_array | stmt_delc_noarray;
stmt_delc_noarray: (VAL | VAR) id_list_stmt ':' typ (SEMI | ASSIGN expr_list SEMI);
stmt_delc_array: (VAL | VAR) id_list_stmt ':' array_type (SEMI | ASSIGN array_lst SEMI);
id_list_stmt: ID COMMA id_list_stmt | ID;

/* Assign Statement */
stmt_assign: lhs ASSIGN expr_1 SEMI;
lhs: STATIC_ID | ID | op_index;

/* If Statement */
stmt_if: IF LP expr_1 RP LCB (stmt_list | ) RCB (elif_stmt_list | ) (else_stmt |);
elif_stmt_list: elif_stmt elif_stmt_list | elif_stmt;
elif_stmt: ELSEIF LP expr_1 RP LCB (stmt_list | ) RCB;
else_stmt: ELSE LCB (stmt_list | ) RCB;

/* For/in statement */
stmt_forin: FOREACH LP (ID | STATIC_ID | op_index) IN expr_1 '..' expr_1 (BY expr_1 | ) RP LCB (stmt_list | ) RCB;

/* Break statement */
stmt_break: BREAK SEMI;

/* Continue statement */
stmt_continue: CONTINUE SEMI;

/* Return statement */
stmt_return: RETURN (expr_1 | ) SEMI;

/* Method Invocation statement */
stmt_method_invo: expr_9 SEMI;


/*-------------------------- Array -----------------------*/
array: idx_array | nd_array;

idx_array: ARRAY LP expr_list RP;

nd_array: ARRAY LP array_list RP;
array_list: array COMMA array_list | array;

/* LEXER DECLARE */

/* 3.2. Comments */
COMMENT: '##' .*? '##' -> skip;

/* 3.4. Keyword */
BREAK: 'Break';
CONTINUE: 'Continue';
IF: 'If';
ELSEIF: 'Elseif';
ELSE: 'Else';
FOREACH: 'Foreach';
TRUE: 'True';
FALSE: 'False';
ARRAY: 'Array';
IN: 'In';
INT: 'Int';
FLOAT: 'Float';
BOOLEAN: 'Boolean';
STR: 'String';
RETURN: 'Return';
NULL: 'Null';
CLASS: 'Class';
VAL: 'Val';
VAR: 'Var';
CONSTRUCTOR: 'Constructor';
DESTRUCTOR: 'Destructor';
NEW: 'New';
BY: 'By';
SELF: 'Self';

/* 3.5. Operator */
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
NOT: '!';
AND: '&&';
OR: '||';
EQUAL: '==';
ASSIGN: '=';
NOT_EQUAL: '!=';
LT: '<';    // less than
LTE: '<=';  // less than or equal
GT: '>';    // greater than
GTE: '>=';  // greater than or equal
COMP_ESTR: '==.';   // compare equal string
CONCAT_STR: '+.';
INST_ATT_ACCESS: '.'; // instance attribute access
STAT_ATT_ACCESS: '::'; // static attribute access

/* 3.6. Seperators */
LP: '(';    // left parentheses
RP: ')';    // right parentheses
LSB: '[';   // left square bracket
RSB: ']';   // right square bracket
LCB: '{';   // left curly bracket
RCB: '}';   // right curly bracket
//DOT: '.';
COMMA: ',';
SEMI: ';';  // semicolon

/* 3.7. Literals */
/* 3.7.1. INTERGER */
INT_LIT: (DEC | OCT | HEX | BIN)
    {
        self.text = self.text.replace("_","")
    };
DEC: ([1-9][0-9]*([_]?[0-9]+)*) | '0';
OCT: '0'( ([1-7]+([_]?[0-7]+)*) | '0');
HEX: '0'[xX]( ([1-9A-Fa-f]+([_]?[0-9A-Fa-f]+)*) | '0');
BIN: '0'[bB]( ([1]+([_]?[01]+)*) | '0');

/* 3.7.2. FLOAT */
fragment EXPONENT: [eE] [+-]? DEC;
FLOAT_LIT: DEC (('.' [0-9]+([_]?[0-9]+)* EXPONENT?) | EXPONENT);

/* 3.7.3. BOOLEAN */
BOOL_LIT: TRUE | FALSE;

/* 3.7.4. STRING */
fragment ESCAPE: '\\' ('b'|'f'|'r'|'n'|'t'|'\''|'\\');
fragment STR_CHAR: ESCAPE | ~[\n\r\\"]  | '\'"';
STRING_LIT: '"' STR_CHAR* '"'
{
y = str(self.text)
self.text = y[1:-1]
};

fragment I_ESCAPE: '\\' ~[bfrnt'\\];

/* 3.3. Identifiers */
ID: [A-Za-z_][A-Za-z_0-9]*;
STATIC_ID: '$'[A-Za-z0-9_]+;

WS: [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines

ERROR_CHAR: .
{
raise ErrorToken(self.text)
};

UNCLOSE_STRING: '"' STR_CHAR* ([\b\t\r\n\f] | EOF)
{
text = str(self.text)
possible = ['\b', '\t', '\r', '\n', '\f']
if text[-1] in possible:
    raise UncloseString(text[1:-1])
else:
    raise UncloseString(text[1:])
};


ILLEGAL_ESCAPE: '"' STR_CHAR* I_ESCAPE
{
raise IllegalEscape(str(self.text)[1:])
};







