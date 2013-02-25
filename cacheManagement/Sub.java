	/**
	 *  This class implements subtraction expressions.
	 *  A subtraction expression is the representation, e.g., of "3-2".
	 */

	public class Sub extends Binary {
	    /**
	     *  Construct this expression.
	     *  @param left The left subexpression of this expression.
	     *  @param right The right subexpression of this expression.
	     */
	    public Sub (Expr left, Expr right) { this.left = left; this.right = right; }
	    /**
	     *  Evaluate this expression.
	     *  @return The value of this expression.
	     */
	   
	    public long eval () { 
	        if(cached){
	    		if (!cache.containsKey(this.left.toString()+"Sub"+ this.right.toString())) {
	    		    value = uncachedEval();
	    		    cache.put(this.left.toString()+"Sub"+this.right.toString(), value);
	    		    //cached = true;
	    		}
	    		else value =  cache.get(this.left.toString()+"Sub"+ this.right.toString());
	        }else 
	    		value = uncachedEval();
	    	return value;
	        
	        }
	        public long uncachedEval(){
	        	return left.eval () - right.eval ();
	        }

	}
