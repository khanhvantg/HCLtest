import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Customer name");
		String name = br.readLine();
		System.out.println("Enter the Customer number");
		int number = Integer.parseInt(br.readLine());
		System.out.println("Enter the Customer address");
		String address = br.readLine();

		Customer c = new Customer(name, number, address);
		try (FileOutputStream fos = new FileOutputStream("Serialize.ser"); 
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(c);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}