import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class HallDAO {
	public void saveHall(Hall hall) throws ClassNotFoundException, SQLException {
		//write your code here
		Connection con = DBConnection.getConnection();
		String insert = "INSERT INTO hall (name, contact_detail, cost_per_day, owner_id)"
				+ "VALUES(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(insert);
		pstmt.setString(1, hall.getName());
		pstmt.setString(2, hall.getContactNumber());
		pstmt.setDouble(3, hall.getCostPerDay());
		pstmt.setLong(4, hall.getOwner().getId());
		pstmt.executeUpdate();
	}
	
	public List<Hall> getAllHall() throws ClassNotFoundException, SQLException {
		List<Hall> hallList = new ArrayList<Hall>();
        //write your code here
		Hall hall = null;
		UserDAO ud = new UserDAO();
		
		Connection con =  DBConnection.getConnection();
		String queryFromHall = "select * from hall";
		PreparedStatement pstmt= con.prepareStatement(queryFromHall);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {

			User user = null;
			String queryFromUser = "select * from \"user\" where id = ?";
			pstmt= con.prepareStatement(queryFromUser);
			pstmt.setLong(1, rs.getLong(5));
			
			ResultSet rs1 = pstmt.executeQuery();
			while(rs1.next()) {
				user = new User(rs1.getLong(1), rs1.getString(2), rs1.getString(3), rs1.getString(4), rs1.getString(5));
			}
			hall = new Hall( rs.getString(2), rs.getString(3), rs.getDouble(4), user);
			hallList.add(hall);
		}
        return hallList;
	}
}
