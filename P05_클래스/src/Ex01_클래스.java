class Person{
	String name;
	int age;
	double height;
	static String nation; //정적변수, 다른 객체간에 공유하는 변수
	final int x=10; //final 변수는 직접 초기화 시켜줘야함!!
}


public class Ex01_클래스 {

	public static void main(String[] args) {
		Person man = new Person();
		
		System.out.println(man.x);
		//man.x=20; //final 변수이기에 값을 할당할수없다. 한번 설정하면 그대로끝
		
		System.out.println(man);
		Person.nation="한국";
		
		man.name="박보검";
		man.age=30;
		man.height=178.3;
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.height);
		System.out.println(Person.nation);
		
		Person woman = new Person();
		System.out.println(woman);
		woman.name="수아";
		woman.age=30;
		woman.height=155.3;
		System.out.println(woman.name);
		System.out.println(woman.age);
		System.out.println(woman.height);
		System.out.println(Person.nation);
		
		
	}

}
