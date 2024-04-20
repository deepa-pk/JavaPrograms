package javaBasicToCore;

public class LoopControl {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==3 && j==3) {
					break;
				}
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
		System.out.println("----------------");
		outerLoop:
			for(int i=1;i<=5;i++) {
				innerLoop:
				for(int j=1;j<=5;j++) {
					if(i==3 && j==3) {
						break outerLoop;	//Labelled break
					}
					System.out.print("*");
					
				}
				System.out.print("\n");
			}
		
		
	}

}
/*
 *  two loops present here - we have given break in nested loop
 * break - will come out of the loop in which it is present 
 		 - will not come out of all loop even in nested loop
 * To come out of all loop - label the loop
 */
/*
output

*****
**    -->breaks out of innerLoop if we didn't mention anything in particularly
*****
*****
----------------
*****
*****
**    -->breaks out of outerLoop

 */

