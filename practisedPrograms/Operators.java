package practisedPrograms;
/* Magical property of EXOR
*(a^b)^a =b
*(a^b)^b =a 
*/
public class Operators {

	public static void main(String[] args) {
		int a=5; 
		System.out.println(a&1); //manipulates bit by bit
//		0101
//		0001
//	&-> 0001  -->O/p - 1
		int b=5;
		int c=(b^3)^b; 
		System.out.println(c);
//b		0101
//3		0011
//		----
//^->   0110
//3		0101
//		----
//^		0011-->O/p - 3 //Magical property of EX-OR
//		----
	}

}
