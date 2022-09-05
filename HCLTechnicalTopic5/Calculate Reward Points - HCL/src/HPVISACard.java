class HPVISACard extends VISACard{

	public Double computeRewardPoints(String type, Double amount){
		Double amounts = super.computeRewardPoints(type, amount);
		if (type.equals("Fuel")) {
			amounts += 10.00;
		}	
		return amounts;
	}
}
