import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranNum =(int)(Math.random()*100)+1;
		int answer=0;
		int count=0;
		for(;;) {
			try {
				System.out.println(ranNum);				
				System.out.print("숫자 맞추기(1~100):");
				answer = Integer.parseInt(sc.nextLine());
				//answer = sc.nextInt();
				count++;

			}catch(NumberFormatException nf) {
				System.out.println("입력타입이 잘못되었습니다.(문자 또는 실수 입력) 정수로 다시 입력해주세요");
				continue;
			}/*catch(InputMismatchException im) {
				System.out.println("입력타입이 잘못되었습니다.(문자 또는 실수 입력) 정수로 다시 입력해주세요");
				continue;
			}*/

			if(ranNum > answer) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(ranNum < answer){
				System.out.println("더 작은 수를 입력하세요");
			}else if(ranNum==answer) {
				System.out.println("정답!");
				System.out.println("시도횟수:"+count);
				break;
			}
			else System.out.println("틀렸습니다");
		}


		//난수발생 : 1~100 49

	}
}
