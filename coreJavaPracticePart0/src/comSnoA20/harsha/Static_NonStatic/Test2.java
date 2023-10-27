package comSnoA20.harsha.Static_NonStatic;

public class Test2 {
	//first execution
	//overall only one time initialized use static
	static {
		System.out.println("static block");
	}
	
	
	//third Execution
	{
		System.out.println("non-static block");
	}
	
	//Fourth Execution
	public Test2(){
		System.out.println("constructor");
	}
	
	//entry point
	//second execution
	public static void main(String[] args) {
		System.out.println("main Method");
		new Test2();
	}
}
