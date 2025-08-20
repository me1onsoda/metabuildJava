interface Camera{
	void takePhoto(); //public static
}
interface Sports2{
	void exercise(); //public static
}
class Shape2{
	private int size;
	private String color;
	
	public void setSize(int size) {
		this.size=size;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
}
class Phone extends Shape2 implements Camera, Sports2{

	@Override
	public void takePhoto() {
		System.out.println("사진을 찍었습니다.");
	}

	@Override
	public void exercise() {
		System.out.println("운동 시작.");
	}
	
}
public class Ex13_인터페이스 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setSize(10);
		p.setColor("Blue");
		System.out.println(p.getSize());
		System.out.println(p.getColor());
		p.takePhoto();
		p.exercise();
	}
}
