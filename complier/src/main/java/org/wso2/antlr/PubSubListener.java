package org.wso2.antlr;// Generated from PubSub.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PubSubParser}.
 */
public interface PubSubListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PubSubParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(PubSubParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(PubSubParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PubSubParser#natP}.
	 * @param ctx the parse tree
	 */
	void enterNatP(PubSubParser.NatPContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#natP}.
	 * @param ctx the parse tree
	 */
	void exitNatP(PubSubParser.NatPContext ctx);
	/**
	 * Enter a parse tree produced by {@link PubSubParser#natS}.
	 * @param ctx the parse tree
	 */
	void enterNatS(PubSubParser.NatSContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#natS}.
	 * @param ctx the parse tree
	 */
	void exitNatS(PubSubParser.NatSContext ctx);
	/**
	 * Enter a parse tree produced by {@link PubSubParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(PubSubParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(PubSubParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PubSubParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(PubSubParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(PubSubParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PubSubParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PubSubParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PubSubParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PubSubParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PubSubParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PubSubParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PubSubParser.BoolContext ctx);
}