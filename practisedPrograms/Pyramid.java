package practisedPrograms;
import java.util.Scanner;
/* Printing pyramid*/
public class Pyramid {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number from 0 to 9 to get pyramid");
		int n= scanner.nextInt();
		System.out.println("     "+n+"     ");
		System.out.println("    "+n+n+n+"    ");
		System.out.println("   "+n+n+n+n+n+"   ");
		System.out.println("  "+n+n+n+n+n+n+n+"   ");
	
		scanner.close();
	}

}
