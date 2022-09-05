import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) {
		//write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of address:");
		int n = sc.nextInt();
		sc.nextLine();

		Map<String,Map<String,Integer>> state = new TreeMap<>();

		String[] addrs = new String[n];

		for (int i = 0 ; i < n; i++) {
			System.out.println("Enter the address:");
			addrs[i] = sc.nextLine();
			String[] str = addrs[i].split(",");
			if (!state.containsKey(str[2])) {
				Map<String,Integer> city = new TreeMap<>();
				city.put(str[1], 1);
				state.put(str[2], city);
			}else {
				if (state.get(str[2]).containsKey(str[1])) {
					state.get(str[2]).put(str[1], state.get(str[2]).get(str[1]) + 1);
				}else {
					state.get(str[2]).put(str[1], 1);
				}
			}
		}
		
		System.out.println("Number of entries in city/state wise:");
		System.out.println();

		for (Map.Entry<String, Map<String, Integer>> e: state.entrySet()) {
			System.out.println("State:" + e.getKey());
			for (Map.Entry<String, Integer> f:  e.getValue().entrySet()) {
				System.out.println("City:" + f.getKey() + " Count:" + f.getValue());

			}
			System.out.println();
		}
	}
}
