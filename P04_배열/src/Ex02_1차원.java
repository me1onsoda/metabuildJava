import java.util.Scanner;

public class Ex02_1차원 {
	public static void main(String[] args) {
		String[] name = {"윤아", "아이유", "수지"};
		
		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<name.length;i++) {
            System.out.print(name[i]+"의 점수:");
            score[i]= sc.nextInt();
        }
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"의 점수는 "+score[i]+"입니다.");
		}
		
	}
}
