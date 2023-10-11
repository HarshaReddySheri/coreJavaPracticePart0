package comSno1.harsha.package1;

public class A {  		//in a file we can declare one class as public 
	public int a ;		//classes can use only two access specifiers "public/default"
    protected int b;
    int c;
    protected int d;
    void f1() {
    	System.out.println(a + b + c + d);
    }
}

class B extends A{
	 void f1() {		//we can't manage more than one package in a single file
		 A a1 = new A();
	    	System.out.println(a + b + c + d);
	    }
}
class C {
	
}

//every class has default constructor auto generator with the same access specifier as that it class
