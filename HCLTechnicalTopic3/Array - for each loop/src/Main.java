import java.io.*; 
import java.util.*; 
public class Main{ 
	public static void main (String[] args) throws Exception{ 

		//Fill your code		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n : ");
		n = s.nextInt();
		
		int[] a= new int[n];
		String[] str=new String[n];
		System.out.println("Enter numbers : ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		s.nextLine();
		System.out.println("Enter strings : ");
		for(int i=0;i<n;i++)
		{
			str[i]=s.nextLine();
		}
		System.out.println("Displaying numbers");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Displaying strings");
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
	} 
} 



