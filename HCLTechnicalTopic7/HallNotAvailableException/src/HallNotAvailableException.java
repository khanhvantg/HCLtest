public class HallNotAvailableException extends Exception{
	//fill your code here
	HallNotAvailableException(){
		
	}
	
	public String booked() {
		return "Hall Already Booked"; 
	}

	public String notexist() {
		return "Hall or Event does not exist"; 
	}
}
