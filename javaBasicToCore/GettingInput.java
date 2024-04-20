/*  Getting inputs from user 
 * To scan char - scanner.next().charAt(0);
 * */

package javaBasicToCore;
import java.util.Scanner;	//inbuilt class in java.util package
public class GettingInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
//		<ClassName>space<variableName> = new(Keyword)Space<ClassName>(Predefined object);
//		System.in -is predefined object of input stream
//		creating object for Scanner class
		System.out.println("What is your name?");
		String name = scanner.nextLine(); 
		
		System.out.println("What is you rating from 1-5");
		int rating = scanner.nextInt();
		scanner.nextLine();
//		After scanning number immediately scan nextLine to avoid storing enter key as char
		
		System.out.println("Enter your email");
		String email = scanner.nextLine();
		
		System.out.println("Hello "+ name);
		System.out.println("You rated as: "+rating);
		System.out.println("Your email is: "+email);
		
		System.out.println("Enter a byte value from -128 to +127");
		byte byteValue = scanner.nextByte();
		System.out.println("Enter a short value from -32768 to +32767");
		short shortValue = scanner.nextShort();
		System.out.println("Enter a int value");
		int intValue = scanner.nextInt();
		System.out.println("Enter a long value");
		long longValue = scanner.nextLong();
		System.out.println("Enter a float value");
		float floatValue = scanner.nextFloat();
		System.out.println("Enter a double value");
		double doubleValue = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter a char");
		char charValue = scanner.next().charAt(0);
		
		System.out.println("The byte value is: "+byteValue);
		System.out.println("The short value is: "+shortValue);
		System.out.println("The int value is: "+intValue);
		System.out.println("The long value is: "+longValue);
		System.out.println("The float value is: "+floatValue);
		System.out.println("The double value is: "+doubleValue);
		System.out.println("The character value is: "+charValue);
	
		scanner.close();
		
	}

}
