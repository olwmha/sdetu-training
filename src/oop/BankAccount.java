package oop;

public class BankAccount implements IRate {
	//Defining the variables
	
	String accountNumber;
	//can also declare final after the static which means it cannot be changed in the other page.
	//Static --> belongs to the Class and not the object instance
	//Final --> Constant that cannot be changed
	
	//Static variable
	private static final String routingNumber = "55432";
	
	//Instance variable
	private String name;
	private String id;
	String accountType;
	double balance = 0;
	
	//Constructor definitions (these are unique methods)
	//Uses:
		//1.Used to define or set up or initialize properties of an object
		//2.Constructors are IMPLICITLY called upon instantiation (called automatically as soon as we create an object)
		//3.Must have the same name as the class itself.
		//4.Constructors have no return type therefore cannot use void or int etc
	
	BankAccount(){
		System.out.println("New account created");
	}
	
	//Overloading: calling the same method name with different arguments (can apply to any method) Java discerns using the different arguments called.
	BankAccount(String accountType){
		System.out.println("New account: " + accountType + " created.");
	}
	//Any variable accessed in the parent method can be accessed in the child but not the other way around
	//Thus variables defined in the method below are not available to other methods
	//initDeposit, accountType and errorMsg are all local variables (defined within blocks e.g. methods, if statements and loops
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account: " + accountType + " created.");
		System.out.println("Initial deposit of:  R"+initDeposit);
		String errorMsg = null;
			if(initDeposit < 1000){
				errorMsg = "Error: The minimum initial deposit is R2000.00";
				System.out.println(errorMsg);
			}else{
				errorMsg = "Thank you for your initial deposit of: R" + initDeposit;
			}
			System.out.println(errorMsg);
			//Can then access this balance variable in the methods below as defined for the whole class not just the method and can be updated in the methods
			balance = balance + initDeposit;
	}
	
	//Getters/ Setters
	//We want the user to be able to define the name but not the variable name out right but rather call a function
	
	public void setName(String name){
		//the this stands for the name that belongs to the class not the method
		this.name = name;
	}
	public String getName(){
		return name;
	}
	//Shortcut can go to source then generate getters and setters 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	//Interface methods
	public void setRate(){
		System.out.println("Setting rate");
	}
	public void increaseRate(){
		System.out.println("Increasing rate");
	}

	
	//Define the methods (functions in oop)
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	public void withdraw(double amount){
		balance = balance + amount;
		showActivity("Withdraw");
	}
	//Private: can only be called in the class but it can within other methods that are then called
	private void showActivity(String activity){
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: R" + balance);
	}
	void checkBalance(){
		System.out.println("Your Balance is: R" + balance);
	}
	void getStatus(){
		
	}
}
