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
	
	public ArrayList<PersonBean> getPersonByGender() {
		getConnect();
		ArrayList<PersonBean> pbList = new ArrayList<>();
		String sql = "select * from person where gender=?";
		System.out.print("조회하고싶은 성별을 입력해주세요.(남자/여자)\n>>");
		String inputGender = sc.nextLine();
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
		String sql = "update person set num=?, name=?, addr=? where num=?";
	}
	
	public void deleteData() {//정보 삭제
		getConnect();
		String sql = "delete from person where name = ?";
		try {
			ps = conn.prepareStatement(sql);
			System.out.print("삭제할 정보의 이름을 입력해주세요.\n>>");
			String name = sc.nextLine();
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
	
	public void insertData() { //정보 추가 아직 정렬은 안됨
		getConnect();
		String sql = "insert into person values(perseq.nextval,?,?,?,?)";
		System.out.println("추가할 정보를 입력해주세요");
		String name ="";
		while(true) {
			
			System.out.print("이름(중복 불가)\n>>");
			name = sc.nextLine();
			
			if(isNameExists(name)) 
				System.out.println("이미 존재하는 이름입니다. 다시 입력해주세요.");
			else break;
		}
		
		System.out.print("나이\n>>");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("성별(남자/여자)\n>>");
		String gender = sc.nextLine();
		System.out.print("생일(yyyy-mm-dd)\n#default 입력시 기본값으로 현재 날짜가 입력됩니다.\n>>");
		String birth = sc.nextLine();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, gender);
			ps.setString(4, birth);
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
	

}
