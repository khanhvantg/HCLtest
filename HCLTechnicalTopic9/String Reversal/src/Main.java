import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
		// fill your code here
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter a string to reverse");
    	String str = sc.nextLine();
    	StringBuffer strBff = new StringBuffer(str);
    	
    	System.out.println("Reverse of the string is " + strBff.reverse());
	}
}