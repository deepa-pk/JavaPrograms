package javaBasicToCore;

/* Arithmetic operators  
 * Compound Assignment
 * Increment and Decrement Operator
 * */
public class ArithmeticOperators {

	public static void main(String[] args) {
		int a=10, b=2,c;
		a+=3;	//a=a+3; 
		c=a+b; 
		System.out.println("The value of Arithmetic operator c is: "+c);
		
		int a1=11,b1=2,c1;
		c1=a1/b1; 
		System.out.println("The value of Modulo c1 is: "+c1); // o/p->5 --in order to get answer precisely use double/float
		
		int x=11;
		x%=b; 
		System.out.println("The value of compound assignment x is:" +x);
		
		int z=11;
		z++;
		++z;
		System.out.println("The value of z after increment is:"+z);
//		int d=11++; incr/decr operator can't be used for constants. used for variables
		
		int p=60,q;
		q=p++; //post increment - 1st stores the value of p in q (then increment the value of p)
		System.out.println("post incr p is: "+p);
		System.out.println("post incr q is: "+q);
		
		q=++p; //pre increment - 1st increment the value of p & store in q
		System.out.println("pre incr p is: "+p);
		System.out.println("pre incr q is: "+q);
		
	}

}
/* An operator(+,-,*,/,%) has two operands a&b; both can be variables or anyone can be number
   % -> gives reminder
 * Compound Assignment --> can both be variables or one of them can also be number
 * can also be used with bitwise operators (<,>)
 * a=a+b; --> a+=b 
 * a=a-3; --> a-=3 
 * a=a*3; --> a*=3 
 * a=a/3; --> a/=3   
 * a=a%3; --> a%=3   
 * Easy to type & the operations takes place faster
 * Increment or Decrement Operator => to increase/decrease the value by 1.
 * pre increment : ++a
 * post increment : a++
 * pre decrement : --a
 * post decrement : a-- 
 */
