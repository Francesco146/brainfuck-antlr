// Generated from /home/accounts/studenti/id234mpo/IdeaProjects/lab4/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrainfuckParser}.
 */
public interface BrainfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(BrainfuckParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(BrainfuckParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterLt(BrainfuckParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitLt(BrainfuckParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterGt(BrainfuckParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitGt(BrainfuckParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterPlus(BrainfuckParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitPlus(BrainfuckParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterMinus(BrainfuckParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitMinus(BrainfuckParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dot}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterDot(BrainfuckParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitDot(BrainfuckParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comma}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterComma(BrainfuckParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitComma(BrainfuckParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BrainfuckParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BrainfuckParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nil}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void enterNil(BrainfuckParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 */
	void exitNil(BrainfuckParser.NilContext ctx);
}