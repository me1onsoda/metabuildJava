class Top{
	private int data;
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
}//Top

class Top2{
	private String data;
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
}//Top2

public class Ex01_NotGeneric {
	public static void main(String[] args) {
		Top t1 = new Top();
		t1.setData(123);
		int x = t1.getData();
		System.out.println(x);
		
		Top2 t2 = new Top2();
		t2.setData("generic");
		String y = t2.getData();
		System.out.println(y);
		
	}
}
