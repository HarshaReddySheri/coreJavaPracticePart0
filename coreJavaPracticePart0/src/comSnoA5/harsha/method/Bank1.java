package comSnoA5.harsha.method;

public class Bank1 {
	
	static int currentBalance = 1000;
	public static void greetCustomer() {
		System.out.println("Hello, wellcome to the banking application");
	}
	public void deposit(int amount){
		currentBalance += amount;
		System.out.println("Amount is deposit successfully");
	}
	public static void withdrawal(int amount){
		currentBalance -= amount;
		System.out.println("Amount is withdrawal successfully");
	}
	public int getcurrentBalance(){
		return currentBalance;
		
	}
	public static void main(String[] args) {
		Bank1 bank = new Bank1();
		greetCustomer();// method calling without object creation due to static word
		System.out.println("currentBalance is: "+ bank.getcurrentBalance());
		
		bank.deposit(500);//method calling with object creation due to non-static word
		System.out.println("currentBalance is: "+ bank.getcurrentBalance());
		
		withdrawal(300);//method calling without object creation due to static word
		System.out.println("currentBalance is: "+ bank.getcurrentBalance());//method calling with object creation due to non-static word
		
	}

}
