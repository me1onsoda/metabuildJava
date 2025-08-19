class Person2{
	private String name;
	private int age;
	
	public Person2() {}
	public Person2(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println(name+"\n"+age);
	}
}//Person2

class Worker extends Person2{
	private String company;
	private String part;
	
	public Worker() {}
	public Worker(String name, int age, String company, String part) {

		super(name,age); //super 생성자 부모생성자 사용
		this.company=company;
		this.part=part;
	}
	
	public void display() {
		super.display();
		System.out.println(company+"\n"+part);
	}
	
}//Worker

class Teacher extends Worker{
	private String subject;
	
	public Teacher() {}
	public Teacher(String name, int age, String company, String part, String subject) {
		
		super(name,age,company,part); //super 생성자 부모생성자 사용 //
		this.subject=subject;
	}
	
	public void display() {
		super.display();
		System.out.println(subject);
	}
	
}//Teacher

public class Ex04_상속 {
	public static void main(String[] args) {
		Person2 p = new Person2("제니",20);
		p.display();
		System.out.println("------------------------");
		
		Worker w = new Worker("지수",22,"메타빌드","연구부");
		w.display();
		System.out.println("------------------------");

		Teacher t = new Teacher("로제",24,"메타고","생활지도부","음악");
		t.display();
		System.out.println("------------------------");
	}
}
