# Generated from main/d96/parser/D96.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E")
        buf.write("\u0234\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31")
        buf.write("\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36")
        buf.write("\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t")
        buf.write("&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4")
        buf.write("/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t\64")
        buf.write("\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t")
        buf.write(";\4<\t<\4=\t=\4>\t>\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\u0084")
        buf.write("\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\u0090")
        buf.write("\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099\n\6\3\7\3\7")
        buf.write("\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3")
        buf.write("\b\3\b\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\3\t\3\n\3\n\3")
        buf.write("\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13")
        buf.write("\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f")
        buf.write("\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d6")
        buf.write("\n\r\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\3\17\3\17")
        buf.write("\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3")
        buf.write("\20\3\20\3\20\3\20\5\20\u00ee\n\20\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\5\21\u00f9\n\21\3\22\3\22\3")
        buf.write("\22\3\22\5\22\u00ff\n\22\3\23\3\23\3\23\3\23\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\23\5\23\u010b\n\23\3\24\3\24\3\24\3")
        buf.write("\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0119")
        buf.write("\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0122\n")
        buf.write("\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30")
        buf.write("\3\30\3\30\5\30\u0130\n\30\3\31\3\31\3\31\3\31\5\31\u0136")
        buf.write("\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34")
        buf.write("\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35")
        buf.write("\3\35\3\35\3\35\3\35\5\35\u0151\n\35\3\36\3\36\3\36\3")
        buf.write("\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015d\n\36\3\36")
        buf.write("\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u016a\n!\3")
        buf.write("!\3!\3\"\3\"\5\"\u0170\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3")
        buf.write("#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\5&\u0186\n&\3\'\3\'")
        buf.write("\3\'\3\'\5\'\u018c\n\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*")
        buf.write("\3*\3*\3*\3*\5*\u019b\n*\3+\3+\3+\3+\3+\5+\u01a2\n+\3")
        buf.write(",\3,\3,\3,\3,\3,\7,\u01aa\n,\f,\16,\u01ad\13,\3-\3-\3")
        buf.write("-\3-\3-\3-\7-\u01b5\n-\f-\16-\u01b8\13-\3.\3.\3.\3.\3")
        buf.write(".\3.\7.\u01c0\n.\f.\16.\u01c3\13.\3/\3/\3/\5/\u01c8\n")
        buf.write("/\3\60\3\60\3\60\5\60\u01cd\n\60\3\61\3\61\3\61\3\61\3")
        buf.write("\61\3\61\3\61\3\61\7\61\u01d7\n\61\f\61\16\61\u01da\13")
        buf.write("\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u01e2\n\62\f\62")
        buf.write("\16\62\u01e5\13\62\3\63\3\63\3\63\3\63\3\63\5\63\u01ec")
        buf.write("\n\63\3\64\3\64\3\64\5\64\u01f1\n\64\3\65\3\65\3\65\3")
        buf.write("\65\3\65\3\65\3\65\3\65\3\65\5\65\u01fc\n\65\3\66\3\66")
        buf.write("\5\66\u0200\n\66\3\67\3\67\3\67\5\67\u0205\n\67\3\67\3")
        buf.write("\67\38\38\38\58\u020c\n8\38\38\39\39\39\39\39\59\u0215")
        buf.write("\n9\3:\3:\3:\3:\3:\3:\5:\u021d\n:\3;\3;\3;\3;\3;\3<\3")
        buf.write("<\3<\3<\3<\7<\u0229\n<\f<\16<\u022c\13<\3<\3<\3=\3=\3")
        buf.write(">\3>\3>\2\7VXZ`b?\2\4\6\b\n\f\16\20\22\24\26\30\32\34")
        buf.write("\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln")
        buf.write("prtvxz\2\f\3\2\35\36\3\2?@\3\2\31\34\3\2\60\61\3\2*/\3")
        buf.write("\2()\3\2\"#\3\2$&\3\2\3\7\3\2\25\26\2\u0237\2|\3\2\2\2")
        buf.write("\4\u0083\3\2\2\2\6\u0085\3\2\2\2\b\u008f\3\2\2\2\n\u0098")
        buf.write("\3\2\2\2\f\u009e\3\2\2\2\16\u00a0\3\2\2\2\20\u00a8\3\2")
        buf.write("\2\2\22\u00b0\3\2\2\2\24\u00b8\3\2\2\2\26\u00c7\3\2\2")
        buf.write("\2\30\u00d5\3\2\2\2\32\u00db\3\2\2\2\34\u00e7\3\2\2\2")
        buf.write("\36\u00ed\3\2\2\2 \u00f8\3\2\2\2\"\u00fe\3\2\2\2$\u010a")
        buf.write("\3\2\2\2&\u0118\3\2\2\2(\u011a\3\2\2\2*\u0121\3\2\2\2")
        buf.write(",\u0123\3\2\2\2.\u012f\3\2\2\2\60\u0135\3\2\2\2\62\u0137")
        buf.write("\3\2\2\2\64\u013b\3\2\2\2\66\u013f\3\2\2\28\u0150\3\2")
        buf.write("\2\2:\u0152\3\2\2\2<\u0161\3\2\2\2>\u0164\3\2\2\2@\u0167")
        buf.write("\3\2\2\2B\u016f\3\2\2\2D\u0173\3\2\2\2F\u017a\3\2\2\2")
        buf.write("H\u017e\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2\2\2N\u0191\3")
        buf.write("\2\2\2P\u0193\3\2\2\2R\u019a\3\2\2\2T\u01a1\3\2\2\2V\u01a3")
        buf.write("\3\2\2\2X\u01ae\3\2\2\2Z\u01b9\3\2\2\2\\\u01c7\3\2\2\2")
        buf.write("^\u01cc\3\2\2\2`\u01ce\3\2\2\2b\u01db\3\2\2\2d\u01eb\3")
        buf.write("\2\2\2f\u01f0\3\2\2\2h\u01fb\3\2\2\2j\u01ff\3\2\2\2l\u0201")
        buf.write("\3\2\2\2n\u0208\3\2\2\2p\u0214\3\2\2\2r\u021c\3\2\2\2")
        buf.write("t\u021e\3\2\2\2v\u0223\3\2\2\2x\u022f\3\2\2\2z\u0231\3")
        buf.write("\2\2\2|}\5\4\3\2}~\7\2\2\3~\3\3\2\2\2\177\u0080\5\6\4")
        buf.write("\2\u0080\u0081\5\4\3\2\u0081\u0084\3\2\2\2\u0082\u0084")
        buf.write("\5\6\4\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084\5")
        buf.write("\3\2\2\2\u0085\u0086\7\r\2\2\u0086\u0087\7@\2\2\u0087")
        buf.write("\u0088\5\b\5\2\u0088\u0089\78\2\2\u0089\u008a\5\n\6\2")
        buf.write("\u008a\u008b\79\2\2\u008b\7\3\2\2\2\u008c\u008d\7>\2\2")
        buf.write("\u008d\u0090\5\36\20\2\u008e\u0090\3\2\2\2\u008f\u008c")
        buf.write("\3\2\2\2\u008f\u008e\3\2\2\2\u0090\t\3\2\2\2\u0091\u0092")
        buf.write("\5\f\7\2\u0092\u0093\5\n\6\2\u0093\u0099\3\2\2\2\u0094")
        buf.write("\u0095\5\26\f\2\u0095\u0096\5\n\6\2\u0096\u0099\3\2\2")
        buf.write("\2\u0097\u0099\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0094")
        buf.write("\3\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a\u009f")
        buf.write("\5\16\b\2\u009b\u009f\5\20\t\2\u009c\u009f\5\22\n\2\u009d")
        buf.write("\u009f\5\24\13\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2")
        buf.write("\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\r\3\2")
        buf.write("\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a3\7\66\2\2\u00a2\u00a4")
        buf.write("\5\34\17\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4")
        buf.write("\u00a5\3\2\2\2\u00a5\u00a6\7\67\2\2\u00a6\u00a7\5H%\2")
        buf.write("\u00a7\17\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\u00ab\7\66")
        buf.write("\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac")
        buf.write("\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\67\2\2\u00ae")
        buf.write("\u00af\5H%\2\u00af\21\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1")
        buf.write("\u00b3\7\66\2\2\u00b2\u00b4\5\34\17\2\u00b3\u00b2\3\2")
        buf.write("\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6")
        buf.write("\7\67\2\2\u00b6\u00b7\5H%\2\u00b7\23\3\2\2\2\u00b8\u00b9")
        buf.write("\7\f\2\2\u00b9\u00ba\7\66\2\2\u00ba\u00bb\7\67\2\2\u00bb")
        buf.write("\u00bc\5H%\2\u00bc\25\3\2\2\2\u00bd\u00be\t\2\2\2\u00be")
        buf.write("\u00bf\5\32\16\2\u00bf\u00c0\7>\2\2\u00c0\u00c1\5J&\2")
        buf.write("\u00c1\u00c2\7<\2\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\t")
        buf.write("\2\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7<\2\2\u00c6\u00c8")
        buf.write("\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8")
        buf.write("\27\3\2\2\2\u00c9\u00ca\t\3\2\2\u00ca\u00cb\7=\2\2\u00cb")
        buf.write("\u00cc\5\30\r\2\u00cc\u00cd\7=\2\2\u00cd\u00ce\5R*\2\u00ce")
        buf.write("\u00d6\3\2\2\2\u00cf\u00d0\t\3\2\2\u00d0\u00d1\7>\2\2")
        buf.write("\u00d1\u00d2\5J&\2\u00d2\u00d3\7\65\2\2\u00d3\u00d4\5")
        buf.write("R*\2\u00d4\u00d6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cf")
        buf.write("\3\2\2\2\u00d6\31\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00d9")
        buf.write("\7=\2\2\u00d9\u00dc\5\32\16\2\u00da\u00dc\t\3\2\2\u00db")
        buf.write("\u00d7\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\33\3\2\2\2\u00dd")
        buf.write("\u00de\5\36\20\2\u00de\u00df\7>\2\2\u00df\u00e0\5J&\2")
        buf.write("\u00e0\u00e1\7<\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e8")
        buf.write("\3\2\2\2\u00e3\u00e4\5\36\20\2\u00e4\u00e5\7>\2\2\u00e5")
        buf.write("\u00e6\5J&\2\u00e6\u00e8\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7")
        buf.write("\u00e3\3\2\2\2\u00e8\35\3\2\2\2\u00e9\u00ea\7@\2\2\u00ea")
        buf.write("\u00eb\7=\2\2\u00eb\u00ee\5\36\20\2\u00ec\u00ee\7@\2\2")
        buf.write("\u00ed\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\37\3\2")
        buf.write("\2\2\u00ef\u00f9\5$\23\2\u00f0\u00f9\5(\25\2\u00f1\u00f9")
        buf.write("\5\66\34\2\u00f2\u00f9\5:\36\2\u00f3\u00f9\5<\37\2\u00f4")
        buf.write("\u00f9\5> \2\u00f5\u00f9\5H%\2\u00f6\u00f9\5B\"\2\u00f7")
        buf.write("\u00f9\5@!\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8")
        buf.write("\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2")
        buf.write("\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3")
        buf.write("\2\2\2\u00f8\u00f7\3\2\2\2\u00f9!\3\2\2\2\u00fa\u00fb")
        buf.write("\5 \21\2\u00fb\u00fc\5\"\22\2\u00fc\u00ff\3\2\2\2\u00fd")
        buf.write("\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3\2\2\2")
        buf.write("\u00ff#\3\2\2\2\u0100\u0101\t\2\2\2\u0101\u0102\5\36\20")
        buf.write("\2\u0102\u0103\7>\2\2\u0103\u0104\5J&\2\u0104\u0105\7")
        buf.write("<\2\2\u0105\u010b\3\2\2\2\u0106\u0107\t\2\2\2\u0107\u0108")
        buf.write("\5&\24\2\u0108\u0109\7<\2\2\u0109\u010b\3\2\2\2\u010a")
        buf.write("\u0100\3\2\2\2\u010a\u0106\3\2\2\2\u010b%\3\2\2\2\u010c")
        buf.write("\u010d\7@\2\2\u010d\u010e\7=\2\2\u010e\u010f\5&\24\2\u010f")
        buf.write("\u0110\7=\2\2\u0110\u0111\5R*\2\u0111\u0119\3\2\2\2\u0112")
        buf.write("\u0113\7@\2\2\u0113\u0114\7>\2\2\u0114\u0115\5J&\2\u0115")
        buf.write("\u0116\7\65\2\2\u0116\u0117\5R*\2\u0117\u0119\3\2\2\2")
        buf.write("\u0118\u010c\3\2\2\2\u0118\u0112\3\2\2\2\u0119\'\3\2\2")
        buf.write("\2\u011a\u011b\5*\26\2\u011b\u011c\7\65\2\2\u011c\u011d")
        buf.write("\5R*\2\u011d\u011e\7<\2\2\u011e)\3\2\2\2\u011f\u0122\5")
        buf.write("\60\31\2\u0120\u0122\5,\27\2\u0121\u011f\3\2\2\2\u0121")
        buf.write("\u0120\3\2\2\2\u0122+\3\2\2\2\u0123\u0124\5R*\2\u0124")
        buf.write("\u0125\5.\30\2\u0125-\3\2\2\2\u0126\u0127\7:\2\2\u0127")
        buf.write("\u0128\5R*\2\u0128\u0129\7;\2\2\u0129\u0130\3\2\2\2\u012a")
        buf.write("\u012b\7:\2\2\u012b\u012c\5R*\2\u012c\u012d\7;\2\2\u012d")
        buf.write("\u012e\5.\30\2\u012e\u0130\3\2\2\2\u012f\u0126\3\2\2\2")
        buf.write("\u012f\u012a\3\2\2\2\u0130/\3\2\2\2\u0131\u0136\7?\2\2")
        buf.write("\u0132\u0136\7@\2\2\u0133\u0136\5\62\32\2\u0134\u0136")
        buf.write("\5\64\33\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2\2\2\u0135")
        buf.write("\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\61\3\2\2\2\u0137")
        buf.write("\u0138\5R*\2\u0138\u0139\7\63\2\2\u0139\u013a\7@\2\2\u013a")
        buf.write("\63\3\2\2\2\u013b\u013c\7@\2\2\u013c\u013d\7\62\2\2\u013d")
        buf.write("\u013e\7?\2\2\u013e\65\3\2\2\2\u013f\u0140\7\17\2\2\u0140")
        buf.write("\u0141\7\66\2\2\u0141\u0142\5R*\2\u0142\u0143\7\67\2\2")
        buf.write("\u0143\u0144\5H%\2\u0144\u0145\58\35\2\u0145\67\3\2\2")
        buf.write("\2\u0146\u0147\7\20\2\2\u0147\u0148\7\66\2\2\u0148\u0149")
        buf.write("\5R*\2\u0149\u014a\7\67\2\2\u014a\u014b\5H%\2\u014b\u014c")
        buf.write("\58\35\2\u014c\u0151\3\2\2\2\u014d\u014e\7\21\2\2\u014e")
        buf.write("\u0151\5H%\2\u014f\u0151\3\2\2\2\u0150\u0146\3\2\2\2\u0150")
        buf.write("\u014d\3\2\2\2\u0150\u014f\3\2\2\2\u01519\3\2\2\2\u0152")
        buf.write("\u0153\7\22\2\2\u0153\u0154\7\66\2\2\u0154\u0155\5\60")
        buf.write("\31\2\u0155\u0156\7\23\2\2\u0156\u0157\5R*\2\u0157\u0158")
        buf.write("\7\63\2\2\u0158\u0159\7\63\2\2\u0159\u015c\5R*\2\u015a")
        buf.write("\u015b\7\24\2\2\u015b\u015d\5R*\2\u015c\u015a\3\2\2\2")
        buf.write("\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7")
        buf.write("\67\2\2\u015f\u0160\5H%\2\u0160;\3\2\2\2\u0161\u0162\7")
        buf.write(" \2\2\u0162\u0163\7<\2\2\u0163=\3\2\2\2\u0164\u0165\7")
        buf.write("!\2\2\u0165\u0166\7<\2\2\u0166?\3\2\2\2\u0167\u0169\7")
        buf.write("\37\2\2\u0168\u016a\5R*\2\u0169\u0168\3\2\2\2\u0169\u016a")
        buf.write("\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7<\2\2\u016c")
        buf.write("A\3\2\2\2\u016d\u0170\5D#\2\u016e\u0170\5F$\2\u016f\u016d")
        buf.write("\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171")
        buf.write("\u0172\7<\2\2\u0172C\3\2\2\2\u0173\u0174\5R*\2\u0174\u0175")
        buf.write("\7\63\2\2\u0175\u0176\7@\2\2\u0176\u0177\7\66\2\2\u0177")
        buf.write("\u0178\5p9\2\u0178\u0179\7\67\2\2\u0179E\3\2\2\2\u017a")
        buf.write("\u017b\7@\2\2\u017b\u017c\7\62\2\2\u017c\u017d\5l\67\2")
        buf.write("\u017dG\3\2\2\2\u017e\u017f\78\2\2\u017f\u0180\5\"\22")
        buf.write("\2\u0180\u0181\79\2\2\u0181I\3\2\2\2\u0182\u0186\5L\'")
        buf.write("\2\u0183\u0186\5N(\2\u0184\u0186\5P)\2\u0185\u0182\3\2")
        buf.write("\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186K\3")
        buf.write("\2\2\2\u0187\u0188\7\30\2\2\u0188\u018b\7:\2\2\u0189\u018c")
        buf.write("\5N(\2\u018a\u018c\5L\'\2\u018b\u0189\3\2\2\2\u018b\u018a")
        buf.write("\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7=\2\2\u018e")
        buf.write("\u018f\7\3\2\2\u018f\u0190\7;\2\2\u0190M\3\2\2\2\u0191")
        buf.write("\u0192\t\4\2\2\u0192O\3\2\2\2\u0193\u0194\7@\2\2\u0194")
        buf.write("Q\3\2\2\2\u0195\u0196\5T+\2\u0196\u0197\t\5\2\2\u0197")
        buf.write("\u0198\5T+\2\u0198\u019b\3\2\2\2\u0199\u019b\5T+\2\u019a")
        buf.write("\u0195\3\2\2\2\u019a\u0199\3\2\2\2\u019bS\3\2\2\2\u019c")
        buf.write("\u019d\5V,\2\u019d\u019e\t\6\2\2\u019e\u019f\5V,\2\u019f")
        buf.write("\u01a2\3\2\2\2\u01a0\u01a2\5V,\2\u01a1\u019c\3\2\2\2\u01a1")
        buf.write("\u01a0\3\2\2\2\u01a2U\3\2\2\2\u01a3\u01a4\b,\1\2\u01a4")
        buf.write("\u01a5\5X-\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\4\2\2\u01a7")
        buf.write("\u01a8\t\7\2\2\u01a8\u01aa\5X-\2\u01a9\u01a6\3\2\2\2\u01aa")
        buf.write("\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2")
        buf.write("\u01acW\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\b-\1\2")
        buf.write("\u01af\u01b0\5Z.\2\u01b0\u01b6\3\2\2\2\u01b1\u01b2\f\4")
        buf.write("\2\2\u01b2\u01b3\t\b\2\2\u01b3\u01b5\5Z.\2\u01b4\u01b1")
        buf.write("\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6")
        buf.write("\u01b7\3\2\2\2\u01b7Y\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9")
        buf.write("\u01ba\b.\1\2\u01ba\u01bb\5\\/\2\u01bb\u01c1\3\2\2\2\u01bc")
        buf.write("\u01bd\f\4\2\2\u01bd\u01be\t\t\2\2\u01be\u01c0\5\\/\2")
        buf.write("\u01bf\u01bc\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3")
        buf.write("\2\2\2\u01c1\u01c2\3\2\2\2\u01c2[\3\2\2\2\u01c3\u01c1")
        buf.write("\3\2\2\2\u01c4\u01c5\7\'\2\2\u01c5\u01c8\5\\/\2\u01c6")
        buf.write("\u01c8\5^\60\2\u01c7\u01c4\3\2\2\2\u01c7\u01c6\3\2\2\2")
        buf.write("\u01c8]\3\2\2\2\u01c9\u01ca\7#\2\2\u01ca\u01cd\5^\60\2")
        buf.write("\u01cb\u01cd\5`\61\2\u01cc\u01c9\3\2\2\2\u01cc\u01cb\3")
        buf.write("\2\2\2\u01cd_\3\2\2\2\u01ce\u01cf\b\61\1\2\u01cf\u01d0")
        buf.write("\5b\62\2\u01d0\u01d8\3\2\2\2\u01d1\u01d2\f\4\2\2\u01d2")
        buf.write("\u01d3\7:\2\2\u01d3\u01d4\5R*\2\u01d4\u01d5\7;\2\2\u01d5")
        buf.write("\u01d7\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d7\u01da\3\2\2\2")
        buf.write("\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9a\3\2\2")
        buf.write("\2\u01da\u01d8\3\2\2\2\u01db\u01dc\b\62\1\2\u01dc\u01dd")
        buf.write("\5d\63\2\u01dd\u01e3\3\2\2\2\u01de\u01df\f\4\2\2\u01df")
        buf.write("\u01e0\7\63\2\2\u01e0\u01e2\5d\63\2\u01e1\u01de\3\2\2")
        buf.write("\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4")
        buf.write("\3\2\2\2\u01e4c\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7")
        buf.write("\5f\64\2\u01e7\u01e8\7\62\2\2\u01e8\u01e9\5f\64\2\u01e9")
        buf.write("\u01ec\3\2\2\2\u01ea\u01ec\5f\64\2\u01eb\u01e6\3\2\2\2")
        buf.write("\u01eb\u01ea\3\2\2\2\u01ece\3\2\2\2\u01ed\u01ee\7\64\2")
        buf.write("\2\u01ee\u01f1\5f\64\2\u01ef\u01f1\5h\65\2\u01f0\u01ed")
        buf.write("\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1g\3\2\2\2\u01f2\u01fc")
        buf.write("\5r:\2\u01f3\u01fc\7@\2\2\u01f4\u01fc\5n8\2\u01f5\u01f6")
        buf.write("\7\66\2\2\u01f6\u01f7\5R*\2\u01f7\u01f8\7\67\2\2\u01f8")
        buf.write("\u01fc\3\2\2\2\u01f9\u01fc\7\16\2\2\u01fa\u01fc\5j\66")
        buf.write("\2\u01fb\u01f2\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fb\u01f4")
        buf.write("\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb")
        buf.write("\u01fa\3\2\2\2\u01fci\3\2\2\2\u01fd\u0200\7?\2\2\u01fe")
        buf.write("\u0200\5l\67\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2")
        buf.write("\u0200k\3\2\2\2\u0201\u0202\7?\2\2\u0202\u0204\7\66\2")
        buf.write("\2\u0203\u0205\5p9\2\u0204\u0203\3\2\2\2\u0204\u0205\3")
        buf.write("\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\7\67\2\2\u0207")
        buf.write("m\3\2\2\2\u0208\u0209\7@\2\2\u0209\u020b\7\66\2\2\u020a")
        buf.write("\u020c\5p9\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c")
        buf.write("\u020d\3\2\2\2\u020d\u020e\7\67\2\2\u020eo\3\2\2\2\u020f")
        buf.write("\u0210\5R*\2\u0210\u0211\7=\2\2\u0211\u0212\5p9\2\u0212")
        buf.write("\u0215\3\2\2\2\u0213\u0215\5R*\2\u0214\u020f\3\2\2\2\u0214")
        buf.write("\u0213\3\2\2\2\u0215q\3\2\2\2\u0216\u021d\5x=\2\u0217")
        buf.write("\u021d\7\b\2\2\u0218\u021d\5z>\2\u0219\u021d\7\t\2\2\u021a")
        buf.write("\u021d\5t;\2\u021b\u021d\7\27\2\2\u021c\u0216\3\2\2\2")
        buf.write("\u021c\u0217\3\2\2\2\u021c\u0218\3\2\2\2\u021c\u0219\3")
        buf.write("\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021ds")
        buf.write("\3\2\2\2\u021e\u021f\7\30\2\2\u021f\u0220\7\66\2\2\u0220")
        buf.write("\u0221\5p9\2\u0221\u0222\7\67\2\2\u0222u\3\2\2\2\u0223")
        buf.write("\u0224\7\30\2\2\u0224\u0225\7\66\2\2\u0225\u022a\5t;\2")
        buf.write("\u0226\u0227\7=\2\2\u0227\u0229\5t;\2\u0228\u0226\3\2")
        buf.write("\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b")
        buf.write("\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d")
        buf.write("\u022e\7\67\2\2\u022ew\3\2\2\2\u022f\u0230\t\n\2\2\u0230")
        buf.write("y\3\2\2\2\u0231\u0232\t\13\2\2\u0232{\3\2\2\2-\u0083\u008f")
        buf.write("\u0098\u009e\u00a3\u00ab\u00b3\u00c7\u00d5\u00db\u00e7")
        buf.write("\u00ed\u00f8\u00fe\u010a\u0118\u0121\u012f\u0135\u0150")
        buf.write("\u015c\u0169\u016f\u0185\u018b\u019a\u01a1\u01ab\u01b6")
        buf.write("\u01c1\u01c7\u01cc\u01d8\u01e3\u01eb\u01f0\u01fb\u01ff")
        buf.write("\u0204\u020b\u0214\u021c\u022a")
        return buf.getvalue()


