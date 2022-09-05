class Exhibition extends Event {
	
    //Fill your code here
	private static int gst=5;
	private int noOfStalls;
	
	
	public Exhibition(String name, String type, double costPerDay,int noOfDays, int noOfStalls) {
		super(name, type, costPerDay, noOfDays);
		this.noOfStalls=noOfStalls;
	}
	
    public static int getGst() {
		return gst;
	}

	public static void setGst(int gst) {
		Exhibition.gst = gst;
	}

	public int getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(int noOfStalls) {
		this.noOfStalls = noOfStalls;
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
		"Number of stalls:"+this.getNoOfStalls()+"\n"+
		"Total amount:"+String.format("%.2f",this.totalCost());
    }
}