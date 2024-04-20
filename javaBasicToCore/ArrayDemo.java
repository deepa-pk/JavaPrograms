package javaBasicToCore;
// one dimensional array
public class ArrayDemo {
//	syntax: dataType VariableName[] = new dataType[5];
	public static void main(String[] args) {
//		int marks[]; //declaration - doesn't allocate space 
		int marks[] = new int[5]; //allocates memory which is assigned to marks (array variable)
		marks[0]=89; //index starts from zero
		marks[1]=94;
		marks[2]=66;
		marks[3]=78;
		marks[4]=87; //index could always be size-1
		for(int m: marks) {
			System.out.print(m+",");
		}
		
		float[] oneD = new float[4];
		oneD[0] =88.5f;
		oneD[1] =45.0f;
		oneD[2] =89.9f;
		
		System.out.println("\n");
		for(float o:oneD) {
			System.out.print(o+",");
		}
		
		System.out.println(marks[1]); //didn't assign value automatically stores the value as zero
		char initials[] = {'a','b','c','d','e'}; //array constants can only be used in initializers
		for(char c:initials) {
			System.out.print(c+","); 
		}
	

	}

}
/* Arrays - Storing multiple values at one place
 * syntax: dataType VariableName[];
 * index/subscript starts from zero - gonna access using subscript
 * new - is a keyword
 * Creating n number variables take a lot of time also difficult to handle
 * array symbol can be used as: float[] a; float a[];
 * can also be used as: char[] c1,c2,c3; - can allocate separately using new keyword.
 * 
 */
