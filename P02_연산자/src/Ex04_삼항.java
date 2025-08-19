
public class Ex04_삼항 {
	public static void main(String[] args) {
		int x=10,y=20;
		int result = x>y ? x : y ;
		System.out.println("result : "+result);

		String result2;
		result2 = x%2 == 0 ? "짝수" : "홀수";
		System.out.println(result2);
	}
}

/*
 삼항 연산자
 ? :
 -> 조건 ? 조건이 참일때 :조건이 거짓일때
 -> ex) 조건 ? A : B //조건이 참이면 A 실행 거짓이면 B실행
 */