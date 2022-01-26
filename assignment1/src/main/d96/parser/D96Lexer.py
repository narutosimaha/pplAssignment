# Generated from main/d96/parser/D96.g4 by ANTLR 4.9.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


from lexererr import *



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E")
        buf.write("\u0262\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%")
        buf.write("\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.")
        buf.write("\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64")
        buf.write("\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:")
        buf.write("\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\t")
        buf.write("C\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\3\2\3\2\7")
        buf.write("\2\u0098\n\2\f\2\16\2\u009b\13\2\3\2\3\2\6\2\u009f\n\2")
        buf.write("\r\2\16\2\u00a0\7\2\u00a3\n\2\f\2\16\2\u00a6\13\2\3\2")
        buf.write("\3\2\3\3\3\3\3\3\7\3\u00ad\n\3\f\3\16\3\u00b0\13\3\5\3")
        buf.write("\u00b2\n\3\3\4\3\4\3\4\3\4\3\4\7\4\u00b9\n\4\f\4\16\4")
        buf.write("\u00bc\13\4\3\4\3\4\6\4\u00c0\n\4\r\4\16\4\u00c1\7\4\u00c4")
        buf.write("\n\4\f\4\16\4\u00c7\13\4\5\4\u00c9\n\4\3\4\3\4\3\5\3\5")
        buf.write("\3\5\3\5\7\5\u00d1\n\5\f\5\16\5\u00d4\13\5\3\5\3\5\6\5")
        buf.write("\u00d8\n\5\r\5\16\5\u00d9\7\5\u00dc\n\5\f\5\16\5\u00df")
        buf.write("\13\5\5\5\u00e1\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u00ea")
        buf.write("\n\6\f\6\16\6\u00ed\13\6\3\6\3\6\6\6\u00f1\n\6\r\6\16")
        buf.write("\6\u00f2\7\6\u00f5\n\6\f\6\16\6\u00f8\13\6\5\6\u00fa\n")
        buf.write("\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7")
        buf.write("\3\7\3\7\5\7\u010b\n\7\3\7\3\7\3\b\3\b\3\b\7\b\u0112\n")
        buf.write("\b\f\b\16\b\u0115\13\b\3\b\3\b\6\b\u0119\n\b\r\b\16\b")
        buf.write("\u011a\7\b\u011d\n\b\f\b\16\b\u0120\13\b\5\b\u0122\n\b")
        buf.write("\3\t\3\t\5\t\u0126\n\t\3\t\6\t\u0129\n\t\r\t\16\t\u012a")
        buf.write("\3\n\3\n\7\n\u012f\n\n\f\n\16\n\u0132\13\n\3\13\3\13\7")
        buf.write("\13\u0136\n\13\f\13\16\13\u0139\13\13\3\13\3\13\3\13\3")
        buf.write("\f\3\f\3\f\3\f\5\f\u0142\n\f\3\r\3\r\3\r\3\16\3\16\3\16")
        buf.write("\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17")
        buf.write("\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20")
        buf.write("\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25")
        buf.write("\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27")
        buf.write("\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32")
        buf.write("\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34")
        buf.write("\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36")
        buf.write("\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37")
        buf.write("\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3")
        buf.write("#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3")
        buf.write("%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3")
        buf.write(",\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61")
        buf.write("\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65")
        buf.write("\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\38\39\39\3:\3")
        buf.write(":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3")
        buf.write("C\6C\u0225\nC\rC\16C\u0226\3D\3D\7D\u022b\nD\fD\16D\u022e")
        buf.write("\13D\3E\3E\7E\u0232\nE\fE\16E\u0235\13E\3E\5E\u0238\n")
        buf.write("E\3E\3E\3F\3F\7F\u023e\nF\fF\16F\u0241\13F\3F\3F\3F\3")
        buf.write("G\3G\3G\5G\u0249\nG\3H\3H\3H\3H\7H\u024f\nH\fH\16H\u0252")
        buf.write("\13H\3H\3H\3H\3H\3H\3I\6I\u025a\nI\rI\16I\u025b\3I\3I")
        buf.write("\3J\3J\3J\3\u0250\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21")
        buf.write("\2\23\2\25\t\27\2\31\2\33\n\35\13\37\f!\r#\16%\17\'\20")
        buf.write(")\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?")
        buf.write("\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60")
        buf.write("i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081=\u0083")
        buf.write(">\u0085?\u0087@\u0089A\u008bB\u008d\2\u008fC\u0091D\u0093")
        buf.write("E\3\2\23\3\2\63;\3\2\62;\4\2ZZzz\4\2\63;CH\4\2\62;CH\3")
        buf.write("\2\639\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2\f")
        buf.write("\f\17\17$$^^\t\2))^^ddhhppttvv\6\2\62;C\\aac|\5\2C\\a")
        buf.write("ac|\4\3\f\f\17\17\5\2\n\f\16\17\"\"\2\u0280\2\3\3\2\2")
        buf.write("\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2")
        buf.write("\r\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37")
        buf.write("\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2")
        buf.write("\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2")
        buf.write("\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2")
        buf.write("\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2")
        buf.write("\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2")
        buf.write("\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3")
        buf.write("\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a")
        buf.write("\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2")
        buf.write("k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2")
        buf.write("\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2")
        buf.write("\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085")
        buf.write("\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2")
        buf.write("\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095")
        buf.write("\3\2\2\2\5\u00b1\3\2\2\2\7\u00b3\3\2\2\2\t\u00cc\3\2\2")
        buf.write("\2\13\u00e4\3\2\2\2\r\u010a\3\2\2\2\17\u0121\3\2\2\2\21")
        buf.write("\u0123\3\2\2\2\23\u012c\3\2\2\2\25\u0133\3\2\2\2\27\u0141")
        buf.write("\3\2\2\2\31\u0143\3\2\2\2\33\u0146\3\2\2\2\35\u0150\3")
        buf.write("\2\2\2\37\u015c\3\2\2\2!\u0167\3\2\2\2#\u016d\3\2\2\2")
        buf.write("%\u0172\3\2\2\2\'\u0175\3\2\2\2)\u017c\3\2\2\2+\u0181")
        buf.write("\3\2\2\2-\u0189\3\2\2\2/\u018c\3\2\2\2\61\u018f\3\2\2")
        buf.write("\2\63\u0194\3\2\2\2\65\u019a\3\2\2\2\67\u019f\3\2\2\2")
        buf.write("9\u01a5\3\2\2\2;\u01a9\3\2\2\2=\u01af\3\2\2\2?\u01b7\3")
        buf.write("\2\2\2A\u01be\3\2\2\2C\u01c2\3\2\2\2E\u01c6\3\2\2\2G\u01cd")
        buf.write("\3\2\2\2I\u01d3\3\2\2\2K\u01dc\3\2\2\2M\u01de\3\2\2\2")
        buf.write("O\u01e0\3\2\2\2Q\u01e2\3\2\2\2S\u01e4\3\2\2\2U\u01e6\3")
        buf.write("\2\2\2W\u01e8\3\2\2\2Y\u01eb\3\2\2\2[\u01ee\3\2\2\2]\u01f1")
        buf.write("\3\2\2\2_\u01f4\3\2\2\2a\u01f6\3\2\2\2c\u01f9\3\2\2\2")
        buf.write("e\u01fb\3\2\2\2g\u01fe\3\2\2\2i\u0201\3\2\2\2k\u0205\3")
        buf.write("\2\2\2m\u0208\3\2\2\2o\u020a\3\2\2\2q\u020e\3\2\2\2s\u0210")
        buf.write("\3\2\2\2u\u0212\3\2\2\2w\u0214\3\2\2\2y\u0216\3\2\2\2")
        buf.write("{\u0218\3\2\2\2}\u021a\3\2\2\2\177\u021c\3\2\2\2\u0081")
        buf.write("\u021e\3\2\2\2\u0083\u0220\3\2\2\2\u0085\u0222\3\2\2\2")
        buf.write("\u0087\u0228\3\2\2\2\u0089\u022f\3\2\2\2\u008b\u023b\3")
        buf.write("\2\2\2\u008d\u0248\3\2\2\2\u008f\u024a\3\2\2\2\u0091\u0259")
        buf.write("\3\2\2\2\u0093\u025f\3\2\2\2\u0095\u0099\t\2\2\2\u0096")
        buf.write("\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2")
        buf.write("\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a4\3")
        buf.write("\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7a\2\2\u009d\u009f")
        buf.write("\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0")
        buf.write("\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2")
        buf.write("\u00a2\u009c\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3")
        buf.write("\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4")
        buf.write("\3\2\2\2\u00a7\u00a8\b\2\2\2\u00a8\4\3\2\2\2\u00a9\u00b2")
        buf.write("\7\62\2\2\u00aa\u00ae\t\2\2\2\u00ab\u00ad\t\3\2\2\u00ac")
        buf.write("\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2")
        buf.write("\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3")
        buf.write("\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b2\6")
        buf.write("\3\2\2\2\u00b3\u00b4\7\62\2\2\u00b4\u00c8\t\4\2\2\u00b5")
        buf.write("\u00c9\7\62\2\2\u00b6\u00ba\t\5\2\2\u00b7\u00b9\t\6\2")
        buf.write("\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8")
        buf.write("\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c5\3\2\2\2\u00bc")
        buf.write("\u00ba\3\2\2\2\u00bd\u00bf\7a\2\2\u00be\u00c0\t\6\2\2")
        buf.write("\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3")
        buf.write("\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd")
        buf.write("\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5")
        buf.write("\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2")
        buf.write("\u00c8\u00b5\3\2\2\2\u00c8\u00b6\3\2\2\2\u00c9\u00ca\3")
        buf.write("\2\2\2\u00ca\u00cb\b\4\3\2\u00cb\b\3\2\2\2\u00cc\u00e0")
        buf.write("\7\62\2\2\u00cd\u00e1\7\62\2\2\u00ce\u00d2\t\7\2\2\u00cf")
        buf.write("\u00d1\t\b\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2")
        buf.write("\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00dd\3")
        buf.write("\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7a\2\2\u00d6\u00d8")
        buf.write("\t\b\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9")
        buf.write("\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2")
        buf.write("\u00db\u00d5\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3")
        buf.write("\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd")
        buf.write("\3\2\2\2\u00e0\u00cd\3\2\2\2\u00e0\u00ce\3\2\2\2\u00e1")
        buf.write("\u00e2\3\2\2\2\u00e2\u00e3\b\5\4\2\u00e3\n\3\2\2\2\u00e4")
        buf.write("\u00e5\7\62\2\2\u00e5\u00f9\t\t\2\2\u00e6\u00fa\7\62\2")
        buf.write("\2\u00e7\u00eb\7\63\2\2\u00e8\u00ea\t\n\2\2\u00e9\u00e8")
        buf.write("\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb")
        buf.write("\u00ec\3\2\2\2\u00ec\u00f6\3\2\2\2\u00ed\u00eb\3\2\2\2")
        buf.write("\u00ee\u00f0\7a\2\2\u00ef\u00f1\t\n\2\2\u00f0\u00ef\3")
        buf.write("\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3")
        buf.write("\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f5")
        buf.write("\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2")
        buf.write("\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00e6\3")
        buf.write("\2\2\2\u00f9\u00e7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc")
        buf.write("\b\6\5\2\u00fc\f\3\2\2\2\u00fd\u00fe\5\17\b\2\u00fe\u00ff")
        buf.write("\5\23\n\2\u00ff\u0100\5\21\t\2\u0100\u010b\3\2\2\2\u0101")
        buf.write("\u0102\5\17\b\2\u0102\u0103\5\23\n\2\u0103\u010b\3\2\2")
        buf.write("\2\u0104\u0105\5\23\n\2\u0105\u0106\5\21\t\2\u0106\u010b")
        buf.write("\3\2\2\2\u0107\u0108\5\17\b\2\u0108\u0109\5\21\t\2\u0109")
        buf.write("\u010b\3\2\2\2\u010a\u00fd\3\2\2\2\u010a\u0101\3\2\2\2")
        buf.write("\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010c\3")
        buf.write("\2\2\2\u010c\u010d\b\7\6\2\u010d\16\3\2\2\2\u010e\u0122")
        buf.write("\7\62\2\2\u010f\u0113\t\2\2\2\u0110\u0112\t\3\2\2\u0111")
        buf.write("\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2")
        buf.write("\u0113\u0114\3\2\2\2\u0114\u011e\3\2\2\2\u0115\u0113\3")
        buf.write("\2\2\2\u0116\u0118\7a\2\2\u0117\u0119\t\3\2\2\u0118\u0117")
        buf.write("\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a")
        buf.write("\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2")
        buf.write("\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3")
        buf.write("\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u010e")
        buf.write("\3\2\2\2\u0121\u010f\3\2\2\2\u0122\20\3\2\2\2\u0123\u0125")
        buf.write("\t\13\2\2\u0124\u0126\t\f\2\2\u0125\u0124\3\2\2\2\u0125")
        buf.write("\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\t\3\2\2")
        buf.write("\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3")
        buf.write("\2\2\2\u012a\u012b\3\2\2\2\u012b\22\3\2\2\2\u012c\u0130")
        buf.write("\7\60\2\2\u012d\u012f\t\3\2\2\u012e\u012d\3\2\2\2\u012f")
        buf.write("\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2")
        buf.write("\u0131\24\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0137\7$\2")
        buf.write("\2\u0134\u0136\5\27\f\2\u0135\u0134\3\2\2\2\u0136\u0139")
        buf.write("\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138")
        buf.write("\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7$\2\2")
        buf.write("\u013b\u013c\b\13\7\2\u013c\26\3\2\2\2\u013d\u0142\n\r")
        buf.write("\2\2\u013e\u0142\5\31\r\2\u013f\u0140\7)\2\2\u0140\u0142")
        buf.write("\7$\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141")
        buf.write("\u013f\3\2\2\2\u0142\30\3\2\2\2\u0143\u0144\7^\2\2\u0144")
        buf.write("\u0145\t\16\2\2\u0145\32\3\2\2\2\u0146\u0147\7u\2\2\u0147")
        buf.write("\u0148\7v\2\2\u0148\u0149\7c\2\2\u0149\u014a\7v\2\2\u014a")
        buf.write("\u014b\7g\2\2\u014b\u014c\7o\2\2\u014c\u014d\7g\2\2\u014d")
        buf.write("\u014e\7p\2\2\u014e\u014f\7v\2\2\u014f\34\3\2\2\2\u0150")
        buf.write("\u0151\7E\2\2\u0151\u0152\7q\2\2\u0152\u0153\7p\2\2\u0153")
        buf.write("\u0154\7u\2\2\u0154\u0155\7v\2\2\u0155\u0156\7t\2\2\u0156")
        buf.write("\u0157\7w\2\2\u0157\u0158\7e\2\2\u0158\u0159\7v\2\2\u0159")
        buf.write("\u015a\7q\2\2\u015a\u015b\7t\2\2\u015b\36\3\2\2\2\u015c")
        buf.write("\u015d\7F\2\2\u015d\u015e\7g\2\2\u015e\u015f\7u\2\2\u015f")
        buf.write("\u0160\7v\2\2\u0160\u0161\7t\2\2\u0161\u0162\7w\2\2\u0162")
        buf.write("\u0163\7e\2\2\u0163\u0164\7v\2\2\u0164\u0165\7q\2\2\u0165")
        buf.write("\u0166\7t\2\2\u0166 \3\2\2\2\u0167\u0168\7E\2\2\u0168")
        buf.write("\u0169\7n\2\2\u0169\u016a\7c\2\2\u016a\u016b\7u\2\2\u016b")
        buf.write("\u016c\7u\2\2\u016c\"\3\2\2\2\u016d\u016e\7U\2\2\u016e")
        buf.write("\u016f\7g\2\2\u016f\u0170\7n\2\2\u0170\u0171\7h\2\2\u0171")
        buf.write("$\3\2\2\2\u0172\u0173\7K\2\2\u0173\u0174\7h\2\2\u0174")
        buf.write("&\3\2\2\2\u0175\u0176\7G\2\2\u0176\u0177\7n\2\2\u0177")
        buf.write("\u0178\7u\2\2\u0178\u0179\7g\2\2\u0179\u017a\7k\2\2\u017a")
        buf.write("\u017b\7h\2\2\u017b(\3\2\2\2\u017c\u017d\7G\2\2\u017d")
        buf.write("\u017e\7n\2\2\u017e\u017f\7u\2\2\u017f\u0180\7g\2\2\u0180")
        buf.write("*\3\2\2\2\u0181\u0182\7H\2\2\u0182\u0183\7q\2\2\u0183")
        buf.write("\u0184\7t\2\2\u0184\u0185\7g\2\2\u0185\u0186\7c\2\2\u0186")
        buf.write("\u0187\7e\2\2\u0187\u0188\7j\2\2\u0188,\3\2\2\2\u0189")
        buf.write("\u018a\7K\2\2\u018a\u018b\7p\2\2\u018b.\3\2\2\2\u018c")
        buf.write("\u018d\7D\2\2\u018d\u018e\7{\2\2\u018e\60\3\2\2\2\u018f")
        buf.write("\u0190\7V\2\2\u0190\u0191\7t\2\2\u0191\u0192\7w\2\2\u0192")
        buf.write("\u0193\7g\2\2\u0193\62\3\2\2\2\u0194\u0195\7H\2\2\u0195")
        buf.write("\u0196\7c\2\2\u0196\u0197\7n\2\2\u0197\u0198\7u\2\2\u0198")
        buf.write("\u0199\7g\2\2\u0199\64\3\2\2\2\u019a\u019b\7P\2\2\u019b")
        buf.write("\u019c\7w\2\2\u019c\u019d\7n\2\2\u019d\u019e\7n\2\2\u019e")
        buf.write("\66\3\2\2\2\u019f\u01a0\7C\2\2\u01a0\u01a1\7t\2\2\u01a1")
        buf.write("\u01a2\7t\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7{\2\2\u01a4")
        buf.write("8\3\2\2\2\u01a5\u01a6\7K\2\2\u01a6\u01a7\7p\2\2\u01a7")
        buf.write("\u01a8\7v\2\2\u01a8:\3\2\2\2\u01a9\u01aa\7H\2\2\u01aa")
        buf.write("\u01ab\7n\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7c\2\2\u01ad")
        buf.write("\u01ae\7v\2\2\u01ae<\3\2\2\2\u01af\u01b0\7D\2\2\u01b0")
        buf.write("\u01b1\7q\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7n\2\2\u01b3")
        buf.write("\u01b4\7g\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6\7p\2\2\u01b6")
        buf.write(">\3\2\2\2\u01b7\u01b8\7U\2\2\u01b8\u01b9\7v\2\2\u01b9")
        buf.write("\u01ba\7t\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7p\2\2\u01bc")
        buf.write("\u01bd\7i\2\2\u01bd@\3\2\2\2\u01be\u01bf\7X\2\2\u01bf")
        buf.write("\u01c0\7c\2\2\u01c0\u01c1\7n\2\2\u01c1B\3\2\2\2\u01c2")
        buf.write("\u01c3\7X\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7t\2\2\u01c5")
        buf.write("D\3\2\2\2\u01c6\u01c7\7T\2\2\u01c7\u01c8\7g\2\2\u01c8")
        buf.write("\u01c9\7v\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cb\7t\2\2\u01cb")
        buf.write("\u01cc\7p\2\2\u01ccF\3\2\2\2\u01cd\u01ce\7D\2\2\u01ce")
        buf.write("\u01cf\7t\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7c\2\2\u01d1")
        buf.write("\u01d2\7m\2\2\u01d2H\3\2\2\2\u01d3\u01d4\7E\2\2\u01d4")
        buf.write("\u01d5\7q\2\2\u01d5\u01d6\7p\2\2\u01d6\u01d7\7v\2\2\u01d7")
        buf.write("\u01d8\7k\2\2\u01d8\u01d9\7p\2\2\u01d9\u01da\7w\2\2\u01da")
        buf.write("\u01db\7g\2\2\u01dbJ\3\2\2\2\u01dc\u01dd\7-\2\2\u01dd")
        buf.write("L\3\2\2\2\u01de\u01df\7/\2\2\u01dfN\3\2\2\2\u01e0\u01e1")
        buf.write("\7,\2\2\u01e1P\3\2\2\2\u01e2\u01e3\7\61\2\2\u01e3R\3\2")
        buf.write("\2\2\u01e4\u01e5\7\'\2\2\u01e5T\3\2\2\2\u01e6\u01e7\7")
        buf.write("#\2\2\u01e7V\3\2\2\2\u01e8\u01e9\7(\2\2\u01e9\u01ea\7")
        buf.write("(\2\2\u01eaX\3\2\2\2\u01eb\u01ec\7~\2\2\u01ec\u01ed\7")
        buf.write("~\2\2\u01edZ\3\2\2\2\u01ee\u01ef\7#\2\2\u01ef\u01f0\7")
        buf.write("?\2\2\u01f0\\\3\2\2\2\u01f1\u01f2\7?\2\2\u01f2\u01f3\7")
        buf.write("?\2\2\u01f3^\3\2\2\2\u01f4\u01f5\7@\2\2\u01f5`\3\2\2\2")
        buf.write("\u01f6\u01f7\7>\2\2\u01f7\u01f8\7?\2\2\u01f8b\3\2\2\2")
        buf.write("\u01f9\u01fa\7>\2\2\u01fad\3\2\2\2\u01fb\u01fc\7@\2\2")
        buf.write("\u01fc\u01fd\7?\2\2\u01fdf\3\2\2\2\u01fe\u01ff\7-\2\2")
        buf.write("\u01ff\u0200\7\60\2\2\u0200h\3\2\2\2\u0201\u0202\7?\2")
        buf.write("\2\u0202\u0203\7?\2\2\u0203\u0204\7\60\2\2\u0204j\3\2")
        buf.write("\2\2\u0205\u0206\7<\2\2\u0206\u0207\7<\2\2\u0207l\3\2")
        buf.write("\2\2\u0208\u0209\7\60\2\2\u0209n\3\2\2\2\u020a\u020b\7")
        buf.write("P\2\2\u020b\u020c\7g\2\2\u020c\u020d\7y\2\2\u020dp\3\2")
        buf.write("\2\2\u020e\u020f\7?\2\2\u020fr\3\2\2\2\u0210\u0211\7*")
        buf.write("\2\2\u0211t\3\2\2\2\u0212\u0213\7+\2\2\u0213v\3\2\2\2")
        buf.write("\u0214\u0215\7}\2\2\u0215x\3\2\2\2\u0216\u0217\7\177\2")
        buf.write("\2\u0217z\3\2\2\2\u0218\u0219\7]\2\2\u0219|\3\2\2\2\u021a")
        buf.write("\u021b\7_\2\2\u021b~\3\2\2\2\u021c\u021d\7=\2\2\u021d")
        buf.write("\u0080\3\2\2\2\u021e\u021f\7.\2\2\u021f\u0082\3\2\2\2")
        buf.write("\u0220\u0221\7<\2\2\u0221\u0084\3\2\2\2\u0222\u0224\7")
        buf.write("&\2\2\u0223\u0225\t\17\2\2\u0224\u0223\3\2\2\2\u0225\u0226")
        buf.write("\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227")
        buf.write("\u0086\3\2\2\2\u0228\u022c\t\20\2\2\u0229\u022b\t\17\2")
        buf.write("\2\u022a\u0229\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a")
        buf.write("\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0088\3\2\2\2\u022e")
        buf.write("\u022c\3\2\2\2\u022f\u0233\7$\2\2\u0230\u0232\5\27\f\2")
        buf.write("\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3")
        buf.write("\2\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233")
        buf.write("\3\2\2\2\u0236\u0238\t\21\2\2\u0237\u0236\3\2\2\2\u0238")
        buf.write("\u0239\3\2\2\2\u0239\u023a\bE\b\2\u023a\u008a\3\2\2\2")
        buf.write("\u023b\u023f\7$\2\2\u023c\u023e\5\27\f\2\u023d\u023c\3")
        buf.write("\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240")
        buf.write("\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242")
        buf.write("\u0243\5\u008dG\2\u0243\u0244\bF\t\2\u0244\u008c\3\2\2")
        buf.write("\2\u0245\u0246\7^\2\2\u0246\u0249\n\16\2\2\u0247\u0249")
        buf.write("\7^\2\2\u0248\u0245\3\2\2\2\u0248\u0247\3\2\2\2\u0249")
        buf.write("\u008e\3\2\2\2\u024a\u024b\7%\2\2\u024b\u024c\7%\2\2\u024c")
        buf.write("\u0250\3\2\2\2\u024d\u024f\13\2\2\2\u024e\u024d\3\2\2")
        buf.write("\2\u024f\u0252\3\2\2\2\u0250\u0251\3\2\2\2\u0250\u024e")
        buf.write("\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253")
        buf.write("\u0254\7%\2\2\u0254\u0255\7%\2\2\u0255\u0256\3\2\2\2\u0256")
        buf.write("\u0257\bH\n\2\u0257\u0090\3\2\2\2\u0258\u025a\t\22\2\2")
        buf.write("\u0259\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0259\3")
        buf.write("\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e")
        buf.write("\bI\n\2\u025e\u0092\3\2\2\2\u025f\u0260\13\2\2\2\u0260")
        buf.write("\u0261\bJ\13\2\u0261\u0094\3\2\2\2&\2\u0099\u00a0\u00a4")
        buf.write("\u00ae\u00b1\u00ba\u00c1\u00c5\u00c8\u00d2\u00d9\u00dd")
        buf.write("\u00e0\u00eb\u00f2\u00f6\u00f9\u010a\u0113\u011a\u011e")
        buf.write("\u0121\u0125\u012a\u0130\u0137\u0141\u0226\u022c\u0233")
        buf.write("\u0237\u023f\u0248\u0250\u025b\f\3\2\2\3\4\3\3\5\4\3\6")
        buf.write("\5\3\7\6\3\13\7\3E\b\3F\t\b\2\2\3J\n")
        return buf.getvalue()


