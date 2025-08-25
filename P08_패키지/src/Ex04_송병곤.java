import java.util.Scanner;

class Person{
	private String id;
	private String pw;
	private String name;
	public Person(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public String getId() { return id; }
	public String getPw() { return pw; }
	public String getName() { return name; }
}
public class Ex04_송병곤 {
	public static void main(String[] args) {
		Person[] users = new Person[3];
		users[0]=new Person("kim","1234","김연아");
		users[1]=new Person("park","5678","박세리");
		users[2]=new Person("son","9876","손흥민");

		Scanner sc = new Scanner(System.in);

		while(true) {
			Person matched = null; //반복시작마다 초기화

			while(true) { //ID 검증
				System.out.print("id입력:");
				String id = sc.nextLine();

				if(id.length()<3||id.length()>8) {
					System.out.println("3~8글자를 입력해주세요");
					continue;
				}

				for(Person user : users) {
					if(id.equals(user.getId())) {
						matched = user;
						break;
					}
				}
				if(matched != null) break;
				System.out.println("가입되지 않은 아이디입니다.");
			}

			while(true) { //PW검증
				System.out.print("pw입력:");
				String pw = sc.nextLine();
				if(pw.equals(matched.getPw())) break;
				System.out.println("패스워드가 맞지 않습니다. 다시 입력해주세요.");
			}

			System.out.println(matched.getName()+"님 반갑습니다.");

			while(true) { //재시작여부 확인
				System.out.println("계속 하시겠습니까? (y/n)");
				String yn = (sc.nextLine()).toLowerCase();
				if(yn.equals("n")) return;
				if(yn.equals("y")) break;
				System.out.println("y/n으로 입력해주세요.");
			}
		}
	}
}

//개선점
//유저 정보는 클래스에 display함수를 만들어도 좋았을듯
