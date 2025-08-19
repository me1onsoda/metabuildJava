import java.util.Scanner;

public class Ex08_재귀호출 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		System.out.println(ex(num1, num2));
	}	

	public static int ex(int x, int y) {
		if(y==0) return 1; //마지막에 4*4*4*4*1이 되는셈 순서대로 y가 4 3 2 1 0 마지막에는 곱할필요가 없으니까
		else return x*ex(x,y-1);
	}
}
