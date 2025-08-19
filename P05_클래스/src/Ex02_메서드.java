
public class Ex02_메서드 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		print_star();
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		caculate(40,10,7);
	}
	
	public static void caculate(int a, int b, int c) {
		int result = a - b - c;
		System.out.println(result);
	}
	
	public static void print_star() {//void 리턴타입은 아무것도 리턴하지않는다
		
		System.out.println("**********");
		System.out.println("##########");
	}
	
}
