import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args)throws Exception {
		//write your code here
		 List<String> list = new ArrayList<String>();
		 int i=0;
		 Scanner sc = new Scanner(System.in);
		 Set<String> set = new HashSet<>();
		 String name;
		 String answerContinue="";
		 while (!answerContinue.equals("N")) {
			System.out.println("Enter the username");
			name = sc.nextLine();
		 	set.add(name);
		 	System.out.println("Do you want to continue?(Y/N)");
		 	answerContinue = sc.nextLine();
		 }
		 System.out.println("The unique number of usernames is " + set.size());
    }
}

