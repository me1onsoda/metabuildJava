import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "sqlid";
		String pw = "sqlpw";
		Connection conn = null;
		PreparedStatement ps = null; //sql문장을 분석한 문장이 들어감
		ResultSet rs = null;
		//0. ojdbc8,jar추가
		//1.드라이버로드
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드성공");				
			
			//2.계정에 접속
			conn = DriverManager.getConnection(url,id,pw); //오라클 서버에 로그인
			//conn : sqlid/sqlpw에 접속했다는 정보가 들어가있음
			System.out.println(conn);
			System.out.println("접속성공");
			
			//3.sql문 작성-분석
			String sql = "select * from test";
			ps = conn.prepareStatement(sql); //sql문장을 분석한 문장이 들어감
			//SQLException이 발생할수있따
			
			//4.sql문 실행
			rs = ps.executeQuery(); //sql문 실행
			
			while(rs.next()) {
				//한줄에만 접근
				int num= rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr"); //getString 하고 칼럼이름을 적는다
				System.out.println(num+","+name+","+addr);
			}
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패/분석 실패/없는 칼럼");
			e.printStackTrace();
		} finally {
			if(rs != null) { //rs사용했으면 닫자! /사용안했는데 닫으려하면 오류나니까
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//5.접속 끊기
			if(conn != null) {//접속 성공된 상태인가?를 묻는것 
				try {
					conn.close();
					System.out.println("접속 끊기 성공");
				} catch (SQLException e) {
					System.out.println("접속 끊기 실패");
					e.printStackTrace();
				}
			}
		}
		
	}
}

//JDBC : java database connectivity
//C:\Oracle\product\12.2.0\dbhome_1\jdbc\lib
//https://steady-record.tistory.com/entry/%EC%9B%B9%EC%97%90-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4JDBC-%EC%97%B0%EA%B2%B0%ED%95%98%EA%B8%B0
//🔻JDBC 연결하기 (링크에서 이부분)
//-> ojdbc8,jar를 추가하는것 그리고 나서 드라이버 로드
