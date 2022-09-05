import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		//Your code here
		Scanner sc = new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter the string");
		str1 = sc.nextLine();
		System.out.println("Enter the start string");
		str2 = sc.nextLine();
		if(str1.startsWith(str2)){
			System.out.println('"' + str1 + '"'+ " starts with "+ '"'+ str2+'"');
		} else {
			System.out.println('"' + str1 + '"'+ " does not start with "+ '"'+ str2+'"');
		}
	}
}
