// Generated from LLinha.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LLinhaParser}.
 */
public interface LLinhaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LLinhaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LLinhaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LLinhaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LLinhaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LLinhaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LLinhaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(LLinhaParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(LLinhaParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(LLinhaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(LLinhaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LLinhaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LLinhaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#expressaoprec}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoprec(LLinhaParser.ExpressaoprecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#expressaoprec}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoprec(LLinhaParser.ExpressaoprecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LLinhaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LLinhaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#vetor}.
	 * @param ctx the parse tree
	 */
	void enterVetor(LLinhaParser.VetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#vetor}.
	 * @param ctx the parse tree
	 */
	void exitVetor(LLinhaParser.VetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#dclvetor}.
	 * @param ctx the parse tree
	 */
	void enterDclvetor(LLinhaParser.DclvetorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#dclvetor}.
	 * @param ctx the parse tree
	 */
	void exitDclvetor(LLinhaParser.DclvetorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(LLinhaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(LLinhaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#dif}.
	 * @param ctx the parse tree
	 */
	void enterDif(LLinhaParser.DifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#dif}.
	 * @param ctx the parse tree
	 */
	void exitDif(LLinhaParser.DifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#menori}.
	 * @param ctx the parse tree
	 */
	void enterMenori(LLinhaParser.MenoriContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#menori}.
	 * @param ctx the parse tree
	 */
	void exitMenori(LLinhaParser.MenoriContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#maiori}.
	 * @param ctx the parse tree
	 */
	void enterMaiori(LLinhaParser.MaioriContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#maiori}.
	 * @param ctx the parse tree
	 */
	void exitMaiori(LLinhaParser.MaioriContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(LLinhaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(LLinhaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LLinhaParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LLinhaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link LLinhaParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LLinhaParser.DivContext ctx);
}