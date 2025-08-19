
public class Ex13_송병곤 {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				if(i%2!=0) continue;
				System.out.print(i+"*"+j+"="+(i*j)+"\n");
				if(i==j) break;
			}
			System.out.println("\n");
		}
	}

}

