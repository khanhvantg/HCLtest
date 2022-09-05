
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class UserDAO {
    public List<User> getAllUser() throws ClassNotFoundException, SQLException {
        List<User> userList = new ArrayList<User>();
        //fill your code here
        Connection con = DBConnection.getConnection();
		Statement stmt= con.createStatement();

		String responseFromDB="select * from \"user\"";
		ResultSet rs= stmt.executeQuery(responseFromDB);
		
		while(rs.next()) {
			User user = new User(rs.getLong(1),rs.getString(2),rs.getString(3),
								rs.getNString(4),rs.getString(5));
			userList.add(user);
		}
		
        return userList;
    }
	public void insertDetails(User user) throws ClassNotFoundException, SQLException {
        //fill your code here
		Connection con = DBConnection.getConnection();
		
		String insertUser = "INSERT INTO \"user\" (name, contact_detail,username,password)"+ "VALUES(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertUser);
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getContactDetail());
		pstmt.setString(3, user.getUsername());
		pstmt.setString(4, user.getPassword());
		
		pstmt.executeUpdate();
    }
}
