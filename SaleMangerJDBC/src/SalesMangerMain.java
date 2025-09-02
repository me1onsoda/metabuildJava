import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesMangerMain {
	SalesMangerDao smdao = new SalesMangerDao();
	Scanner sc = new Scanner(System.in);
	
	public SalesMangerMain() {
		init();
	}
	
	private void init() {
		int menu =0;
		while(true) {
			displayMenu();
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch(InputMismatchException | NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 1~11사이의 숫자를 입력해주세요.");
				continue;
			}
			switch(menu) {
			case 1:
				getAllProducts();
				break;
			case 2:
				getProductBySearch();
				break;
			case 3:
				updateProduct();
				break;
			case 4:
				deleteProduct();
				break;
			case 5:
				insertProduct();
				break;
			case 6:
				getAllSales();
				break;
			case 7:
				insertSale();
				break;
			case 8:
				SalesGroupByProduct();
				break;
			case 9:
				getSalesByDate();
				break;
			case 10:
				getTopSales();
				break;
			case 11:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default: 
				System.out.println("메뉴에 없는 번호입니다. 1~11 사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}

	private void getAllProducts() {
		System.out.println();
		for(ProductsBean pb : smdao.getAllProducts()){
			pb.displayData();
		}
	}

	private void getProductBySearch() {
		String column ="";
		int menu =0;
		String searchWord;
		int searchInt;
		System.out.println("1.상품번호 2.상품명");
		System.out.print("어떤 항목으로 검색할지 선택해주세요.\n>>");
		menu = Integer.parseInt(sc.nextLine());
		switch(menu) {
		case 1:
			column = "product_id";
			System.out.print("검색어>>");
			searchInt = Integer.parseInt(sc.nextLine());
			for(ProductsBean pb : smdao.getProductBySearch(column, searchInt)){
				pb.displayData();
			}
			break;
		case 2:
			column = "product_name";
			System.out.print("검색어>>");
			searchWord = sc.nextLine();
			for(ProductsBean pb : smdao.getProductBySearch(column, searchWord)){
				pb.displayData();
			}
			break;
		}
		
	}

	private void updateProduct() {
		
	}

	private void deleteProduct() {
		
	}

	private void insertProduct() {
		
	}

	private void getAllSales() {
//		for(SalesBean sb : smdao.getAllSales();
	}

	private void insertSale() {
		
	}

	private void SalesGroupByProduct() {
		
	}

	private void getSalesByDate() {
		
	}

	private void getTopSales() {
		
	}

	private void displayMenu() {
		System.out.println("====메뉴선택하기=====");
		System.out.println("1.전체 상품 목록 조회");
		System.out.println("2.상품 검색");
		System.out.println("3.상품 정보 수정");
		System.out.println("4.상품 삭제");
		System.out.println("5.신규 상품 추가");
		System.out.println("6.전체 판매 기록 조회");
		System.out.println("7.판매 기록 추가");
		System.out.println("8.상품별 총 판매량 조회");
		System.out.println("9.기간별 판매 기록 조회");
		System.out.println("10.판매량 TOP 5 상품 조회 조회");
		System.out.println("11.프로그램 종료");
 		System.out.print(">>");	
	}

	public static void main(String[] args) {
		new SalesMangerMain();
	}
}
