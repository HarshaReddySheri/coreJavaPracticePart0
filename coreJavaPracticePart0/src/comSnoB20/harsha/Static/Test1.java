package comSnoB20.harsha.Static;//No need of object creation

import java.util.Random;
public class Test1 {

	static int number;
	public static void main(String[] args) {
		
		Test1.number = new Random().nextInt();
		Test1.number = new Random().nextInt();
		Test1.number = new Random().nextInt();
		Test1.number = new Random().nextInt();
		Test1.number = new Random().nextInt();
		
		System.out.println(Test1.number);
		System.out.println(Test1.number);
		System.out.println(Test1.number);
		
		

	}

}
