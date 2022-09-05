import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		// fill your code here
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	
    	StringTokenizer strOne = new StringTokenizer(str, "=");
    	String strTwo = "";
    	
    	while(strOne.hasMoreTokens()) {
    		strTwo = strTwo+" "+strOne.nextToken();
    	}
    	
    	StringTokenizer strThree = new StringTokenizer(strTwo, ";");
    	while(strThree.hasMoreTokens()) {
    		System.out.println(strThree.nextToken());
    	}
	}
}