public class VISACard {
	private String type;
	private Double amount;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double computeRewardPoints(String type, Double amount){

		return 0.01 * amount;
	}

}
