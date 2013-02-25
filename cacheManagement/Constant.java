/**
 *  This class implements constant expressions.
 *  A constant expression is the representation of an "int".
 **/

public class Constant extends Expr {
	/**
     *  Construct this expression.
     *  @param value The int value represented by this expression.
     */
    public Constant (int value) { 
		this.value = value; 
    }
    public long eval () { return value; }
    
    public long uncachedEval(){ return 1;}

}
