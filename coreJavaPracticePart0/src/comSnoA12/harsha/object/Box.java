package comSnoA12.harsha.object;

public class Box {
	double width=25;

	public static void main(String args[]) {
		Box b1 = new Box();
		Box b2 = b1;
		
		System.out.println("b1.width:" + b1.width);
		System.out.println("b2.width:" + b2.width);
		
		b2=null;
		System.out.println("b1.width:" + b1.width);
		System.out.println("b2.width:" + b2.width);
	}
}
