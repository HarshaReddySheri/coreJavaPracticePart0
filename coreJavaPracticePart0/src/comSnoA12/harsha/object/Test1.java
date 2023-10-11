package comSnoA12.harsha.object;

public class Test1 {
	
	public Test1() {
		
	}
	
	public Test1(int a) {
		
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1(10);
		Test1 t3 = new Test1(20);
		//every hashCode number is different so every object is different
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
	}
}
