import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class UserDAO {
	public void updateUser(User user) throws ClassNotFoundException, SQLException{
		Connection con = DBConnection.getConnection();
		String query = "UPDATE \"user\""
				+ "SET contact_detail = ? "
				+ "WHERE id = ?";
		PreparedStatement s = con.prepareStatement(query);
		s.setString(1, user.getContactDetail());
		s.setLong(2, user.getId());

		s.executeQuery();
	}

	public User findUserByUsername(String username) throws ClassNotFoundException, SQLException{
		User user = null;
		Connection con = DBConnection.getConnection();
		String query = "select * from \"user\" where username = ?";

		PreparedStatement s = con.prepareStatement(query);
		s.setString(1, username);

		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			user = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		}
		return user;
	}

	public List<User> getAllUsers() throws SQLException, ClassNotFoundException{
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
}
