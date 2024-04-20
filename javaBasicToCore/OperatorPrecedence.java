package javaBasicToCore;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int a=10, b=25;
		
		double c= a*b-10 /a;
		double d= (a*b-10) /a;
		
		System.out.println(c);
		System.out.println(d);


	}

}
/*
 * Equal to has last priority
 * To change priority use brackets - parenthesis has high priority
 * Preference as per-priority
 * ++ postfix
 * -- prefix
 * *	/	%
 * +	-
 * >>	>>>	<<
 * >	>=	<	<= instanceof
 * ==	!=
 * &
 * ^
 * |
 * &&
 * ||
 * ?:
 * ->
 * =
 * 
 * 
 */

