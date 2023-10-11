package comSnoA11.harsha.Constructors;

public class ConstructorPractice {
	public int i;
	public static void main(String[] args) {
		ConstructorPractice cp = new ConstructorPractice();
		System.out.println(cp.i);
	}
	
	//NonParameterized constructor --> Hard code
	public ConstructorPractice() {
		i = 20;
		System.out.println("constructor is called");
		
	}
	
	
	//Parameterized constructor --> soft code
	public ConstructorPractice(int a) {
		i = a;
	}
}
