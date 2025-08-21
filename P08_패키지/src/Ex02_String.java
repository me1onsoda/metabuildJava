import java.util.Scanner;

//import java.lang.String


public class Ex02_String {
	public static void main(String[] args) {
//		String s1 = new String("Have a nice day");
//		String s2 = new String("Have a nice day");
		String s1 = "Have a nice day";
		String s2 = "Have a nice Day";
		
		System.out.println(s1+"\n"+s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.length()); //공백 포함
		System.out.println(s2.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2); //new로 생성해서 비교하면 false, 평소하듯이 String 변수 생성해서 비교하면 true
		System.out.println(s1.compareTo(s2)	); // d:100 - D:68 = 32 // 같으면 0 다르면 0말고
		
		if(s1.compareTo(s2)==0) System.out.println("문자열 같음");
		else System.out.println("문자열 다름");
		
		System.out.println(s1.equalsIgnoreCase(s2)); //소 대문자 무시, 같은것으로 취급
		if(s1.equalsIgnoreCase(s2)) System.out.println("문자열 같음(소 대문자 무시)");
		System.out.println(s1.compareToIgnoreCase(s2)); //소 대문자 무시, 같은것으로 취급
		if(s1.compareToIgnoreCase(s2)==0) System.out.println("문자열 같음(소 대문자 무시)");
		else System.out.println("문자열 다름");
		
		s1.concat(s2);
		String s3= " abc DE Fg h ";
		System.out.println(s3.length());
		System.out.println(s3);
		String trim=s3.trim(); //앞뒤 공백 없애주나봄
		System.out.println(trim);
		System.out.println(trim.length());
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println("s1.indexof:"+s1.indexOf("a"));
		
		if(s3.contains("a")) System.out.println("a 포함됨");
		
		System.out.println(s3.charAt(3));
		
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3, 6)); 
		
		String fullName = "Hello.java";
		String fileName;
		String ext;
		fileName=fullName.substring(0,fullName.indexOf("."));
		ext=fullName.substring(fullName.indexOf(".")+1);
		System.out.println("fileName : "+fileName);
		System.out.println("ext : "+ext);
		
		String id = "kim";
		String pw = "1234";
		Scanner sc = new Scanner(System.in);
		String id1 = sc.nextLine();
		String pw1 = sc.nextLine();
		
		if(id.equals(id1)) {
			if(pw.equals(pw1)) {
				System.out.println("로그인 되었습니다.");
			}
			else System.out.println("패스워드를 확인해주세요.");
		}
		else System.out.println("가입되지 않은 id입니다.");
		
		
	}
}

// a:97 d:100
// A:65 D:68