import java.util.Scanner;
public class Pr_복습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		int avg = sum / 3;
		
		System.out.println(sum);
		System.out.println(avg);
		double davg = sum / 3.0;
		System.out.println(davg);
		
		float f8 = 0.10001f;
		System.out.println("f8="+f8);
	}

}
