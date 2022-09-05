import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws Exception{ 
		Scanner s = new Scanner(System.in);
		String name;
		double costPerDay, deposit;

		ItemType p = new ItemType();
		
		System.out.println("Enter the item type name");
		p.setName(s.nextLine());
		System.out.println("Enter the cost per day");
		p.setCostPerDay(s.nextDouble());
		System.out.println("Enter the deposit");
		p.setDeposit(s.nextDouble());
		p.display();
	}
}