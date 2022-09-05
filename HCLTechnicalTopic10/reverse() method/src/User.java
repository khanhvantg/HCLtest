public class User implements Comparable<User>{
	//write your code here

	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public User(String name, String mobileNumber, String username, String password) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int compareTo(User arg0) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(arg0.name));
	}
	
	@Override
	 public String toString() {
		return String.format("%-15s%-15s",getName(),getMobileNumber());
	 }
}