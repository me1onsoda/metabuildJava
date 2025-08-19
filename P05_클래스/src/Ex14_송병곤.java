class Music{
	private String title;
	private String singer;
	private String genre;
	private int price;
	
	public Music() {
		title="예뻤어";
		singer="DAY6";
		genre="락";
		price=4000;
	}
	public Music(String title, String singer, String genre, int price) {
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
	}
	
	public void setMusic(String title, String singer, String genre, int price) {
		this.title=title;
		this.singer=singer;
		this.genre=genre;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public String getGenre() {
		return genre;
	}
	public int getPrice() {
		return price;
	}
	
	public void display(){
		System.out.println(title+"\t"+singer+"\t"+genre+"\t"+price);
	}
}

public class Ex14_송병곤 {
	public static void main(String[] args) {
		Music m1 = new Music(); //생성자 통한 초기화
		Music m2 = new Music("아파트","로제","댄스곡",3000); //생성자 통해서
		Music m3 = new Music(); //setter메서드를 통해서 초기화
		m3.setMusic("광화문에서","규현","발라드",5000);

		//m1을 getter로 출력
		//m2,m3는 display로 출력
		System.out.println(m1.getTitle()+"\t"+m1.getSinger()+"\t"+m1.getGenre()+"\t"+m1.getPrice());
		m2.display();
		m3.display();
	}

}
