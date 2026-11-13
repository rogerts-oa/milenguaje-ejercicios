// Generated from com/example/Junior.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuniorParser}.
 */
public interface JuniorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuniorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JuniorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JuniorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JuniorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JuniorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JuniorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JuniorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#roomDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRoomDeclaration(JuniorParser.RoomDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#roomDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRoomDeclaration(JuniorParser.RoomDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#deviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeviceDeclaration(JuniorParser.DeviceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#deviceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeviceDeclaration(JuniorParser.DeviceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#deviceKind}.
	 * @param ctx the parse tree
	 */
	void enterDeviceKind(JuniorParser.DeviceKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#deviceKind}.
	 * @param ctx the parse tree
	 */
	void exitDeviceKind(JuniorParser.DeviceKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JuniorParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JuniorParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(JuniorParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(JuniorParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JuniorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JuniorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(JuniorParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(JuniorParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(JuniorParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(JuniorParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#automation}.
	 * @param ctx the parse tree
	 */
	void enterAutomation(JuniorParser.AutomationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#automation}.
	 * @param ctx the parse tree
	 */
	void exitAutomation(JuniorParser.AutomationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#eventSource}.
	 * @param ctx the parse tree
	 */
	void enterEventSource(JuniorParser.EventSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#eventSource}.
	 * @param ctx the parse tree
	 */
	void exitEventSource(JuniorParser.EventSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#eventKind}.
	 * @param ctx the parse tree
	 */
	void enterEventKind(JuniorParser.EventKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#eventKind}.
	 * @param ctx the parse tree
	 */
	void exitEventKind(JuniorParser.EventKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JuniorParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JuniorParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#deviceReference}.
	 * @param ctx the parse tree
	 */
	void enterDeviceReference(JuniorParser.DeviceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#deviceReference}.
	 * @param ctx the parse tree
	 */
	void exitDeviceReference(JuniorParser.DeviceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#deviceAction}.
	 * @param ctx the parse tree
	 */
	void enterDeviceAction(JuniorParser.DeviceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#deviceAction}.
	 * @param ctx the parse tree
	 */
	void exitDeviceAction(JuniorParser.DeviceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#targets}.
	 * @param ctx the parse tree
	 */
	void enterTargets(JuniorParser.TargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#targets}.
	 * @param ctx the parse tree
	 */
	void exitTargets(JuniorParser.TargetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#notification}.
	 * @param ctx the parse tree
	 */
	void enterNotification(JuniorParser.NotificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#notification}.
	 * @param ctx the parse tree
	 */
	void exitNotification(JuniorParser.NotificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JuniorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JuniorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(JuniorParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(JuniorParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(JuniorParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(JuniorParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(JuniorParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(JuniorParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(JuniorParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(JuniorParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(JuniorParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(JuniorParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(JuniorParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(JuniorParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(JuniorParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(JuniorParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JuniorParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JuniorParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuniorParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(JuniorParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuniorParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(JuniorParser.ReferenceContext ctx);
}