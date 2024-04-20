package javaBasicToCore;
//2D Array = Array of arrays
public class ArrayTwoDimensional {

	public static void main(String[] args) {
		int marks[][] = new int[3][4]; //[rows][columns]
		marks[0][0]=85;
		marks[0][1]=75;
		marks[0][2]=65;
		marks[1][0]=95;
		marks[1][1]=45;
		marks[1][2]=55;
		marks[2][1]=77;
		for(int[] m: marks) {
			System.out.println(m);
		}
		
		int b[][]= new int[4][];//mentioning only the size of rows not columns it possible to do so.		
		b[0] = new int[5];
		b[1] = new int[3];
		b[2] = new int[100];
		b[3] = new int[4];
//		four different arrays can be allocated in four different sizes 
		
		int charac[][] = {
				{2,3,4,5},
				{5,6,4,3},
				{7,8,6,5}
		}; //2D arrays can be totally initialized directly like this
//		to separate each arrays use (,) comma separated values
		
	}

}
