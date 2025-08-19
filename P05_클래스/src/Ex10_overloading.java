
public class Ex10_overloading {
	public static void main(String[] args) {
		
		System.out.println(plus(3,10));
		
		System.out.println(plus(3,10,20));
		
		System.out.println(plus(3.0,10.0));
		
	}
	
	public static int plus(int x, int y) {
		return x+y;
	}
	public static int plus(int x, int y, int z) {
		return x+y;
	}
	
	public static double plus(double x, double y) {
		return x+y;
	}
}

//오버로딩 
//메서드 이름이 같아야한다
//매개변수의 갯수나 타입은 달라야한다
//리턴타입은 달라도 의미가없다
