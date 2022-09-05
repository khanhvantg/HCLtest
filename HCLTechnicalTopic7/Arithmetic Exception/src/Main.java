import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// your code here
		Scanner s = new Scanner(System.in);
		int n;
		int m;
		System.out.println("Enter the cost of the item for n days");
		n=s.nextInt();
		System.out.println("Enter the value of n");
		m=s.nextInt();
		try{
	          System.out.println("Cost per day of the item is"+n/m);
	        }
      catch(ArithmeticException e){
    	  System.out.println(e.toString());
      }
	}

}
