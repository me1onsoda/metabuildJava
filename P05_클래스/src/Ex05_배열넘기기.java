

public class Ex05_배열넘기기 {
	public static void main(String[] args) {
		int[] src = {3,4,5};
		for(int i=0; i<src.length; i++) {
			System.out.print(src[i]+" ");
		}
		System.out.println();
		
		send(src[0], src[1], src[2]);
		
		send1(src);
		
		System.out.println(src[1]);
		
		int[][] src2 = {{3,4,5},{6,7,8}};
		
	}//main
	
	public static void send(int a, int b, int c) {
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
		System.out.println();
	}
	public static void send1(int[] a) { //배열의 주소를 보내는것이기 떄문에 내부에서 배열의 값을 바꾸면 원본 배열의 값또한 바뀐다
		for(int i=0; i<a.length; i++) { //값이 아니라 주소가 넘어간다!
			System.out.print(a[i]+" ");
		}
		
		a[1]=77;
	}
	
	public static void send2(int[][] a) {
		for(int i=0; i<a.length; i++) { //값이 아니라 주소가 넘어간다!
			for(int j=0; i<a[i].length; i++) { //값이 아니라 주소가 넘어간다!
			System.out.print(a[i]+" ");
			}
		}
		
		
	}
}
