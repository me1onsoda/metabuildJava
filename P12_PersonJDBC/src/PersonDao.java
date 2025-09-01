import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonDao { //DB

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "sqlid";
	String pw = "sqlpw";
	Connection conn = null;
	ResultSet rs= null;
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);
	
	public PersonDao() {
		System.out.println("PersonDao 생성자");
		
	}//
	
	public void getConnect() {//2.계정접속 (드라이버 로드는 자동)
		
		try {
			conn = DriverManager.getConnection(url,id,pw);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<PersonBean> getAllPerson() { //전체 정보 조회
		getConnect(); //2.계정접속
		ArrayList<PersonBean> pbList = new ArrayList<>();
		String sql = "select * from person order by num";
		try {
			ps = conn.prepareStatement(sql);
			rs=ps.executeQuery();

			pbList = toPersonList(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return pbList;
		
	}
	
	public ArrayList<PersonBean> getPersonByGender(String inputGender) {
		getConnect();
		ArrayList<PersonBean> pbList = new ArrayList<>();
		String sql = "select * from person where gender=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, inputGender);
			rs = ps.executeQuery();
			pbList = toPersonList(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return pbList;
		
	}
	
	public void updateData() {//정보 수정
		getConnect();
		int menu = 0;
		int numKey = 0;
		System.out.print("수정하려는 정보의 번호를 입력해주세요.\n>>");
		numKey=Integer.parseInt(sc.nextLine()); 
		PersonBean personToUpdate = getPersonByNum(numKey);

		if (personToUpdate == null) {
			System.out.println(numKey + "번 데이터가 존재하지 않습니다.");
			return;
		}
		
		
		String sql = "select * from pesrson where num=?";
		try {
		ps = conn.prepareStatement(sql);
		ps.setInt(1, numKey);
		rs = ps.executeQuery();
		while(rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String gender = rs.getString("gender");
			String birth = rs.getString("birth");
		}
		System.out.print("수정하려는 정보를 선택해 주세요.\n1.이름 2.나이 3.성별 4.생년월일\n>>");
		menu = Integer.parseInt(sc.nextLine()); 
		String sqlUpdate = "update person set name=?, age=?, gender=?, birth=? where num=?";
			switch(menu) {
			case 1:
				sql = "update person set name=? where num=?";
				System.out.print("새로운 이름 입력 >> ");
				String name = sc.nextLine();
				ps = conn.prepareStatement(sql);
				ps.setString(1, name);
				ps.setInt(2, numKey);
				ps.executeUpdate();
				break;
			case 2:
				sql = "update person set age=? where num=?";
			    System.out.print("새로운 나이 입력 >> ");
				int age = Integer.parseInt(sc.nextLine());
				ps = conn.prepareStatement(sql);
				ps.setInt(1, age);
				ps.setInt(2, numKey);
				ps.executeUpdate();
				break;
			case 3:
				sql = "update person set gender=? where num=?";
			    System.out.print("새로운 성별 입력 >> ");
				String gender = sc.nextLine();
				ps = conn.prepareStatement(sql);
				ps.setString(1, gender);
				ps.setInt(2, numKey);
				ps.executeUpdate();
				break;
			case 4:
				sql = "update person set birth=? where num=?";
				System.out.print("새로운 생년월일(yyyy-mm-dd) 입력 >> ");
				String birth = sc.nextLine();
				ps = conn.prepareStatement(sql);
				ps.setString(1, birth);
				ps.setInt(2, numKey);
				ps.executeUpdate();
				break;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData(String name) {//정보 삭제
		getConnect();
		String sql = "delete from person where name = ?";
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			int cnt = ps.executeUpdate();
			if(cnt==1) System.out.println("삭제가 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertData(String name, int age, String gender, String birth) { //정보 추가 아직 정렬은 안됨
		getConnect();
		String sql = "insert into person values(perseq.nextval,?,?,?,?)";
		
		if(birth.equals("default")) sql = "insert into person values(perseq.nextval,?,?,?,default)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, gender);
			if(!birth.equals("default")) ps.setString(4, birth);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<PersonBean> toPersonList(ResultSet rs) {
		ArrayList<PersonBean> pbList = new ArrayList<>();
		try {
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String gender = rs.getString("gender");
				String birth = rs.getString("birth");
				
				PersonBean pb = new PersonBean();
				pb.setNum(num);
				pb.setName(name);
				pb.setAge(age);
				pb.setGender(gender);
				pb.setBirth(birth);
				
				pbList.add(pb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pbList;
	}
	
	public boolean isNameExists(String name) {
        String sql = "select count(*) from person where name = ?";
        try (Connection conn = DriverManager.getConnection(url, id, pw);
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, name);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0; // count가 0보다 크면 true 반환
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
	
	public PersonBean getPersonByNum(int numKey) {
	    PersonBean pb = null;
	    String sql = "select * from person where num = ?";
	    
	    try (Connection conn = DriverManager.getConnection(url, id, pw);
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, numKey);
	        try (ResultSet rs = ps.executeQuery()) {
	            ArrayList<PersonBean> list = toPersonList(rs);
	            if (!list.isEmpty()) {
	                pb = list.get(0); 
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return pb; 
	}
}
