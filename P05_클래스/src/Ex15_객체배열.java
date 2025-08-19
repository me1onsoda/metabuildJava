class Book{
	private String title;
	private int price=2000;
	
	Book () {
		title="java";
		price=2000;
	}
	Book (String title){
		this.title=title;
	}
	Book (String title, int price){
		this.title=title;
		this.price=price;
	}
	
	public void display() {
		System.out.println(title+","+price);
	}
}

public class Ex15_객체배열 {
	public static void main(String[] args) {

		Book[] bk = {new Book(),new Book("Oracle"),new Book("Spring",5000)};
		Book[] bk2 = new Book[3];
		
		System.out.println(bk.length);
		bk[0].display();
		bk[1].display();
		bk[2].display();
		for(int i=0; i<bk.length; i++) {
			bk[i].display();
		}
		System.out.println();
		for (Book book : bk) {
            book.display();
        }
		
	}

}
