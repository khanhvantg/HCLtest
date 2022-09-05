import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of hall in csv format:");
		String str1 = sc.nextLine();
		String[] a = str1.split(",");
		UserDAO ud = new UserDAO();
		User user = null;
		System.out.println("Enter the username:");
		String str2 = sc.nextLine();
		user = ud.getUser(str2);
		while(user==null) {	
			System.out.println("Username seems to be wrong!! Enter the correct username:");
			str2 = sc.nextLine();
			user = ud.getUser(str2);
		}
		
		Hall h = new Hall(a[0], a[1], Double.parseDouble(a[2]), user);
		HallDAO d = new HallDAO();
		d.saveHall(h);
		List<Hall> e = d.getAllHall();
		Collections.sort(e);
		System.out.println("The hall details are:");
		System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Cost","Owner");
		for (Hall j: e) {
			System.out.format("%-15s%-15s%-15s%-15s\n",j.getName(),j.getContactNumber(),j.getCostPerDay(),j.getOwner().getName());
		}	
	}
}
