interface RemoteControl2{
	void turnOn();
	void turnOff();
}
public class Ex16_익명클래스 {
	public static void main(String[] args) {
		RemoteControl2 r = new RemoteControl2() {
			@Override
			public void turnOn() { //public 이라고 붙여야함
				System.out.println("Tv를 켠다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Tv를 끈다.");
			}
		};
		
		r.turnOn();
		r.turnOff();
	}
}
