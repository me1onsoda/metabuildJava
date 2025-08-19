public class Ex11_do_while {
	public static void main(String[] args) {
		int i;
		//1~5출력
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println();
		i=6;

		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		
		i=6;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
	}
}