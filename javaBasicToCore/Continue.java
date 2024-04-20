package javaBasicToCore;
/* The continue statement is often used to skip certain iterations of a loop based on a condition, 
 * without terminating the loop entirely.
 */
public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==7)
				continue; //Skips the rest of the loop body for i=7
			System.out.println(i);
		}

		outerLoop:
			for(int i=1;i<=5;i++) {
				innerLoop:
				for(int j=1;j<=5;j++) {
					if(i==3 && j==3) {
						continue outerLoop;	//Labelled continue like labelled break
					}
					System.out.print("*");					
				}
				System.out.print("\n");
			}

	}

}
/* continue is a way of saying continue to the next iteration, just for the one given time when(i==7)
 don't execute anything which is instructed down below.
 * the continue statement is used within loops to skip the current iteration and 
 proceed to the next iteration of the loop. 
 the remaining code inside the loop's body for the current iteration is skipped, 
 and the loop proceeds with the next iteration.
 */
/*
 * output for the program
1
2
3
4
5
6
8
9
10
*****
*****
*******
*****
*/
