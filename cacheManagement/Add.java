/**
 *  This class implements addition expressions.
 *  An addition expression is the representation, e.g., of "666 + 999".
 */
public class Add extends Binary {

	/**
     *  Construct this expression.
     *  @param left The left subexpression of this expression.
     *  @param right The right subexpression of this expression.
     **/
    public Add (Expr left, Expr right) { 
    	this.left = left; 
    	this.right = right; 
    }
    /**
     *  Evaluate this expression.
     *  @return The value of this expression.
     */
    public long eval () { 
    if(cached){
		if (!cache.containsKey(this.left.toString()+"Add"+ this.right.toString())) {
		    value = uncachedEval();
		    cache.put(this.left.toString()+"Add"+ this.right.toString(), value);
		}
		else value =  cache.get(this.left.toString()+"Add"+ this.right.toString());
    }else 
		value = uncachedEval();
	return value;
    
    }
    public long uncachedEval(){
    	return left.eval () + right.eval ();
    }
}

