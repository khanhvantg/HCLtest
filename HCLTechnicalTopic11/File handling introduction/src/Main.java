import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args)  throws IOException{

		//Fill your code here
		BufferedReader br = new BufferedReader(new FileReader("input.csv"));
		UserBO userBO = new UserBO();
		List<User> userList = userBO.readFromFile(br);
		if (userList.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			String name="Name", email="Email", username="Username", password="Password" ;
			System.out.printf("%-15s %-20s %-15s %s\n", name, email, username, password);
			userBO.display(userList);
		}
	}
}
