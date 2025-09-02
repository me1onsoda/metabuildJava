//create table sales(
//	sales_id number primary key,
//	product_id number references products(product_id),
//	quantity number not null,
//	sales_date date default sysdate
//);
public class SalesBean {
	int sales_id;
	int product_id;
	int quantity;
	String sales_date;
	
	public SalesBean() {}
	
	public SalesBean(int sales_id, int product_id, int quantity, String sales_date) {
		super();
		this.sales_id = sales_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.sales_date = sales_date;
	}
	public int getSales_id() {
		return sales_id;
	}
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getSales_date() {
		return sales_date;
	}
	public void setSales_date(String sales_date) {
		this.sales_date = sales_date;
	}
	
	
	
}
