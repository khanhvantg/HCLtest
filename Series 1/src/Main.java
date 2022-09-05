import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		//Fill your code here
    	Scanner sc = new Scanner(System.in);
    	int n =1;
    	int i=1;
    	n = sc.nextInt();
    	while(i<=n) {
    		System.out.print(i*i+" ");
    		i++;
    	}
	}
}