package comSno5.harsha.Method;

public class Bank {
	static int currentBalance = 1000;
	
	public static void  greetCustomer() {
		System.out.println("Hello, Welcome to the banking application");
	}
	
	public void deposit(int amount) {							//if u need input for method we use parameter concept
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposit successful");
	}
	
	public void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawn successful");
	}
	
	public int getcurrentBalance(){
		return currentBalance;   			
		
	}
	
	
	public static void main(String[] args) {
		//Static method can access or calling directly any kind of non-static field or method. Only possible thought object creation
		Bank bank = new Bank();
		greetCustomer(); //Method calling withoutObject creation due to static 
		System.out.println("The currentBalance is : " + bank.getcurrentBalance());
		bank.deposit(500); //method calling with object creation due to nonStatic
		System.out.println("The currentBalance is : " + bank.getcurrentBalance());
		bank.withdrawal(300);
		System.out.println(bank.getcurrentBalance());
	}
	
}
