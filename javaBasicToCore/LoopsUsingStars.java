package javaBasicToCore;

public class LoopsUsingStars {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) { //outer loop: to control rows
			for(int j=1;j<=5;j++) { //inner loop: is actually going to print (5*)stars for every iteration
				System.out.print(i);
			}
			System.out.print("\n");
		}
		System.out.println("------------------------");
		for(int i=1;i<=5;i++) { //outer loop: to control rows
			for(int j=1;j<=5;j++) { //inner loop: is actually going to print (5*)stars for every iteration
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

}
