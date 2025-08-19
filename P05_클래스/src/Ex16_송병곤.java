import java.util.Scanner;

class Person2 {

	private String name;
	private int age;
	
	Person2(String name, int age){
		this.name=name;
		this.age=age;
	}

	public void display() {
		System.out.println(name+","+age);
	}
}
public class Ex16_송병곤 {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		Person2[] p = new Person2[3];
		
		for(int i=0; i<p.length; i++) {
			System.out.print("이름:");
			name=sc.nextLine();
			System.out.print("나이:");
			age=Integer.parseInt(sc.nextLine());
			p[i] = new Person2(name, age);
		}
		for(Person2 person : p) {
			person.display();
		}
	}

}
