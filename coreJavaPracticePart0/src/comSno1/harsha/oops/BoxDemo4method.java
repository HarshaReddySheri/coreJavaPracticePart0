package comSno1.harsha.oops;
class Box4{
	double width;
	double height;
	double depth;
	//method with return type
	double volume() {
		return width *height*depth;
	}
}


class BoxDemo4method{
	public static void main(String args[]) {
		Box4 mybox1 = new Box4();
		Box4 mybox2 = new Box4();
		double vol;
		
		mybox1.width = 10;
		mybox1.height =20;
		mybox1.depth =15;
		
		mybox2.width = 10;
		mybox2.height =10;
		mybox2.depth =10;
		
		System.out.println("Volume is " +mybox1.volume());
		
		vol=mybox2.volume();
		System.out.println("volume is " +vol);
		

	}
}