import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes() throws Exception {
		List<ItemType> itemTypeList = new ArrayList<>();
		//your code goes here...
		
		Connection con = DBConnection.getConnection();
		Statement stmt= con.createStatement();

		String responseFromDB="select * from item_type";
		ResultSet rs= stmt.executeQuery(responseFromDB);
		
		while(rs.next()) {
			ItemType i = new ItemType(rs.getLong(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4));
			itemTypeList.add(i);
		}	
		
		return itemTypeList;
	}
}
