//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//class Company{
//	private String part;
//	private String position;
//	private String grade;
//	public Company() {}
//	public Company(String part, String position, String grade) {
//		super();
//		this.part = part;
//		this.position = position;
//		this.grade = grade;
//	}
//	public String toString() {
//		return part+"/"+position+"/"+grade;
//	}
//
//}
//
//public class Ex14_송병곤1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Map<String, Company> emp = new HashMap<>();
//		
//		while(true) {
//			System.out.print("1.추가 | 2.검색 | 3.삭제 | 4.전체보기 | 5.종료 :");
//			int menu = sc.nextInt();
//			if(menu == 5) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			switch(menu) {
//			case 1:
//				System.out.print("이름:");
//				String name = sc.next();
//				System.out.print("부서:");
//				String part = sc.next();
//				System.out.print("직급:");
//				String position = sc.next();
//				System.out.print("평점:");
//				String grade = sc.next();
//
//				emp.put(name, new Company(part, position, grade));
//				System.out.println(emp);
//				break;
//			case 2:
//				System.out.print("찾는이름:");
//				String searchName = sc.next();
//				Company searchEmp = emp.get(searchName);
//				if(searchEmp==null) System.out.println("찾는 이름이 없습니다.");
//				else System.out.println(searchEmp);
//				break;
//			case 3:
//				System.out.print("삭제할 이름:");
//				String removeName = sc.next();
//				Company removeEmp = emp.remove(removeName);
//				if(removeEmp==null) System.out.println("찾는 이름이 없습니다.");
//				else System.out.println(emp);
//				break;
//			case 4:
//				System.out.println(emp);
//				break;
//			default:
//				System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
//			}
//				
//		}
//	}
//}
