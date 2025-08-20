interface CopyMachine{ //인터페이스에는 미완성 메서드가 들어가야함!
	//미완성 메서드
	void copy(); //public abstract
	int age=30; //static final //한번 초기화 이후에는 수정불가
}
interface PrintMachine{
	void print();
}
class Compound implements CopyMachine ,PrintMachine{

	@Override
	public void copy() {
		System.out.println("복사한다.");
	}

	@Override
	public void print() {
		System.out.println("출력한다.");		
	}

}
public class Ex12_인터페이스 {
	public static void main(String[] args) {
		//CopyMachine c = new CopyMachine(); //interface는 객체 생성 불가능
		Compound c = new Compound();
		c.copy();
		c.print();
		
		CopyMachine c2 = new Compound();
		c2.copy();
//		c2.print(); //안되는 이유: 자식을 부모로 업케스팅한 상황인데 Copy로 업캐스팅했기때문에 copy는 있지만 print는 없기때문에	
		
		PrintMachine p2 = new Compound();
		//p2.copy();
		p2.print();
		
	}
}
