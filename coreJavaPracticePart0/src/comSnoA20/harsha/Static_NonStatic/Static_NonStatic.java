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
	 * Ans:
	 * 
	 * 3.How do we access static variable or methods?
	 * 
	 * 4.understand the memory concept
	 * 
	 * 
	 */
}
