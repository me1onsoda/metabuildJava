
public class BookBean { //한줄의 레코드 //한세트
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pub_Day;
	
	public BookBean() {}
	public BookBean(int no, String title, String author, String publisher, int price, String pub_Day) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pub_Day = pub_Day;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPubDay() {
		return pub_Day;
	}
	public void setPubDay(String pubDay) {
		this.pub_Day = pubDay;
	}
	
	public void displayData() {
		System.out.println( no+","+title+","+author+","+publisher+","+price+","+pub_Day);
	}
}
