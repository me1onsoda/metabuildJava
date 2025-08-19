class Person {
	private String name;
	private int age;

	public Person () {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

}//Person

class Student {
	int kor,eng,math;
	Person p; //Person 포함

	public Student(String name,int age, int kor, int eng, int math) {
		//p.name=name;
		//p.age=age;
		p = new Person(name,age);
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	void display() {
		System.out.println("name:"+p.getName());
		System.out.println("age:"+p.getAge());
		System.out.println("kor:"+kor);
		System.out.println("eng:"+eng);
		System.out.println("math:"+math);
	}
}

class Teacher1{
	int salary;
	Person p = new Person();
	
	public Teacher1(String name, int age, int salary) {
		this.salary=salary;
		p.setName(name);
		p.setAge(age);
	}
}

public class Ex03_포함 {
	public static void main(String[] args) {
		Student s = new Student("kim",20,70,80,90);
		s.display();
	}
}
