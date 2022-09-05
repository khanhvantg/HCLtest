public class Address implements Comparable<Address>{
	//fill your code here
	private String username, addressLine1, addressLine2;
	private int pinCode;

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Address(String username, String addressLine1, String addressLine2, int pinCode) {
		super();
		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	
	
	public int getPinCode() {
		return pinCode;
	}

	public int compareTo(Address address){
		if (pinCode == address.pinCode)
		{
			return (addressLine1.compareTo(address.addressLine1));
		}
		else if (pinCode > address.pinCode)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
