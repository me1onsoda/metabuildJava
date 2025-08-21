import java.util.Scanner;

public class Ex07_Math {
	public static void main(String[] args) {
//		int ranNo = (int)(Math.random()*31+20);
//		System.out.println(ranNo);
//		
//		ranNo = (int)(Math.random()*45)+1;
//		System.out.println(ranNo);
		
		Scanner sc = new Scanner(System.in);
		int[] my = new int[6];
		
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*7)+1;
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}		
		
		for(int i=0; i<my.length; i++) {
			System.out.print("숫자"+(i+1)+":");
			my[i] = sc.nextInt();
		}
		
		System.out.println("----------------------");
		System.out.println("로또번호");
		for(int lottNum : lotto) {
			System.out.print(lottNum+" ");
			
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.println("내가고른번호");
		for(int myNum : my) {	
			System.out.print(myNum+" ");
		}
		
		int count=0;
		for(int lottNum : lotto) {
			for(int myNum : my) {	
				if(lottNum==myNum) count++;
			}
		}
		
		
	}
}
