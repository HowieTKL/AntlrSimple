package org.howietkl;// Generated from D:/git/MyParser/src/main/resources/SQLo.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLoParser}.
 */
public interface SQLoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SQLoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SQLoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SQLoParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SQLoParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLoParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SQLoParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLoParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SQLoParser.TableContext ctx);
}