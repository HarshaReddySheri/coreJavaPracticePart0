package comSnoB.harsha.Class;

public class DataType {

	static byte b;
	static short s;
	static int i;
	static long l;
	static  float f;
	static double d;
	static boolean bool;
	static char c;
	

	//output in bytes
	public static void main(String[] args) {
		System.out.println(Byte.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Double.SIZE/8);
		System.out.println(Character.SIZE/8);
		
		System.out.println("  ");
		//
		System.out.print(Byte.MIN_VALUE + " ");
		System.out.println(Byte.MAX_VALUE);
		System.out.print(Short.MIN_VALUE + " ");
		System.out.println(Short.MAX_VALUE);
		System.out.print(Integer.MIN_VALUE + " ");
		System.out.println(Integer.MAX_VALUE);
		System.out.print(Long.MIN_VALUE + " ");
		System.out.println(Long.MAX_VALUE);
		System.out.print(Float.MIN_VALUE + " ");
		System.out.println(Float.MAX_VALUE);
		System.out.print(Double.MIN_VALUE + " ");
		System.out.println(Double.MAX_VALUE);
		System.out.print (Character.MIN_VALUE + " ");
		System.out.println(Character.MAX_VALUE);
		
		System.out.println("  ");
		
		/*byte b = 50;
		short s = 250;
		int i = 2147483647;
		long l = 9876543210L;
		float f = 3.14f;
		double d = 88.756421; 
		boolean b1= true;
		boolean b2 = false;
		char c = 'r'; */
		
		//Default values 
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bool);
		System.out.println(c);
		System.out.println(f);
		
	}
}
