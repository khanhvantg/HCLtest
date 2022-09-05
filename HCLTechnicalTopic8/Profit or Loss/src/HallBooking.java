public class HallBooking {
	//Your code here
	private String hallName;
	private Double cost;
	private Integer hallCapacity;
	private Integer seatsBooked;
	
	public HallBooking(String hallName, Double cost, Integer hallCapacity, Integer seatsBooked) {
		this.hallName = hallName;
		this.cost = cost;
		this.hallCapacity = hallCapacity;
		this.seatsBooked = seatsBooked;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getHallCapacity() {
		return hallCapacity;
	}

	public void setHallCapacity(Integer hallCapacity) {
		this.hallCapacity = hallCapacity;
	}

	public Integer getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(Integer seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
}
