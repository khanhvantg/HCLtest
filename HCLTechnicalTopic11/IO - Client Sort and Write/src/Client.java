class Client implements Comparable<Client>{
    private Integer clientId;
	private String name;
	private String email;
	private String phonenumber;
	private String country;
	
	
	@Override
	public String toString() {
		return clientId + "," + name + "," + email + "," + phonenumber+ "," + country+"\n" ;
	}
	public Client(Integer clientId, String name, String email, String phonenumber, String country) {
		super();
		this.clientId = clientId;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.country = country;
	}
	public Client() {
		super();
		
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public int compareTo(Client o) {
		//Fill your code here
		return this.clientId - o.getClientId();
	}
	
}