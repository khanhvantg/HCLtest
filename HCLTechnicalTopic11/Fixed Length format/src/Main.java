import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String ch = null;
		BufferedReader br = new BufferedReader(new FileReader("input.csv"));
		ArrayList<Event> e = EventBO.readFile(br);
		do {
			System.out.println("Enter the name of the person whose events to be shown:");
			String s = sc.nextLine();
			ArrayList<Event> es = EventBO.eventsByPerson(e, s);
			if(es.isEmpty()) {
				System.out.println("The given person has no upcoming events");
			}else {
				System.out.printf("%-15s%-20s%-15s%-15s%-15s\n" , "Name", "Detail", "Type", "Attendees Count", "Projected Expense");
				for(int i = 0; i < es.size(); i++) {
					System.out.print(es.get(i).toString());
				}
			}
			System.out.println("Do you want to continue?(y/n)");
			ch = sc.nextLine();
		}while(ch.equals("y"));
	}
}