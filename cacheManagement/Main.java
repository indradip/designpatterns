
import java.util.Random;

	public class Main {
	    /** 
	     *  The driver class invokes a cache-friendly and a cache hurting 
	     *  computation. 
	     **/
		
		 private static void nonRepeatativeCompute(){
		    	// Constructs a plain expression
			    Random r = new Random(System.currentTimeMillis ()); 
			    Expr tmp1, tmp2 = null;
		    	
				for (int i = 0; i < 50; i++) {
					
					Expr one = new Constant (r.nextInt());
					Expr two = new Constant (r.nextInt());
					Expr three = new Constant (r.nextInt());
					
				    tmp1 = new Add (one, two);
				    tmp2 = new Sub (tmp1, three);
					
				    // Construct a timed expressions
					TimedExpr timed = new TimedExpr (tmp2);
					// Print the results
					System.out.println ("value="+timed.eval ());
					System.out.println ("time="+timed.elapsed ());
				    
				}
				
		    	
		    }
	   
	    private static void repeatativeFib(){
	    	// Constructs a plain expression
	    	Expr previous = new Constant (0);
			Expr current = new Constant (1);
			for (int i = 2; i < 40; i++) {
			    Expr tmp = new Add (previous, current);
			    //System.out.println ("fib("+i+")="+tmp.eval ());
			    previous = current;
			    current = tmp;
			}
			// Construct a timed expressions
			TimedExpr timed = new TimedExpr (current);
			// Print the results
			System.out.println ("value="+timed.eval ());
			System.out.println ("time="+timed.elapsed ());
	    	
	    }
	    
	    public static void main (String [] args) {
	    	
	    	//repeatativeFib(); // cache friendly operation
	    	
	    	nonRepeatativeCompute(); // not so cache friendly
		
		
	    }
}
