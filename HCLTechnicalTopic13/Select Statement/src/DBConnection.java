import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        //fill your code here
        Connection con = null;
        
        try{  
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
			con = DriverManager.getConnection(url,username,password);  
		}catch(Exception e){ 
			System.out.println(e);
		}  
        return con;
    }
}