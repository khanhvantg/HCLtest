import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception  {
		//your code goes here...
		ItemTypeDAO dao = new ItemTypeDAO();
		List<ItemType> itemList = dao.getAllItemTypes();
		System.out.format("%-5s %-15s %-10s %s\n","ID","Name","Deposit","Cost per day");
		for (ItemType item: itemList) {
			System.out.format("%-5s %-15s %-10s %s\n",item.getId(),item.getName(),item.getDeposit(),item.getCostPerDay());
		}
	}
}