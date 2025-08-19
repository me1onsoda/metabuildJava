
public class Ex03_실수형 {
	public static void main(String[] args) { //main 적은후 ctrl+space+enter
		float f1=1.234f; //기본 실수는 모두 double임 float에 넣으려면 f를 붙이자
		double d=1.234; //double이 더 크기떄문에 double형을 float에 넣을수없는것
		float f3=-12.3987f;
		
		float f=5;
		System.out.println(f);
		double d5=5;
		System.out.println(d5);
		
		int f5=(int)3.7; //실수를 정수로, 강제 형변환
		System.out.println(f5);
		
		int f6=(int)f3;
		System.out.println(f6);
		
		
	}
}
