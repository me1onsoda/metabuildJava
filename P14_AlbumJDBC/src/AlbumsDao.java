import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumsDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "sqlid";
	String pw = "sqlpw";
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;


	public ArrayList<AlbumsBean> getAllAlbum() {
		getConnect();
		ArrayList<AlbumsBean> abList = new ArrayList<>();
		String sql = "select * from albums order by num";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			abList = toAlbumList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return abList;
	}

	private ArrayList<AlbumsBean> toAlbumList(ResultSet rs2) {
		ArrayList<AlbumsBean> abList = new ArrayList<>();
		try {
			while(rs.next()) {
				int num = rs.getInt("num");
				String song = rs.getString("song");
				String singer = rs.getString("singer");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				String pub_day = rs.getString("pub_day");
				AlbumsBean ab = new AlbumsBean(num, song, singer, company, price, pub_day);

				abList.add(ab);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return abList;
	}

	private void getConnect() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertData(String song, String singer, String company, int price, String pub_day) {
		getConnect();
		String sql = "insert into albums values(bseq.nextval,?,?,?,?,?)";
		if(pub_day.equals("default")) sql = "insert into albums values(bseq.nextval,?,?,?,?,default)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, song);
			ps.setString(2, singer);
			ps.setString(3, company);
			ps.setInt(4, price);
			if(!pub_day.equals("default")) 
				ps.setString(5, pub_day);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!= null) rs.close();
				if(ps!= null) ps.close();
				if(conn!= null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

	public int deleteData(int delNum) {
		getConnect();
		int cnt = 0;
		String sql = "delete from albums where num=?";
		try {
			conn.setAutoCommit(false);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, delNum);
			cnt = ps.executeUpdate();
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!= null) rs.close();
				if(ps!= null) ps.close();
				if(conn!= null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}

	public void updateData(AlbumsBean ab) {
		getConnect();
		String sql = "update from albums set song=?, singer=?, company=?, price=?, pub_day=? where num=?";
		try {
			ps = conn.prepareStatement(sql);
			if(ab.getPub_day().equals("default")) sql = "update book set title=?, author=?, publisher=?, price=?, pub_day=default where no=?";
			conn.setAutoCommit(false); // 업데이트후 자동커밋하지 않도록
			ps = conn.prepareStatement(sql);
			ps.setString(1, ab.getSong());
			ps.setString(2, ab.getSinger());
			ps.setString(3, ab.getCompany());
			ps.setInt(4, ab.getPrice());
			if(ab.getPub_day().equals("default")) 
				ps.setInt(5, ab.getNum());
			else{
				ps.setString(5, ab.getPub_day());
				ps.setInt(6, ab.getNum());
			}
			ps.executeUpdate();
			conn.commit(); //모두 실행된이후에 커밋되도록
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!= null) rs.close();
				if(ps!= null) ps.close();
				if(conn!= null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public ArrayList<AlbumsBean> getDataBySearch(String column,String searchWord) {
		getConnect();
		ArrayList<AlbumsBean> abList = new ArrayList<>();
		String sql = "select * from albums where "+column+" like ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchWord+"%");
			rs = ps.executeQuery();
			abList = toAlbumList(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!= null) rs.close();
				if(ps!= null) ps.close();
				if(conn!= null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return abList;
	}

	public AlbumsBean getAlbum(int updateNum) {
		getConnect();
		ArrayList<AlbumsBean> abList = new ArrayList<>();
		String sql = "select * from albums where num=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, updateNum);
			rs = ps.executeQuery();
			abList = toAlbumList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!= null) rs.close();
				if(ps!= null) ps.close();
				if(conn!= null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(abList.size()==0) return null;
		return abList.get(0);
	}



}
