package org.wso2.antlr;

// Generated from CompilerParser.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CompilerParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void enterCompilationUnit(CompilerParser.CompilationUnitContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#compilationUnit}.
     *
     * @param ctx the parse tree
     */
    void exitCompilationUnit(CompilerParser.CompilationUnitContext ctx);

    /**
     * Enter a parse tree produced by {@link CompilerParser#publisher}.
     *
     * @param ctx the parse tree
     */
    void enterPublisher(CompilerParser.PublisherContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#publisher}.
     *
     * @param ctx the parse tree
     */
    void exitPublisher(CompilerParser.PublisherContext ctx);

    /**
     * Enter a parse tree produced by {@link CompilerParser#subscriber}.
     *
     * @param ctx the parse tree
     */
    void enterSubscriber(CompilerParser.SubscriberContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#subscriber}.
     *
     * @param ctx the parse tree
     */
    void exitSubscriber(CompilerParser.SubscriberContext ctx);

    /**
     * Enter a parse tree produced by {@link CompilerParser#keyValuePair}.
     *
     * @param ctx the parse tree
     */
    void enterKeyValuePair(CompilerParser.KeyValuePairContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#keyValuePair}.
     *
     * @param ctx the parse tree
     */
    void exitKeyValuePair(CompilerParser.KeyValuePairContext ctx);

    /**
     * Enter a parse tree produced by {@link CompilerParser#primitive}.
     *
     * @param ctx the parse tree
     */
    void enterPrimitive(CompilerParser.PrimitiveContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#primitive}.
     *
     * @param ctx the parse tree
     */
    void exitPrimitive(CompilerParser.PrimitiveContext ctx);

    /**
     * Enter a parse tree produced by {@link CompilerParser#string}.
     *
     * @param ctx the parse tree
     */
    void enterString(CompilerParser.StringContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#string}.
     *
     * @param ctx the parse tree
     */
    void exitString(CompilerParser.StringContext ctx);

    /**
     * Enter a parse tree produced by {@link CompilerParser#bool}.
     *
     * @param ctx the parse tree
     */
    void enterBool(CompilerParser.BoolContext ctx);

    /**
     * Exit a parse tree produced by {@link CompilerParser#bool}.
     *
     * @param ctx the parse tree
     */
    void exitBool(CompilerParser.BoolContext ctx);
}