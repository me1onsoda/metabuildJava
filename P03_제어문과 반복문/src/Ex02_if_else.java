import java.util.Scanner;
public class Ex02_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int n = sc.nextInt();
		System.out.println("n:"+n);
		if (n>=1 && n<=10)
			System.out.println("1~10사이의 수입니다.");
		if (n>=11 && n<=20)
			System.out.println("11~20사이의 수입니다.");
		if (n>=21 && n<=30)
			System.out.println("21~30사이의 수입니다.");
		
		System.out.println("------------------------");
		
		if(n%5==0)
			System.out.println("5의 배수입니다");
		if(n%10==0)
			System.out.println("10의 배수입니다");
		
	}

}
