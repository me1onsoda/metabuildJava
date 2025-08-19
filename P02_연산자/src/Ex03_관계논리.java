
public class Ex03_관계논리 {

	public static void main(String[] args) {
		int a=3, b=20;
		boolean result = a>=b;
		System.out.println("result : "+result);
		result = a<=b;
		System.out.println("result : "+result);
		System.out.println(30!=39);
		
		// && = and연산자 둘다 T가 아니라면 모두 F
		// || = or연산자 둘다 F가 아니라면 모두 T
		// ! not연산자 반전 T는 F로 F는 T로
		
		result = a>b && a>b;
		System.out.println("result : "+result);
		result = a<b && a<b;
		System.out.println("result : "+result);
		result = a<b || a>b;
		System.out.println("result : "+result);
		result = a<b || a>b;
		System.out.println("result : "+!result);
		
		
	}

}
