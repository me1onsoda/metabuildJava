import java.util.Scanner;
public class Ex01_연산자 {

	public static void main(String[] args) { // ctrl+d 는 한줄 삭제
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " x " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		
		System.out.printf("%d+%d=%.3f\n",a,b,(double)a+b);
		System.out.printf("%d-%d=%.3f\n",a,b,(double)a-b);
		System.out.printf("%dx%d=%.3f\n",a,b,(double)a*b);
		System.out.printf("%d/%d=%.3f\n",a,b,(double)a/b);

		

	}

}
