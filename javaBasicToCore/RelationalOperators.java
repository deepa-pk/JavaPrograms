package javaBasicToCore;
/*
 * Relational Operators(6) -- mostly used with if [< <= > >= == !=]
 * Assignment operator --> a=b, for assigning value
 * == --> equal to 
 * != --> not equal to
 * Relational operators returns the value either true/false
 */
public class RelationalOperators {

	public static void main(String[] args) {
		int a=10,b=15;
		System.out.println(a>=100);
		int c=10;
		System.out.println(a>=c); //either a is greater or a is equal to c then the o/p is true
		System.out.println(a<c);
		System.out.println("Comparing the value of a&b "+ (a==b)); //To compare without disturbing the values
		a=b; //Assignment operator, it stores the value of b in a
		System.out.println("After assigning a=b,the value of a is: "+a);
		System.out.println("Comparing the value of a&b "+ (a==b));
		System.out.println(a!=b); //not equal to
		

	}

}
 //can be cross check b/w two variables(a>b) or with variable and number (a>100)
//can compare integer,floating point, double, boolean even char can be compared
/* In memory transistor is connected with capacitor 
 * if capacitor is charged it is 1
 * if it is not charged then it is 0
 * This is how information is stored in the memory(number,word,video,audio,photo)everything is stored in 0's &1's
 * ram==512mb -> mega byted 10e6 i.e -> 1 million apo 512million bytes 512million*8 bits
 * 
 * 
 * 
 */
