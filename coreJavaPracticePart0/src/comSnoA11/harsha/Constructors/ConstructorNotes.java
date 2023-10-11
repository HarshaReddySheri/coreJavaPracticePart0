package comSnoA11.harsha.Constructors;

public class ConstructorNotes {
	/*
	 * 
	 * Method
	 * ******
	 * Block of code in class
	 * but it's called After object creation is completed
	 * 
	 * Constructor
	 * ***********
	 * Block of code in class
	 * But it's called when the object were created
	 * 
	 * Remember
	 * ********
	 * it's not a method but it same like method than it's called constructor.
	 * default is constructor is always parameter less constructor
	 * who to provide multiple constructor?
	 * By changing parameter of constructor same like Method Overloading.
	 * Constructor is always mapped automatically --> according to parameterized. 
	 * 
	 * 
	 * Agenda
	 * ******
	 * 
	 * 1.What is a constructor?
	 * 2.What are the thumb rules for creating a constructor?
	 * 3.What is a default constructor or  implicit constructor?
	 * 4.What is an explicit constructor?
	 * 5.Different types of explicit constructor?
	 * Why we use the constructor?
	 * Ans: constructor always called at object creation.
	 * 		The operation which are performed while allocating memory are done in constructor.
	 * why we create object?
	 * Ans:To allocate the memory for class
	 *     to access classMembers --> variables & method
	 * 
	 * 1.What is a constructor?
	 * Ans: A constructor is a block of codes similar to the method 
	 * 		It is called when an instance(object) of the class is created.
	 *  
	 * 2.What are the thumb rules for creating a constructor?
	 * Ans: 1.A Constructor does not have return type.
	 * 		2.The name of the constructor is same as the name of the class.
	 * 		3.A constructor can't be abstract, final, static.
	 * 		4.Only allow access specifiers public,protected,private with constructor.
	 * 
	 * 
	 * 3.What is default constructor?
	 * Ans:A default constructor is a constructor created by the compiler if we do not define any constructor for a class
	 * 
	 * 				 compiler
	 * myClass.java  ---------->  myclass.class
	 * 
	 * 4.What is explicit constructor?
	 * Ans: Explicit mean done by the programmer
	 * 		Implicit mean done by the JVM or not the programmer
	 * 
	 * Different types of explicit constructor?
	 * -->Parameterized constructor
	 * -->Non-Parameterized constructor
	 * 
	 *5.Difference B/W constructor and Method?
	 * 
	 *		Constructor														Method
	 *
	 *1.A Constructor is used to									1.A method is used to expose  
	 *	initialize the state of an object								the behavior of an object
	 *
	 *2.A constructor is invoked implicitly 						2.The method id invoked explicitly
	 *
	 *3.The constructor Must not have a return type & static		3.The method must have a return type & may or may not static
	 *
	 *4.java compiler provide a default constructor 				4.The method is not provided by the compiler in any case 
	 *	if you don't have any constructor in a class
	 */
}
