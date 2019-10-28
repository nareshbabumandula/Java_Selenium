package oops;

public class ICICI implements RBI, FederalReserve{
	
	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.NoofCustomers();
		ic.AccountServices();
		ic.MinDeposit();
		ic.MaxDeposit();
		ic.MinWithDrawl();
		ic.MaxWithDrawl();
		ic.PersonalLoans();
		ic.HomeLoans();
	}

	@Override
	public void MinDeposit() {
		System.out.println("Min Deposit is 1000 Rupees");
		
	}

	@Override
	public void MaxDeposit() {
		System.out.println("Min Deposit is 2 lakhs");
		
	}

	@Override
	public void MinWithDrawl() {
		System.out.println("Min Deposit is 100 Rupees");
		
	}

	@Override
	public void MaxWithDrawl() {
		System.out.println("Min Deposit is 50k Rupees");
		
	}

	@Override
	public void PersonalLoans() {
		System.out.println("Personal Loans facility is available upto 50 lakhs");
		
	}

	@Override
	public void HomeLoans() {
		System.out.println("Home Loans facility is available");
	}

	@Override
	public void AccountServices() {
		System.out.println("AccountServices are available : opening/closing/update the customer details");
		
	}

}
