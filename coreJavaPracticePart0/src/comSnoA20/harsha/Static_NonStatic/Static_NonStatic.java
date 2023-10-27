package comSnoA20.harsha.Static_NonStatic;

public class Static_NonStatic {
	/*
	 * Agenda
	 * ******
	 * 
	 * 1.What is static in java?
	 * Ans:Class --> storage of variable & method important as like blue print constructor & blocks
	 * 		-->If we want to memory for a class we must  create object
	 * 
	 * 		-->Object creation is done then complete class member are allocated memory
	 * Memory allocation type
	 * 1.Object creation or nonStatic allocation
	 * 2.static allocation
	 * 
	 * Access 
	 * ******
	 * NonStatic ----> object.name
	 * Static    ----> class.name
	 * 
	 * Blocks
	 * ******
	 * --> Static block
	 * --> Non-Static block
	 * 
	 * Used for help to variable initialization
	 * 
	 * Main --> it is a entry point off program but before that static block will execute first
	 * But without Main --> we can't run program
	 * 
	 * static field are not suitable for constructor
	 * *********************************************
	 * field are like variable's
	 * 
	 *  //Suitable
	 * EX: Static int number;
	 * 
	 * 		static{
	 * 			s.o.pln("static block");
	 * 			number = 10;
	 * 		}
	 *		
	 *  //Not Suitable
	 *  EX: static int number;
	 *  	public Test2(){
	 *  	s.o.pln("constructor");
	 *  	number = 10;
	 *  	}
	 *  
	 *  *******************************************************************************************************
	 *  Static fields
	 *  HOw many time's you load the class one time initialization is done for static
	 *  
	 *  Constructor inside the static field
	 *  How many time's you load the class so many time initialization is done to many object creation happened
	 *  *******************************************************************************************************
	 *  
	 *  so that we have to keep in the static block
	 *  *static field are in static block
	 *  
	 *  Static can access nonStatic directly
	 *  But nonStatic can't access static directly 
	 *  we must create object to nonStatic
	 *  
	 *  public static void main(String[] args ){
	 *  new Test2().print(); //can't access without object creation
	 *  }
	 *  
	 *  //nonStatic Method
	 *  public void print(){
	 *  	main(null); //can access without object creation
	 *  }
	 *  
	 * 2.How to specify static and nonStatic KeyWords on variables, Methods and blocks?
	 * Ans: we done all the codes, please see in static & non static package
	 * 
	 * 3.How do we access static variable or methods?
	 * Ans: 
	 * 
	 * Why we use static variables in java?
	 * 
	 * static variable are used for Memory management.
	 * static variable are used for common property of all the object.
	 * _________________ 
	 *
	 * Normal variables
	 * _________________
	 * 
	 * company -----> parent
	 * -------
	 * em1  em2   -->class both are in same company
	 * 
	 * we create object for each employ
	 * company name for all the object employ will be the same 
	 * if defined normal variable in class with company name then every time we create an object 
	 * java will allocate new memory for that object & class name variable
	 * for 100 object ---> class name
	 * 
	 * variable java will 100 time memory allocated
	 * 
	 * even storing the same value that is name of company
	 * 
	 *
	 * ________________
	 * 
	 * static variables
	 * ________________
	 * 
	 * company -->parent
	 * em1  em2 -->static className
	 * 
	 * Memory is only allocated at one time that is class loading
	 * All other object will referred to the same memory location
	 * defined as static in class this variable is belong to class not for employees
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * what is static method?
	 * 1.static methods are also called as class methods
	 * 			--> belong to class not to object
	 * 2.static methods are used for memory management
	 * 
	 * Normal Method
	 * ______________
	 * 
	 * 		  class
	 * object1	   object2
	 * |			|
	 * NM			NM
	 * 
	 * When normal method is created then all the object have the separate copy of method 
	 * because normal method belong to object
	 * every time new object is created then memory will allocated for normal method
	 * 
	 * static Method
	 * ______________
	 * 
	 * 			class
	 * object1        object2 --both are static method
	 * 
	 * Use static method only one copy is created that one copy share among all the object.
	 * 
	 * 
	 * FEATURES
	 * ________
	 * 
	 * 1.Static Method can access and modify static variables
	 * 2.We can access static method directly with class name
	 * EG: classNAme.staticMethod();
	 * 
	 * Main Method in java is static so JVM can access it without object creation
	 * 
	 *    
	 *  																						JVM MEMORY
	 * 4.understand the memory concept												____________________________________Method Area___________
	 * 																				| class1		 |class2	| class3	| ............... |
	 * 																		Static	|static block	 |SB		|SB			| ............... |
	 * 																				|static variables|SV		|SV			| ............... |
	 *				  compile 				 run/execute							|static Methods	 |SM		|SM			| ............... |
	 * Ans:Java File -----------> Class File -------------> Class Loader ---------->|________________|__________|___________|_________________|
	 * 																				|									Heap Memory			  |	
	 * 																				|object1		 |object2   |							  |				
	 * 																				|variables       |variables |							  |
	 * 																				|methods		 |Methods   |                  			  |	
	 * 																				|_________________________________________________________|
	 * 																				|_______________________________________stack Area________|										
	 * 																				|_____________________________________PCRegisters_________|
	 * 																				|_____________________________________NativeMethodStack___|
	 * 	USE STATIC METHOD AREA
	 * if u want's to share one memory to all object's or same instance
	 * if u want's one variable must be same for every data
	 * 
	 * 
	 */
}
