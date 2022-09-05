import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception, IOException {

				//Fill your code
		String name, email, type, location; 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer Details");
		System.out.println("Enter the name");
		name=s.nextLine();
		System.out.println("Enter the email");
		email=s.nextLine();
		System.out.println("Enter the type");
		type=s.nextLine();
		System.out.println("Enter the location");
		location = s.nextLine();
		
		Customer cus=new Customer(name,email,type,location);
		cus.displayDetails();
		
	}
}


