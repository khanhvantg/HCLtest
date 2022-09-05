import java.util.Date;

public class Staff extends Person{

	public Staff(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName) {
		super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
		// TODO Auto-generated constructor stub
	}
	public int employeeID;
	public String designation;
	
	
	
	public int getEmployeeID() {
		return employeeID;
	}



	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}

	

	public Staff(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName,
			int employeeID, String designation) {
		super(name, dateOfBirth, gender, mobileNumber, bloodBankName);
		this.employeeID = employeeID;
		this.designation = designation;
	}



	public void displayStaffdetails() {
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Designation: "+designation);
	}
}
