import org.antlr.v4.runtime.*;
public class BailErrorStrategy extends DefaultErrorStrategy {
/** Instead of recovering from exception e, rethrow it wrapped
* in a generic RuntimeException so it is not caught by the
* rule function catches. Exception e is the "cause" of the
* RuntimeException.
*/
	@Override
	public void recover(Parser recognizer, RecognitionException e) {
		//throw new RuntimeException(e);
		System.out.println("Erro no códido. Operação abortada.\n");
		Runtime.getRuntime().exit(1);
	}

/** Make sure we don't attempt to recover inline; if the parser
* successfully recovers, it won't throw an exception.
*/
	@Override
	public Token recoverInline(Parser recognizer) throws RecognitionException
	{
		//throw new RuntimeException(new InputMismatchException(recognizer));
		System.out.println("Erro no códido (inline). Operação abortada.\n");
		Runtime.getRuntime().exit(1);
		return null;
	}
	/** Make sure we don't attempt to recover from problems in subrules. */

	@Override
	public void sync(Parser recognizer) { }
}