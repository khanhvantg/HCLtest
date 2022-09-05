import java.io.*; 
import java.util.*; 
public class Main{ 
	public static void main (String[] args) throws Exception{ 

		//Fill your code		
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n: ");
		n=s.nextInt();
		
		int[] a= new int[n+1];
		int sum=0;
		a[0]=n;
		for(int i=1;i<=n;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of array elements is : "+sum);
	} 
} 



