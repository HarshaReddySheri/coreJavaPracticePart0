package comSnoB.harsha.Class;

public class Student1 { 

	public static void main(String[] args) {
		int height = 70; //inside the method is called local variable
		System.out.println(height);
		
		 
		test1(54);//type1 //parameter variable creation
		
	}
	public static void test1(int weight) {
		//System.out.println(height);//we can't access local variable in other method
		weight = 60;//type2
		System.out.println(weight);
	}
	
	
		//local variable can define and initialization
	//but parameters can only be defined	
}
