import java.util.List;

public class Main {
	public static void main(String args[]) throws Exception{
		//your code goes here...
		UserDAO dao = new UserDAO();
		List<User> userList = dao.getAllUsers();
		System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
		for (User u : userList) {
			System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),
															u.getUsername(), u.getPassword());
		}
	}
}
