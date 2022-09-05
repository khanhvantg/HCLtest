public class PremiumStall implements Stall{
	//fill your code here
	private String stallName, ownerName;
	private Integer cost, projector;

	PremiumStall(String stallName, Integer cost, String ownerName, Integer projector){
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.projector=projector;
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
	public Integer getProjector() {
		return projector;
	}
	public void setProjector(Integer projector) {
		this.projector = projector;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Stall Name: " + stallName);
		System.out.println("Cost: Rs." + cost);
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Number of Projectors: " + projector);
	}
	
}