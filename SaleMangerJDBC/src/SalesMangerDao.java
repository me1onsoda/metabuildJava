import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalesMangerDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "sqlid";
	String pw = "sqlpw";
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	
	private void getConnect() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public ArrayList<ProductsBean> getAllProducts() {
		ArrayList<ProductsBean> pList = new ArrayList<>();
		getConnect();
		String sql = "select * from products";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			pList=toProducList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return pList;
	}

	private ArrayList<ProductsBean> toProducList(ResultSet rs) {
		ArrayList<ProductsBean> pList = new ArrayList<>();
		try {
			while(rs.next()) {
				int product_id = rs.getInt("product_id");    
				String product_name = rs.getString("product_name");
				int price = rs.getInt("price"); 
				int stock_quantity = rs.getInt("stock_quantity");
				ProductsBean pb = new ProductsBean(product_id, product_name, price, stock_quantity);
				
				pList.add(pb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}


	public ArrayList<ProductsBean> getProductBySearch(String column, String searchWord) {
		getConnect();
		ArrayList<ProductsBean> pList = new ArrayList<>();
		String sql =  "select * from products where "+column+"=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+searchWord+"%");
			rs = ps.executeQuery();
			pList = toProducList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}
	public ArrayList<ProductsBean> getProductBySearch(String column, int searchInt) {
		getConnect();
		ArrayList<ProductsBean> pList = new ArrayList<>();
		String sql =  "select * from products where "+column+"=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, searchInt);
			rs = ps.executeQuery();
			pList = toProducList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}
	
	
}
