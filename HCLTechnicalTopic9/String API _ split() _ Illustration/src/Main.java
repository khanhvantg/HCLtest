import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		// fill your code here
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the string");
    	String str = sc.nextLine();
    	
    	String str1 = str.replaceAll(" +", " ");
    	String strArr[] = str1.split(" ",-1);
    	
    	System.out.println("The words in the string are");
    	for(int i = 0; i < strArr.length; i++)
    	{
    		System.out.println(strArr[i]);
    	}
	}
}