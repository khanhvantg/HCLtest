public class GoldStall  implements Stall{
	//fill your code here
	private String stallName, ownerName;
	private Integer cost, tvSet;
	
	GoldStall (String stallName, Integer cost, String ownerName, Integer tvSet){
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.tvSet=tvSet;
	}
	
	public String getStallName() {
		return stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getTvSet() {
		return tvSet;
	}
	public void setTvSet(Integer tvSet) {
		this.tvSet = tvSet;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name: " + stallName);
		System.out.println("Cost: Rs." + cost);
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Number of TV sets: " + tvSet);	
	}
}

