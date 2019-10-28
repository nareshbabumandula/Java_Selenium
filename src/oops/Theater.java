package oops;

public abstract class Theater {

	// Methods with body or implememtation
	public void CarParking()
	{
		//body or implementation
		System.out.println("Car Parking facility should be available..!");
	}
		
	public void OnlineBooking()
	{
		//body or implementation
		System.out.println("Online Ticket Booking facility should be available..!");
	}
	
	//Bodyless or abstract methods or unimplemented methods
	public abstract void BikeParking();
	public abstract void TicketTypes();
	public abstract void Cafeteria();
	public abstract void FireSafety();
	public abstract void EmergencyExit();
	
	
}
