import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		// fill your code here
		Scanner sc = new Scanner(System.in);

		Item<Integer> intItem = new Item<Integer>();
		Item<String> strItem = new Item<String>();

		System.out.println("Enter a integer :");
		intItem.set(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter a string :");
		strItem.set(sc.nextLine());
		System.out.println("Integer Value :" + intItem.get());
		System.out.println("String Value :" + strItem.get());
	}
}