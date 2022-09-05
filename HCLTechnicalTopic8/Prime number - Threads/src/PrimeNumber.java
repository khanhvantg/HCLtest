
public class PrimeNumber extends Thread {
	Integer number;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public PrimeNumber() {

	}

	public PrimeNumber(Integer number) {
		this.number = number;
	}

	boolean checkPrime(Integer n) {
		if ( n < 2) return false;
		for (Integer i = 2; i < n; i++) {
			if ( n % i == 0) return false;
		}
		return true;
	} 
	public void run() {
		System.out.println("Prime number between 1 to " + this.number);
		for (Integer i = 1; i <= this.number; i++) {
			if (checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
