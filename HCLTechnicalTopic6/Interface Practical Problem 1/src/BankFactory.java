public class BankFactory {
	
     //	Fill your code
	public ICICI getIcici() {
		ICICI icici = new ICICI();
		return icici;
	}	
	public HDFC getHdfc() {
		HDFC hdfc = new HDFC();
		return hdfc;
	}
}