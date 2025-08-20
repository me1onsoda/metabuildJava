class Test{
	int x=10;
	void display() {
		System.out.println("Test x:"+x);
	}
}
class Test2 extends Test{
	void display() {
		System.out.println("Test x:"+x*x);
	}
}

public class Ex14_익명클래스 {

	public static void main(String[] args) {
		Test t1= new Test();
		t1.display();
		Test t2=new Test2();
		t2.display();
		
		new Test() { //익명 클래스형태
			void display() {
				System.out.println("Test x:"+x*x*x);
			}
		}.display(); 
	}

}
