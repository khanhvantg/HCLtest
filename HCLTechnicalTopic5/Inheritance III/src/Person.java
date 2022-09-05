import java.text.SimpleDateFormat;
import java.util.Date;

public class Person{

        //    Fill your code
       	public String name;
       	public Date dateOfBirth;
       	public String gender;
       	public String mobileNumber;
       	public String bloodBankName;
       	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getBloodBankName() {
			return bloodBankName;
		}
		public void setBloodBankName(String bloodBankName) {
			this.bloodBankName = bloodBankName;
		}
		public Person(String name, Date dateOfBirth, String gender, String mobileNumber, String bloodBankName) {
			this.name = name;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.mobileNumber = mobileNumber;
			this.bloodBankName = bloodBankName;
		}
		
		public void displayDetails() {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Name: "+name);
			System.out.println("Date Of Birth: "+formatter.format(dateOfBirth));
			System.out.println("Gender: "+gender);
			System.out.println("Mobile Number: "+ mobileNumber);
			System.out.println("Blood BankName: "+bloodBankName);
		}
		
}


