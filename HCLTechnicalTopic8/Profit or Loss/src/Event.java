public class Event {
	//Your code here
	private String name;
	private HallBooking hallBooking;
	
	public Event(String name, HallBooking hallBooking) {
		this.name = name;
		this.hallBooking = hallBooking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HallBooking getHallBooking() {
		return hallBooking;
	}

	public void setHallBooking(HallBooking hallBooking) {
		this.hallBooking = hallBooking;
	}
	
	
	
}
