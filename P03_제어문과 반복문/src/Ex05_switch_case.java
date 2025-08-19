import java.util.Scanner;

public class Ex05_switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("입력받은 문자열:"+s);
		
		switch(s) {
		case "apple": System.out.println("사과");
		break;
		case "grape": System.out.println("포도");
		break;
		default: System.out.println("나머지");
		}
	}

}
