
public class Ex04_문자형 {
	public static void main(String[] args) {
		int f1=10;
		double f2=2.34;
		
		char c1='a';
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println((char)c1+1);
		System.out.println((char)(c1+1));
		System.out.println(c1+1); //98출력, char변수는 2byte int는 4byte 이러면 더큰 4byte로 변환되서 출력 c1=a의 아스키코드값은 97 그러므로 97+1=9
		System.out.println(c1+c1); //char간의 +는 아스키코드값끼리 더해서 출력됨

		
		String s1="melon";
		System.out.println(s1+c1+s1+c1);
		
		int asc=97;
		System.out.println((char)asc);
		char asc1=97;
		System.out.println(asc1);
		
	}
}
