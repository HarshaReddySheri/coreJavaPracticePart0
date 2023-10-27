package comSnoA20.harsha.Static_NonStatic;//No need of object creation

import java.util.Random;
public class StaticVariable {

	static int number;
	public static void main(String[] args) {
		
		StaticVariable.number = new Random().nextInt();
		StaticVariable.number = new Random().nextInt();
		StaticVariable.number = new Random().nextInt();
		StaticVariable.number = new Random().nextInt();
		StaticVariable.number = new Random().nextInt();
		
		System.out.println(StaticVariable.number);
		System.out.println(StaticVariable.number);
		System.out.println(StaticVariable.number);
		
		

	}

}
