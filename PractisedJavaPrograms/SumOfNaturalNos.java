package practisedPrograms;
import java.util.Scanner;
public class SumOfNaturalNos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n;
		double sum = 0.0; //Initialize variable=0, in the area of accumulation/sum.
		System.out.println("Enter the numbers. Enter a negative number to stop:\n ");
		while(true) {
			n = scanner.nextDouble();
			if(n<0.0) {
				break;
			}
			sum = sum+ n; //accumulation
		}
		System.out.println("The sum is: "+sum);
		scanner.close();
		
	}

}
