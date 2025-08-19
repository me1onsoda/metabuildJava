
public class Ex05_송병곤 {
	public static void main(String[] args) {
		int[] fib = new int[10];
		fib[0] = 1;
		fib[1] = 1;
		
		for(int i=2; i<=9; i++) {
			fib[i]=fib[i-2]+fib[i-1];
		}
		
		for (int result : fib) System.out.print(result+" ");
		
	}
}
