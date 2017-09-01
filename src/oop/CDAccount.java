package oop;

//In order to inherit the object class must extends
public class CDAccount extends BankAccount {
	
	String interestRate;
	
	void compounding(){
		System.out.println("Compounding interest");
	}

}
