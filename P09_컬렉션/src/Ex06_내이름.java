import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String toString() {
		return name + "\t" + tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}//Card

public class Ex06_내이름 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String tellNum;
		ArrayList<Card> cardList = new ArrayList<>();
		while(true) {
			boolean found=false;
			System.out.println("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: 
				System.out.print("이름을 입력하세요:");
				name = sc.next();
				System.out.print("전화번호를 입력하세요:");
				tellNum = sc.next();
				Card c = new Card(name, tellNum);
				cardList.add(c);
				break;
			case 2: 
				System.out.print("삭제할 이름을 입력하세요:");
				name = sc.next();
				for(int i=0; i<cardList.size(); i++) {
					Card cd = cardList.get(i);
					if(cd.getName().equals(name)) { 
						cardList.remove(i);
						System.out.println("삭제되었습니다.");
						found = true;
						break;
					}
				}
				if(found == false) System.out.println("존재하지않습니다.");
				break;
			case 3: 
				System.out.print("이름을 입력해주세요:");
				name=sc.next();
				for(Card cardname : cardList) {
					if(cardname.getName().equals(name)) {
						System.out.print("수정하실 전화번호는:");
						tellNum=sc.next();
						cardname.setTel(tellNum);
						System.out.println("수정되었습니다.");
						found =true;
						break;
					}
				}
				if(found == false) System.out.println("존재하지않습니다.");
				break;
			case 4: 
				System.out.println("이름\t전화번호");
			    for (Card card : cardList) {
			        System.out.println(card);
			    }
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default : System.out.println("잘못입력했습니다.");
			}
		}
	}
}
/*
1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : 아이유
전화번호를 입력하세요 : 1234

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:1
이름을 입력하세요 : 박보검
전화번호를 입력하세요 : 3223

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		1234
박보검		3223

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : 박보검
삭제되었습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		1234

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:2
이름을 입력하세요 : 웬디
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		1234

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : 아이유
수정하실 전화번호는 : 9876
수정되었습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:4
이름		전화번호
아이유		9876

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:3
이름을 입력하세요 : 슬기
이름을 잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:6
잘못입력하셨습니다.

1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:5
프로그램을 종료합니다.
*/

