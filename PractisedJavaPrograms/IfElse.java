package practisedPrograms;
/* you are given 3 integers a,b and c. It is guaranteed that two of these integers are 
 * equal to each other. What is the value of third integer.
 */
class ExtraNumber{
	public static int extraNum(int a,int b, int c) {
		if(a==b)
			return c;
		else if(a==c)
			return b;
		else 
			return a;		
	}
}

public class IfElse {

	public static void main(String[] args) {
				
		System.out.println(ExtraNumber.extraNum(10,10,2));
		System.out.println(ExtraNumber.extraNum(5,6,5));
		
	}

}
