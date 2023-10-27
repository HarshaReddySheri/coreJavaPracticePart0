package comSnoA21TypeReferenceWithLocalVariable;

import java.util.Arrays;

public class LVTypeInference {
	public void abc(){
		System.out.println("abc");
	}
	
	public static void main(String[] args) {
		//var can use in variables, Arrays, object creation
		var i = 10000;
		var s1 = "Yadagiri Reddy";
		var b1 = true;
		
		System.out.println(i);
		System.out.println(s1);
		System.out.println(b1);
		var var = 10;
		System.out.println(var);
		
		//Array --> remove square bracket from Left hand side
		
		
		var arr = new int [5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 2;
		arr[4] = 2;
		System.out.println(Arrays.toString(arr));
		
		var arr1 = new int[] {1,2,8};
		System.out.println(Arrays.toString(arr1));
		
		
		//object creation can also be use var
		var c = new LVTypeInference();
		c.abc();
	}
}
