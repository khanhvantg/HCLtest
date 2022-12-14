public class ItemType {

	private String name;
	private double costPerDay, deposit;

	public String getName( ) {
		return name;
	}
	
	public void setName(String name) { 
		this.name = name; 
	} 

	public double getCostPerDay() {
		return costPerDay;
	}
	
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public void display(){
		System.out.println("Item type details");
		System.out.println("Name : " + name);
		System.out.println("CostPerDay : "+String.format("%.2f",costPerDay));
		System.out.println("Deposit : "+String.format("%.2f",deposit));
	}
}