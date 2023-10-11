package comSno9_10.harsha.ControlFlowStatements;
public class NestedIfDemo{
	public static void main(String args []) {
		
		int i = 50;
		
		if (i == 50);{
			System.out.println("i is 50");
			if(i < 70);{
				System.out.println("i is smaller then 70");
				if (i< 55);{
					System.out.println("i is also smaller then 55");
				}
			}
		}
	}
}