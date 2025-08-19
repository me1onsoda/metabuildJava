import java.util.Scanner;

public class Ex06_입력문 {
	public static void main(String[] args) {
		int kor, eng, math;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수:");
		kor = sc.nextInt();
		System.out.print("영어점수:");
		eng = sc.nextInt();
		System.out.print("수학점수:");
		math = sc.nextInt();
		System.out.print("합계 : " + (kor + eng + math));
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.println("\n평균 : " + avg + "점");
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d" , kor, eng, math);
	}	
}
