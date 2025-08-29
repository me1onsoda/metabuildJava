import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		Connection conn = null;
		PreparedStatement ps =null;
		int cnt = -1;
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, id, pw);
			
			int num = 20;
			String name = "현아";
			String addr = "광주";
			int conNum = 2;
			
//			String sql = "update test set num=10, name='서현', addr='목포' where num=1";
//		String sql = "update test set num="+10+", name='"+서현+"', addr='"+목포+"' where num="+1";
			String sql = "update test set num=?, name=?, addr=? where num=?";
			
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, num);
			ps.setString(2, name);
			ps.setString(3, addr);
			ps.setInt(4, conNum);
			
			
			cnt = ps.executeUpdate();
			System.out.println("cnt : "+cnt);
			//cnt 1:성공 0:조건x -1:실패
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
