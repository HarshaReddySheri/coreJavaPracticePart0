package comSnoA12.harsha.object;

public class Test {
	int i;
	int j;
	
	public Test() {
		//initializing these way is a good practice
		i = 10;
		j = 20;
	}
	
	//Giving values from outside to the constructor while from the object
	public Test(int i, int j) {
		
		//if you want to initialize what is given
		this.i = i;
		this.j = j;
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test(15,25);
		Test t3 = new Test(80,50);
		//Method access
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		//Variable access
		System.out.println(t3.i);
		System.out.println(t3.j);
		
		//verify the object are equal
		//every object has different reference variable 
		//so they are not equal
		System.out.println(t1 == t2);
		System.out.println(t2 == t3);
	}
	
	
	public int add() {
		return i+j;
	}
}
