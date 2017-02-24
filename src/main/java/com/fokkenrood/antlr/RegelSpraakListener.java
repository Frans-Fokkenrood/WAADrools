// Generated from src\main\java\com\fokkenrood\antlr\RegelSpraak.g4 by ANTLR 4.6
package com.fokkenrood.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegelSpraakParser}.
 */
public interface RegelSpraakListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(RegelSpraakParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(RegelSpraakParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void enterRegel(RegelSpraakParser.RegelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#regel}.
	 * @param ctx the parse tree
	 */
	void exitRegel(RegelSpraakParser.RegelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#testcase}.
	 * @param ctx the parse tree
	 */
	void enterTestcase(RegelSpraakParser.TestcaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#testcase}.
	 * @param ctx the parse tree
	 */
	void exitTestcase(RegelSpraakParser.TestcaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#testgeval}.
	 * @param ctx the parse tree
	 */
	void enterTestgeval(RegelSpraakParser.TestgevalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#testgeval}.
	 * @param ctx the parse tree
	 */
	void exitTestgeval(RegelSpraakParser.TestgevalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void enterWaarde(RegelSpraakParser.WaardeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#waarde}.
	 * @param ctx the parse tree
	 */
	void exitWaarde(RegelSpraakParser.WaardeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void enterVergelijking(RegelSpraakParser.VergelijkingContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#vergelijking}.
	 * @param ctx the parse tree
	 */
	void exitVergelijking(RegelSpraakParser.VergelijkingContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegelSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void enterFeit(RegelSpraakParser.FeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegelSpraakParser#feit}.
	 * @param ctx the parse tree
	 */
	void exitFeit(RegelSpraakParser.FeitContext ctx);
}