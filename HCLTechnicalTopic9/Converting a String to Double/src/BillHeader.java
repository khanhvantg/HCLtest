import java.text.SimpleDateFormat;
import java.util.Date;

public class BillHeader {
	// fill your code here
	private Date issueDate, dueDate;
	private double originalAmount, amountOutstanding;
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public double getOriginalAmount() {
		return originalAmount;
	}
	public void setOriginalAmount(double originalAmount) {
		this.originalAmount = originalAmount;
	}
	public double getAmountOutstanding() {
		return amountOutstanding;
	}
	public void setAmountOutstanding(double amountOutstanding) {
		this.amountOutstanding = amountOutstanding;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return "Issue date: " + formatter.format(getIssueDate()) + 
				"\nDue Date: " + formatter.format(getDueDate()) +
				"\nOriginal amount Rs." + getOriginalAmount() + 
				"\nAmount outstanding Rs." + getAmountOutstanding();
	}
}