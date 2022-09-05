import java.util.*;
import java.text.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		ArrayList<Event> eventList=new ArrayList<>();
		ArrayList<Hall> hallList=new ArrayList<>();
		
		eventList.add(new Event("Book Fair","All books available","John","Exhibition"));
		eventList.add(new Event("Furniture Fair","Discount of 20%","Joe","Exhibition"));
		eventList.add(new Event("Magic show","Magic without Logic","Jack","Stage event"));
		
		hallList.add(new Hall("Sdf hall","123456",new Double(10000.0),"Jill"));
		hallList.add(new Hall("JKL hall","135790",new Double(25000.0),"James"));
		hallList.add(new Hall("TUV hall","246800",new Double(15000.0),"Jane"));
		
		//write your code here
		
		Scanner sc = new Scanner(System.in);
		String key = null;
		HallNotAvailableException ex = new HallNotAvailableException();
		HallBooking hb = new HallBooking();
		ArrayList<HallBooking> hallBookingList=new ArrayList<>();
		SimpleDateFormat sdf= new SimpleDateFormat ("dd-MM-yyyy");
		do {
			System.out.println("Enter the booking details:");
			String detail = sc.nextLine();
			String[] splits = detail.split(",");
			HallBooking h = new HallBooking();
			for (Hall a: hallList) {
				if (a.getName().equals(splits[0])){
					h.setHall(a);
				}
			}
			for (Event b: eventList) {
				if (b.getName().equals(splits[1])){
					h.setEvent(b);
				}
			}
			try {
				Date date = sdf.parse(splits[2]);
				h.setEventDate(date);

			}
			catch(ParseException e){
				System.out.println(e.toString());
			}
			
			h.setPrice(Double.parseDouble(splits[3]));
			
			try {
				if (h.getHall() == null) throw new Exception();
				if (h.getEvent() == null) throw new Exception();
				if (HallBookingBO.validateHallBooking(hallBookingList, h) == true) {
						System.out.println(hb.toString() + ex.booked());
				} else {
					hallBookingList.add(h);
				}
			} catch(Exception e) {
				System.out.println(hb.toString() + ex.notexist());
			}


			System.out.println("Do you want to continue?(y/n)");
			key = sc.nextLine();
		}while(key.equals("y"));

		System.out.println("The bookings entered are:");
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Hall name","Event name","Event date","Price");
		for (HallBooking a: hallBookingList) {
			System.out.printf("%-15s%-15s%-15s%-15s\n", a.getHall().getName(), a.getEvent().getName(), sdf.format(a.getEventDate()), a.getPrice());
		}
	}
}
