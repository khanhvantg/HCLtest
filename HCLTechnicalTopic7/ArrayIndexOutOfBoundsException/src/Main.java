import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of seats to be booked:");
		n=s.nextInt();
		int m;
		try{
			int a[]=new int[100];
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter the seat number "+i);
				m=s.nextInt();
				a[m-1]=m;
				a[i]=m;
			}
			System.out.println("The seats booked are:");
			for(int i=1;i<=n;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
	}
}
