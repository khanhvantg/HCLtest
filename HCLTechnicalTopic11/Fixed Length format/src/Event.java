public class Event {

	private String name;
	private String detail;
	private String type;
	private String organiser;
	private int attendeesCount;
	private double projectedExpense;
	
	public Event(String name, String detail, String type, String organiser, int attendeesCount,
			double projectedExpense) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.organiser = organiser;
		this.attendeesCount = attendeesCount;
		this.projectedExpense = projectedExpense;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrganiser() {
		return organiser;
	}

	public void setOrganiser(String organiser) {
		this.organiser = organiser;
	}

	public int getAttendeesCount() {
		return attendeesCount;
	}

	public void setAttendeesCount(int attendeesCount) {
		this.attendeesCount = attendeesCount;
	}

	public double getProjectedExpense() {
		return projectedExpense;
	}

	public void setProjectedExpense(double projectedExpense) {
		this.projectedExpense = projectedExpense;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-20s%-15s%-15s%-15s\n",this.name, this.detail, this.type, this.attendeesCount, this.projectedExpense);
	}
}