import com.javastudy.Car;

public class Ex06_import {
	public static void main(String[] args) {
		Car c = new Car("아반테",200);
		c.prnCar();
	}
	
	
}


//final 변수앞이나 메서드 앞에 선언할떄 붙여서 선어
//final 클래스는 상속받을수없다 -> 보안상의 이유로 확장을 막아두는것

//메서드앞에 final 이 붙을경우 그 메서드는 오버라이딩 될수없음