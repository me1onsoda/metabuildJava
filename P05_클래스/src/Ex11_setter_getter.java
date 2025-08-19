import java.util.Scanner;

class Fruit{
	private String name;
	private int price;
	
	public void setName(String n) { //원하는 조건을 걸어서 이름을 넣을수있도록
		name=n;
	}
	
	public void setPrice(int p) {
		if (p>0) price = p;
		if (p<0) System.out.println("오류:가격에 음수가 입력됨");
	}
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public void risePrice(int x) {
		price +=x;
		System.out.println("가격이 "+x+"원 올랐습니다.");
	}
}

public class Ex11_setter_getter {

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		
		//f1.name="포도";
		//f1.price=-3000;
		f1.setName("포도");
		f1.setPrice(3000); 
		//System.out.println(f1.name+"는 "+f1.price+"원");
		
		System.out.println(f1.getName()+"는 "+f1.getPrice()+"원");
		System.out.print("오를 가격의 값:");
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		f1.risePrice(n);
		System.out.println("현재 "+f1.getName()+"의 가격은 "+f1.getPrice()+"원");
		
		

		
	}

}
