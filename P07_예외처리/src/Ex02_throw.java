
public class Ex02_throw {
	public static void main(String[] args) {
		try {
			call();
			System.out.println("call메서드 정상처리");
		}catch(ArithmeticException ae) {
		System.out.println("call메서드 오류발생 : "+ae);
		}
	}
	
	public static void call() throws ArithmeticException {
		try {
			int result = 3/0;
			System.out.println("result 오류업음");
		}catch(ArithmeticException ae) {
			System.out.println("result 에러발생 : "+ae);
			throw ae;
		}
	}
}
