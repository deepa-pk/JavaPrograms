package practisedPrograms;
import java.util.Scanner;
public class AlphabetSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char alphabet= scanner.next().charAt(0);
		
		switch(alphabet) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(alphabet + " is Vowel");
			break;
		default:
			System.out.println(alphabet + " is constant");
			scanner.close();
		}
	}

}
