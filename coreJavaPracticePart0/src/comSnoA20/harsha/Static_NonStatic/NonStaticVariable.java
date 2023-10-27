package comSnoA20.harsha.Static_NonStatic;//object creation needed

import java.util.Random;

public class NonStaticVariable {
	int number;
	public static void main(String[] args) {
		NonStaticVariable t1 = new NonStaticVariable();
		t1.number = new Random().nextInt();
		
		NonStaticVariable t2 = new NonStaticVariable();
		t2.number = new Random().nextInt();
		
		NonStaticVariable t3 = new NonStaticVariable();
		t3.number = new Random().nextInt();
		
		System.out.println(t1.number);
		System.out.println(t2.number);
		System.out.println(t3.number);

	}

}
