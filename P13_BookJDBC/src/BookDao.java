import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "sqlid";
	String pw = "sqlpw";
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;

	public BookDao() 
	{System.out.println("BookDao 생성자");
	try {
		Class.forName(driver);
		System.out.println("드라이버 로드 완료");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}}

	public ArrayList<BookBean> getAllBook(){ //전체 정보조회
		getConnect();
		ArrayList<BookBean> bdList = new ArrayList<>();
		String sql = "select * from book order by no";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			bdList = toBookList(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bdList;

	}
	public ArrayList<BookBean> getBookBySearch(String column,String serachWord){ //조건조회
		getConnect();
		ArrayList<BookBean> bdList = new ArrayList<>();
		try {
			String sql ="select * from book where "+column+" like ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,"%"+serachWord+"%");
			rs = ps.executeQuery();
			bdList = toBookList(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bdList;
	}


	public void updateData(BookBean bb) { //수정
		getConnect();
		try {
			String sql = "update book set title=?, author=?, publisher=?, price=?, pub_day=? where no=?";
			if(bb.getPubDay().equals("default")) sql = "update book set title=?, author=?, publisher=?, price=?, pub_day=default where no=?";
			conn.setAutoCommit(false); // 업데이트후 자동커밋하지 않도록
			ps = conn.prepareStatement(sql);
			ps.setString(1, bb.getTitle());
			ps.setString(2, bb.getAuthor());
			ps.setString(3, bb.getPublisher());
			ps.setInt(4, bb.getPrice());
			if(bb.getPubDay().equals("default")) 
				ps.setInt(5, bb.getNo());
			else{
				ps.setString(5, bb.getPubDay());
				ps.setInt(6, bb.getNo());
			}
			ps.executeUpdate();
			conn.commit(); //모두 실행된이후에 커밋되도록
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();//sqlException 예외로 인해 전부 처리되지 못했을수있기때문에 롤백
			} 
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public int delteData(int no) { //삭제
		getConnect();
		int cnt=0;
		String sql = "delete from book where no=?";
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			cnt = ps.executeUpdate();
			conn.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();//sqlException 예외로 인해 전부 처리되지 못했을수있기때문에 롤백
			} 
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public void insertData(String title, String author, String publisher, int price, String pub_day) { //추가
		getConnect();
		String sql = "insert into book values(bseq.nextval,?,?,?,?,?)";
		if(pub_day.equals("default")) 
			sql = "insert into book values(bseq.nextval,?,?,?,?,default)";

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, author);
			ps.setString(3, publisher);
			ps.setInt(4, price);
			if(!pub_day.equals("default")) 
				ps.setString(5, pub_day);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


	public void getConnect() {
		try {
			conn = DriverManager.getConnection(url,id,pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<BookBean> toBookList(ResultSet rs) {
		ArrayList<BookBean> bdList = new ArrayList<>();
		try {
			while(rs.next()) {
				int no = rs.getInt("no");
				String title=rs.getString("title");
				String author=rs.getString("author");
				String publisher=rs.getString("publisher");
				int price=rs.getInt("price");
				String pub_Day=rs.getString("pub_Day");

				BookBean bb = new BookBean();
				bb.setNo(no);
				bb.setTitle(title);
				bb.setAuthor(author);
				bb.setPublisher(publisher);
				bb.setPrice(price);
				bb.setPubDay(pub_Day);

				bdList.add(bb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bdList;
	}


	public BookBean getBookByNo(int no){ //no에 따른 BookBean객체 리턴
		getConnect();
		ArrayList<BookBean> bdList = new ArrayList<>();
		String sql = "select * from book where no=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			rs=ps.executeQuery();
			bdList = toBookList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return bdList.get(0);
	}

}
