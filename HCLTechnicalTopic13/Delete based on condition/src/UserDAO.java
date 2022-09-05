import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class UserDAO {
	public List<User> getAllUser() throws ClassNotFoundException, SQLException {
		List<User> userList =new ArrayList<>();
		Connection con = DBConnection.getConnection();
		Statement stmt= con.createStatement();

		String responseFromDB= "select * from \"user\"";
		ResultSet rs= stmt.executeQuery(responseFromDB);

		while(rs.next()) {
			User u = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			userList.add(u);
		}	
		return userList;
	}
	
	public Boolean deleteUser(String username) throws ClassNotFoundException, SQLException {
		UserDAO d = new UserDAO();
		List<User> e = d.getAllUser();
		for (User u: e) {
			if (u.getUsername().equals(username)) {
				Connection con = DBConnection.getConnection();
				String query = "delete from \"user\" "
						+ "where username = ?";
				PreparedStatement s = con.prepareStatement(query);
				s.setString(1, username);
				s.executeUpdate();
				return true;
			}
		}
		return false;
	}
}
