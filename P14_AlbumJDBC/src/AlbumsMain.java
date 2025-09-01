import java.util.InputMismatchException;
import java.util.Scanner;

public class AlbumsMain {
	AlbumsDao adao = new AlbumsDao();
	Scanner sc = new Scanner(System.in);

	public AlbumsMain() {
		init();
	}

	private void init() {
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
				for(AlbumsBean list : adao.getAllAlbum()) {
					list.displayData();
				}
				break;
			case 2:
				getAlbumBySearch();
				break;
			case 3:
				updateAlbum();
				break;
			case 4:
				deleteAlbum();
				break;
			case 5:
				insertAlbum();
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

	private void insertAlbum() {
		System.out.print("앨범 이름을 입력해주세요.\n>>");
		String song = sc.nextLine();
		System.out.print("가수를 입력해주세요.\n>>");
		String singer = sc.nextLine();
		System.out.print("발매사 입력해주세요.\n>>");
		String company = sc.nextLine();
		System.out.print("가격을 입력해주세요.\n>>");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("발매일를 입력해주세요.(yyyy-mm-dd)\n[default입력시 현재날짜가 자동으로 입력됩니다.]\n>>");
		String pub_day = sc.nextLine();
		adao.insertData(song, singer, company, price , pub_day);
	}

	private void deleteAlbum() {
		int cnt = 0;
		System.out.println("삭제할 앨범의 번호를 입력해주세요.");
		int delNum = Integer.parseInt(sc.nextLine());
		cnt = adao.deleteData(delNum);
		if(cnt==1) System.out.println("삭제가 완료되었습니다.");
		else System.out.println("해당되는 앨범이 없습니다.");
	}

	private void updateAlbum() {
		System.out.print("수정할 앨범의 번호를 입력해주세요.\n>>");
		int updateNum = Integer.parseInt(sc.nextLine());
		if(adao.getAlbum(updateNum)==null) {
			System.out.println("해당되는 앨범이 없습니다. 메뉴로 돌아갑니다.");
			return;
		}

		adao.getAlbum(updateNum).displayData();
		System.out.print("새로운 앨범 이름을 입력해주세요.\n>>");
		String updateSong = sc.nextLine();
		System.out.print("새로운 가수를 입력해주세요.\n>>");
		String updateSinger = sc.nextLine();
		System.out.print("새로운 발매사 입력해주세요.\n>>");
		String updateCompany = sc.nextLine();
		System.out.print("새로운 가격을 입력해주세요.\n>>");
		int updatePrice = Integer.parseInt(sc.nextLine());
		System.out.print("새로운 발매일를 입력해주세요.(yyyy-mm-dd)\n[default입력시 현재날짜가 자동으로 입력됩니다.]\n>>");
		String updatePub_day = sc.nextLine();

		AlbumsBean ab = new AlbumsBean(updateNum, updateSong, updateSinger, updateCompany, updatePrice, updatePub_day);
		adao.updateData(ab);
	}

	private void getAlbumBySearch() {
		System.out.println("어떤 조건으로 조회할지 선택해주세요.");
		System.out.println("1.앨범이름");
		System.out.println("2.가수");
		System.out.println("3.발매사");
		System.out.println("4.번호 입력");
		System.out.print(">>");
		int searchMenu=0;
		try {
			searchMenu = Integer.parseInt(sc.nextLine());
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 숫자(1~6)을 입력해주세요.");
			return;
		}
		String column="";
		switch(searchMenu) {
		case 1:
			column = "song";
			break;
		case 2:
			column = "singer";
			break;
		case 3:
			column = "compnay";
			break;
		case 4:
			column = "num";
			break;
		default:
			System.out.println("메뉴에 없는 번호입니다. 1~4 사이의 숫자를 입력해주세요.");
			return;
		}
		System.out.print("검색어>>");
		String searchWord = sc.nextLine();
		int resultNum=adao.getDataBySearch(column, searchWord).size();
		System.out.println("검색결과:"+resultNum);
		if(resultNum==0) {
			System.out.println("해당되는 정보가 없습니다.");
			return;
		}
		for(AlbumsBean searchList : adao.getDataBySearch(column,searchWord)) {
			searchList.displayData();
		}

	}

	private void displayMenu() {
		System.out.println("====메뉴선택하기=====");
		System.out.println("1.전체 정보 조회");
		System.out.println("2.조건 조회");
		System.out.println("3.정보 수정");
		System.out.println("4.정보 삭제");
		System.out.println("5.정보 추가");
		System.out.println("6.프로그램 종료");
		System.out.print(">>");	
	}

	public static void main(String[] args) {
		new AlbumsMain();
	}

}
