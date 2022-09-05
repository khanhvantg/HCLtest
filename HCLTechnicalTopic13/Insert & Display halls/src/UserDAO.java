import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	public User getUser(String username) throws ClassNotFoundException, SQLException {
		User user = null;
		Connection con = DBConnection.getConnection();
		String query = "select * from \"user\" where username = ?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		user = new User(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
		return user;
	}
}