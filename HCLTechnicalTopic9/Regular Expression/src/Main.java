import java.util.Scanner;

public class Main {
	public static void main(String []args){
		//fill your code here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the generated hall booking id to validate: ");
		String str = sc.nextLine();
		
		String regex = "[0-9]+";
		if (str.matches(regex)) {
			System.out.println("Valid Booking ID");
		} else {
			System.out.println("Invalid Booking ID");
		}
	}
}
