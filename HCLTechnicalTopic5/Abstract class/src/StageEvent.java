
public class StageEvent extends Event{
	private Integer noOfShows;
	private Double costPerShow;
	public StageEvent(String name, String detail, String type, 
			String organiser, Integer noOfShows,Double costPerShow) {
		super(name, detail, type, organiser);
		this.noOfShows = noOfShows;
		this.costPerShow = costPerShow;
	}

	Double calculateAmount() {

		return this.noOfShows *  this.costPerShow;

	}  

}