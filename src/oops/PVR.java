package oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		
		PVR pv = new PVR();
		pv.BikeParking();
		pv.Cafeteria();
		pv.CarParking();
		pv.TicketTypes();
		pv.FireSafety();
		pv.EmergencyExit();
		pv.OnlineBooking();

	}

	@Override
	public void BikeParking() {
		System.out.println("Bike Parking facility is available for 300 bikes");
		
	}

	@Override
	public void TicketTypes() {
		System.out.println("Ticket types are available for general, first class and deluxe categories");
		
	}

	@Override
	public void Cafeteria() {
		System.out.println("Cafeteria facility is available");
		
	}

	@Override
	public void FireSafety() {
		System.out.println("Fire Safety is available");
	}

	@Override
	public void EmergencyExit() {
		System.out.println("8 emergency exits are available");
		
	}

}
