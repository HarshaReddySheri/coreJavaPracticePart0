package comSnoA20.harsha.Static_NonStatic;

public class Test3 {

	//first execution
	//overall only one time initialized use static
	static int number;
	static {
		System.out.println("static block3");
		number = 10;
	}
	
	static {
		System.out.println("static block1");
		number = 10;
	}
	static {
		System.out.println("static block2");
		number = 10;
	}
	//third Execution
	{
		System.out.println("non-static block");
	}
	
	//Fourth Execution
	public Test3(){
		System.out.println("constructor");
	}
	
	//entry point
	//second execution
	public static void main(String[] args) {
		System.out.println("main Method");
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		Test3 t3 = new Test3();
		Test3 t4 = new Test3();
		Test3 t5 = new Test3();
	}
}


