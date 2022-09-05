import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	public List<User> getAllUsers() throws Exception{
		List<User> userList = new ArrayList<User>();
		//your code goes here...
		
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		
		String responseFromDB="select * from \"user\"";
		ResultSet rs= stmt.executeQuery(responseFromDB);
		
		while(rs.next()) {
			User user = new User(rs.getLong(1),rs.getString(2),
					rs.getString(3),rs.getString(4),rs.getString(5));
			userList.add(user);
		}
		
		return userList;
	}
}
