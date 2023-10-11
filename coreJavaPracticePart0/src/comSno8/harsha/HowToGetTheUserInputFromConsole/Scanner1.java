package comSno8.harsha.HowToGetTheUserInputFromConsole;

import java.util.Scanner;
public class Scanner1{
	
	public static void main(String args []) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter your name: ");
		System.out.println("Your name is: " + input.nextLine());
		
		System.out.println(input.nextInt());
		System.out.println(input.nextDouble());
		System.out.println(input.nextByte());
		System.out.println(input.nextShort());
		System.out.println(input.nextLong());
		System.out.println(input.nextFloat());
		System.out.println(input.nextBoolean());
		input.close();
	}
    
}
