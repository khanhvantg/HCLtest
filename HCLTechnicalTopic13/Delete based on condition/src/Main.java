import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Scanner sn = new Scanner(System.in);
		UserDAO d = new UserDAO();
		List<User> e = d.getAllUser();
		System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Username","Password");	
		for (User j: e) {
			System.out.println(j.toString());
		}
		System.out.println("Enter the username to be deleted:");
		String name = sn.nextLine();
		boolean flag = d.deleteUser(name);
		if (!flag) {
			System.out.println("User not found");
		}else {
			System.out.println("User deleted successfully");
		}
		List<User> f = d.getAllUser();
		System.out.format("%-15s%-15s%-15s%-15s\n","Name","Mobile","Username","Password");	
		for (User j: f) {
			System.out.println(j.toString());
		}
	}
}
