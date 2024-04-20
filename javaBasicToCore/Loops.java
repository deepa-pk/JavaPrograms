package javaBasicToCore;
//Loops- used to repeat set of instructions again and again.
//for(),while(),dowhile()
public class Loops {

	public static void main(String[] args) {
//		------------------for loop------------------
		int counter;
		for(counter=1;counter<=5;counter++) { //can use i instead of counter
			//i stands for iterator
			System.out.print("*");
		}
		System.out.println("\toutside the loop counter is:"+counter);
		
//		------------------while loop------------------
		int j=1; //initialization
		while(j<=5) { //condition
			System.out.print(j);
			j++;
		}
		System.out.println("\toutside the loop j is:"+j);
		
//		------------------do while loop------------------
		int k=1; //initialization
		do{ //condition
			System.out.print(k);
			k++;
		}while(k<=5); 
		System.out.println("\toutside the loop j is:"+k);
	}

}
/* for loop: for(int i=1;i<=n;i++) 
 *  syntax: for(initialization;condition;incr/decr){...}
*	initialization(int i=1)
*	condition(i<=5) - can use && || in condition
*	condition should based on relational operator to get result as true/false,where to stop
*	increment/decrement (each step +1) counter=counter+1; counter+=1;
*for, while - checks condition at first - entry controlled loop
*			- execution is completely based on the condition.
*do while - checks condition at last - exit controlled loop
*		  - though the condition fails the loop is executed at least once
*		  - it is guaranteed that execution takes place once
*		  - at least once the loop will be executed.
*
*/	
