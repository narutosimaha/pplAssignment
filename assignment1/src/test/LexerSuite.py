import unittest
from TestUtils import TestLexer

class LexerSuite(unittest.TestCase):
      
    def test_lowercase_identifier(self):
        """test identifiers"""
        self.assertTrue(TestLexer.test("abc","abc,<EOF>",101))
    def test_lower_upper_id(self):
        self.assertTrue(TestLexer.test("aCBbdc","aCBbdc,<EOF>",102))
    def test_mixed_id(self):
        self.assertTrue(TestLexer.test("aAsVN3","aAsVN3,<EOF>",103))
    def test_integer(self):
        """test integers"""
        self.assertTrue(TestLexer.test("123a123","123,a123,<EOF>",104))
    def test_keywork(self):
        """test keywork"""
        self.assertTrue(TestLexer.test("Class","Class,<EOF>",105))
    def test_keywork1(self):
        """test keywork"""
        self.assertTrue(TestLexer.test("&&","&&,<EOF>",106))