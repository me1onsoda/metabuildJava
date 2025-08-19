
public class Ex03_메서드_송병곤 {
	public static void main(String[] args) {
		table(3);
		printS("apple",3);
		double avg = avgCalc(3,7);
		System.out.println();
		System.out.println(avg);
		
	}
	
	public static void table(int n) {
		for(int i=1; i<=9; i++) {
			System.out.println(n+"*"+i+"="+i*n);
		}
		System.out.println();
	}
	
	public static void printS(String s, int n) {
		for (int i=0; i<n; i++) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static double avgCalc(int x, int y) {
		double avg = (double)(x+y)/2;
		return avg;
	}
}
