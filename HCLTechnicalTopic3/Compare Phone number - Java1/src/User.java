public class User {

        //Fill your code
	private String name, username,password;
	private Long phoneNumber;
	
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
    boolean flag = false;
	public boolean comparePhoneNumber(User userOne, User userTwo)	{
		
		//Fill your code
		if(userOne.phoneNumber==userTwo.phoneNumber)
			return !flag;
		return flag;
	}
	
}