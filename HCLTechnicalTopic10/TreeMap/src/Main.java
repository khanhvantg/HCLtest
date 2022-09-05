import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args){
		//fill your code here
		String[] events;
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events:");
		int noOfEvent = sc.nextInt();
		sc.nextLine();
		TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
		for(int i=0;i<noOfEvent;i++) {
			input = sc.nextLine();
			events = input.split(",");
			String name = events[0];
			Integer price = Integer.parseInt(events[1]);
			Integer seatBooked = Integer.parseInt(events[2]);
			if(treeMap.containsKey(price)) {
				Integer seat = treeMap.get(price);
				treeMap.put(price, (seat+seatBooked));
			} else {
				treeMap.put(price, seatBooked);
			}
		}
		System.out.println("Ticket Price Tickets Booked");
		for(Map.Entry m:treeMap.entrySet()){
			System.out.printf("%-15s %s\n",m.getKey(),m.getValue());
		} 
	}
}
