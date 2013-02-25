
public abstract class Binary extends Expr {

	/** The left and right subexpressions of this expression. */
    protected Expr left, right;
    /**
     *  Compute the left subexpression of this expression.
     *  @return The left subexpression of this expression.
     */
    public Expr getLeft () { return left; }
    /**
     *  Compute the right subexpression of this expression.
     *  @return The right subexpression of this expression.
     */
    public Expr getRight () { return right; }

}
