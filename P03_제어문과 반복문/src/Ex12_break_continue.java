
public class Ex12_break_continue {

	public static void main(String[] args) {
		int i;
		for( i=1; i<11; i++) {
			if(i==5)
				break;
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		for( i=1; i<11; i++) {
			if(i==5)
				continue;
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
		i=1;
		while(i<=10) {
			if (i==5) {i++; continue;}
			System.out.print(i+" ");
			i++;
		}
	}

}
