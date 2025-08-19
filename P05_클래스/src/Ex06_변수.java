class Var{
	static int a; //정적변수 스태틱변수
	int b;
	
	public void increment() {
		int c=0; //지역변수 로컬변수
		a++;
		b++;
		c++;
		System.out.println("static변수 a:"+a);
		System.out.println("인스턴스 변수 b:"+b);
		System.out.println("지역 변수 c:"+c);
		System.out.println();
	}//increment
}

public class Ex06_변수 {

	public static void main(String[] args) {
		System.out.println("객체1 생성");
		Var v1 = new Var();
		v1.increment();
		v1.increment();
		
		System.out.println("객체2 생성");
		Var v2 = new Var();
		v2.increment();
		v2.increment();
		
		System.out.println("객체3 생성");
		Var v3 = new Var();
		v3.increment();
		v3.increment();
		
	}//main

}
