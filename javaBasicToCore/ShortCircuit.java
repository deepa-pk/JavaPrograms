package javaBasicToCore;
/* &,| are used as bitwise(&), short circuit(&&), and boolean(true/false) operators 
 * SHORT CIRCUIT - Avoid checking 2nd operand in many scenarios (95% used)
 */

public class ShortCircuit {

	public static void main(String[] args) {
		int a=12;int b=22;
//							false    --> o/p false
		System.out.println(a>=20 && a<=30); //to check the is in between 20 and 30
				
//							true && true    --> o/p true
		System.out.println(b>=20 && b<=30);
//							true | true     -->o/p true
		System.out.println(a>=20 | a<=30);
//							true ||		    -->o/p true		
		System.out.println(a>=20 || a<=30);
//						  false  || true    --> o/p true
		System.out.println(b>20 || b<=30);
		
		
		
		 

	}

}
/*Same truth table but there is changes in behavior a=1;b=0
 * AND - if a=0 not necessary to check for 2nd operand obviously its false.
 * 		- if a=1 then its needed to check b
 * OR - if a=1 not needed check for 2nd operand obviously its true.
 * 		- if a=0 then its necessary to check b
 */
