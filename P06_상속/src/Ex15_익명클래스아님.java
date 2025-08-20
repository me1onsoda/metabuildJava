interface RemoteControl{
	void turnOn();
	void turnOff();
}
class Tv implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Tv를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끈다.");
	}
	
}
public class Ex15_익명클래스아님 {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.turnOn();
		t.turnOff();
	}
}
