package comSnoA14_15_18.harsha.LoopingStatements;
public class DoWhileLoopDemo{
	public static void main(String args []) {
		
		//syntax 
		//do {
		//    statement(s)
		//    condition change statement
		//} while (expression);
		
		int count = 11;
		
		do {
		    System.out.println("Count is: " + count);
		    count++;
		} while (count < 10);
	}
}