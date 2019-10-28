package oops;

public interface RBI {
	
	abstract void MinDeposit();
	abstract void MaxDeposit();
	abstract void MinWithDrawl();
	abstract void MaxWithDrawl();
	abstract void PersonalLoans();
	abstract void HomeLoans();
	abstract void AccountServices();
	
	public default void NoofCustomers()
	{
		System.out.println("Executing a default method - NoofCustomers..!");
	}
		
	static void MortgageLoan()
	{
		System.out.println("Executing a static method - MortgageLoan..!");
	}
	
	
	public static void main(String[] args)
	{
		MortgageLoan();
	}
	
}
