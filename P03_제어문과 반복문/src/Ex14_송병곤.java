
public class Ex14_송병곤 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i=1; i<=100; i++) {
			sum += i;
			if(i%10==0) System.out.println("1~"+i+"="+sum);
		}
	}
}
