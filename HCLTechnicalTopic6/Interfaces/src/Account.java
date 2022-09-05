import java.util.Date;

class Account {
	//fill the code
	private String name, accountNumber;
	private Double balance;
	private Date startDate;
	
	public Account (String name, String accountNumber, Double balance, Date startDate) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.startDate=startDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	
}

