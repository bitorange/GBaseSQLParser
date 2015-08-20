// Generated from uniformSQL.g4 by ANTLR 4.5.1
package cn.edu.bit.linc.sqlparser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link uniformSQLParser}.
 */
public interface uniformSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(uniformSQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(uniformSQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#delimited_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelimited_statement(uniformSQLParser.Delimited_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#delimited_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelimited_statement(uniformSQLParser.Delimited_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#integer_types}.
	 * @param ctx the parse tree
	 */
	void enterInteger_types(uniformSQLParser.Integer_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#integer_types}.
	 * @param ctx the parse tree
	 */
	void exitInteger_types(uniformSQLParser.Integer_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void enterRelational_op(uniformSQLParser.Relational_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#relational_op}.
	 * @param ctx the parse tree
	 */
	void exitRelational_op(uniformSQLParser.Relational_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#cast_data_type}.
	 * @param ctx the parse tree
	 */
	void enterCast_data_type(uniformSQLParser.Cast_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#cast_data_type}.
	 * @param ctx the parse tree
	 */
	void exitCast_data_type(uniformSQLParser.Cast_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void enterInterval_unit(uniformSQLParser.Interval_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void exitInterval_unit(uniformSQLParser.Interval_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(uniformSQLParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(uniformSQLParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(uniformSQLParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(uniformSQLParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void enterHex_literal(uniformSQLParser.Hex_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void exitHex_literal(uniformSQLParser.Hex_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(uniformSQLParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(uniformSQLParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#bit_literal}.
	 * @param ctx the parse tree
	 */
	void enterBit_literal(uniformSQLParser.Bit_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#bit_literal}.
	 * @param ctx the parse tree
	 */
	void exitBit_literal(uniformSQLParser.Bit_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(uniformSQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(uniformSQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#functionList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionList(uniformSQLParser.FunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#functionList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionList(uniformSQLParser.FunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#number_functions}.
	 * @param ctx the parse tree
	 */
	void enterNumber_functions(uniformSQLParser.Number_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#number_functions}.
	 * @param ctx the parse tree
	 */
	void exitNumber_functions(uniformSQLParser.Number_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#char_functions}.
	 * @param ctx the parse tree
	 */
	void enterChar_functions(uniformSQLParser.Char_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#char_functions}.
	 * @param ctx the parse tree
	 */
	void exitChar_functions(uniformSQLParser.Char_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#time_functions}.
	 * @param ctx the parse tree
	 */
	void enterTime_functions(uniformSQLParser.Time_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#time_functions}.
	 * @param ctx the parse tree
	 */
	void exitTime_functions(uniformSQLParser.Time_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#other_functions}.
	 * @param ctx the parse tree
	 */
	void enterOther_functions(uniformSQLParser.Other_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#other_functions}.
	 * @param ctx the parse tree
	 */
	void exitOther_functions(uniformSQLParser.Other_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#group_functions}.
	 * @param ctx the parse tree
	 */
	void enterGroup_functions(uniformSQLParser.Group_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#group_functions}.
	 * @param ctx the parse tree
	 */
	void exitGroup_functions(uniformSQLParser.Group_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(uniformSQLParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(uniformSQLParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(uniformSQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(uniformSQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(uniformSQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(uniformSQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#engine_name}.
	 * @param ctx the parse tree
	 */
	void enterEngine_name(uniformSQLParser.Engine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#engine_name}.
	 * @param ctx the parse tree
	 */
	void exitEngine_name(uniformSQLParser.Engine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(uniformSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(uniformSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(uniformSQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(uniformSQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#parser_name}.
	 * @param ctx the parse tree
	 */
	void enterParser_name(uniformSQLParser.Parser_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#parser_name}.
	 * @param ctx the parse tree
	 */
	void exitParser_name(uniformSQLParser.Parser_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(uniformSQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(uniformSQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name(uniformSQLParser.Partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name(uniformSQLParser.Partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#partition_logical_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_logical_name(uniformSQLParser.Partition_logical_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#partition_logical_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_logical_name(uniformSQLParser.Partition_logical_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#constraintbol_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraintbol_name(uniformSQLParser.Constraintbol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#constraintbol_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraintbol_name(uniformSQLParser.Constraintbol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#foreign_keybol_name}.
	 * @param ctx the parse tree
	 */
	void enterForeign_keybol_name(uniformSQLParser.Foreign_keybol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#foreign_keybol_name}.
	 * @param ctx the parse tree
	 */
	void exitForeign_keybol_name(uniformSQLParser.Foreign_keybol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(uniformSQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(uniformSQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#event_name}.
	 * @param ctx the parse tree
	 */
	void enterEvent_name(uniformSQLParser.Event_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#event_name}.
	 * @param ctx the parse tree
	 */
	void exitEvent_name(uniformSQLParser.Event_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(uniformSQLParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(uniformSQLParser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(uniformSQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(uniformSQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(uniformSQLParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(uniformSQLParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#server_name}.
	 * @param ctx the parse tree
	 */
	void enterServer_name(uniformSQLParser.Server_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#server_name}.
	 * @param ctx the parse tree
	 */
	void exitServer_name(uniformSQLParser.Server_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#wrapper_name}.
	 * @param ctx the parse tree
	 */
	void enterWrapper_name(uniformSQLParser.Wrapper_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#wrapper_name}.
	 * @param ctx the parse tree
	 */
	void exitWrapper_name(uniformSQLParser.Wrapper_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(uniformSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(uniformSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(uniformSQLParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(uniformSQLParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#server_alias}.
	 * @param ctx the parse tree
	 */
	void enterServer_alias(uniformSQLParser.Server_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#server_alias}.
	 * @param ctx the parse tree
	 */
	void exitServer_alias(uniformSQLParser.Server_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(uniformSQLParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(uniformSQLParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#group_name}.
	 * @param ctx the parse tree
	 */
	void enterGroup_name(uniformSQLParser.Group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#group_name}.
	 * @param ctx the parse tree
	 */
	void exitGroup_name(uniformSQLParser.Group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#principal_name}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal_name(uniformSQLParser.Principal_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#principal_name}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal_name(uniformSQLParser.Principal_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(uniformSQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(uniformSQLParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#priv_type}.
	 * @param ctx the parse tree
	 */
	void enterPriv_type(uniformSQLParser.Priv_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#priv_type}.
	 * @param ctx the parse tree
	 */
	void exitPriv_type(uniformSQLParser.Priv_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(uniformSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(uniformSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#exp_factor1}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor1(uniformSQLParser.Exp_factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#exp_factor1}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor1(uniformSQLParser.Exp_factor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#exp_factor2}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor2(uniformSQLParser.Exp_factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#exp_factor2}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor2(uniformSQLParser.Exp_factor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#exp_factor3}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor3(uniformSQLParser.Exp_factor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#exp_factor3}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor3(uniformSQLParser.Exp_factor3Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#exp_factor4}.
	 * @param ctx the parse tree
	 */
	void enterExp_factor4(uniformSQLParser.Exp_factor4Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#exp_factor4}.
	 * @param ctx the parse tree
	 */
	void exitExp_factor4(uniformSQLParser.Exp_factor4Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#bool_primary}.
	 * @param ctx the parse tree
	 */
	void enterBool_primary(uniformSQLParser.Bool_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#bool_primary}.
	 * @param ctx the parse tree
	 */
	void exitBool_primary(uniformSQLParser.Bool_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(uniformSQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(uniformSQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void enterBit_expr(uniformSQLParser.Bit_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#bit_expr}.
	 * @param ctx the parse tree
	 */
	void exitBit_expr(uniformSQLParser.Bit_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor1}.
	 * @param ctx the parse tree
	 */
	void enterFactor1(uniformSQLParser.Factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor1}.
	 * @param ctx the parse tree
	 */
	void exitFactor1(uniformSQLParser.Factor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor2}.
	 * @param ctx the parse tree
	 */
	void enterFactor2(uniformSQLParser.Factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor2}.
	 * @param ctx the parse tree
	 */
	void exitFactor2(uniformSQLParser.Factor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor3}.
	 * @param ctx the parse tree
	 */
	void enterFactor3(uniformSQLParser.Factor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor3}.
	 * @param ctx the parse tree
	 */
	void exitFactor3(uniformSQLParser.Factor3Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor4}.
	 * @param ctx the parse tree
	 */
	void enterFactor4(uniformSQLParser.Factor4Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor4}.
	 * @param ctx the parse tree
	 */
	void exitFactor4(uniformSQLParser.Factor4Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor5}.
	 * @param ctx the parse tree
	 */
	void enterFactor5(uniformSQLParser.Factor5Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor5}.
	 * @param ctx the parse tree
	 */
	void exitFactor5(uniformSQLParser.Factor5Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor6}.
	 * @param ctx the parse tree
	 */
	void enterFactor6(uniformSQLParser.Factor6Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor6}.
	 * @param ctx the parse tree
	 */
	void exitFactor6(uniformSQLParser.Factor6Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#factor7}.
	 * @param ctx the parse tree
	 */
	void enterFactor7(uniformSQLParser.Factor7Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#factor7}.
	 * @param ctx the parse tree
	 */
	void exitFactor7(uniformSQLParser.Factor7Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(uniformSQLParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(uniformSQLParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(uniformSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(uniformSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#case_when_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_statement(uniformSQLParser.Case_when_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#case_when_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_statement(uniformSQLParser.Case_when_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#case_when_statement1}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_statement1(uniformSQLParser.Case_when_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#case_when_statement1}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_statement1(uniformSQLParser.Case_when_statement1Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#case_when_statement2}.
	 * @param ctx the parse tree
	 */
	void enterCase_when_statement2(uniformSQLParser.Case_when_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#case_when_statement2}.
	 * @param ctx the parse tree
	 */
	void exitCase_when_statement2(uniformSQLParser.Case_when_statement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void enterColumn_spec(uniformSQLParser.Column_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_spec}.
	 * @param ctx the parse tree
	 */
	void exitColumn_spec(uniformSQLParser.Column_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#raw_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterRaw_expression_list(uniformSQLParser.Raw_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#raw_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitRaw_expression_list(uniformSQLParser.Raw_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(uniformSQLParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(uniformSQLParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expr(uniformSQLParser.Interval_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expr(uniformSQLParser.Interval_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_references}.
	 * @param ctx the parse tree
	 */
	void enterTable_references(uniformSQLParser.Table_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_references}.
	 * @param ctx the parse tree
	 */
	void exitTable_references(uniformSQLParser.Table_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void enterTable_reference(uniformSQLParser.Table_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_reference}.
	 * @param ctx the parse tree
	 */
	void exitTable_reference(uniformSQLParser.Table_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_factor1}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor1(uniformSQLParser.Table_factor1Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_factor1}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor1(uniformSQLParser.Table_factor1Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_factor2}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor2(uniformSQLParser.Table_factor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_factor2}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor2(uniformSQLParser.Table_factor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_factor3}.
	 * @param ctx the parse tree
	 */
	void enterTable_factor3(uniformSQLParser.Table_factor3Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_factor3}.
	 * @param ctx the parse tree
	 */
	void exitTable_factor3(uniformSQLParser.Table_factor3Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_atom}.
	 * @param ctx the parse tree
	 */
	void enterTable_atom(uniformSQLParser.Table_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_atom}.
	 * @param ctx the parse tree
	 */
	void exitTable_atom(uniformSQLParser.Table_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void enterJoin_condition(uniformSQLParser.Join_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#join_condition}.
	 * @param ctx the parse tree
	 */
	void exitJoin_condition(uniformSQLParser.Join_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_hint_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_hint_list(uniformSQLParser.Index_hint_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_hint_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_hint_list(uniformSQLParser.Index_hint_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(uniformSQLParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(uniformSQLParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_hint}.
	 * @param ctx the parse tree
	 */
	void enterIndex_hint(uniformSQLParser.Index_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_hint}.
	 * @param ctx the parse tree
	 */
	void exitIndex_hint(uniformSQLParser.Index_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_list(uniformSQLParser.Index_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_list(uniformSQLParser.Index_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_clause(uniformSQLParser.Partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_clause(uniformSQLParser.Partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void enterPartition_names(uniformSQLParser.Partition_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#partition_names}.
	 * @param ctx the parse tree
	 */
	void exitPartition_names(uniformSQLParser.Partition_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#root_statement}.
	 * @param ctx the parse tree
	 */
	void enterRoot_statement(uniformSQLParser.Root_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#root_statement}.
	 * @param ctx the parse tree
	 */
	void exitRoot_statement(uniformSQLParser.Root_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#data_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_statements(uniformSQLParser.Data_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#data_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_statements(uniformSQLParser.Data_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#data_definition_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_definition_statements(uniformSQLParser.Data_definition_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#data_definition_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_definition_statements(uniformSQLParser.Data_definition_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(uniformSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(uniformSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(uniformSQLParser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(uniformSQLParser.Select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(uniformSQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(uniformSQLParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(uniformSQLParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(uniformSQLParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(uniformSQLParser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(uniformSQLParser.Groupby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(uniformSQLParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(uniformSQLParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(uniformSQLParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(uniformSQLParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_item(uniformSQLParser.Orderby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_item(uniformSQLParser.Orderby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(uniformSQLParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(uniformSQLParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(uniformSQLParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(uniformSQLParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#row_count}.
	 * @param ctx the parse tree
	 */
	void enterRow_count(uniformSQLParser.Row_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#row_count}.
	 * @param ctx the parse tree
	 */
	void exitRow_count(uniformSQLParser.Row_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(uniformSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(uniformSQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(uniformSQLParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(uniformSQLParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(uniformSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(uniformSQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void enterTable_spec(uniformSQLParser.Table_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#table_spec}.
	 * @param ctx the parse tree
	 */
	void exitTable_spec(uniformSQLParser.Table_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void enterDisplayed_column(uniformSQLParser.Displayed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#displayed_column}.
	 * @param ctx the parse tree
	 */
	void exitDisplayed_column(uniformSQLParser.Displayed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#insert_statements}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statements(uniformSQLParser.Insert_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#insert_statements}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statements(uniformSQLParser.Insert_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#insert_header}.
	 * @param ctx the parse tree
	 */
	void enterInsert_header(uniformSQLParser.Insert_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#insert_header}.
	 * @param ctx the parse tree
	 */
	void exitInsert_header(uniformSQLParser.Insert_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#insert_subfix}.
	 * @param ctx the parse tree
	 */
	void enterInsert_subfix(uniformSQLParser.Insert_subfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#insert_subfix}.
	 * @param ctx the parse tree
	 */
	void exitInsert_subfix(uniformSQLParser.Insert_subfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(uniformSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(uniformSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#value_list_clause}.
	 * @param ctx the parse tree
	 */
	void enterValue_list_clause(uniformSQLParser.Value_list_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#value_list_clause}.
	 * @param ctx the parse tree
	 */
	void exitValue_list_clause(uniformSQLParser.Value_list_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_value_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_value_list(uniformSQLParser.Column_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_value_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_value_list(uniformSQLParser.Column_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#set_columns_cluase}.
	 * @param ctx the parse tree
	 */
	void enterSet_columns_cluase(uniformSQLParser.Set_columns_cluaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#set_columns_cluase}.
	 * @param ctx the parse tree
	 */
	void exitSet_columns_cluase(uniformSQLParser.Set_columns_cluaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#set_column_cluase}.
	 * @param ctx the parse tree
	 */
	void enterSet_column_cluase(uniformSQLParser.Set_column_cluaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#set_column_cluase}.
	 * @param ctx the parse tree
	 */
	void exitSet_column_cluase(uniformSQLParser.Set_column_cluaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_statement(uniformSQLParser.Create_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#drop_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_statement(uniformSQLParser.Drop_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#drop_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_statement(uniformSQLParser.Drop_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(uniformSQLParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(uniformSQLParser.Create_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_table_statement1}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement1(uniformSQLParser.Create_table_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_table_statement1}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement1(uniformSQLParser.Create_table_statement1Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_table_statement2}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement2(uniformSQLParser.Create_table_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_table_statement2}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement2(uniformSQLParser.Create_table_statement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_table_statement3}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement3(uniformSQLParser.Create_table_statement3Context ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_table_statement3}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement3(uniformSQLParser.Create_table_statement3Context ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_definition(uniformSQLParser.Create_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_definition(uniformSQLParser.Create_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(uniformSQLParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(uniformSQLParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#null_or_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_or_notnull(uniformSQLParser.Null_or_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#null_or_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_or_notnull(uniformSQLParser.Null_or_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_data_type_header}.
	 * @param ctx the parse tree
	 */
	void enterColumn_data_type_header(uniformSQLParser.Column_data_type_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_data_type_header}.
	 * @param ctx the parse tree
	 */
	void exitColumn_data_type_header(uniformSQLParser.Column_data_type_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_name(uniformSQLParser.Index_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_column_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_name(uniformSQLParser.Index_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void enterReference_definition(uniformSQLParser.Reference_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#reference_definition}.
	 * @param ctx the parse tree
	 */
	void exitReference_definition(uniformSQLParser.Reference_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void enterReference_option(uniformSQLParser.Reference_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#reference_option}.
	 * @param ctx the parse tree
	 */
	void exitReference_option(uniformSQLParser.Reference_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(uniformSQLParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(uniformSQLParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#varchar_length}.
	 * @param ctx the parse tree
	 */
	void enterVarchar_length(uniformSQLParser.Varchar_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#varchar_length}.
	 * @param ctx the parse tree
	 */
	void exitVarchar_length(uniformSQLParser.Varchar_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#binary_length}.
	 * @param ctx the parse tree
	 */
	void enterBinary_length(uniformSQLParser.Binary_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#binary_length}.
	 * @param ctx the parse tree
	 */
	void exitBinary_length(uniformSQLParser.Binary_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(uniformSQLParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(uniformSQLParser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#alter_table_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_specification(uniformSQLParser.Alter_table_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#alter_table_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_specification(uniformSQLParser.Alter_table_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_column_names}.
	 * @param ctx the parse tree
	 */
	void enterIndex_column_names(uniformSQLParser.Index_column_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_column_names}.
	 * @param ctx the parse tree
	 */
	void exitIndex_column_names(uniformSQLParser.Index_column_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_type}.
	 * @param ctx the parse tree
	 */
	void enterIndex_type(uniformSQLParser.Index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_type}.
	 * @param ctx the parse tree
	 */
	void exitIndex_type(uniformSQLParser.Index_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(uniformSQLParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(uniformSQLParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#column_definitions}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definitions(uniformSQLParser.Column_definitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#column_definitions}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definitions(uniformSQLParser.Column_definitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterRename_table_statement(uniformSQLParser.Rename_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#rename_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitRename_table_statement(uniformSQLParser.Rename_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(uniformSQLParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(uniformSQLParser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_statement(uniformSQLParser.Drop_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_statement(uniformSQLParser.Drop_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table_statement(uniformSQLParser.Truncate_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table_statement(uniformSQLParser.Truncate_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_statement(uniformSQLParser.Create_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_statement(uniformSQLParser.Create_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_view_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_body(uniformSQLParser.Create_view_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_view_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_body(uniformSQLParser.Create_view_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_statement(uniformSQLParser.Alter_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_statement(uniformSQLParser.Alter_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#create_user_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_statement(uniformSQLParser.Create_user_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#create_user_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_statement(uniformSQLParser.Create_user_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#drop_user_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_statement(uniformSQLParser.Drop_user_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#drop_user_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_statement(uniformSQLParser.Drop_user_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#grant_privilege_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_privilege_statement(uniformSQLParser.Grant_privilege_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#grant_privilege_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_privilege_statement(uniformSQLParser.Grant_privilege_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#principal_specification}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal_specification(uniformSQLParser.Principal_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#principal_specification}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal_specification(uniformSQLParser.Principal_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#revoke_privilege_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_privilege_statement(uniformSQLParser.Revoke_privilege_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#revoke_privilege_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_privilege_statement(uniformSQLParser.Revoke_privilege_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#show_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_event_statement(uniformSQLParser.Show_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#show_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_event_statement(uniformSQLParser.Show_event_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#show_specification}.
	 * @param ctx the parse tree
	 */
	void enterShow_specification(uniformSQLParser.Show_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#show_specification}.
	 * @param ctx the parse tree
	 */
	void exitShow_specification(uniformSQLParser.Show_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#set_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_event_statement(uniformSQLParser.Set_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#set_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_event_statement(uniformSQLParser.Set_event_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#use_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_event_statement(uniformSQLParser.Use_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#use_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_event_statement(uniformSQLParser.Use_event_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#server_event_statement}.
	 * @param ctx the parse tree
	 */
	void enterServer_event_statement(uniformSQLParser.Server_event_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#server_event_statement}.
	 * @param ctx the parse tree
	 */
	void exitServer_event_statement(uniformSQLParser.Server_event_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#update_statements}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statements(uniformSQLParser.Update_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#update_statements}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statements(uniformSQLParser.Update_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link uniformSQLParser#delete_statements}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statements(uniformSQLParser.Delete_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link uniformSQLParser#delete_statements}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statements(uniformSQLParser.Delete_statementsContext ctx);
}