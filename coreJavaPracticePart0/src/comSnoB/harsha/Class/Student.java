package comSnoB.harsha.Class;

public class Student{   //inside class is called GLOBAL VARIABLE
	int id = 101;//instance variable creation
	int pass = 220;
	static int pin = 102;//class variable creation
	public static void main(String [] args) {
		Student student = new Student();//object creation
		System.out.println(student.id);// instance variable access
		
		System.out.println(new Student().pass);//without object creation can access 
		// instance or non static variable is NEEEDED of object creation
		
		System.out.println(pin); //class variable access
		//static or Class variable is NO NEEDED of object creation
	}
}
