abstract class Shape{
	public Shape() {
		System.out.println("Shape 생성자");
	}
	public abstract void draw(); //추상메서드는 당연히 추상 클래스안에서 생성
	public abstract void delete(); //추상메서드는 당연히 추상 클래스안에서 생성
} //추상메서드앞의 제어자는 public이 맞을듯 안그럼 다른패키지에서 접근이 힘들어지니까
class Circle extends Shape{
	public Circle() {
		System.out.println("Circle 생성자");
	}
	public void draw() {
		System.out.println("원을 그린다.");
	}
	public void delete() {
		System.out.println("원을 지운다.");
	}
}
class Triangle extends Shape{
	public Triangle() {
		System.out.println("Triangle 생성자");
	}
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
	public void delete() {
		System.out.println("삼각형을 지운다.");
	}
} 
class Square extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}

public class Ex10_추상클래스 {
	public static void main(String[] args) {
		Circle c = new Circle();
		Triangle t = new Triangle();
		
		c.draw();
		t.delete();
		
		Shape[] s = new Shape[2];
		s[0]= c;
		s[1]= t;
		
		s[0].draw();
		s[0].delete();
		s[1].draw();
		s[1].delete();
		
	}
}
