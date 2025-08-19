class Animal{
	public void move2() {
		System.out.println("동물이 움직인다.");
	}
}

class Person3 extends Animal{
	public void move() {
		System.out.println("사람이 걷는다.");
	}
	
}

class Bird extends Animal{
	public void move() {
		System.out.println("새가 날아간다.");
	}
	
}
public class Ex07_다형성 {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.move();
		
		Animal person = new Person3();
		person.move(); //오류 이유 : 업캐스팅을 해서 animal 객체로 인식되는데 animal객체에는 move가 없기떄문
		
		Animal bird = new Bird();
		bird.move(); 
		System.out.println("----------------");
		
		double i =3; //자동으로 3.0으로 들어감 자동형변환
		System.out.println(i);
		
		Animal p2 = new Person3(); // animal로 자동형변환 사실 (Animal)new Person3(); 인셈 //자식을 부모타입으로 변환 //업캐스팅
		p2.move();
		
		Animal b2 = new Bird();
		b2.move(); 
				
	}

}
