//create table products(
//	product_id number primary key,
//	product_name varchar2(50) not null,
//	price number not null,
//	stock_quantity number default 0
//);
public class ProductsBean {
	private int product_id;
	private String product_name;
	private int price;
	private int stock_quantity;
	
	public ProductsBean() {}
	
	
	public ProductsBean(int product_id, String product_name, int price, int stock_quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.stock_quantity = stock_quantity;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}


	public void displayData() {
		System.out.println(product_id+","+product_name+","+price+","+stock_quantity);
	}
	
	
	
}
