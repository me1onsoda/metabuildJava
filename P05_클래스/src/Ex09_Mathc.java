class Calculate2{
	public int max (int a, int b) {
		if(a>b) return a;
		else return b;
	}
}

public class Ex09_Mathc {

	public static void main(String[] args) {
		int num1=20, num2=7;
		
		Calculate2 c = new Calculate2();
		System.out.println("큰값 : "+ c.max(num1,num2));
		System.out.println("큰값 : "+ Math.max(num1,num2)); //이런 것들은 굳이 클래스를 안만들고 기본적으로 있는 라이브러리에서 가져와서 쓸수있다
		
		System.out.println("작은 값 : "+ Math.min(num1, num2));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
