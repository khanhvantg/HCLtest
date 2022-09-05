import java.util.Date;

class Flight {
    //fill your code here
	String clientName, idProof;
	Date flightschedule;
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public Date getFlightschedule() {
		return flightschedule;
	}
	public void setFlightschedule(Date flightschedule) {
		this.flightschedule = flightschedule;
	}
	
	public Flight(String clientName, String idProof, Date flightschedule) {
		super();
		this.clientName = clientName;
		this.idProof = idProof;
		this.flightschedule = flightschedule;
	}
	
	
}