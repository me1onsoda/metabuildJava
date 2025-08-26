import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08_Scanner {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("read.txt")).useDelimiter(",");
		int num,sum=0,count=0;
		while(sc.hasNextInt()) {
			count++;
			num=sc.nextInt();
			System.out.println(num);
			sum+= num;
		}
		System.out.println(sum);
		System.out.println(sum/count);
		
		sc.close();
		
	}
}
