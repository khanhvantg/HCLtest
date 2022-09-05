import java.text.SimpleDateFormat;
import java.util.Date;

class InternationalFlight extends Flight {
	
    //fill your code here
	private String passportNumber, natureOfVisit;

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getNatureOfVisit() {
		return natureOfVisit;
	}

	public void setNatureOfVisit(String natureOfVisit) {
		this.natureOfVisit = natureOfVisit;
	}

	
	
	public InternationalFlight(String clientName, String idProof, Date flightschedule, String passportNumber,
			String natureOfVisit) {
		super(clientName, idProof, flightschedule);
		this.passportNumber = passportNumber;
		this.natureOfVisit = natureOfVisit;
	}

	void displayFlightDetails() {
		SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");
		String date = formater.format(this.flightschedule);
		System.out.println("Flight Details :");
		System.out.println("Name : " + this.clientName);
		System.out.println("ID Proof : " + this.idProof);
		System.out.println("Flight Schedule : " + date);
		System.out.println("Passport Number : " + this.passportNumber);
		System.out.println("Flight Schedule : " + this.natureOfVisit);
	}
}