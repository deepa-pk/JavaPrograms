package javaBasicToCore;
/*Bitwise operators - used for Encryption & Decryption - in whatsapp for secured based on bitwise manipulation
 * Parity checking in networks
 * Error code
 * Ex-or is used in graphics
 * ~ NOT << left shift - value is equivalent to multiples of 2 - fill the replaced number as 0
 * & AND >> right shift - value is equivalent to divisible of 2 -retains the sign
 * | OR >>> right shift with zero fill
 *  ^ EX-OR 
 *  Higher order bit has 1 then it is Negative number
 *  */
public class BitwiseOperators {

	public static void main(String[] args) {
		int a=9, b=12; 
		int c=a&b;
		System.out.println("a&b is: "+ c);
		c=a|b;
		System.out.println("a|b is: "+ c);
		c=a^b;
		System.out.println("a^b is: "+ c);
		c=~a;
		System.out.println("~a is: "+c); //mostly the value of negations are -ve numbers
		
		int p=4; 
		System.out.println("Integer p after left shift: " + (p<<1)); //fills replaced values as 0's
		System.out.println("Integer p after left shift: " + (p<<2));
		System.out.println("Integer p after left shift: " + (p<<28)); //0/p=1073741824
		System.out.println("Integer p after left shift: " + (p<<30)); //o/p=0:num 1 went out of memory
		
		byte q=4;//byte b=4;/short p=4; - automatically promoted to int in expressions
		//in expressions byte/short are promoted as int in arithmetic op/logical op/bitwise op
		System.out.println("Byte q after left shift(casted): " + (byte)(q<<28));
		
		int r=-3;
		System.out.println("right shift: " + (r>>1)); //o/p: negative num - retains sign
		System.out.println("right shift with zero fill: " + (r>>>1)); //o/p: omits sign - with zero fill
	}

}
/* 1 byte has 8 bits
 * int has 32 bits
 * Binary number -2's power
 * 5 - (101)2 needs 3 bits to store the value [In background everything is bitwise manipulation]
 * 6 - (110)2
 * Decimal number - raising 10's power
 * &[AND] -> If both the values are true -->o/p true [only 1 possibility]
 * |[OR] -> If any one value is true -->o/p true [3 possibilities]
 * ^[EX-OR] -> Strict OR, only either one is true o/p--> true [2 possibilities]
 * 			-- if both are true/false o/p--> false
 * ~[NOT] -> needs only one value change 0 as 1 and 1 as 0.
 * mostly the value of negations are negative numbers
 * Negative numbers are stored as 2's compliment
 * 2's compliment - negate the given number and adding one with it
 */
