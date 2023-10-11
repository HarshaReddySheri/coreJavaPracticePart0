package comSno1.harsha.oops;
class Box3{
	double width;
	double height;
	double depth;
	//method without parameter
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width*height*depth);
	}
}


class BoxDemo3method{
	public static void main(String args[]) {
		Box3 m1 = new Box3();
		Box3 m2 = new Box3();
		double vol;
		
		m1.width = 10;
		m1.height =20;
		m1.depth =15;
		
		m2.width = 10;
		m2.height =10;
		m2.depth =10;
		
		m1.volume();
		m2.volume();
		
	//	vol = mybox.width*mybox.height*mybox.depth;
	//	System.out.println("Volume is " + vol);
		
	//	vol = m1.width*m1.height*m1.depth;
	//	System.out.println("Volume is " + vol);
	}
}