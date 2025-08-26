import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06_InputStreamReader {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println(s);
//		
//		//InputStream은 한글을 읽을수없음
//		InputStream is = System.in;
//		//바이트입력 -> 문자입력  문자를 입력받을수있게 바꾸는것
//		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열입력:");
		String s = br.readLine();//공백포함
		System.out.println(s);
//		int n = Integer.parseInt(br.readLine());
//		System.out.println(n);
		
		
	}
}
