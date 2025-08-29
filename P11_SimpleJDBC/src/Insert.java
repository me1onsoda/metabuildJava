import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드");
			
			int num = 5;
			String name = "태연";
			String addr="경주";
			
			
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn);
			
			//String sql = "insert into test(num,name,addr) values(4,'슬기','경기')";
			//String sql = "insert into test(num,name,addr) values("+num+",+'"+name+"','"+addr+"')";
			String sql = "insert into test(num,name,addr) values(?,?,?)";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, num); //물음표 위치 , 들어갈 내용
			ps.setString(2, name);
			ps.setString(3, addr);
			
			int cnt = ps.executeUpdate(); //insert할떄는 executeUpdate!!
			//성공적으로 삽입된 갯수 리턴
			System.out.println("cnt : "+cnt);
			
			String sqlSelect = "select * from test";
			ps = conn.prepareStatement(sqlSelect);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int num1 = rs.getInt("num");
				String name1 = rs.getString("name");
				String addr1 = rs.getString("addr");
				System.out.println(num1+","+name1+","+addr1);
			}
			
			
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패");
		}catch ( SQLException e) {
			e.printStackTrace();
			System.out.println("접속 실패/ 분석실패/ 없는 칼럼");
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
