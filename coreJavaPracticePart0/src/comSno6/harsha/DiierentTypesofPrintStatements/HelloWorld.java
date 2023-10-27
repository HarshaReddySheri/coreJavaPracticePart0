package comSno6.harsha.DiierentTypesofPrintStatements;
public class HelloWorld
{
	public static void main(String arg[])
	{
		System.out.printf("The current year is %d and the month is %s", 2022, "March");
		System.out.println();
		System.out.println("Hello World!");
		
		System.out.print("Hello World! ");           //difference b/w print and println
		
		System.out.print("Hello World!1");
		
		
		
		
		System.out.println();
		
		
		/*
		  %b boolean
		  %c character
		  %d integer
		  %e scientific notation
		  %f floating point
		  %s string
		  %tc complete date and time
		  %n a newline on this platform
		  %% the character %X
		 */
		System.err.printf("The current year is %d and the month is %s", 2022, "March");
		System.out.println();
		System.err.println("Hello World!");
		System.err.print("Hello World!");
		System.err.print("Hello World!2");
		
		
		
		
	}
	
}