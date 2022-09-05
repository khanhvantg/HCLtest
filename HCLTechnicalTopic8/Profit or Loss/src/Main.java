import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//Your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events");
		int noOfEvents = Integer.parseInt(sc.nextLine());
		if (noOfEvents > 0 && noOfEvents % 2 == 0) {
			System.out.println("Enter event details in CSV");
			String eventDetail = "";
			List<Event> eventList = new ArrayList<Event>();
			ComputeStatus computeStatus = new ComputeStatus();
			ThreadGroup threadGroup = new ThreadGroup("TG1");
			Thread t1 = new Thread(threadGroup, computeStatus, "T1");
			Thread t2 = new Thread(threadGroup, computeStatus, "T2");
			for (int i = 0; i < noOfEvents; i++) {
				eventDetail = sc.nextLine();
				String[] details = eventDetail.split(",");
				HallBooking hallBooking = new HallBooking(details[1],
						Double.parseDouble(details[2]),
						Integer.parseInt(details[3]),
						Integer.parseInt(details[4]));
				Event event = new Event(details[0], hallBooking);
				eventList.add(event);
				computeStatus.setEventList(eventList);
				if (i + 1 == noOfEvents / 2) {
					t1.start();
					try {
						t1.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					eventList.clear();
				}
				if (i + 1 == noOfEvents) {
					t2.start();
				}
			}
		 } else {
			 System.out.println("Invalid Input");
		 }

	}
}
