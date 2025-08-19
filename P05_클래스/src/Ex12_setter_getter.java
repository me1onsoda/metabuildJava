import java.util.Scanner;

class Human{
	private String name;
	private int age;
	private double height;
	
	public void setName(String name) {
		this.name =name; //this.name 멤버변수인 name이라는 뜻
	}
	public void setAge(int a) {
		age=a;
	}
	public void setHeight(double h) {
		height=h;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	
	public void aging(int y) {
		System.out.println(y+"년이 지났습니다.");
		age +=y;
		System.out.println(name+"의 나이는 "+age);
	}
}

public class Ex12_setter_getter {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setName("윤아");
		h1.setAge(30);
		h1.setHeight(172.9);
		
		System.out.println(h1.getName()+" "+h1.getAge()+" "+h1.getHeight());
		System.out.print("몇년을 흘러보낼까요?\n->");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		h1.aging(n);
	}

}
