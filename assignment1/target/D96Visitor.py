# Generated from main/d96/parser/D96.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .D96Parser import D96Parser
else:
    from D96Parser import D96Parser

# This class defines a complete generic visitor for a parse tree produced by D96Parser.

class D96Visitor(ParseTreeVisitor):

    # Visit a parse tree produced by D96Parser#program.
    def visitProgram(self, ctx:D96Parser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#class_list.
    def visitClass_list(self, ctx:D96Parser.Class_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#class1.
    def visitClass1(self, ctx:D96Parser.Class1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#inherit_parent.
    def visitInherit_parent(self, ctx:D96Parser.Inherit_parentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#inside_class.
    def visitInside_class(self, ctx:D96Parser.Inside_classContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#method.
    def visitMethod(self, ctx:D96Parser.MethodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#static_method.
    def visitStatic_method(self, ctx:D96Parser.Static_methodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#non_static_method.
    def visitNon_static_method(self, ctx:D96Parser.Non_static_methodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#constructor.
    def visitConstructor(self, ctx:D96Parser.ConstructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#destructor.
    def visitDestructor(self, ctx:D96Parser.DestructorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#attribute.
    def visitAttribute(self, ctx:D96Parser.AttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#symmetric_var_exp.
    def visitSymmetric_var_exp(self, ctx:D96Parser.Symmetric_var_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#variable_list.
    def visitVariable_list(self, ctx:D96Parser.Variable_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#parameter_list.
    def visitParameter_list(self, ctx:D96Parser.Parameter_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#id_list.
    def visitId_list(self, ctx:D96Parser.Id_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#statement.
    def visitStatement(self, ctx:D96Parser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#statement_list.
    def visitStatement_list(self, ctx:D96Parser.Statement_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#var_const_declar_stment.
    def visitVar_const_declar_stment(self, ctx:D96Parser.Var_const_declar_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#symmetric_var_exp1.
    def visitSymmetric_var_exp1(self, ctx:D96Parser.Symmetric_var_exp1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#assign_stment.
    def visitAssign_stment(self, ctx:D96Parser.Assign_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#lhs_assignment.
    def visitLhs_assignment(self, ctx:D96Parser.Lhs_assignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#index_expression.
    def visitIndex_expression(self, ctx:D96Parser.Index_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#index_operators.
    def visitIndex_operators(self, ctx:D96Parser.Index_operatorsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#scalar_variable.
    def visitScalar_variable(self, ctx:D96Parser.Scalar_variableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#attribute_access.
    def visitAttribute_access(self, ctx:D96Parser.Attribute_accessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#static_attribute_access.
    def visitStatic_attribute_access(self, ctx:D96Parser.Static_attribute_accessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#if_stment.
    def visitIf_stment(self, ctx:D96Parser.If_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#else_if.
    def visitElse_if(self, ctx:D96Parser.Else_ifContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#for_in_stment.
    def visitFor_in_stment(self, ctx:D96Parser.For_in_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#break_stment.
    def visitBreak_stment(self, ctx:D96Parser.Break_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#continue_stment.
    def visitContinue_stment(self, ctx:D96Parser.Continue_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#return_stment.
    def visitReturn_stment(self, ctx:D96Parser.Return_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#method_invo_stment.
    def visitMethod_invo_stment(self, ctx:D96Parser.Method_invo_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#instance_invok_method.
    def visitInstance_invok_method(self, ctx:D96Parser.Instance_invok_methodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#static_invok_method.
    def visitStatic_invok_method(self, ctx:D96Parser.Static_invok_methodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#block_stment.
    def visitBlock_stment(self, ctx:D96Parser.Block_stmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#data_type.
    def visitData_type(self, ctx:D96Parser.Data_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#array_type.
    def visitArray_type(self, ctx:D96Parser.Array_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#primitive_type.
    def visitPrimitive_type(self, ctx:D96Parser.Primitive_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#class_exp.
    def visitClass_exp(self, ctx:D96Parser.Class_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp.
    def visitExp(self, ctx:D96Parser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp1.
    def visitExp1(self, ctx:D96Parser.Exp1Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp2.
    def visitExp2(self, ctx:D96Parser.Exp2Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp3.
    def visitExp3(self, ctx:D96Parser.Exp3Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp4.
    def visitExp4(self, ctx:D96Parser.Exp4Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp5.
    def visitExp5(self, ctx:D96Parser.Exp5Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp6.
    def visitExp6(self, ctx:D96Parser.Exp6Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp7.
    def visitExp7(self, ctx:D96Parser.Exp7Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp8.
    def visitExp8(self, ctx:D96Parser.Exp8Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp9.
    def visitExp9(self, ctx:D96Parser.Exp9Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp10.
    def visitExp10(self, ctx:D96Parser.Exp10Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#operands.
    def visitOperands(self, ctx:D96Parser.OperandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#static_operands.
    def visitStatic_operands(self, ctx:D96Parser.Static_operandsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#static_func_call.
    def visitStatic_func_call(self, ctx:D96Parser.Static_func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#func_call.
    def visitFunc_call(self, ctx:D96Parser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#exp_list.
    def visitExp_list(self, ctx:D96Parser.Exp_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#literal.
    def visitLiteral(self, ctx:D96Parser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#indexed_array_literal.
    def visitIndexed_array_literal(self, ctx:D96Parser.Indexed_array_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#multi_array_literal.
    def visitMulti_array_literal(self, ctx:D96Parser.Multi_array_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#integer_literal.
    def visitInteger_literal(self, ctx:D96Parser.Integer_literalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by D96Parser#boolean_literal.
    def visitBoolean_literal(self, ctx:D96Parser.Boolean_literalContext):
        return self.visitChildren(ctx)



del D96Parser