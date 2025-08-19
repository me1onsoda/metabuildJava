import java.util.Scanner;

public class Ex04_switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = sc.nextInt();

		switch(num) {
			case 1: System.out.println(1);
			break;
			case 2: System.out.println(2);
			break;
			case 3: System.out.println(3);
			break;
		}

	}

}