class D96Parser ( Parser ):

    grammarFileName = "D96.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'statement'", "'Constructor'", "'Destructor'", "'Class'", 
                     "'Self'", "'If'", "'Elseif'", "'Else'", "'Foreach'", 
                     "'In'", "'By'", "'True'", "'False'", "'Null'", "'Array'", 
                     "'Int'", "'Float'", "'Boolean'", "'String'", "'Val'", 
                     "'Var'", "'Return'", "'Break'", "'Continue'", "'+'", 
                     "'-'", "'*'", "'/'", "'%'", "'!'", "'&&'", "'||'", 
                     "'!='", "'=='", "'>'", "'<='", "'<'", "'>='", "'+.'", 
                     "'==.'", "'::'", "'.'", "'New'", "'='", "'('", "')'", 
                     "'{'", "'}'", "'['", "']'", "';'", "','", "':'" ]

    symbolicNames = [ "<INVALID>", "DECIMAL_NO_ZERO", "DECIMAL", "HEXA", 
                      "OCTAL", "BIN", "FLOAT_LITERAL", "STRING_LITERAL", 
                      "STATEMENT", "CONSTRUCTOR", "DESTRUCTOR", "CLASS", 
                      "SELF", "IF", "ELSEIF", "ELSE", "FOREACH", "IN", "BY", 
                      "TRUE", "FALSE", "NULL", "ARRAY", "INT", "FLOAT", 
                      "BOOLEAN", "STRING", "VAL", "VAR", "RETURN", "BREAK", 
                      "CONTINUE", "ADD", "SUB", "MUL", "DIV", "REM", "NOT", 
                      "AND", "OR", "NEQ", "EQUAL", "GT", "LTE", "LT", "GTE", 
                      "CONCAT", "STR_EQUAL", "DOUBCOLON", "DOT", "NEW", 
                      "ASSIGN", "LP", "RP", "LCB", "RCB", "LSB", "RSB", 
                      "SEMI", "COMMA", "COLON", "DOLLAR_ID", "ID", "UNCLOSE_STRING", 
                      "ILLEGAL_ESCAPE", "COMMENT", "WS", "ERROR_CHAR" ]

    RULE_program = 0
    RULE_class_list = 1
    RULE_class1 = 2
    RULE_inherit_parent = 3
    RULE_inside_class = 4
    RULE_method = 5
    RULE_static_method = 6
    RULE_non_static_method = 7
    RULE_constructor = 8
    RULE_destructor = 9
    RULE_attribute = 10
    RULE_symmetric_var_exp = 11
    RULE_variable_list = 12
    RULE_parameter_list = 13
    RULE_id_list = 14
    RULE_statement = 15
    RULE_statement_list = 16
    RULE_var_const_declar_stment = 17
    RULE_symmetric_var_exp1 = 18
    RULE_assign_stment = 19
    RULE_lhs_assignment = 20
    RULE_index_expression = 21
    RULE_index_operators = 22
    RULE_scalar_variable = 23
    RULE_attribute_access = 24
    RULE_static_attribute_access = 25
    RULE_if_stment = 26
    RULE_else_if = 27
    RULE_for_in_stment = 28
    RULE_break_stment = 29
    RULE_continue_stment = 30
    RULE_return_stment = 31
    RULE_method_invo_stment = 32
    RULE_instance_invok_method = 33
    RULE_static_invok_method = 34
    RULE_block_stment = 35
    RULE_data_type = 36
    RULE_array_type = 37
    RULE_primitive_type = 38
    RULE_class_exp = 39
    RULE_exp = 40
    RULE_exp1 = 41
    RULE_exp2 = 42
    RULE_exp3 = 43
    RULE_exp4 = 44
    RULE_exp5 = 45
    RULE_exp6 = 46
    RULE_exp7 = 47
    RULE_exp8 = 48
    RULE_exp9 = 49
    RULE_exp10 = 50
    RULE_operands = 51
    RULE_static_operands = 52
    RULE_static_func_call = 53
    RULE_func_call = 54
    RULE_exp_list = 55
    RULE_literal = 56
    RULE_indexed_array_literal = 57
    RULE_multi_array_literal = 58
    RULE_integer_literal = 59
    RULE_boolean_literal = 60

    ruleNames =  [ "program", "class_list", "class1", "inherit_parent", 
                   "inside_class", "method", "static_method", "non_static_method", 
                   "constructor", "destructor", "attribute", "symmetric_var_exp", 
                   "variable_list", "parameter_list", "id_list", "statement", 
                   "statement_list", "var_const_declar_stment", "symmetric_var_exp1", 
                   "assign_stment", "lhs_assignment", "index_expression", 
                   "index_operators", "scalar_variable", "attribute_access", 
                   "static_attribute_access", "if_stment", "else_if", "for_in_stment", 
                   "break_stment", "continue_stment", "return_stment", "method_invo_stment", 
                   "instance_invok_method", "static_invok_method", "block_stment", 
                   "data_type", "array_type", "primitive_type", "class_exp", 
                   "exp", "exp1", "exp2", "exp3", "exp4", "exp5", "exp6", 
                   "exp7", "exp8", "exp9", "exp10", "operands", "static_operands", 
                   "static_func_call", "func_call", "exp_list", "literal", 
                   "indexed_array_literal", "multi_array_literal", "integer_literal", 
                   "boolean_literal" ]

    EOF = Token.EOF
    DECIMAL_NO_ZERO=1
    DECIMAL=2
    HEXA=3
    OCTAL=4
    BIN=5
    FLOAT_LITERAL=6
    STRING_LITERAL=7
    STATEMENT=8
    CONSTRUCTOR=9
    DESTRUCTOR=10
    CLASS=11
    SELF=12
    IF=13
    ELSEIF=14
    ELSE=15
    FOREACH=16
    IN=17
    BY=18
    TRUE=19
    FALSE=20
    NULL=21
    ARRAY=22
    INT=23
    FLOAT=24
    BOOLEAN=25
    STRING=26
    VAL=27
    VAR=28
    RETURN=29
    BREAK=30
    CONTINUE=31
    ADD=32
    SUB=33
    MUL=34
    DIV=35
    REM=36
    NOT=37
    AND=38
    OR=39
    NEQ=40
    EQUAL=41
    GT=42
    LTE=43
    LT=44
    GTE=45
    CONCAT=46
    STR_EQUAL=47
    DOUBCOLON=48
    DOT=49
    NEW=50
    ASSIGN=51
    LP=52
    RP=53
    LCB=54
    RCB=55
    LSB=56
    RSB=57
    SEMI=58
    COMMA=59
    COLON=60
    DOLLAR_ID=61
    ID=62
    UNCLOSE_STRING=63
    ILLEGAL_ESCAPE=64
    COMMENT=65
    WS=66
    ERROR_CHAR=67

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def class_list(self):
            return self.getTypedRuleContext(D96Parser.Class_listContext,0)


        def EOF(self):
            return self.getToken(D96Parser.EOF, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = D96Parser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 122
            self.class_list()
            self.state = 123
            self.match(D96Parser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Class_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def class1(self):
            return self.getTypedRuleContext(D96Parser.Class1Context,0)


        def class_list(self):
            return self.getTypedRuleContext(D96Parser.Class_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_class_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClass_list" ):
                return visitor.visitClass_list(self)
            else:
                return visitor.visitChildren(self)




    def class_list(self):

        localctx = D96Parser.Class_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_class_list)
        try:
            self.state = 129
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 125
                self.class1()
                self.state = 126
                self.class_list()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 128
                self.class1()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Class1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS(self):
            return self.getToken(D96Parser.CLASS, 0)

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def inherit_parent(self):
            return self.getTypedRuleContext(D96Parser.Inherit_parentContext,0)


        def LCB(self):
            return self.getToken(D96Parser.LCB, 0)

        def inside_class(self):
            return self.getTypedRuleContext(D96Parser.Inside_classContext,0)


        def RCB(self):
            return self.getToken(D96Parser.RCB, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_class1

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClass1" ):
                return visitor.visitClass1(self)
            else:
                return visitor.visitChildren(self)




    def class1(self):

        localctx = D96Parser.Class1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_class1)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 131
            self.match(D96Parser.CLASS)
            self.state = 132
            self.match(D96Parser.ID)
            self.state = 133
            self.inherit_parent()
            self.state = 134
            self.match(D96Parser.LCB)
            self.state = 135
            self.inside_class()
            self.state = 136
            self.match(D96Parser.RCB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inherit_parentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLON(self):
            return self.getToken(D96Parser.COLON, 0)

        def id_list(self):
            return self.getTypedRuleContext(D96Parser.Id_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_inherit_parent

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInherit_parent" ):
                return visitor.visitInherit_parent(self)
            else:
                return visitor.visitChildren(self)




    def inherit_parent(self):

        localctx = D96Parser.Inherit_parentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_inherit_parent)
        try:
            self.state = 141
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.COLON]:
                self.enterOuterAlt(localctx, 1)
                self.state = 138
                self.match(D96Parser.COLON)
                self.state = 139
                self.id_list()
                pass
            elif token in [D96Parser.LCB]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inside_classContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def method(self):
            return self.getTypedRuleContext(D96Parser.MethodContext,0)


        def inside_class(self):
            return self.getTypedRuleContext(D96Parser.Inside_classContext,0)


        def attribute(self):
            return self.getTypedRuleContext(D96Parser.AttributeContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_inside_class

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInside_class" ):
                return visitor.visitInside_class(self)
            else:
                return visitor.visitChildren(self)




    def inside_class(self):

        localctx = D96Parser.Inside_classContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_inside_class)
        try:
            self.state = 150
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.CONSTRUCTOR, D96Parser.DESTRUCTOR, D96Parser.DOLLAR_ID, D96Parser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 143
                self.method()
                self.state = 144
                self.inside_class()
                pass
            elif token in [D96Parser.VAL, D96Parser.VAR]:
                self.enterOuterAlt(localctx, 2)
                self.state = 146
                self.attribute()
                self.state = 147
                self.inside_class()
                pass
            elif token in [D96Parser.RCB]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MethodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def static_method(self):
            return self.getTypedRuleContext(D96Parser.Static_methodContext,0)


        def non_static_method(self):
            return self.getTypedRuleContext(D96Parser.Non_static_methodContext,0)


        def constructor(self):
            return self.getTypedRuleContext(D96Parser.ConstructorContext,0)


        def destructor(self):
            return self.getTypedRuleContext(D96Parser.DestructorContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_method

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod" ):
                return visitor.visitMethod(self)
            else:
                return visitor.visitChildren(self)




    def method(self):

        localctx = D96Parser.MethodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_method)
        try:
            self.state = 156
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.DOLLAR_ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 152
                self.static_method()
                pass
            elif token in [D96Parser.ID]:
                self.enterOuterAlt(localctx, 2)
                self.state = 153
                self.non_static_method()
                pass
            elif token in [D96Parser.CONSTRUCTOR]:
                self.enterOuterAlt(localctx, 3)
                self.state = 154
                self.constructor()
                pass
            elif token in [D96Parser.DESTRUCTOR]:
                self.enterOuterAlt(localctx, 4)
                self.state = 155
                self.destructor()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Static_methodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def parameter_list(self):
            return self.getTypedRuleContext(D96Parser.Parameter_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_static_method

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatic_method" ):
                return visitor.visitStatic_method(self)
            else:
                return visitor.visitChildren(self)




    def static_method(self):

        localctx = D96Parser.Static_methodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_static_method)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 158
            self.match(D96Parser.DOLLAR_ID)
            self.state = 159
            self.match(D96Parser.LP)
            self.state = 161
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==D96Parser.ID:
                self.state = 160
                self.parameter_list()


            self.state = 163
            self.match(D96Parser.RP)
            self.state = 164
            self.block_stment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Non_static_methodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def parameter_list(self):
            return self.getTypedRuleContext(D96Parser.Parameter_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_non_static_method

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNon_static_method" ):
                return visitor.visitNon_static_method(self)
            else:
                return visitor.visitChildren(self)




    def non_static_method(self):

        localctx = D96Parser.Non_static_methodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_non_static_method)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self.match(D96Parser.ID)
            self.state = 167
            self.match(D96Parser.LP)
            self.state = 169
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==D96Parser.ID:
                self.state = 168
                self.parameter_list()


            self.state = 171
            self.match(D96Parser.RP)
            self.state = 172
            self.block_stment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConstructorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONSTRUCTOR(self):
            return self.getToken(D96Parser.CONSTRUCTOR, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def parameter_list(self):
            return self.getTypedRuleContext(D96Parser.Parameter_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_constructor

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConstructor" ):
                return visitor.visitConstructor(self)
            else:
                return visitor.visitChildren(self)




    def constructor(self):

        localctx = D96Parser.ConstructorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_constructor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 174
            self.match(D96Parser.CONSTRUCTOR)
            self.state = 175
            self.match(D96Parser.LP)
            self.state = 177
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==D96Parser.ID:
                self.state = 176
                self.parameter_list()


            self.state = 179
            self.match(D96Parser.RP)
            self.state = 180
            self.block_stment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DestructorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DESTRUCTOR(self):
            return self.getToken(D96Parser.DESTRUCTOR, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_destructor

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDestructor" ):
                return visitor.visitDestructor(self)
            else:
                return visitor.visitChildren(self)




    def destructor(self):

        localctx = D96Parser.DestructorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_destructor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 182
            self.match(D96Parser.DESTRUCTOR)
            self.state = 183
            self.match(D96Parser.LP)
            self.state = 184
            self.match(D96Parser.RP)
            self.state = 185
            self.block_stment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AttributeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable_list(self):
            return self.getTypedRuleContext(D96Parser.Variable_listContext,0)


        def COLON(self):
            return self.getToken(D96Parser.COLON, 0)

        def data_type(self):
            return self.getTypedRuleContext(D96Parser.Data_typeContext,0)


        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def VAL(self):
            return self.getToken(D96Parser.VAL, 0)

        def VAR(self):
            return self.getToken(D96Parser.VAR, 0)

        def symmetric_var_exp(self):
            return self.getTypedRuleContext(D96Parser.Symmetric_var_expContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_attribute

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttribute" ):
                return visitor.visitAttribute(self)
            else:
                return visitor.visitChildren(self)




    def attribute(self):

        localctx = D96Parser.AttributeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_attribute)
        self._la = 0 # Token type
        try:
            self.state = 197
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 187
                _la = self._input.LA(1)
                if not(_la==D96Parser.VAL or _la==D96Parser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 188
                self.variable_list()
                self.state = 189
                self.match(D96Parser.COLON)
                self.state = 190
                self.data_type()
                self.state = 191
                self.match(D96Parser.SEMI)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 193
                _la = self._input.LA(1)
                if not(_la==D96Parser.VAL or _la==D96Parser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 194
                self.symmetric_var_exp()
                self.state = 195
                self.match(D96Parser.SEMI)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Symmetric_var_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(D96Parser.COMMA)
            else:
                return self.getToken(D96Parser.COMMA, i)

        def symmetric_var_exp(self):
            return self.getTypedRuleContext(D96Parser.Symmetric_var_expContext,0)


        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def COLON(self):
            return self.getToken(D96Parser.COLON, 0)

        def data_type(self):
            return self.getTypedRuleContext(D96Parser.Data_typeContext,0)


        def ASSIGN(self):
            return self.getToken(D96Parser.ASSIGN, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_symmetric_var_exp

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSymmetric_var_exp" ):
                return visitor.visitSymmetric_var_exp(self)
            else:
                return visitor.visitChildren(self)




    def symmetric_var_exp(self):

        localctx = D96Parser.Symmetric_var_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_symmetric_var_exp)
        self._la = 0 # Token type
        try:
            self.state = 211
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 199
                _la = self._input.LA(1)
                if not(_la==D96Parser.DOLLAR_ID or _la==D96Parser.ID):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 200
                self.match(D96Parser.COMMA)
                self.state = 201
                self.symmetric_var_exp()
                self.state = 202
                self.match(D96Parser.COMMA)
                self.state = 203
                self.exp()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 205
                _la = self._input.LA(1)
                if not(_la==D96Parser.DOLLAR_ID or _la==D96Parser.ID):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 206
                self.match(D96Parser.COLON)
                self.state = 207
                self.data_type()
                self.state = 208
                self.match(D96Parser.ASSIGN)
                self.state = 209
                self.exp()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMA(self):
            return self.getToken(D96Parser.COMMA, 0)

        def variable_list(self):
            return self.getTypedRuleContext(D96Parser.Variable_listContext,0)


        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_variable_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable_list" ):
                return visitor.visitVariable_list(self)
            else:
                return visitor.visitChildren(self)




    def variable_list(self):

        localctx = D96Parser.Variable_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_variable_list)
        self._la = 0 # Token type
        try:
            self.state = 217
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 213
                _la = self._input.LA(1)
                if not(_la==D96Parser.DOLLAR_ID or _la==D96Parser.ID):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 214
                self.match(D96Parser.COMMA)
                self.state = 215
                self.variable_list()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 216
                _la = self._input.LA(1)
                if not(_la==D96Parser.DOLLAR_ID or _la==D96Parser.ID):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Parameter_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def id_list(self):
            return self.getTypedRuleContext(D96Parser.Id_listContext,0)


        def COLON(self):
            return self.getToken(D96Parser.COLON, 0)

        def data_type(self):
            return self.getTypedRuleContext(D96Parser.Data_typeContext,0)


        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def parameter_list(self):
            return self.getTypedRuleContext(D96Parser.Parameter_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_parameter_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParameter_list" ):
                return visitor.visitParameter_list(self)
            else:
                return visitor.visitChildren(self)




    def parameter_list(self):

        localctx = D96Parser.Parameter_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_parameter_list)
        try:
            self.state = 229
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 219
                self.id_list()
                self.state = 220
                self.match(D96Parser.COLON)
                self.state = 221
                self.data_type()
                self.state = 222
                self.match(D96Parser.SEMI)
                self.state = 223
                self.parameter_list()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 225
                self.id_list()
                self.state = 226
                self.match(D96Parser.COLON)
                self.state = 227
                self.data_type()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Id_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def COMMA(self):
            return self.getToken(D96Parser.COMMA, 0)

        def id_list(self):
            return self.getTypedRuleContext(D96Parser.Id_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_id_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitId_list" ):
                return visitor.visitId_list(self)
            else:
                return visitor.visitChildren(self)




    def id_list(self):

        localctx = D96Parser.Id_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_id_list)
        try:
            self.state = 235
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 231
                self.match(D96Parser.ID)
                self.state = 232
                self.match(D96Parser.COMMA)
                self.state = 233
                self.id_list()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 234
                self.match(D96Parser.ID)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def var_const_declar_stment(self):
            return self.getTypedRuleContext(D96Parser.Var_const_declar_stmentContext,0)


        def assign_stment(self):
            return self.getTypedRuleContext(D96Parser.Assign_stmentContext,0)


        def if_stment(self):
            return self.getTypedRuleContext(D96Parser.If_stmentContext,0)


        def for_in_stment(self):
            return self.getTypedRuleContext(D96Parser.For_in_stmentContext,0)


        def break_stment(self):
            return self.getTypedRuleContext(D96Parser.Break_stmentContext,0)


        def continue_stment(self):
            return self.getTypedRuleContext(D96Parser.Continue_stmentContext,0)


        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def method_invo_stment(self):
            return self.getTypedRuleContext(D96Parser.Method_invo_stmentContext,0)


        def return_stment(self):
            return self.getTypedRuleContext(D96Parser.Return_stmentContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_statement

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = D96Parser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_statement)
        try:
            self.state = 246
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,12,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 237
                self.var_const_declar_stment()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 238
                self.assign_stment()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 239
                self.if_stment()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 240
                self.for_in_stment()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 241
                self.break_stment()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 242
                self.continue_stment()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 243
                self.block_stment()
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 244
                self.method_invo_stment()
                pass

            elif la_ == 9:
                self.enterOuterAlt(localctx, 9)
                self.state = 245
                self.return_stment()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Statement_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(D96Parser.StatementContext,0)


        def statement_list(self):
            return self.getTypedRuleContext(D96Parser.Statement_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_statement_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement_list" ):
                return visitor.visitStatement_list(self)
            else:
                return visitor.visitChildren(self)




    def statement_list(self):

        localctx = D96Parser.Statement_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_statement_list)
        try:
            self.state = 252
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.DECIMAL_NO_ZERO, D96Parser.DECIMAL, D96Parser.HEXA, D96Parser.OCTAL, D96Parser.BIN, D96Parser.FLOAT_LITERAL, D96Parser.STRING_LITERAL, D96Parser.SELF, D96Parser.IF, D96Parser.FOREACH, D96Parser.TRUE, D96Parser.FALSE, D96Parser.NULL, D96Parser.ARRAY, D96Parser.VAL, D96Parser.VAR, D96Parser.RETURN, D96Parser.BREAK, D96Parser.CONTINUE, D96Parser.SUB, D96Parser.NOT, D96Parser.NEW, D96Parser.LP, D96Parser.LCB, D96Parser.DOLLAR_ID, D96Parser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 248
                self.statement()
                self.state = 249
                self.statement_list()
                pass
            elif token in [D96Parser.RCB]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_const_declar_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def id_list(self):
            return self.getTypedRuleContext(D96Parser.Id_listContext,0)


        def COLON(self):
            return self.getToken(D96Parser.COLON, 0)

        def data_type(self):
            return self.getTypedRuleContext(D96Parser.Data_typeContext,0)


        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def VAL(self):
            return self.getToken(D96Parser.VAL, 0)

        def VAR(self):
            return self.getToken(D96Parser.VAR, 0)

        def symmetric_var_exp1(self):
            return self.getTypedRuleContext(D96Parser.Symmetric_var_exp1Context,0)


        def getRuleIndex(self):
            return D96Parser.RULE_var_const_declar_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVar_const_declar_stment" ):
                return visitor.visitVar_const_declar_stment(self)
            else:
                return visitor.visitChildren(self)




    def var_const_declar_stment(self):

        localctx = D96Parser.Var_const_declar_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_var_const_declar_stment)
        self._la = 0 # Token type
        try:
            self.state = 264
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 254
                _la = self._input.LA(1)
                if not(_la==D96Parser.VAL or _la==D96Parser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 255
                self.id_list()
                self.state = 256
                self.match(D96Parser.COLON)
                self.state = 257
                self.data_type()
                self.state = 258
                self.match(D96Parser.SEMI)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 260
                _la = self._input.LA(1)
                if not(_la==D96Parser.VAL or _la==D96Parser.VAR):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 261
                self.symmetric_var_exp1()
                self.state = 262
                self.match(D96Parser.SEMI)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Symmetric_var_exp1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(D96Parser.COMMA)
            else:
                return self.getToken(D96Parser.COMMA, i)

        def symmetric_var_exp1(self):
            return self.getTypedRuleContext(D96Parser.Symmetric_var_exp1Context,0)


        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def COLON(self):
            return self.getToken(D96Parser.COLON, 0)

        def data_type(self):
            return self.getTypedRuleContext(D96Parser.Data_typeContext,0)


        def ASSIGN(self):
            return self.getToken(D96Parser.ASSIGN, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_symmetric_var_exp1

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSymmetric_var_exp1" ):
                return visitor.visitSymmetric_var_exp1(self)
            else:
                return visitor.visitChildren(self)




    def symmetric_var_exp1(self):

        localctx = D96Parser.Symmetric_var_exp1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_symmetric_var_exp1)
        try:
            self.state = 278
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,15,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 266
                self.match(D96Parser.ID)
                self.state = 267
                self.match(D96Parser.COMMA)
                self.state = 268
                self.symmetric_var_exp1()
                self.state = 269
                self.match(D96Parser.COMMA)
                self.state = 270
                self.exp()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 272
                self.match(D96Parser.ID)
                self.state = 273
                self.match(D96Parser.COLON)
                self.state = 274
                self.data_type()
                self.state = 275
                self.match(D96Parser.ASSIGN)
                self.state = 276
                self.exp()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assign_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lhs_assignment(self):
            return self.getTypedRuleContext(D96Parser.Lhs_assignmentContext,0)


        def ASSIGN(self):
            return self.getToken(D96Parser.ASSIGN, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_assign_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign_stment" ):
                return visitor.visitAssign_stment(self)
            else:
                return visitor.visitChildren(self)




    def assign_stment(self):

        localctx = D96Parser.Assign_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_assign_stment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 280
            self.lhs_assignment()
            self.state = 281
            self.match(D96Parser.ASSIGN)
            self.state = 282
            self.exp()
            self.state = 283
            self.match(D96Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Lhs_assignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def scalar_variable(self):
            return self.getTypedRuleContext(D96Parser.Scalar_variableContext,0)


        def index_expression(self):
            return self.getTypedRuleContext(D96Parser.Index_expressionContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_lhs_assignment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLhs_assignment" ):
                return visitor.visitLhs_assignment(self)
            else:
                return visitor.visitChildren(self)




    def lhs_assignment(self):

        localctx = D96Parser.Lhs_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_lhs_assignment)
        try:
            self.state = 287
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 285
                self.scalar_variable()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 286
                self.index_expression()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Index_expressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def index_operators(self):
            return self.getTypedRuleContext(D96Parser.Index_operatorsContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_index_expression

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIndex_expression" ):
                return visitor.visitIndex_expression(self)
            else:
                return visitor.visitChildren(self)




    def index_expression(self):

        localctx = D96Parser.Index_expressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_index_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 289
            self.exp()
            self.state = 290
            self.index_operators()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Index_operatorsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LSB(self):
            return self.getToken(D96Parser.LSB, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def RSB(self):
            return self.getToken(D96Parser.RSB, 0)

        def index_operators(self):
            return self.getTypedRuleContext(D96Parser.Index_operatorsContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_index_operators

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIndex_operators" ):
                return visitor.visitIndex_operators(self)
            else:
                return visitor.visitChildren(self)




    def index_operators(self):

        localctx = D96Parser.Index_operatorsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_index_operators)
        try:
            self.state = 301
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 292
                self.match(D96Parser.LSB)
                self.state = 293
                self.exp()
                self.state = 294
                self.match(D96Parser.RSB)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 296
                self.match(D96Parser.LSB)
                self.state = 297
                self.exp()
                self.state = 298
                self.match(D96Parser.RSB)
                self.state = 299
                self.index_operators()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Scalar_variableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def attribute_access(self):
            return self.getTypedRuleContext(D96Parser.Attribute_accessContext,0)


        def static_attribute_access(self):
            return self.getTypedRuleContext(D96Parser.Static_attribute_accessContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_scalar_variable

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitScalar_variable" ):
                return visitor.visitScalar_variable(self)
            else:
                return visitor.visitChildren(self)




    def scalar_variable(self):

        localctx = D96Parser.Scalar_variableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_scalar_variable)
        try:
            self.state = 307
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,18,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 303
                self.match(D96Parser.DOLLAR_ID)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 304
                self.match(D96Parser.ID)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 305
                self.attribute_access()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 306
                self.static_attribute_access()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Attribute_accessContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def DOT(self):
            return self.getToken(D96Parser.DOT, 0)

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_attribute_access

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAttribute_access" ):
                return visitor.visitAttribute_access(self)
            else:
                return visitor.visitChildren(self)




    def attribute_access(self):

        localctx = D96Parser.Attribute_accessContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_attribute_access)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 309
            self.exp()
            self.state = 310
            self.match(D96Parser.DOT)
            self.state = 311
            self.match(D96Parser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Static_attribute_accessContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def DOUBCOLON(self):
            return self.getToken(D96Parser.DOUBCOLON, 0)

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_static_attribute_access

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatic_attribute_access" ):
                return visitor.visitStatic_attribute_access(self)
            else:
                return visitor.visitChildren(self)




    def static_attribute_access(self):

        localctx = D96Parser.Static_attribute_accessContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_static_attribute_access)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 313
            self.match(D96Parser.ID)
            self.state = 314
            self.match(D96Parser.DOUBCOLON)
            self.state = 315
            self.match(D96Parser.DOLLAR_ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(D96Parser.IF, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def else_if(self):
            return self.getTypedRuleContext(D96Parser.Else_ifContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_if_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_stment" ):
                return visitor.visitIf_stment(self)
            else:
                return visitor.visitChildren(self)




    def if_stment(self):

        localctx = D96Parser.If_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_if_stment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 317
            self.match(D96Parser.IF)
            self.state = 318
            self.match(D96Parser.LP)
            self.state = 319
            self.exp()
            self.state = 320
            self.match(D96Parser.RP)
            self.state = 321
            self.block_stment()
            self.state = 322
            self.else_if()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Else_ifContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ELSEIF(self):
            return self.getToken(D96Parser.ELSEIF, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def else_if(self):
            return self.getTypedRuleContext(D96Parser.Else_ifContext,0)


        def ELSE(self):
            return self.getToken(D96Parser.ELSE, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_else_if

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse_if" ):
                return visitor.visitElse_if(self)
            else:
                return visitor.visitChildren(self)




    def else_if(self):

        localctx = D96Parser.Else_ifContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_else_if)
        try:
            self.state = 334
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.ELSEIF]:
                self.enterOuterAlt(localctx, 1)
                self.state = 324
                self.match(D96Parser.ELSEIF)
                self.state = 325
                self.match(D96Parser.LP)
                self.state = 326
                self.exp()
                self.state = 327
                self.match(D96Parser.RP)
                self.state = 328
                self.block_stment()
                self.state = 329
                self.else_if()
                pass
            elif token in [D96Parser.ELSE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 331
                self.match(D96Parser.ELSE)
                self.state = 332
                self.block_stment()
                pass
            elif token in [D96Parser.DECIMAL_NO_ZERO, D96Parser.DECIMAL, D96Parser.HEXA, D96Parser.OCTAL, D96Parser.BIN, D96Parser.FLOAT_LITERAL, D96Parser.STRING_LITERAL, D96Parser.SELF, D96Parser.IF, D96Parser.FOREACH, D96Parser.TRUE, D96Parser.FALSE, D96Parser.NULL, D96Parser.ARRAY, D96Parser.VAL, D96Parser.VAR, D96Parser.RETURN, D96Parser.BREAK, D96Parser.CONTINUE, D96Parser.SUB, D96Parser.NOT, D96Parser.NEW, D96Parser.LP, D96Parser.LCB, D96Parser.RCB, D96Parser.DOLLAR_ID, D96Parser.ID]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_in_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOREACH(self):
            return self.getToken(D96Parser.FOREACH, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def scalar_variable(self):
            return self.getTypedRuleContext(D96Parser.Scalar_variableContext,0)


        def IN(self):
            return self.getToken(D96Parser.IN, 0)

        def exp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(D96Parser.ExpContext)
            else:
                return self.getTypedRuleContext(D96Parser.ExpContext,i)


        def DOT(self, i:int=None):
            if i is None:
                return self.getTokens(D96Parser.DOT)
            else:
                return self.getToken(D96Parser.DOT, i)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def block_stment(self):
            return self.getTypedRuleContext(D96Parser.Block_stmentContext,0)


        def BY(self):
            return self.getToken(D96Parser.BY, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_for_in_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFor_in_stment" ):
                return visitor.visitFor_in_stment(self)
            else:
                return visitor.visitChildren(self)




    def for_in_stment(self):

        localctx = D96Parser.For_in_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_for_in_stment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 336
            self.match(D96Parser.FOREACH)
            self.state = 337
            self.match(D96Parser.LP)
            self.state = 338
            self.scalar_variable()
            self.state = 339
            self.match(D96Parser.IN)
            self.state = 340
            self.exp()
            self.state = 341
            self.match(D96Parser.DOT)
            self.state = 342
            self.match(D96Parser.DOT)
            self.state = 343
            self.exp()
            self.state = 346
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==D96Parser.BY:
                self.state = 344
                self.match(D96Parser.BY)
                self.state = 345
                self.exp()


            self.state = 348
            self.match(D96Parser.RP)
            self.state = 349
            self.block_stment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Break_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BREAK(self):
            return self.getToken(D96Parser.BREAK, 0)

        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_break_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBreak_stment" ):
                return visitor.visitBreak_stment(self)
            else:
                return visitor.visitChildren(self)




    def break_stment(self):

        localctx = D96Parser.Break_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_break_stment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 351
            self.match(D96Parser.BREAK)
            self.state = 352
            self.match(D96Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Continue_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONTINUE(self):
            return self.getToken(D96Parser.CONTINUE, 0)

        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_continue_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitContinue_stment" ):
                return visitor.visitContinue_stment(self)
            else:
                return visitor.visitChildren(self)




    def continue_stment(self):

        localctx = D96Parser.Continue_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_continue_stment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 354
            self.match(D96Parser.CONTINUE)
            self.state = 355
            self.match(D96Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Return_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(D96Parser.RETURN, 0)

        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_return_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitReturn_stment" ):
                return visitor.visitReturn_stment(self)
            else:
                return visitor.visitChildren(self)




    def return_stment(self):

        localctx = D96Parser.Return_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_return_stment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 357
            self.match(D96Parser.RETURN)
            self.state = 359
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.DECIMAL_NO_ZERO) | (1 << D96Parser.DECIMAL) | (1 << D96Parser.HEXA) | (1 << D96Parser.OCTAL) | (1 << D96Parser.BIN) | (1 << D96Parser.FLOAT_LITERAL) | (1 << D96Parser.STRING_LITERAL) | (1 << D96Parser.SELF) | (1 << D96Parser.TRUE) | (1 << D96Parser.FALSE) | (1 << D96Parser.NULL) | (1 << D96Parser.ARRAY) | (1 << D96Parser.SUB) | (1 << D96Parser.NOT) | (1 << D96Parser.NEW) | (1 << D96Parser.LP) | (1 << D96Parser.DOLLAR_ID) | (1 << D96Parser.ID))) != 0):
                self.state = 358
                self.exp()


            self.state = 361
            self.match(D96Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Method_invo_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SEMI(self):
            return self.getToken(D96Parser.SEMI, 0)

        def instance_invok_method(self):
            return self.getTypedRuleContext(D96Parser.Instance_invok_methodContext,0)


        def static_invok_method(self):
            return self.getTypedRuleContext(D96Parser.Static_invok_methodContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_method_invo_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMethod_invo_stment" ):
                return visitor.visitMethod_invo_stment(self)
            else:
                return visitor.visitChildren(self)




    def method_invo_stment(self):

        localctx = D96Parser.Method_invo_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_method_invo_stment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 365
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
            if la_ == 1:
                self.state = 363
                self.instance_invok_method()
                pass

            elif la_ == 2:
                self.state = 364
                self.static_invok_method()
                pass


            self.state = 367
            self.match(D96Parser.SEMI)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Instance_invok_methodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def DOT(self):
            return self.getToken(D96Parser.DOT, 0)

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def exp_list(self):
            return self.getTypedRuleContext(D96Parser.Exp_listContext,0)


        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_instance_invok_method

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstance_invok_method" ):
                return visitor.visitInstance_invok_method(self)
            else:
                return visitor.visitChildren(self)




    def instance_invok_method(self):

        localctx = D96Parser.Instance_invok_methodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_instance_invok_method)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 369
            self.exp()
            self.state = 370
            self.match(D96Parser.DOT)
            self.state = 371
            self.match(D96Parser.ID)
            self.state = 372
            self.match(D96Parser.LP)
            self.state = 373
            self.exp_list()
            self.state = 374
            self.match(D96Parser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Static_invok_methodContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def DOUBCOLON(self):
            return self.getToken(D96Parser.DOUBCOLON, 0)

        def static_func_call(self):
            return self.getTypedRuleContext(D96Parser.Static_func_callContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_static_invok_method

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatic_invok_method" ):
                return visitor.visitStatic_invok_method(self)
            else:
                return visitor.visitChildren(self)




    def static_invok_method(self):

        localctx = D96Parser.Static_invok_methodContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_static_invok_method)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 376
            self.match(D96Parser.ID)
            self.state = 377
            self.match(D96Parser.DOUBCOLON)
            self.state = 378
            self.static_func_call()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Block_stmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LCB(self):
            return self.getToken(D96Parser.LCB, 0)

        def statement_list(self):
            return self.getTypedRuleContext(D96Parser.Statement_listContext,0)


        def RCB(self):
            return self.getToken(D96Parser.RCB, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_block_stment

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock_stment" ):
                return visitor.visitBlock_stment(self)
            else:
                return visitor.visitChildren(self)




    def block_stment(self):

        localctx = D96Parser.Block_stmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_block_stment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 380
            self.match(D96Parser.LCB)
            self.state = 381
            self.statement_list()
            self.state = 382
            self.match(D96Parser.RCB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Data_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def array_type(self):
            return self.getTypedRuleContext(D96Parser.Array_typeContext,0)


        def primitive_type(self):
            return self.getTypedRuleContext(D96Parser.Primitive_typeContext,0)


        def class_exp(self):
            return self.getTypedRuleContext(D96Parser.Class_expContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_data_type

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitData_type" ):
                return visitor.visitData_type(self)
            else:
                return visitor.visitChildren(self)




    def data_type(self):

        localctx = D96Parser.Data_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_data_type)
        try:
            self.state = 387
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.ARRAY]:
                self.enterOuterAlt(localctx, 1)
                self.state = 384
                self.array_type()
                pass
            elif token in [D96Parser.INT, D96Parser.FLOAT, D96Parser.BOOLEAN, D96Parser.STRING]:
                self.enterOuterAlt(localctx, 2)
                self.state = 385
                self.primitive_type()
                pass
            elif token in [D96Parser.ID]:
                self.enterOuterAlt(localctx, 3)
                self.state = 386
                self.class_exp()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Array_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ARRAY(self):
            return self.getToken(D96Parser.ARRAY, 0)

        def LSB(self):
            return self.getToken(D96Parser.LSB, 0)

        def COMMA(self):
            return self.getToken(D96Parser.COMMA, 0)

        def DECIMAL_NO_ZERO(self):
            return self.getToken(D96Parser.DECIMAL_NO_ZERO, 0)

        def RSB(self):
            return self.getToken(D96Parser.RSB, 0)

        def primitive_type(self):
            return self.getTypedRuleContext(D96Parser.Primitive_typeContext,0)


        def array_type(self):
            return self.getTypedRuleContext(D96Parser.Array_typeContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_array_type

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_type" ):
                return visitor.visitArray_type(self)
            else:
                return visitor.visitChildren(self)




    def array_type(self):

        localctx = D96Parser.Array_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_array_type)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 389
            self.match(D96Parser.ARRAY)
            self.state = 390
            self.match(D96Parser.LSB)
            self.state = 393
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.INT, D96Parser.FLOAT, D96Parser.BOOLEAN, D96Parser.STRING]:
                self.state = 391
                self.primitive_type()
                pass
            elif token in [D96Parser.ARRAY]:
                self.state = 392
                self.array_type()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 395
            self.match(D96Parser.COMMA)
            self.state = 396
            self.match(D96Parser.DECIMAL_NO_ZERO)
            self.state = 397
            self.match(D96Parser.RSB)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Primitive_typeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOOLEAN(self):
            return self.getToken(D96Parser.BOOLEAN, 0)

        def INT(self):
            return self.getToken(D96Parser.INT, 0)

        def FLOAT(self):
            return self.getToken(D96Parser.FLOAT, 0)

        def STRING(self):
            return self.getToken(D96Parser.STRING, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_primitive_type

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrimitive_type" ):
                return visitor.visitPrimitive_type(self)
            else:
                return visitor.visitChildren(self)




    def primitive_type(self):

        localctx = D96Parser.Primitive_typeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 76, self.RULE_primitive_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 399
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.INT) | (1 << D96Parser.FLOAT) | (1 << D96Parser.BOOLEAN) | (1 << D96Parser.STRING))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Class_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_class_exp

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClass_exp" ):
                return visitor.visitClass_exp(self)
            else:
                return visitor.visitChildren(self)




    def class_exp(self):

        localctx = D96Parser.Class_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 78, self.RULE_class_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 401
            self.match(D96Parser.ID)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp1(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(D96Parser.Exp1Context)
            else:
                return self.getTypedRuleContext(D96Parser.Exp1Context,i)


        def CONCAT(self):
            return self.getToken(D96Parser.CONCAT, 0)

        def STR_EQUAL(self):
            return self.getToken(D96Parser.STR_EQUAL, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp" ):
                return visitor.visitExp(self)
            else:
                return visitor.visitChildren(self)




    def exp(self):

        localctx = D96Parser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 80, self.RULE_exp)
        self._la = 0 # Token type
        try:
            self.state = 408
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 403
                self.exp1()
                self.state = 404
                _la = self._input.LA(1)
                if not(_la==D96Parser.CONCAT or _la==D96Parser.STR_EQUAL):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 405
                self.exp1()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 407
                self.exp1()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp2(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(D96Parser.Exp2Context)
            else:
                return self.getTypedRuleContext(D96Parser.Exp2Context,i)


        def EQUAL(self):
            return self.getToken(D96Parser.EQUAL, 0)

        def NEQ(self):
            return self.getToken(D96Parser.NEQ, 0)

        def LT(self):
            return self.getToken(D96Parser.LT, 0)

        def GT(self):
            return self.getToken(D96Parser.GT, 0)

        def LTE(self):
            return self.getToken(D96Parser.LTE, 0)

        def GTE(self):
            return self.getToken(D96Parser.GTE, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp1

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp1" ):
                return visitor.visitExp1(self)
            else:
                return visitor.visitChildren(self)




    def exp1(self):

        localctx = D96Parser.Exp1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 82, self.RULE_exp1)
        self._la = 0 # Token type
        try:
            self.state = 415
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,26,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 410
                self.exp2(0)
                self.state = 411
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.NEQ) | (1 << D96Parser.EQUAL) | (1 << D96Parser.GT) | (1 << D96Parser.LTE) | (1 << D96Parser.LT) | (1 << D96Parser.GTE))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 412
                self.exp2(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 414
                self.exp2(0)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp2Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp3(self):
            return self.getTypedRuleContext(D96Parser.Exp3Context,0)


        def exp2(self):
            return self.getTypedRuleContext(D96Parser.Exp2Context,0)


        def AND(self):
            return self.getToken(D96Parser.AND, 0)

        def OR(self):
            return self.getToken(D96Parser.OR, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp2

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp2" ):
                return visitor.visitExp2(self)
            else:
                return visitor.visitChildren(self)



    def exp2(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = D96Parser.Exp2Context(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 84
        self.enterRecursionRule(localctx, 84, self.RULE_exp2, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 418
            self.exp3(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 425
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,27,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = D96Parser.Exp2Context(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp2)
                    self.state = 420
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 421
                    _la = self._input.LA(1)
                    if not(_la==D96Parser.AND or _la==D96Parser.OR):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 422
                    self.exp3(0) 
                self.state = 427
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,27,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Exp3Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp4(self):
            return self.getTypedRuleContext(D96Parser.Exp4Context,0)


        def exp3(self):
            return self.getTypedRuleContext(D96Parser.Exp3Context,0)


        def ADD(self):
            return self.getToken(D96Parser.ADD, 0)

        def SUB(self):
            return self.getToken(D96Parser.SUB, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp3

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp3" ):
                return visitor.visitExp3(self)
            else:
                return visitor.visitChildren(self)



    def exp3(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = D96Parser.Exp3Context(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 86
        self.enterRecursionRule(localctx, 86, self.RULE_exp3, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 429
            self.exp4(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 436
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,28,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = D96Parser.Exp3Context(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp3)
                    self.state = 431
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 432
                    _la = self._input.LA(1)
                    if not(_la==D96Parser.ADD or _la==D96Parser.SUB):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 433
                    self.exp4(0) 
                self.state = 438
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,28,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Exp4Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp5(self):
            return self.getTypedRuleContext(D96Parser.Exp5Context,0)


        def exp4(self):
            return self.getTypedRuleContext(D96Parser.Exp4Context,0)


        def MUL(self):
            return self.getToken(D96Parser.MUL, 0)

        def DIV(self):
            return self.getToken(D96Parser.DIV, 0)

        def REM(self):
            return self.getToken(D96Parser.REM, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp4

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp4" ):
                return visitor.visitExp4(self)
            else:
                return visitor.visitChildren(self)



    def exp4(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = D96Parser.Exp4Context(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 88
        self.enterRecursionRule(localctx, 88, self.RULE_exp4, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 440
            self.exp5()
            self._ctx.stop = self._input.LT(-1)
            self.state = 447
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,29,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = D96Parser.Exp4Context(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp4)
                    self.state = 442
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 443
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.MUL) | (1 << D96Parser.DIV) | (1 << D96Parser.REM))) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 444
                    self.exp5() 
                self.state = 449
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,29,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Exp5Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NOT(self):
            return self.getToken(D96Parser.NOT, 0)

        def exp5(self):
            return self.getTypedRuleContext(D96Parser.Exp5Context,0)


        def exp6(self):
            return self.getTypedRuleContext(D96Parser.Exp6Context,0)


        def getRuleIndex(self):
            return D96Parser.RULE_exp5

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp5" ):
                return visitor.visitExp5(self)
            else:
                return visitor.visitChildren(self)




    def exp5(self):

        localctx = D96Parser.Exp5Context(self, self._ctx, self.state)
        self.enterRule(localctx, 90, self.RULE_exp5)
        try:
            self.state = 453
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.NOT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 450
                self.match(D96Parser.NOT)
                self.state = 451
                self.exp5()
                pass
            elif token in [D96Parser.DECIMAL_NO_ZERO, D96Parser.DECIMAL, D96Parser.HEXA, D96Parser.OCTAL, D96Parser.BIN, D96Parser.FLOAT_LITERAL, D96Parser.STRING_LITERAL, D96Parser.SELF, D96Parser.TRUE, D96Parser.FALSE, D96Parser.NULL, D96Parser.ARRAY, D96Parser.SUB, D96Parser.NEW, D96Parser.LP, D96Parser.DOLLAR_ID, D96Parser.ID]:
                self.enterOuterAlt(localctx, 2)
                self.state = 452
                self.exp6()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp6Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SUB(self):
            return self.getToken(D96Parser.SUB, 0)

        def exp6(self):
            return self.getTypedRuleContext(D96Parser.Exp6Context,0)


        def exp7(self):
            return self.getTypedRuleContext(D96Parser.Exp7Context,0)


        def getRuleIndex(self):
            return D96Parser.RULE_exp6

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp6" ):
                return visitor.visitExp6(self)
            else:
                return visitor.visitChildren(self)




    def exp6(self):

        localctx = D96Parser.Exp6Context(self, self._ctx, self.state)
        self.enterRule(localctx, 92, self.RULE_exp6)
        try:
            self.state = 458
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.SUB]:
                self.enterOuterAlt(localctx, 1)
                self.state = 455
                self.match(D96Parser.SUB)
                self.state = 456
                self.exp6()
                pass
            elif token in [D96Parser.DECIMAL_NO_ZERO, D96Parser.DECIMAL, D96Parser.HEXA, D96Parser.OCTAL, D96Parser.BIN, D96Parser.FLOAT_LITERAL, D96Parser.STRING_LITERAL, D96Parser.SELF, D96Parser.TRUE, D96Parser.FALSE, D96Parser.NULL, D96Parser.ARRAY, D96Parser.NEW, D96Parser.LP, D96Parser.DOLLAR_ID, D96Parser.ID]:
                self.enterOuterAlt(localctx, 2)
                self.state = 457
                self.exp7(0)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp7Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp8(self):
            return self.getTypedRuleContext(D96Parser.Exp8Context,0)


        def exp7(self):
            return self.getTypedRuleContext(D96Parser.Exp7Context,0)


        def LSB(self):
            return self.getToken(D96Parser.LSB, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def RSB(self):
            return self.getToken(D96Parser.RSB, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp7

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp7" ):
                return visitor.visitExp7(self)
            else:
                return visitor.visitChildren(self)



    def exp7(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = D96Parser.Exp7Context(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 94
        self.enterRecursionRule(localctx, 94, self.RULE_exp7, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 461
            self.exp8(0)
            self._ctx.stop = self._input.LT(-1)
            self.state = 470
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,32,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = D96Parser.Exp7Context(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp7)
                    self.state = 463
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 464
                    self.match(D96Parser.LSB)
                    self.state = 465
                    self.exp()
                    self.state = 466
                    self.match(D96Parser.RSB) 
                self.state = 472
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,32,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Exp8Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp9(self):
            return self.getTypedRuleContext(D96Parser.Exp9Context,0)


        def exp8(self):
            return self.getTypedRuleContext(D96Parser.Exp8Context,0)


        def DOT(self):
            return self.getToken(D96Parser.DOT, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp8

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp8" ):
                return visitor.visitExp8(self)
            else:
                return visitor.visitChildren(self)



    def exp8(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = D96Parser.Exp8Context(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 96
        self.enterRecursionRule(localctx, 96, self.RULE_exp8, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 474
            self.exp9()
            self._ctx.stop = self._input.LT(-1)
            self.state = 481
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,33,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = D96Parser.Exp8Context(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_exp8)
                    self.state = 476
                    if not self.precpred(self._ctx, 2):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 2)")
                    self.state = 477
                    self.match(D96Parser.DOT)
                    self.state = 478
                    self.exp9() 
                self.state = 483
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,33,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Exp9Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp10(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(D96Parser.Exp10Context)
            else:
                return self.getTypedRuleContext(D96Parser.Exp10Context,i)


        def DOUBCOLON(self):
            return self.getToken(D96Parser.DOUBCOLON, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_exp9

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp9" ):
                return visitor.visitExp9(self)
            else:
                return visitor.visitChildren(self)




    def exp9(self):

        localctx = D96Parser.Exp9Context(self, self._ctx, self.state)
        self.enterRule(localctx, 98, self.RULE_exp9)
        try:
            self.state = 489
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,34,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 484
                self.exp10()
                self.state = 485
                self.match(D96Parser.DOUBCOLON)
                self.state = 486
                self.exp10()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 488
                self.exp10()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp10Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEW(self):
            return self.getToken(D96Parser.NEW, 0)

        def exp10(self):
            return self.getTypedRuleContext(D96Parser.Exp10Context,0)


        def operands(self):
            return self.getTypedRuleContext(D96Parser.OperandsContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_exp10

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp10" ):
                return visitor.visitExp10(self)
            else:
                return visitor.visitChildren(self)




    def exp10(self):

        localctx = D96Parser.Exp10Context(self, self._ctx, self.state)
        self.enterRule(localctx, 100, self.RULE_exp10)
        try:
            self.state = 494
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.NEW]:
                self.enterOuterAlt(localctx, 1)
                self.state = 491
                self.match(D96Parser.NEW)
                self.state = 492
                self.exp10()
                pass
            elif token in [D96Parser.DECIMAL_NO_ZERO, D96Parser.DECIMAL, D96Parser.HEXA, D96Parser.OCTAL, D96Parser.BIN, D96Parser.FLOAT_LITERAL, D96Parser.STRING_LITERAL, D96Parser.SELF, D96Parser.TRUE, D96Parser.FALSE, D96Parser.NULL, D96Parser.ARRAY, D96Parser.LP, D96Parser.DOLLAR_ID, D96Parser.ID]:
                self.enterOuterAlt(localctx, 2)
                self.state = 493
                self.operands()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperandsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def literal(self):
            return self.getTypedRuleContext(D96Parser.LiteralContext,0)


        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def func_call(self):
            return self.getTypedRuleContext(D96Parser.Func_callContext,0)


        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def SELF(self):
            return self.getToken(D96Parser.SELF, 0)

        def static_operands(self):
            return self.getTypedRuleContext(D96Parser.Static_operandsContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_operands

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperands" ):
                return visitor.visitOperands(self)
            else:
                return visitor.visitChildren(self)




    def operands(self):

        localctx = D96Parser.OperandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 102, self.RULE_operands)
        try:
            self.state = 505
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,36,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 496
                self.literal()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 497
                self.match(D96Parser.ID)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 498
                self.func_call()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 499
                self.match(D96Parser.LP)
                self.state = 500
                self.exp()
                self.state = 501
                self.match(D96Parser.RP)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 503
                self.match(D96Parser.SELF)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 504
                self.static_operands()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Static_operandsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def static_func_call(self):
            return self.getTypedRuleContext(D96Parser.Static_func_callContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_static_operands

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatic_operands" ):
                return visitor.visitStatic_operands(self)
            else:
                return visitor.visitChildren(self)




    def static_operands(self):

        localctx = D96Parser.Static_operandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 104, self.RULE_static_operands)
        try:
            self.state = 509
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 507
                self.match(D96Parser.DOLLAR_ID)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 508
                self.static_func_call()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Static_func_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DOLLAR_ID(self):
            return self.getToken(D96Parser.DOLLAR_ID, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def exp_list(self):
            return self.getTypedRuleContext(D96Parser.Exp_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_static_func_call

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatic_func_call" ):
                return visitor.visitStatic_func_call(self)
            else:
                return visitor.visitChildren(self)




    def static_func_call(self):

        localctx = D96Parser.Static_func_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 106, self.RULE_static_func_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 511
            self.match(D96Parser.DOLLAR_ID)
            self.state = 512
            self.match(D96Parser.LP)
            self.state = 514
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.DECIMAL_NO_ZERO) | (1 << D96Parser.DECIMAL) | (1 << D96Parser.HEXA) | (1 << D96Parser.OCTAL) | (1 << D96Parser.BIN) | (1 << D96Parser.FLOAT_LITERAL) | (1 << D96Parser.STRING_LITERAL) | (1 << D96Parser.SELF) | (1 << D96Parser.TRUE) | (1 << D96Parser.FALSE) | (1 << D96Parser.NULL) | (1 << D96Parser.ARRAY) | (1 << D96Parser.SUB) | (1 << D96Parser.NOT) | (1 << D96Parser.NEW) | (1 << D96Parser.LP) | (1 << D96Parser.DOLLAR_ID) | (1 << D96Parser.ID))) != 0):
                self.state = 513
                self.exp_list()


            self.state = 516
            self.match(D96Parser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Func_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(D96Parser.ID, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def exp_list(self):
            return self.getTypedRuleContext(D96Parser.Exp_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_func_call

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunc_call" ):
                return visitor.visitFunc_call(self)
            else:
                return visitor.visitChildren(self)




    def func_call(self):

        localctx = D96Parser.Func_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 108, self.RULE_func_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 518
            self.match(D96Parser.ID)
            self.state = 519
            self.match(D96Parser.LP)
            self.state = 521
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.DECIMAL_NO_ZERO) | (1 << D96Parser.DECIMAL) | (1 << D96Parser.HEXA) | (1 << D96Parser.OCTAL) | (1 << D96Parser.BIN) | (1 << D96Parser.FLOAT_LITERAL) | (1 << D96Parser.STRING_LITERAL) | (1 << D96Parser.SELF) | (1 << D96Parser.TRUE) | (1 << D96Parser.FALSE) | (1 << D96Parser.NULL) | (1 << D96Parser.ARRAY) | (1 << D96Parser.SUB) | (1 << D96Parser.NOT) | (1 << D96Parser.NEW) | (1 << D96Parser.LP) | (1 << D96Parser.DOLLAR_ID) | (1 << D96Parser.ID))) != 0):
                self.state = 520
                self.exp_list()


            self.state = 523
            self.match(D96Parser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp_listContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(D96Parser.ExpContext,0)


        def COMMA(self):
            return self.getToken(D96Parser.COMMA, 0)

        def exp_list(self):
            return self.getTypedRuleContext(D96Parser.Exp_listContext,0)


        def getRuleIndex(self):
            return D96Parser.RULE_exp_list

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp_list" ):
                return visitor.visitExp_list(self)
            else:
                return visitor.visitChildren(self)




    def exp_list(self):

        localctx = D96Parser.Exp_listContext(self, self._ctx, self.state)
        self.enterRule(localctx, 110, self.RULE_exp_list)
        try:
            self.state = 530
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,40,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 525
                self.exp()
                self.state = 526
                self.match(D96Parser.COMMA)
                self.state = 527
                self.exp_list()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 529
                self.exp()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LiteralContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def integer_literal(self):
            return self.getTypedRuleContext(D96Parser.Integer_literalContext,0)


        def FLOAT_LITERAL(self):
            return self.getToken(D96Parser.FLOAT_LITERAL, 0)

        def boolean_literal(self):
            return self.getTypedRuleContext(D96Parser.Boolean_literalContext,0)


        def STRING_LITERAL(self):
            return self.getToken(D96Parser.STRING_LITERAL, 0)

        def indexed_array_literal(self):
            return self.getTypedRuleContext(D96Parser.Indexed_array_literalContext,0)


        def NULL(self):
            return self.getToken(D96Parser.NULL, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLiteral" ):
                return visitor.visitLiteral(self)
            else:
                return visitor.visitChildren(self)




    def literal(self):

        localctx = D96Parser.LiteralContext(self, self._ctx, self.state)
        self.enterRule(localctx, 112, self.RULE_literal)
        try:
            self.state = 538
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [D96Parser.DECIMAL_NO_ZERO, D96Parser.DECIMAL, D96Parser.HEXA, D96Parser.OCTAL, D96Parser.BIN]:
                self.enterOuterAlt(localctx, 1)
                self.state = 532
                self.integer_literal()
                pass
            elif token in [D96Parser.FLOAT_LITERAL]:
                self.enterOuterAlt(localctx, 2)
                self.state = 533
                self.match(D96Parser.FLOAT_LITERAL)
                pass
            elif token in [D96Parser.TRUE, D96Parser.FALSE]:
                self.enterOuterAlt(localctx, 3)
                self.state = 534
                self.boolean_literal()
                pass
            elif token in [D96Parser.STRING_LITERAL]:
                self.enterOuterAlt(localctx, 4)
                self.state = 535
                self.match(D96Parser.STRING_LITERAL)
                pass
            elif token in [D96Parser.ARRAY]:
                self.enterOuterAlt(localctx, 5)
                self.state = 536
                self.indexed_array_literal()
                pass
            elif token in [D96Parser.NULL]:
                self.enterOuterAlt(localctx, 6)
                self.state = 537
                self.match(D96Parser.NULL)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Indexed_array_literalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ARRAY(self):
            return self.getToken(D96Parser.ARRAY, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def exp_list(self):
            return self.getTypedRuleContext(D96Parser.Exp_listContext,0)


        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_indexed_array_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIndexed_array_literal" ):
                return visitor.visitIndexed_array_literal(self)
            else:
                return visitor.visitChildren(self)




    def indexed_array_literal(self):

        localctx = D96Parser.Indexed_array_literalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 114, self.RULE_indexed_array_literal)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 540
            self.match(D96Parser.ARRAY)
            self.state = 541
            self.match(D96Parser.LP)
            self.state = 542
            self.exp_list()
            self.state = 543
            self.match(D96Parser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Multi_array_literalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ARRAY(self):
            return self.getToken(D96Parser.ARRAY, 0)

        def LP(self):
            return self.getToken(D96Parser.LP, 0)

        def indexed_array_literal(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(D96Parser.Indexed_array_literalContext)
            else:
                return self.getTypedRuleContext(D96Parser.Indexed_array_literalContext,i)


        def RP(self):
            return self.getToken(D96Parser.RP, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(D96Parser.COMMA)
            else:
                return self.getToken(D96Parser.COMMA, i)

        def getRuleIndex(self):
            return D96Parser.RULE_multi_array_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMulti_array_literal" ):
                return visitor.visitMulti_array_literal(self)
            else:
                return visitor.visitChildren(self)




    def multi_array_literal(self):

        localctx = D96Parser.Multi_array_literalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 116, self.RULE_multi_array_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 545
            self.match(D96Parser.ARRAY)
            self.state = 546
            self.match(D96Parser.LP)
            self.state = 547
            self.indexed_array_literal()
            self.state = 552
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==D96Parser.COMMA:
                self.state = 548
                self.match(D96Parser.COMMA)
                self.state = 549
                self.indexed_array_literal()
                self.state = 554
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 555
            self.match(D96Parser.RP)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Integer_literalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DECIMAL_NO_ZERO(self):
            return self.getToken(D96Parser.DECIMAL_NO_ZERO, 0)

        def DECIMAL(self):
            return self.getToken(D96Parser.DECIMAL, 0)

        def HEXA(self):
            return self.getToken(D96Parser.HEXA, 0)

        def OCTAL(self):
            return self.getToken(D96Parser.OCTAL, 0)

        def BIN(self):
            return self.getToken(D96Parser.BIN, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_integer_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInteger_literal" ):
                return visitor.visitInteger_literal(self)
            else:
                return visitor.visitChildren(self)




    def integer_literal(self):

        localctx = D96Parser.Integer_literalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 118, self.RULE_integer_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 557
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << D96Parser.DECIMAL_NO_ZERO) | (1 << D96Parser.DECIMAL) | (1 << D96Parser.HEXA) | (1 << D96Parser.OCTAL) | (1 << D96Parser.BIN))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Boolean_literalContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TRUE(self):
            return self.getToken(D96Parser.TRUE, 0)

        def FALSE(self):
            return self.getToken(D96Parser.FALSE, 0)

        def getRuleIndex(self):
            return D96Parser.RULE_boolean_literal

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBoolean_literal" ):
                return visitor.visitBoolean_literal(self)
            else:
                return visitor.visitChildren(self)




    def boolean_literal(self):

        localctx = D96Parser.Boolean_literalContext(self, self._ctx, self.state)
        self.enterRule(localctx, 120, self.RULE_boolean_literal)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 559
            _la = self._input.LA(1)
            if not(_la==D96Parser.TRUE or _la==D96Parser.FALSE):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[42] = self.exp2_sempred
        self._predicates[43] = self.exp3_sempred
        self._predicates[44] = self.exp4_sempred
        self._predicates[47] = self.exp7_sempred
        self._predicates[48] = self.exp8_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def exp2_sempred(self, localctx:Exp2Context, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 2)
         

    def exp3_sempred(self, localctx:Exp3Context, predIndex:int):
            if predIndex == 1:
                return self.precpred(self._ctx, 2)
         

    def exp4_sempred(self, localctx:Exp4Context, predIndex:int):
            if predIndex == 2:
                return self.precpred(self._ctx, 2)
         

    def exp7_sempred(self, localctx:Exp7Context, predIndex:int):
            if predIndex == 3:
                return self.precpred(self._ctx, 2)
         

    def exp8_sempred(self, localctx:Exp8Context, predIndex:int):
            if predIndex == 4:
                return self.precpred(self._ctx, 2)
         




