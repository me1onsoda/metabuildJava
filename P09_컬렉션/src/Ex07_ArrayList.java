import java.util.ArrayList;
import java.util.Scanner;

class Music{
	private String title;
	private String singer;
	private int price;
	
	public Music(String title, String singer, int price) {
		super();
		this.title = title;
		this.singer = singer;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return title+"/"+singer+"/"+price;
	}
}//Music

public class Ex07_ArrayList {
	public static void main(String[] args) {
		ArrayList<Music> list = new ArrayList<Music>();
		Scanner sc = new Scanner(System.in);
		String title, singer,retry;
		int price;
		
		while(true) {
			System.out.print("제목:");
			title = sc.next();
			System.out.print("가수명:");
			singer = sc.next();
			System.out.print("가격:");
			price = sc.nextInt();
			
			Music m = new Music(title,singer,price);
			list.add(m);
			
			System.out.print("계속?(y/n)");
			retry = sc.next();
			if(retry.equals("n"))
				break;
		}//while
		
		System.out.println(list);
		int i;
		for(i=0;i<list.size();i++) {
			Music s = list.get(i);
			System.out.println(s);
		}
//		반복해서 입력한 데이터를 Music객체로 만들어서 ArrayList에 넣고 
//		ArrayList 내용 출력하기
		
		
	}
}
