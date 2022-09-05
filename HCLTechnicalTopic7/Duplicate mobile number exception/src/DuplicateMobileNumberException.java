
public class DuplicateMobileNumberException extends Exception{
	//your code here
	public DuplicateMobileNumberException(String s){
		super(s);
	}
	public String toString(){
		return "DuplicateMobileNumberException: Mobile number and alternate mobile number are same ";
	}
}
