package practisedPrograms;
import java.util.Scanner;
public class FirstNOddNums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the upper limit to print odd no's: ");
		int num= scanner.nextInt();
		
		for(int i=1;i<=num;i+=2) {
			System.out.print(i+",");
		}
		scanner.close();

	}

}
