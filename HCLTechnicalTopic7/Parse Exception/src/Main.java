import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main { 
	public static void main(String[] args) { 
		Scanner s=new Scanner(System.in); 
		String start,end; 
		try{ 
			System.out.println("Enter the stage event start date and end date"); 
			start=s.next(); 
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss"); 
			String startDate=sdf.format(sdf.parse(start)); 
			end =s.next(); 
			String endDate=sdf.format(sdf.parse(end)); 
			System.out.println("Start date:"+startDate);
			System.out.println("End date:"+endDate); 
		}
		catch (ParseException e) 
		{ 
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
		} 
	}
}
