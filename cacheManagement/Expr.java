import java.util.HashMap;
/**
 * This class works as the cache manager as well as the abstract 
 * super class of all expressions
 **/
public abstract class Expr {
	
	protected boolean cached = false; //flag for using or not using the cache
    protected long value;
    protected HashMap<String,Long> cache = new HashMap<String,Long>();// The cache
    /**
     **  Evaluate this expressions.
     **  This eval() method fetches the cached value of this expression,
     **  if it is available.  Otherwise, computes the value and caches
     **  it for later, when it just calls uncachedEval() at that point
     **  from within it self.
     **  @return The value of this expression.
     **/
    public abstract long eval(); //
    
    public abstract long uncachedEval();//
}
