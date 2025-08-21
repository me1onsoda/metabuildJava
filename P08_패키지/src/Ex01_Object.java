class Student{ //기본적으로 Object를 상속
	private int stuNo;
	private String name;
	public Student(int stuNo, String name) {
		this.stuNo = stuNo;
		this.name = name;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return stuNo+" "+name;
	}
	
	public boolean equals(Object obj) {//(Student this, Object obj) 두 객체의 주소가 각각 들어가는것
		if(this == obj) return true; 
		if(!(obj instanceof Student)) return false; 
		
		Student s = (Student) obj;
		return this.stuNo==s.stuNo&&this.getName().equals(s.getName());
	}
	
}
public class Ex01_Object {
	public static void main(String[] args) {
		Student s1 = new Student(2020,"아이유");
		Student s2 = new Student(2023,"웬디");
		Student s3 = new Student(2020,"아이유");
		
		System.out.println(s1.getStuNo());
		System.out.println(s1.getName());
		System.out.println(s2.getStuNo());
		System.out.println(s2.getName());
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1); //참조변수만 썼다 -> 어차피 주소를 담고있는거라
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		
		if(s1.getName().equals(s3.getName())) System.out.println("이름이 같음");
	}

}
