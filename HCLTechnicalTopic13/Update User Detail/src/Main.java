import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Scanner sn = new Scanner(System.in);
		UserDAO d = new UserDAO();
		List<User> e = d.getAllUsers();
		System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");	
		for (User j: e) {
			System.out.format("%-5s %-5s %-15s %-10s %s\n",j.getId(),j.getName(),j.getContactDetail(),j.getUsername(),j.getPassword());
		}
		System.out.println("Enter the username:");
		String name = sn.nextLine();
		User u = d.findUserByUsername(name);
		if (u != null) {
			System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");	
			System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
			System.out.println("Enter the mobile number to be updated:");
			String phone = sn.nextLine();
			u.setContactDetail(phone);
			d.updateUser(u);
			System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");	
			System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
		}else {
			System.out.println("No such user is present");
		}
	}
}