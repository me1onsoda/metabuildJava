import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonMain {
	
	Scanner sc = new Scanner(System.in);
	PersonDao pdao = new PersonDao();
	
	public PersonMain() {
		System.out.println("PersonMain 생성자");
		init();
	}
	
	private void init() {
		int menu=0;
		while(true) {
				displayMenu();
			try {
				menu=Integer.parseInt(sc.nextLine());
				
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자(1~6)을 입력해주세요.");
				continue;
			}
			switch (menu) {
			case 1: //전체정보조회
				ArrayList<PersonBean> allData = pdao.getAllPerson();
				for(PersonBean all : allData) {
					all.displayData();
				}
				break;
				
			case 2: //성별로조회
				System.out.print("조회하고싶은 성별을 입력해주세요.(남자/여자)\n>>");
				String inputGender = sc.nextLine();
				ArrayList<PersonBean> dataByGender = pdao.getPersonByGender(inputGender);
				for(PersonBean g : dataByGender) {
					g.displayData();
				}
				break;
				
			case 3: //정보수정
				
				pdao.updateData();
				break;
				
			case 4: //정보삭제
				System.out.print("삭제할 정보의 이름을 입력해주세요.\n>>");
				String name = sc.nextLine();
				if(!pdao.isNameExists(name)) {
					System.out.println("존재하지 않는 이름입니다."); 
					break;
				}
				pdao.deleteData(name);
				break;
				
			case 5: //정보추가
				System.out.println("추가할 정보를 입력해주세요");
				String nameInput ="";
				while(true) {
					
					System.out.print("이름(중복 불가)\n>>");
					nameInput = sc.nextLine();
					
					if(pdao.isNameExists(nameInput)) 
						System.out.println("이미 존재하는 이름입니다. 다시 입력해주세요.");
					else break;
				}
				System.out.print("나이\n>>");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별(남자/여자)\n>>");
				String gender = sc.nextLine();
				System.out.print("생년월일(yyyy-mm-dd)\n#default 입력시 기본값으로 현재 날짜가 입력됩니다.\n>>");
				String birth = sc.nextLine(); 
				pdao.insertData(nameInput, age, gender, birth);
//				ArrayList<PersonBean> afterInsrtData = pdao.getAllPerson();
//				for(PersonBean afterInsert : afterInsrtData) {
//					afterInsert.displayData();
//				}
				break;
				
			case 6: //종료
				System.out.println("프로그램을 종료합니다.");
//				return;
				System.exit(0);
			
			default:
				System.out.println("메뉴에 없는 번호입니다. 1~6 사이의 숫자를 입력해주세요.");
		        break;
			}
			
		}//while
	}

	public static void main(String[] args) {
		
		new PersonMain();
		
	}
	
	public static void displayMenu() {
		System.out.println("====메뉴선택하기=====");
		System.out.println("1.전체 정보 조회");
		System.out.println("2.성별로 조회");
		System.out.println("3.정보 수정");
		System.out.println("4.정보 삭제");
		System.out.println("5.정보 추가");
		System.out.println("6.프로그램 종료");
		System.out.print(">>");
	}
	
	

}
