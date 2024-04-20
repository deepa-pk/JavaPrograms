package practisedPrograms;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter the number: ");
		n= scanner.nextInt();
		
		while(true) {
			if(n<=1) {
				break;
			}
				fact=n*fact;
				n--;
			}
		System.out.println(fact);
			
		scanner.close();	
	}

}
