package oop;

public class LoanAccount implements IRate {
//The rate methods can now be implemented in the Bank account and the loan account with the same rate affecting both
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase rate");
	}
	 
}
