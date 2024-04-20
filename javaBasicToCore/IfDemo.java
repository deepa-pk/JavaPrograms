package javaBasicToCore;
/*Else if ladder and Nested if */
import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if(number>0) 
			System.out.println(number+" is positive");
		else if(number==0)
			System.out.println(number+" is neutral");
		else
			System.out.println(number+" is negative");
		scanner.close();			
	}

}
/*if(condition should be given in parenthesis which should return boolean value)
 * if the condition is true - if block executes
 * if the condition is false - it executes the else block
 * NESTED IF
 		if(number>0) 
			System.out.println(number+" is positive");
		else {
			if(number==0)
			System.out.println(number+" is neutral");
			else
			System.out.println(number+" is negative");

 * 
 */
