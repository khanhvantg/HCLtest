import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		ExhibitionDAO exDAO = new ExhibitionDAO();

		Exhibition ex = null;
		String name = null;
		
		System.out.println("Enter the exhibition name: ");
		do {
			name = sc.nextLine();
			ex = exDAO.getExhibition(name);
			if (ex == null) {
				System.out.println("Enter the correct exhibition name: ");
			}
		}while(ex == null);
		
		System.out.printf("%-20s%-20s%-15s\n","Stall Name","Detail","Owner name");
		for (Stall s: ex.getStallList()) {
			System.out.printf("%-20s%-20s%-15s\n",s.getName(),s.getDetail(),s.getOwner());
		}
	}
}
