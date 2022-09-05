import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		//Your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		int count = 0;
		sc.nextLine();
		for(int i=0;i<n;i++) {
			Article ar = new Article();
			System.out.println("Enter line "+(i+1));
			ar.setLine(sc.nextLine());
			ar.start();
			ar.join();
			count +=ar.getCount();
		}
		System.out.println("There are "+count+" articles in the given input");
	}
}
