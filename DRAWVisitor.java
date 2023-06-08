// Generated from DRAW.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DRAWParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DRAWVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DRAWParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DRAWParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FOR}
	 * labeled alternative in {@link DRAWParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOR(DRAWParser.FORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORIGIN}
	 * labeled alternative in {@link DRAWParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORIGIN(DRAWParser.ORIGINContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SCALE}
	 * labeled alternative in {@link DRAWParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCALE(DRAWParser.SCALEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ROT}
	 * labeled alternative in {@link DRAWParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitROT(DRAWParser.ROTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COLOR}
	 * labeled alternative in {@link DRAWParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOLOR(DRAWParser.COLORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SIZE}
	 * labeled alternative in {@link DRAWParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIZE(DRAWParser.SIZEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV(DRAWParser.DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(DRAWParser.TContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNC}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNC(DRAWParser.FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MUL}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMUL(DRAWParser.MULContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONST}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONST(DRAWParser.CONSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POWER}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOWER(DRAWParser.POWERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ERROR}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitERROR(DRAWParser.ERRORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLUS1}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLUS1(DRAWParser.PLUS1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code MINUS1}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMINUS1(DRAWParser.MINUS1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code LRBACK}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLRBACK(DRAWParser.LRBACKContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLUS}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLUS(DRAWParser.PLUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link DRAWParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMINUS(DRAWParser.MINUSContext ctx);
}