import java.util.Scanner;
public class Ex03_if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력:");		
		String name = sc.nextLine();
		System.out.println("name:"+name);	

		System.out.print("국어점수:");
		int kor = sc.nextInt();
		System.out.print("영어점수:");
		int eng = sc.nextInt();		
		System.out.print("수학점수:");
		int math = sc.nextInt();

		System.out.println("이름  국어  영어  수학");
		System.out.println(name+"   "+kor+"  "+eng+"  "+math);

		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("총점: "+sum);
		System.out.printf("평균: %.2f\n",avg);

		if (avg >= 90)
			System.out.println("학점=A");
		else if (avg>=80)			
			System.out.println("학점=B");
		else if (avg<60)
			System.out.println("학점=F");
		
		switch ((int)avg/10) {
		case 10:
		case 9 : System.out.println("학점=A");
		break;
		case 8 : System.out.println("학점=B");
		break;
		case 7 : System.out.println("학점=C");
		break;
		case 6 : System.out.println("학점=D");
		break;
		default : System.out.println("학점=F");
		
		
		}
		
		

	}

}
