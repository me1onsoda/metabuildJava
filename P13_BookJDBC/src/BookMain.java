import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMain {
	static Scanner sc = new Scanner(System.in);
	BookDao bdao = new BookDao();

	public BookMain() {
		System.out.println("BookMain 생성자");
		init();
	}

	public  void init() {
		int menu = 0;
		while(true) {
			displayMenu();
			try {
				menu=Integer.parseInt(sc.nextLine());

			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자(1~6)을 입력해주세요.");
				continue;
			}

			switch(menu) {
			case 1:
				for(BookBean list : bdao.getAllBook()) {
					list.displayData();
				}
				break;
			case 2:
				getBookBySearch();
				break;
			case 3:
				updateBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				inserBook();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default: 
				System.out.println("메뉴에 없는 번호입니다. 1~6 사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}
	
	private static void displayMenu() {
		System.out.println("====메뉴선택하기=====");
		System.out.println("1.전체 정보 조회");
		System.out.println("2.조건 조회");
		System.out.println("3.정보 수정");
		System.out.println("4.정보 삭제");
		System.out.println("5.정보 추가");
		System.out.println("6.프로그램 종료");
		System.out.print(">>");		
	}
	
	private void getBookBySearch() {
		System.out.println("어떤 조건으로 조회할지 선택해주세요.");
		System.out.println("1.제목");
		System.out.println("2.저자");
		System.out.println("3.출판사");
		System.out.println("4.번호 입력");
		System.out.print(">>");
		String column="";
		int searchNum = 0;
		try {
			searchNum = Integer.parseInt(sc.nextLine());
			
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 숫자(1~6)을 입력해주세요.");
			return;
		}
		switch(searchNum) {
		case 1:
			column = "title";
			break;
		case 2:
			column = "author";
			break;
		case 3:
			column = "publisher";
			break;
		case 4:
			column = "no";
			break;
		default:
			System.out.println("메뉴에 없는 번호입니다. 1~4 사이의 숫자를 입력해주세요.");
			return;
		}
		
		System.out.print("검색어>>");
		String searchWord = sc.nextLine(); //포함으로 검색하게 할거임 '%~%'
		int resultNum = bdao.getBookBySearch(column,searchWord).size();
		System.out.println("검색결과:"+resultNum);
		if(resultNum==0) {
			System.out.println("해당되는 정보가 없습니다.");
			return;
		}
		for(BookBean searchList : bdao.getBookBySearch(column,searchWord)) {
			searchList.displayData();
		}
	}

	private void updateBook() {

		System.out.print("수정하고싶은 책 번호를 입력해주세요.\n>>");
		int updateNo = Integer.parseInt(sc.nextLine());
		bdao.getBookByNo(updateNo).displayData();

		System.out.print("변경된 책 제목을 입력해주세요.\n>>");
		String updateTitle = sc.nextLine();
		System.out.print("변경된 저자를 입력해주세요.\n>>");
		String updateAuthor = sc.nextLine();
		System.out.print("변경된 출판사를 입력해주세요.\n>>");
		String updatePublisher = sc.nextLine();
		System.out.print("변경된 가격을 입력해주세요.\n>>");
		int updatePrice = Integer.parseInt(sc.nextLine());
		System.out.print("변경된 출판 날짜를 입력해주세요.(yyyy-mm-dd)\n[default입력시 현재날짜가 자동으로 입력됩니다.]\n>>");
		String updatePub_day = sc.nextLine();
		BookBean bb = new BookBean(updateNo, updateTitle, updateAuthor, updatePublisher, updatePrice, updatePub_day);
		bdao.updateData(bb);
	}
	
	private void deleteBook() {
		System.out.print("삭제하고싶은 책 번호를 입력해주세요.\n>> ");
		int deleteNo = Integer.parseInt(sc.nextLine());
		int cnt = bdao.delteData(deleteNo);
		
		if(cnt == 1) System.out.println("삭제가 완료되었습니다.");
		else System.out.println("존재하지않는 번호입니다.");
	}
	
	private void inserBook() {
		System.out.print("책 제목을 입력해주세요.\n>>");
		String title = sc.nextLine();
		System.out.print("저자를 입력해주세요.\n>>");
		String author = sc.nextLine();
		System.out.print("출판사를 입력해주세요.\n>>");
		String publisher = sc.nextLine();
		System.out.print("가격을 입력해주세요.\n>>");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("출판 날짜를 입력해주세요.(yyyy-mm-dd)\n[default입력시 현재날짜가 자동으로 입력됩니다.]\n>>");
		String pub_day = sc.nextLine();
		bdao.insertData(title, author, publisher, price , pub_day);
	}
		
	public static void main(String[] args) {
		new BookMain(); 
	}
}
