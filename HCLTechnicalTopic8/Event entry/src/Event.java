public class Event extends Thread{
	//Your code here	
	private String entry;

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public Event(String entry) {
		this.entry = entry;
	}
	
	public void run() {
		EventBO.processEvent(this.entry);	
		System.out.println("The number of current participants are " + EventBO.currentPeopleCount);	
	}
	
}
