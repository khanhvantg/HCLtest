import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExhibitionDAO {
	public Exhibition getExhibition(String name) throws ClassNotFoundException, SQLException {
		Exhibition exhibition = null;
		//write your code here
		Connection con = DBConnection.getConnection();
		String query1 = "select * from exhibition where name = ?";
		PreparedStatement s1 = con.prepareStatement(query1);
		s1.setString(1,name);
		ResultSet rs1 = s1.executeQuery();
		
		while (rs1.next()) {
			exhibition = new Exhibition(rs1.getLong(1),rs1.getString(2));
		}
		if (exhibition == null) return null;
		String query2 = "select * from stall where exhibition_id = ? ";
		PreparedStatement s2 = con.prepareStatement(query2);
		s2.setLong(1,exhibition.getId());
		ResultSet rs2 = s2.executeQuery();
		
		List<Stall> list = new ArrayList<>();
		
		while (rs2.next()) {
			
			Stall stall = new Stall(rs2.getLong(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),exhibition);
			list.add(stall);
		}
		exhibition.setStallList(list);
		return exhibition;
	}
}