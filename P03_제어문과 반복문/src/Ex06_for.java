import java.util.Scanner;

public class Ex06_for {

	public static void main(String[] args) {
		
		for (int i=1; i<101; i++) {
			if(i%5==0 && i%7==0) System.out.print(i+" ");
		}
		System.out.printf("\n");
		int e_sum=0, o_sum=0;
		
		for (int n=1; n<101; n++) {
			if (n%2==0) o_sum += n;
			else e_sum += n;
		}
		System.out.println("홀수의 합:"+e_sum);
		System.out.println("짝수의 합:"+o_sum);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력:");
		int dan = sc.nextInt();
		
		for (int d = 1; d<10; d++) {
			System.out.println(dan+" * "+d+" = "+dan*d);
		}
		
	}

	
}
