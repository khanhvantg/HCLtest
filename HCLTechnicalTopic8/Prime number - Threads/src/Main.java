import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		//Fill your code here 
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		PrimeNumber p = new PrimeNumber(n);
		p.run();
	}

}
