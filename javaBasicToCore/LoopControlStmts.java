package javaBasicToCore;
import java.util.Scanner;
/*
 * Jump statements
 * For a given n, find the nearest number divisible by 10 that is less than or equal n
 * 90-90,78-70, 64-60, 99-90
 */
public class LoopControlStmts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n=scanner.nextInt();
		while(true) { //while(n>=0)
			if(n%10==0) {
				System.out.println(n);	
				break; //even though the condition is true, break-exit the loop
			}
				n--;
		}
		//System.out.println(result);
		
		scanner.close();
			 
	}

}
/*While(true) - is an infinite loop
 * most probably break is used in 'if'.
 * break is used only after checking some information.
 * 
 */


