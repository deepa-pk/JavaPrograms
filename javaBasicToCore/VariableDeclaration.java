package javaBasicToCore;
//Java is case sensitives
public class VariableDeclaration { // class name should start in CAPITAL convention- CASE SENSITIVE
		    int instanceVar = 10; // instance variable 
		    static int classVar = 100; // class variable - declared as static

		    public void method() {
		        int localVar = 10; // local variable - method has local variable
//		        special symbols used in variable name are $ or _ 
//		        Variable name should be meaningful
//		        Eg: 
//		        	$ticketPrice - $
//		        	ticket_Price - _
//		        	ticketPrice1 - numbers also used but not as first character
		        
		        System.out.println("Local Variable: " + localVar);
		        System.out.println("Instance Variable: " + instanceVar);
		        System.out.println("Class Variable: " + classVar);
		    }
 

			public static void main(String[] args) { 
				int ticketPrice; //Variable declaration - CAMEL CASE 
				ticketPrice = 800; //assigning value - 800 is NUMERICAL LITERAL
				int tax=100;//Initialization
				int mark1 = 010; //Octal number
				System.out.println("The value of octal number 010 is: "+mark1);
				int mark2 = 0xA; //Hexa Decimal number in HD  A==10
//				In hexaDecimal (0x - followed by)numbers 0-9 & characters A-Z are allowed
				System.out.println("The value of Hexadecimal number 0xA is: "+mark2);
				System.out.println("int Ticket price is " + ticketPrice);
				System.out.println("Tax is " +tax);
				boolean paid = true; //BOOLEAN LITERAL
				System.out.println("The boolean value is: "+paid);
				char c = 't'; //CHARACTER LITERAL
				System.out.println("The character value is: "+c);
				byte b = 127;
				System.out.println("The Max of byte value is: "+b);
				short s = 32767;
				System.out.println("The Max of short value is: "+s);
				long l = 3456789L; //Add suffix l after assigning number
				System.out.println("The long value is: " +l);
				float f = 34.56789f;
				System.out.println("The float value is: "+f);
				double d = 35.9858533;
				System.out.println("The double value is: "+d);
				String str = "Dhanalakshmi"; //STRING LITERAL
				System.out.println("The string value is :"+str);
//				int binary = 0b010101; //JDK version 7.0 and above
//				int no = 123_456_789; //underscore is used instead of commas JDK version 7&above
//				float pi = 3.14159; - 
//				floating pt nums can be assigned in Std and Scientific notation.
//				float pi = 314159e-05; //Scientific notation 
				// -ve for small numbers where +ve numbers for larger numbers
				 
				System.out.println("--------------------------------");
				
				System.out.println("Hello \t world tabspace"); //tab space
				System.out.println("Hello \b world backspace"); //insert a backspace
				System.out.println("Hello \n world newline"); //insert a newline 
				System.out.println("Hello \r world carriage return"); //insert a carriage return
				System.out.println("Hello \f world form feed"); //insert a form feed
				System.out.println("\'Hello world\' single quote"); //insert a single quote
				System.out.println("\"Hello world\" double quote");//insert a double quote 
				System.out.println("Hello \\ world backslash character"); //insert a backslash character
				
				VariableDeclaration obj = new VariableDeclaration();
				obj.method();
			    }
				
			}


		/* Syntax: <dataType>Space<variableName>;
		 * Data Types: 
		Primitive Data Types- are predefined by the language and represent single values. 
							- byte,short,int,float,long,double,boolean,char.
		All the integers are converted into binary and stored.
		To change characters into binary we have ASCII table. It has standard fixed value. A=65,a=97
		Reference Data Types- These refer to objects and are instantiated from classes. 
							- Examples include 
		*Classes - are user-defined reference data types. They define the blueprint for creating objects. 
		 Instances of classes are created using the new keyword.
					
		*String- in Java are objects of the String class,represents a sequence of characters. 
		Strings are immutable, meaning their values cannot be changed once they are created.

		* Array - in Java are objects of the String class. They represent a sequence of characters. 
		* Strings are immutable, meaning their values cannot be changed once they are created.
		* ArrayList 
		* Interfaces: Interfaces define a set of methods that a class must implement. 
			They are reference types and can be used to achieve abstraction and multiple inheritance-like behavior 
			in Java.
		Object, Interface, 
		* Enum - Enums: Enums are a special kind of class used to represent a fixed set of constants. 
		They are implicitly inherited from the java.lang.Enum class and 
		can contain methods, constructors, and fields like regular classes.

		* Collection- Java provides a framework of classes and interfaces (like ArrayList, LinkedList, HashMap, etc.) 
			in the java.util package to represent collections of objects. 
			These are used to store and manipulate groups of objects.

		Initialization: Variables can be declared and initialized in the same statement: int num = 10;
		Scope: 
		^Scope of a variable defines where in the code it can be accessed.
		^Local variables are declared within methods, constructors, or blocks and can only 
		be accessed within those scopes.
		^Instance variables are declared within a class but 
		outside any method, constructor, or block and are accessible to all methods of the class.
		^Class variables (static variables) are declared with the static keyword and are shared 
		 among all instances of the class.

		Naming Conventions: Variable names must follow certain rules:

		Start with a letter, dollar sign $, or underscore _.
		Subsequent characters can also be digits.
		Cannot use Java reserved words.
		Case-sensitive.
		Final Variables: Variables declared with the final keyword cannot be reassigned once initialized.

		Arrays: Arrays are objects that store multiple variables of the same type. They are declared using brackets [].

		Implicit Initialization: Local variables are not initialized by default 
		and must be explicitly initialized before use. 
		Instance and class variables are automatically initialized with default values if not explicitly initialized.
		 */
	
