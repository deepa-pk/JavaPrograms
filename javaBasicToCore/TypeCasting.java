package javaBasicToCore;

public class TypeCasting {

	public static void main(String[] args) {
		byte b = 5; //1 byte
		int n; //4 byte
		n = b; //LHS>RHS = Automatic/Implicit type conversion. 
		System.out.println(n);
		
		byte b1;
		int n1 =10;
		b1 = (byte)n1; //LHS<RHS = Explicit type conversion => not always works well
//		error: Type mismatch- cannot convert from int to byte 
//		temporarily changes (n1)integer value as byte and stores in b1
		System.out.println(b1);
		
		byte b2; //1 byte
		int n2 = 100000; //4 byte
		b2 = (byte)n2; //explicit type conversion byte can't hold the value in integer so throws error
		System.out.println(b2);
//		If LHS<RHS should be careful value cannot be stored correctly
		
	}

}
/*
 * If receiving variable LHS>RHS = Automatic/Implicit type conversion. 
 * 
 * 
*/
