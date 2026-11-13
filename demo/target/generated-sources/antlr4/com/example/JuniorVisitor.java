// Generated from com/example/Junior.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuniorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JuniorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JuniorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JuniorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JuniorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JuniorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#roomDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomDeclaration(JuniorParser.RoomDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#deviceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeviceDeclaration(JuniorParser.DeviceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#deviceKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeviceKind(JuniorParser.DeviceKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JuniorParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(JuniorParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JuniorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#decision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecision(JuniorParser.DecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#repetition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetition(JuniorParser.RepetitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#automation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutomation(JuniorParser.AutomationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#eventSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventSource(JuniorParser.EventSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#eventKind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventKind(JuniorParser.EventKindContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JuniorParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#deviceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeviceReference(JuniorParser.DeviceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#deviceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeviceAction(JuniorParser.DeviceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#targets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargets(JuniorParser.TargetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotification(JuniorParser.NotificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JuniorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(JuniorParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(JuniorParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(JuniorParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(JuniorParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(JuniorParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(JuniorParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(JuniorParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JuniorParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JuniorParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(JuniorParser.ReferenceContext ctx);
}