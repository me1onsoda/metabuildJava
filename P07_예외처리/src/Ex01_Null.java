
public class Ex01_Null {
	public static void main(String[] args) {
		
		System.out.println("main 시작");
		
		try {
			String s="gaag";
			System.out.println(s);
			System.out.println(s.length());
			
			int[] arr = {10,20,30};
			System.out.println(arr[2]);
			
			int result =3/0;
			System.out.println(result);
			
			
		}catch(NullPointerException e){
			System.out.println("null 에러발생 : "+e);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("에러발생 : "+a);
		}catch(ArithmeticException ae) {
			System.out.println("에러발생 : "+ae);
		}
		
		
		System.out.println("main 끝");
	}
}
