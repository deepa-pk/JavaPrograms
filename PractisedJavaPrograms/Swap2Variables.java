package practisedPrograms;
/* Swap two variables using EXOR's Magical property without using third variable
 * Magical property of EXOR
*(a^b)^a =b
*(a^b)^b =a 
*/
public class Swap2Variables {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping a & b is: "+a+"\t" +b);
	
		a=a+b; //a has sum of two variables
		b=((a^b)^b) -((a^b)^a);//b=a-b; 
		a=((a^b)^b) -((a^b)^a); //a=a-b;
		System.out.println("After swapping a & b is: "+a+"\t" +b);
	}

}
