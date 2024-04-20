package javaBasicToCore;
import java.util.Scanner;
/*	>=90 - A
 * 	80-89 - B
 * 	70-79 - C
 *  60-69 - D
 *  <60 - E
 *  
 */

public class ElseIfLadder {

	public static void main(String[] args) {
		int mark;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks(0-100): ");
		mark = scanner.nextInt();
		  
		if(mark>=90)
			System.out.println("Grade A");
		else if(mark>=80)
			System.out.println("Grade B");
		else if(mark>=70)
			System.out.println("Grade C");
		else if(mark>=60)
			System.out.println("Grade D");
		else
			System.out.println("Grade E");
		
	scanner.close();
	}

}
/* If the first condition fails it moves down to the next 
   until the condition succeeds and prints the respected block
   else prints the else block
 * Here we are checking in descending order so it is not needed to check upper boundary. 
   To write shorter code
 * if marks are assigned in ascending order must check upper boundary in order to get correct output.
  Ex: if(marks>=60 && marks<=69)
  	System.out.println("Grade D");
 * 
 */ 
