import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		Connection conn = null;
		PreparedStatement ps = null;
		int cnt = 0;
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, id, pw);
			
//			int num = 1;
//			String name = "";
//			String addr = "";
			int delNum =10;
			
			String sql = "delete from test where num=?";
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, delNum);
			
			cnt = ps.executeUpdate();
			System.out.println("cnt: "+cnt);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
