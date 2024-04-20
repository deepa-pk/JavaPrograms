package javaBasicToCore;
import java.util.Scanner;
/*
 * switch & else if --> Selection statements 
 * based on the condition select the statement and executes so called selection statement
 */
public class SwitchStatement {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		a = scanner.nextInt();
		System.out.println("Enter the 2nd number");
		b = scanner.nextInt();
		System.out.println("Enter the operator +,-,*,/ ,%");
		char op = scanner.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(a+ "+" +b + " is: " + (a+b));
			break;
		case '-':
			System.out.println(a+ "-" +b + " is: " + (a-b));
			break;
		case '*':
			System.out.println(a+ "*" +b + " is: " + (a*b));
			break;
		case '/':
			System.out.println(a+ "/" +b + " is: " + (a/b));
			break;
		case '%':
			System.out.println(a+ "%" +b + " is: " + (a%b));
			break;
		default:
			System.out.println("Enter a valid operator");
		}
				
		scanner.close();

	}

}
/* Switch is the alternative to if
 * in switch - code looks neat and easy to maintain
 * To handle multiple scenarios - each scenario has different behavior
 * character must be given in single quotes
 * To scan character : scanner.next().charAt(0);
 * scanner.next() - to scan string
 * charAt(0) - to scan the character at 0th position.
 * In Strings & Arrays - position starts from zero
 * swith(op) - switch based on the operator. Decision making operator 
 * can switch character or int or any
 * If a case matches & executes the block to avoid executing further blocks break is used.
 * 
 */




