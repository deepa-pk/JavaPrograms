package javaBasicToCore;
import java.util.Scanner;
public class Loops1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many stars do you want using for loop");
		int n = scanner.nextInt();
		
		System.out.println("for: ");
		for(int i=1;i<=n;i++) {
			System.out.print(i);
		}
		System.out.println("\nwhile: ");
		int j=1;
		while(j<=n) {
			System.out.print("*");
			j++;
		}
		int k=1;
		System.out.println("\ndo while: ");
		do {
			System.out.print(k);
			k++;
		} while(k<=n);
		
		scanner.close();

	}

}
//If we give 0--> do while executes at least once
//			  --> where for and while fails to execute the loop
// can write any program in any loop, its completely based on one's convenience