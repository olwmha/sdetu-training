package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// This App will create a new bank account		 
		
		//Calling the method
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0123456123";
		
		//acc1.name = "Olwethu";
		//Going to get the name using encapsulation as the variable is now private
		acc1.setName("Olwethu Mhaga");
		System.out.println(acc1.getName());
		acc1.balance = 10000;
		//Encapsulation once again (hiding variables in the private class and accessing thing publicly theough methods: get and set)
		acc1.setId("9402185804084");
		System.out.println("Your identification number is: " + acc1.getId());
		
		acc1.deposit(500);
		acc1.deposit(1000);
		acc1.deposit(200);
		acc1.withdraw(700);
		acc1.withdraw(200);
		
		//Methods from the interface are now available to the app
		acc1.setRate();
		acc1.increaseRate();
		
				
		//Calling the constructor
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0234567899";
		acc2.checkBalance();
		
		//Calling a different method although having the same name		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.accountNumber = "1231412433";
		acc3.checkBalance();
		
		
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		//cd1.name = "Juan Diego";
		cd1.setName("Juan Diego");
		cd1.accountType = "CD Account";
		cd1.compounding();
	}

}
