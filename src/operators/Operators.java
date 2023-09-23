package operators;

/**
 * 
 * @author sathish
 *
 *         1.Arithmetic Operators ( +,-,*,/,% ) 
 *         2.Unary Operators 
 *         		i.unary minus(-) 
 *         		ii.Increment(++) [ pre & post ] 
 *         		iii.Decrement(--) [ pre & post ] 
 *         3.Assignment Operators ( = , +=,-= ) 
 *         4.Relational Operators (== , < , <= , >= ,!= ) 
 *         5.Logical Operators ( && - and , || - or, ! -not) 
 *         
 *         	  i. && - check only one condition
 *         		 & - check double condition
 *
 *         			the "&&" operator is used as a logical AND operator. It returns true
 *         		if both operands are true, and false otherwise. The expression using
 *         		"&&" is only evaluated further if the first operand evaluates to
 *         		true, otherwise it stops and returns false immediately.
 * 
 *         	   ii . || 
 * 
 *         			the "||" operator is used as a logical OR operator. It returns true
 *         		if either one of the operands is true, and false otherwise. The
 *        		expression using "||" is only evaluated further if the first operand
 *        		evaluates to false, otherwise it stops and returns true immediately.
 *        
 *        		==>> AND -- Both true then return true
 *        		==>> OR -- Any one true then return true
 *        
 *        6. Ternary Operator
 *        
 *        		condition ? true : false ;
 */
public class Operators {
	
	public static void main(String[] args) {
		
		Long count = 0L;
		
		count++;
		
		System.out.println(count);
		
	}
}
