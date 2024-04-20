package javaBasicToCore;
//import java.io.*;
public class MyFirstProgram {

	public static void main(String[] args) {
				System.out.print("Hello ");
				System.out.println("This is my first java program");
				System.out.println("with a lot of interest");
	}

}
/*public - publicly accessible
  		-JVM executes the program from the main
  		- If JVM needs to access the file, it should be declared as public
 * static - CAN'T CREATE OBJ FOR MAIN(); SO MAIN() IS ALWAYS STATIC
 		To use method without creating object.
 		If I write a method inside the class, to use the method need to create an object
 * void - has no return type NULL
 * main() - program execution starts from here, ENTRY POINT
 * main(String[] args) - i/p given to method
 * String - sequence of characters should given in double quotes
 * Syntax - rules
 * statement - line of code
 * System - a class inside the package java.lang class
 * out - instance(object) of the printstream class
 * PRINT - is a in-built method, in the package java.io.printstream; or java.io.*;
 */
