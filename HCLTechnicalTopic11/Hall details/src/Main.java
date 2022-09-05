import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException {
		//Your code here

		List<Hall> hallsList = new ArrayList<Hall>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of halls:");
		int n = sc.nextInt();
		sc.nextLine();
		Hall hall = null;
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] elements = input.split(",");
			hall = new Hall(elements[0], elements[1], Double.parseDouble(elements[2]), elements[3]);
			hallsList.add(hall);
			hall = null;
		}
		Hall.writeHallDetails(hallsList);
	}
}
