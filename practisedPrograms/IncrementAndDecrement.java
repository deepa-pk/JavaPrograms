package practisedPrograms;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a=3, b=4, c; c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("c is: "+c);
		
		int d=15; d = d++ + ++d;
		System.out.println("d is: "+d);
		
		int e=15; e = ++e + ++e;
		System.out.println("e is:" + e);
		
		int f=0,g=0; int res=--f * --g * --f * g--;
		System.out.println("res is:"+res);
		
		int h=1; int result = h++ + ++h * --h - h--;
		System.out.println("The result is: "+result);
		System.out.println("------------------");
		
		int a1=10, b1=20; int c1 = a1++ + b1++;
		System.out.println("c1 is:" + c1);
		System.out.println("a1 is:" + a1);
		System.out.println("b1 is:" + b1);
		System.out.println("------------------");
		
		int a2=10, b2=20; int c2 = ++a2 + ++b2;
		System.out.println("c2 is:" + c2);
		System.out.println("a2 is:" + a2);
		System.out.println("b2 is:" + b2);
		System.out.println("------------------");
		
		int a3=10, b3=20; int c3 = a3++ + ++b3;
		System.out.println("c3 is:" + c3);
		System.out.println("a3 is:" + a3);
		System.out.println("b3 is:" + b3);
		System.out.println("------------------");
		
		int a4=10, b4=20; int c4 = ++a4 + b4++;
		System.out.println("c4 is:" + c4);
		System.out.println("a4 is:" + a4);
		System.out.println("b4 is:" + b4);
		System.out.println("------------------");
		

	}

}
