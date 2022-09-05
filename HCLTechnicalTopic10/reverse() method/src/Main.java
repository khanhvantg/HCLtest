import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// fill your code here
		System.out.println("Enter the number of users:");
		Scanner sc = new Scanner(System.in);

		ArrayList<User> UserList = new ArrayList<User>();
		try {
			int n= sc.nextInt();
			sc.nextLine();

			for (int i = 0; i < n; i++)
			{
				System.out.println("Enter the details of User " + (i+1));
				String userInfo = sc.nextLine();
				String user[] = userInfo.split(",");
				UserList.add(new User(user[0], user[1], user[2], user[3]));

			}
			Collections.sort(UserList);
			Collections.reverse(UserList);
		} catch (Exception e){

		} finally {
			System.out.println("The user details in reverse order:");
			System.out.printf("%-15s%-15s\n","Name", "Mobile number");

			for (User user: UserList){
				System.out.println(user.toString());
			}
		}

	}
}