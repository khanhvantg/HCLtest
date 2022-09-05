import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		// fill your code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Address Details :\nEnter Line 1 :");
    	String line1 = sc.nextLine();
    	System.out.println("Enter Line 2 :");
    	String line2 = sc.nextLine();
    	System.out.println("Enter City :");
    	String city = sc.nextLine();
    	System.out.println("Enter Country :");
    	String country = sc.nextLine();
    	System.out.println("Enter Zip Code :");
    	int zipCode = sc.nextInt();
    	Address address = new Address(line1, line2, city, country, zipCode);
    	System.out.println(address.toString());
	}
}