class D96Lexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    DECIMAL_NO_ZERO = 1
    DECIMAL = 2
    HEXA = 3
    OCTAL = 4
    BIN = 5
    FLOAT_LITERAL = 6
    STRING_LITERAL = 7
    STATEMENT = 8
    CONSTRUCTOR = 9
    DESTRUCTOR = 10
    CLASS = 11
    SELF = 12
    IF = 13
    ELSEIF = 14
    ELSE = 15
    FOREACH = 16
    IN = 17
    BY = 18
    TRUE = 19
    FALSE = 20
    NULL = 21
    ARRAY = 22
    INT = 23
    FLOAT = 24
    BOOLEAN = 25
    STRING = 26
    VAL = 27
    VAR = 28
    RETURN = 29
    BREAK = 30
    CONTINUE = 31
    ADD = 32
    SUB = 33
    MUL = 34
    DIV = 35
    REM = 36
    NOT = 37
    AND = 38
    OR = 39
    NEQ = 40
    EQUAL = 41
    GT = 42
    LTE = 43
    LT = 44
    GTE = 45
    CONCAT = 46
    STR_EQUAL = 47
    DOUBCOLON = 48
    DOT = 49
    NEW = 50
    ASSIGN = 51
    LP = 52
    RP = 53
    LCB = 54
    RCB = 55
    LSB = 56
    RSB = 57
    SEMI = 58
    COMMA = 59
    COLON = 60
    DOLLAR_ID = 61
    ID = 62
    UNCLOSE_STRING = 63
    ILLEGAL_ESCAPE = 64
    COMMENT = 65
    WS = 66
    ERROR_CHAR = 67

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'statement'", "'Constructor'", "'Destructor'", "'Class'", "'Self'", 
            "'If'", "'Elseif'", "'Else'", "'Foreach'", "'In'", "'By'", "'True'", 
            "'False'", "'Null'", "'Array'", "'Int'", "'Float'", "'Boolean'", 
            "'String'", "'Val'", "'Var'", "'Return'", "'Break'", "'Continue'", 
            "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'&&'", "'||'", "'!='", 
            "'=='", "'>'", "'<='", "'<'", "'>='", "'+.'", "'==.'", "'::'", 
            "'.'", "'New'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", 
            "';'", "','", "':'" ]

    symbolicNames = [ "<INVALID>",
            "DECIMAL_NO_ZERO", "DECIMAL", "HEXA", "OCTAL", "BIN", "FLOAT_LITERAL", 
            "STRING_LITERAL", "STATEMENT", "CONSTRUCTOR", "DESTRUCTOR", 
            "CLASS", "SELF", "IF", "ELSEIF", "ELSE", "FOREACH", "IN", "BY", 
            "TRUE", "FALSE", "NULL", "ARRAY", "INT", "FLOAT", "BOOLEAN", 
            "STRING", "VAL", "VAR", "RETURN", "BREAK", "CONTINUE", "ADD", 
            "SUB", "MUL", "DIV", "REM", "NOT", "AND", "OR", "NEQ", "EQUAL", 
            "GT", "LTE", "LT", "GTE", "CONCAT", "STR_EQUAL", "DOUBCOLON", 
            "DOT", "NEW", "ASSIGN", "LP", "RP", "LCB", "RCB", "LSB", "RSB", 
            "SEMI", "COMMA", "COLON", "DOLLAR_ID", "ID", "UNCLOSE_STRING", 
            "ILLEGAL_ESCAPE", "COMMENT", "WS", "ERROR_CHAR" ]

    ruleNames = [ "DECIMAL_NO_ZERO", "DECIMAL", "HEXA", "OCTAL", "BIN", 
                  "FLOAT_LITERAL", "INTEGER_PART", "EXPONENT_PART", "DECIMAL_PART", 
                  "STRING_LITERAL", "STR_CHAR", "ESC_SEQ", "STATEMENT", 
                  "CONSTRUCTOR", "DESTRUCTOR", "CLASS", "SELF", "IF", "ELSEIF", 
                  "ELSE", "FOREACH", "IN", "BY", "TRUE", "FALSE", "NULL", 
                  "ARRAY", "INT", "FLOAT", "BOOLEAN", "STRING", "VAL", "VAR", 
                  "RETURN", "BREAK", "CONTINUE", "ADD", "SUB", "MUL", "DIV", 
                  "REM", "NOT", "AND", "OR", "NEQ", "EQUAL", "GT", "LTE", 
                  "LT", "GTE", "CONCAT", "STR_EQUAL", "DOUBCOLON", "DOT", 
                  "NEW", "ASSIGN", "LP", "RP", "LCB", "RCB", "LSB", "RSB", 
                  "SEMI", "COMMA", "COLON", "DOLLAR_ID", "ID", "UNCLOSE_STRING", 
                  "ILLEGAL_ESCAPE", "ESC_ILLEGAL", "COMMENT", "WS", "ERROR_CHAR" ]

    grammarFileName = "D96.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    def action(self, localctx:RuleContext, ruleIndex:int, actionIndex:int):
        if self._actions is None:
            actions = dict()
            actions[0] = self.DECIMAL_NO_ZERO_action 
            actions[2] = self.HEXA_action 
            actions[3] = self.OCTAL_action 
            actions[4] = self.BIN_action 
            actions[5] = self.FLOAT_LITERAL_action 
            actions[9] = self.STRING_LITERAL_action 
            actions[67] = self.UNCLOSE_STRING_action 
            actions[68] = self.ILLEGAL_ESCAPE_action 
            actions[72] = self.ERROR_CHAR_action 
            self._actions = actions
        action = self._actions.get(ruleIndex, None)
        if action is not None:
            action(localctx, actionIndex)
        else:
            raise Exception("No registered action for:" + str(ruleIndex))


    def DECIMAL_NO_ZERO_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 0:
             self.text = self.text.replace("_", "") 
     

    def HEXA_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 1:
             self.text = self.text.replace("_", "") 
     

    def OCTAL_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 2:
             self.text = self.text.replace("_", "") 
     

    def BIN_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 3:
             self.text = self.text.replace("_", "") 
     

    def FLOAT_LITERAL_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 4:

                                self.text = self.text.replace("_", "")
                            
     

    def STRING_LITERAL_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 5:

            		            y = str(self.text)
            		            self.text = y[1:-1]
            	           
     

    def UNCLOSE_STRING_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 6:

            		y = str(self.text)
            		possible = ['\n', '\r']
            		if y[-1] in possible:
            			raise UncloseString(y[1:-1])
            		else:
            			raise UncloseString(y[1:])
            	
     

    def ILLEGAL_ESCAPE_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 7:

            		y = str(self.text)
            		raise IllegalEscape(y[1:])
            	
     

    def ERROR_CHAR_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 8:

            		raise ErrorToken(self.text)
            	
     


