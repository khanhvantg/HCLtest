import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws Exception{ 		
		
		//Fill your code
		Scanner s = new Scanner(System.in);
		String nameOne, usernameOne, passwordOne, nameTwo, usernameTwo, passwordTwo;
		long phoneNumberOne, phoneNumberTwo;
		
		System.out.println("Enter Name");
		nameOne=s.nextLine();
		System.out.println("Enter UserName");
		usernameOne=s.nextLine();
		System.out.println("Enter Password");
		passwordOne=s.nextLine();
		System.out.println("Enter PhoneNumber");
		phoneNumberOne=s.nextLong();
		s.nextLine();
		System.out.println("Enter Name");
		nameTwo=s.nextLine();
		System.out.println("Enter UserName");
		usernameTwo=s.nextLine();
		System.out.println("Enter Password");
		passwordTwo=s.nextLine();
		System.out.println("Enter PhoneNumber");
		phoneNumberTwo=s.nextLong();
		
		User userOne = new User(nameOne, usernameOne, passwordOne, phoneNumberOne);
		User userTwo = new User(nameTwo, usernameTwo, passwordTwo, phoneNumberTwo);
		boolean flag=userOne.comparePhoneNumber(userTwo);
		if(flag==true)
			System.out.println("Same Users");
		else System.out.println("Different Users");
		
	}
}