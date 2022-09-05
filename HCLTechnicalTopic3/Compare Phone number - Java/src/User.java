public class User {

        //Fill your code
	private String name, username,password;
	private long phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public User(String name, String username, String password, long phoneNumber) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;

    }
    boolean flag = false;
	public boolean comparePhoneNumber(User user){
		//Fill your code
		if (Long.toString(phoneNumber).equals(Long.toString(user.getPhoneNumber()))) {
			return !flag;
		}
		else return flag;
	}
	
}