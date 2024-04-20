package javaBasicToCore;
/* Conditional operator */
public class ConditionalOperator {

	public static void main(String[] args) {
		
		int a=45, b=60;
		int max;
//		if(a>b)
//			max=a;
//		else
//			max=b;
		
		max = (a>b)?a:b;
		
		System.out.println(max);
	}
}
/* max = condition(a>b) ?	true(a)	: false(b); 
 * if the condition is true stores a in max
 * if the condition is false stores b in max
 */


