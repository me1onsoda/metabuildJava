
public class Ex07_재귀호출 {

	public static void main(String[] args) {
		show(3);
		show(1);
	}

	public static void show(int cnt) {
		System.out.println("cnt : "+cnt);
		if(cnt==1)
			return;
		
		show(--cnt);
	}
}
