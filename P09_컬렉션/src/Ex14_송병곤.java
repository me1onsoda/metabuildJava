import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Company{
	private String part;
	private String position;
	private String grade;
	public Company() {}
	public Company(String part, String position, String grade) {
		super();
		this.part = part;
		this.position = position;
		this.grade = grade;
	}
	public String toString() {
		return part+"/"+position+"/"+grade;
	}

}

public class Ex14_송병곤 {
	public static void main(String[] args) {
		String answer;
		Scanner sc = new Scanner(System.in);
		Map<String, Company> emp = new HashMap<>();

		while(true) {

			System.out.print("이름:");
			String name = sc.next();
			System.out.print("부서:");
			String part = sc.next();
			System.out.print("직급:");
			String position = sc.next();
			System.out.print("평점:");
			String grade = sc.next();

			emp.put(name, new Company(part, position, grade));

			System.out.print("계속?");
			answer = sc.next();
			if(answer.toLowerCase().equals("y")) continue;
			if(answer.toLowerCase().equals("n")) {
				System.out.println(emp);
				break;
			}
		}

		while(true) {
			System.out.print("찾는이름:");
			String searchName = sc.next();
			Company searchEmp = emp.get(searchName);
			if(searchEmp==null) System.out.println("찾는 이름이 없습니다.");
			else System.out.println(searchEmp);

			System.out.print("계속?");
			answer = sc.next();
			if(answer.toLowerCase().equals("y")) continue;
			if(answer.toLowerCase().equals("n")) break;
		}

		while(true) {
			System.out.print("삭제할 이름:");
			String removeName = sc.next();
			Company removeEmp = emp.remove(removeName);
			if(removeEmp==null) System.out.println("찾는 이름이 없습니다.");
			else System.out.println(emp);


			System.out.print("계속?");
			answer = sc.next();
			if(answer.toLowerCase().equals("y")) continue;
			if(answer.toLowerCase().equals("n")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
