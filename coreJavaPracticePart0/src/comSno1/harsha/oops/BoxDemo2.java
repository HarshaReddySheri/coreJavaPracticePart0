package comSno1.harsha.oops;
class Box2{
	double width;
	double height;
	double depth;
}

class BoxDemo2{
	public static void main(String args[]) {
		Box mybox = new Box();
		Box m1 = new Box();
		double vol;
		
		mybox.width = 10;
		mybox.height =20;
		mybox.depth =15;
		
		m1.width = 10;
		m1.height =10;
		m1.depth =10;
		
		vol = mybox.width*mybox.height*mybox.depth;
		System.out.println("Volume is " + vol);
		
		vol = m1.width*m1.height*m1.depth;
		System.out.println("Volume is " + vol);
	}
}
