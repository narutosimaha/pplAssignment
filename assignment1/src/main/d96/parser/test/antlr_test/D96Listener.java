// Generated from D96.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link D96Parser}.
 */
public interface D96Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link D96Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(D96Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(D96Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#normal_class_or_non}.
	 * @param ctx the parse tree
	 */
	void enterNormal_class_or_non(D96Parser.Normal_class_or_nonContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#normal_class_or_non}.
	 * @param ctx the parse tree
	 */
	void exitNormal_class_or_non(D96Parser.Normal_class_or_nonContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#normal_classes}.
	 * @param ctx the parse tree
	 */
	void enterNormal_classes(D96Parser.Normal_classesContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#normal_classes}.
	 * @param ctx the parse tree
	 */
	void exitNormal_classes(D96Parser.Normal_classesContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#program_class}.
	 * @param ctx the parse tree
	 */
	void enterProgram_class(D96Parser.Program_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#program_class}.
	 * @param ctx the parse tree
	 */
	void exitProgram_class(D96Parser.Program_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#normal_class}.
	 * @param ctx the parse tree
	 */
	void enterNormal_class(D96Parser.Normal_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#normal_class}.
	 * @param ctx the parse tree
	 */
	void exitNormal_class(D96Parser.Normal_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#inherit_parent}.
	 * @param ctx the parse tree
	 */
	void enterInherit_parent(D96Parser.Inherit_parentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#inherit_parent}.
	 * @param ctx the parse tree
	 */
	void exitInherit_parent(D96Parser.Inherit_parentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#inside_class}.
	 * @param ctx the parse tree
	 */
	void enterInside_class(D96Parser.Inside_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#inside_class}.
	 * @param ctx the parse tree
	 */
	void exitInside_class(D96Parser.Inside_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#inside_program_class}.
	 * @param ctx the parse tree
	 */
	void enterInside_program_class(D96Parser.Inside_program_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#inside_program_class}.
	 * @param ctx the parse tree
	 */
	void exitInside_program_class(D96Parser.Inside_program_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#inside_normal_class}.
	 * @param ctx the parse tree
	 */
	void enterInside_normal_class(D96Parser.Inside_normal_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#inside_normal_class}.
	 * @param ctx the parse tree
	 */
	void exitInside_normal_class(D96Parser.Inside_normal_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#non_destructor}.
	 * @param ctx the parse tree
	 */
	void enterNon_destructor(D96Parser.Non_destructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#non_destructor}.
	 * @param ctx the parse tree
	 */
	void exitNon_destructor(D96Parser.Non_destructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(D96Parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(D96Parser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#static_method}.
	 * @param ctx the parse tree
	 */
	void enterStatic_method(D96Parser.Static_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#static_method}.
	 * @param ctx the parse tree
	 */
	void exitStatic_method(D96Parser.Static_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#non_static_method}.
	 * @param ctx the parse tree
	 */
	void enterNon_static_method(D96Parser.Non_static_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#non_static_method}.
	 * @param ctx the parse tree
	 */
	void exitNon_static_method(D96Parser.Non_static_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(D96Parser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(D96Parser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#destructor}.
	 * @param ctx the parse tree
	 */
	void enterDestructor(D96Parser.DestructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#destructor}.
	 * @param ctx the parse tree
	 */
	void exitDestructor(D96Parser.DestructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#mainfunc}.
	 * @param ctx the parse tree
	 */
	void enterMainfunc(D96Parser.MainfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#mainfunc}.
	 * @param ctx the parse tree
	 */
	void exitMainfunc(D96Parser.MainfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(D96Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(D96Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(D96Parser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(D96Parser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(D96Parser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(D96Parser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(D96Parser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(D96Parser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(D96Parser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(D96Parser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(D96Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(D96Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#var_const_declar_stment}.
	 * @param ctx the parse tree
	 */
	void enterVar_const_declar_stment(D96Parser.Var_const_declar_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#var_const_declar_stment}.
	 * @param ctx the parse tree
	 */
	void exitVar_const_declar_stment(D96Parser.Var_const_declar_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#assign_stment}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stment(D96Parser.Assign_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#assign_stment}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stment(D96Parser.Assign_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#lhs_assignment}.
	 * @param ctx the parse tree
	 */
	void enterLhs_assignment(D96Parser.Lhs_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#lhs_assignment}.
	 * @param ctx the parse tree
	 */
	void exitLhs_assignment(D96Parser.Lhs_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#if_stment}.
	 * @param ctx the parse tree
	 */
	void enterIf_stment(D96Parser.If_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#if_stment}.
	 * @param ctx the parse tree
	 */
	void exitIf_stment(D96Parser.If_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(D96Parser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(D96Parser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#for_in_stment}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_stment(D96Parser.For_in_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#for_in_stment}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_stment(D96Parser.For_in_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#break_stment}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stment(D96Parser.Break_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#break_stment}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stment(D96Parser.Break_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#continue_stment}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stment(D96Parser.Continue_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#continue_stment}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stment(D96Parser.Continue_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#return_stment}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stment(D96Parser.Return_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#return_stment}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stment(D96Parser.Return_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#method_invo_stment}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invo_stment(D96Parser.Method_invo_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#method_invo_stment}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invo_stment(D96Parser.Method_invo_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#instance_invok_method}.
	 * @param ctx the parse tree
	 */
	void enterInstance_invok_method(D96Parser.Instance_invok_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#instance_invok_method}.
	 * @param ctx the parse tree
	 */
	void exitInstance_invok_method(D96Parser.Instance_invok_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#static_invok_method}.
	 * @param ctx the parse tree
	 */
	void enterStatic_invok_method(D96Parser.Static_invok_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#static_invok_method}.
	 * @param ctx the parse tree
	 */
	void exitStatic_invok_method(D96Parser.Static_invok_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#block_stment}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stment(D96Parser.Block_stmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#block_stment}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stment(D96Parser.Block_stmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(D96Parser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(D96Parser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#index_expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expression(D96Parser.Index_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#index_expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expression(D96Parser.Index_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#index_operators}.
	 * @param ctx the parse tree
	 */
	void enterIndex_operators(D96Parser.Index_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#index_operators}.
	 * @param ctx the parse tree
	 */
	void exitIndex_operators(D96Parser.Index_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#scalar_variable}.
	 * @param ctx the parse tree
	 */
	void enterScalar_variable(D96Parser.Scalar_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#scalar_variable}.
	 * @param ctx the parse tree
	 */
	void exitScalar_variable(D96Parser.Scalar_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#attribute_access}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_access(D96Parser.Attribute_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#attribute_access}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_access(D96Parser.Attribute_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#static_attribute_access}.
	 * @param ctx the parse tree
	 */
	void enterStatic_attribute_access(D96Parser.Static_attribute_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#static_attribute_access}.
	 * @param ctx the parse tree
	 */
	void exitStatic_attribute_access(D96Parser.Static_attribute_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(D96Parser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(D96Parser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(D96Parser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(D96Parser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(D96Parser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(D96Parser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#class_exp}.
	 * @param ctx the parse tree
	 */
	void enterClass_exp(D96Parser.Class_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#class_exp}.
	 * @param ctx the parse tree
	 */
	void exitClass_exp(D96Parser.Class_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(D96Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(D96Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(D96Parser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(D96Parser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(D96Parser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(D96Parser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp3}.
	 * @param ctx the parse tree
	 */
	void enterExp3(D96Parser.Exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp3}.
	 * @param ctx the parse tree
	 */
	void exitExp3(D96Parser.Exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp4}.
	 * @param ctx the parse tree
	 */
	void enterExp4(D96Parser.Exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp4}.
	 * @param ctx the parse tree
	 */
	void exitExp4(D96Parser.Exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp5}.
	 * @param ctx the parse tree
	 */
	void enterExp5(D96Parser.Exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp5}.
	 * @param ctx the parse tree
	 */
	void exitExp5(D96Parser.Exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp6}.
	 * @param ctx the parse tree
	 */
	void enterExp6(D96Parser.Exp6Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp6}.
	 * @param ctx the parse tree
	 */
	void exitExp6(D96Parser.Exp6Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp7}.
	 * @param ctx the parse tree
	 */
	void enterExp7(D96Parser.Exp7Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp7}.
	 * @param ctx the parse tree
	 */
	void exitExp7(D96Parser.Exp7Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp8}.
	 * @param ctx the parse tree
	 */
	void enterExp8(D96Parser.Exp8Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp8}.
	 * @param ctx the parse tree
	 */
	void exitExp8(D96Parser.Exp8Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp9}.
	 * @param ctx the parse tree
	 */
	void enterExp9(D96Parser.Exp9Context ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp9}.
	 * @param ctx the parse tree
	 */
	void exitExp9(D96Parser.Exp9Context ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#operands}.
	 * @param ctx the parse tree
	 */
	void enterOperands(D96Parser.OperandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#operands}.
	 * @param ctx the parse tree
	 */
	void exitOperands(D96Parser.OperandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#static_operands}.
	 * @param ctx the parse tree
	 */
	void enterStatic_operands(D96Parser.Static_operandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#static_operands}.
	 * @param ctx the parse tree
	 */
	void exitStatic_operands(D96Parser.Static_operandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#static_func_call}.
	 * @param ctx the parse tree
	 */
	void enterStatic_func_call(D96Parser.Static_func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#static_func_call}.
	 * @param ctx the parse tree
	 */
	void exitStatic_func_call(D96Parser.Static_func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(D96Parser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(D96Parser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(D96Parser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(D96Parser.Exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(D96Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(D96Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#indexed_array_literal}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_array_literal(D96Parser.Indexed_array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#indexed_array_literal}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_array_literal(D96Parser.Indexed_array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#multi_array_literal}.
	 * @param ctx the parse tree
	 */
	void enterMulti_array_literal(D96Parser.Multi_array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#multi_array_literal}.
	 * @param ctx the parse tree
	 */
	void exitMulti_array_literal(D96Parser.Multi_array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(D96Parser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(D96Parser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link D96Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(D96Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link D96Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(D96Parser.Boolean_literalContext ctx);
}