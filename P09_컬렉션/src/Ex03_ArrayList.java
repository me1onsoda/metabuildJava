import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		
		//List : 순서가 있다, 중복 허용한다.
		String s = "sss";
		System.out.println(s.toString());
		
		ArrayList<String> al = new ArrayList<String>();
		int size = al.size();
		System.out.println("size:" + size);
		al.add("수영"); // 0
		al.add("윤아"); // 1
		al.add("수영"); // 2
		size = al.size();
		System.out.println("size:" + size);
		System.out.println(al);
		System.out.println(al.toString());
		
		String obj = al.get(1);
		System.out.println("obj:" + obj);
		
		al.add(1,"태연");
		System.out.println(al);
		
		int index1 = al.indexOf("수영");
		System.out.println(index1);
		
		int index2 = al.lastIndexOf("수영");
		System.out.println(index2);
		
		boolean contains = al.contains("수영");
		System.out.println(contains);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력:");
		String name = sc.next();
		if(al.indexOf(name) != -1) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않았습니다.");
		}
		
		if(al.contains(name) == true) {
			System.out.println("가입한 회원입니다.");
		}else {
			System.out.println("가입하지 않았습니다.");
		}
		
		//al.remove(1);
		al.remove("수영");
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
	}
}









