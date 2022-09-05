
class Exhibition extends Event{
	private Integer noOfStalls;
	public Exhibition(String name, String detail, 
			String ownerName, Integer noOfStalls) {
		super(name, detail, ownerName);
		this.noOfStalls = noOfStalls;
	}

	@Override
	public Double projectedRevenue() {
		return (double) (this.noOfStalls * 10000);
	}

	public Integer getNoOfStalls() {
		return noOfStalls;
	}

	public void setNoOfStalls(Integer noOfStalls) {
		this.noOfStalls = noOfStalls;
	}

}