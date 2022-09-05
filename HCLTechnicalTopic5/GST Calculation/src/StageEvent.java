class StageEvent extends Event{

    //Fill your code here
	private static int gst=15;
	public static int getGst() {
		return gst;
	}


	public static void setGst(int gst) {
		StageEvent.gst = gst;
	}


	public int getNoOfSeats() {
		return noOfSeats;
	}


	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	private int noOfSeats;
	
	
	public StageEvent(String name, String type, double costPerDay,int noOfDays, int noOfSeats) {
		super(name, type, costPerDay, noOfDays);
		this.noOfSeats=noOfSeats;
	}
	
    
    public Double totalCost() {

       //Fill your code here
        
        return super.getCostPerDay()*super.getNoOfDays()*(100+gst)/100;
    }
    
    public String toString() {
       //Fill your code here
    	return "Event Details\n" + 
		"Name:" + this.getName()+"\n"+
		"Type:"+this.getType()+"\n"+
		"Number of seats:"+this.getNoOfSeats()+"\n"+
		"Total amount:"+String.format("%.2f",this.totalCost());
    }
}