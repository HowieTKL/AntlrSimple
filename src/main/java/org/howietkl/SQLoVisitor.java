package org.howietkl;// Generated from D:/git/MyParser/src/main/resources/SQLo.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SQLoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SQLoParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLoParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SQLoParser.TableContext ctx);
}