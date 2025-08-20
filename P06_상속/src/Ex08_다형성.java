class Car {

	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	int door=6;
	int wheel=10;
	public void drive() {
		System.out.println("FEdrive");
	}
	void water() {
		System.out.println("water~");
	}
}//FireEngine


public class Ex08_다형성 {
	public static void main(String[] args) {
		Car c ;
		FireEngine fe = new FireEngine ();
		FireEngine fe2;

		fe.water();
		fe.drive();
		c = fe; //c=(Car)fe; 자식을 부모타입에 넣을때 자동으로 됨 //업캐스팅
		System.out.println(c.door); //4
		//	System.out.println(c.wheel);
		System.out.println(c.color);

		System.out.println(c.door); //6
		System.out.println(c.wheel);
		System.out.println(c.color);

		c.drive(); //확인!
		System.out.println(c instanceof FireEngine);
		if(c instanceof FireEngine) 
			System.out.println("다운 캐스팅 가능");
		else
			System.out.println("다운 캐스팅 불가능");
		

		fe2=(FireEngine)c; //부모를 자식타입으로 내리는작업 //이때는 내가 직접 명시해줘야함 다운캐스팅 한다고
		fe2.water();
		fe2.drive();
	}
}
