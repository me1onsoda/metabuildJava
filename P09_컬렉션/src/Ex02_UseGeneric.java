class Top3<T>{
	private T data;
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
}//Top

public class Ex02_UseGeneric {
	public static void main(String[] args) {
		Top3<Integer> t1 = new Top3<Integer>();
		t1.setData(123);
		Integer a = t1.getData();
		System.out.println(a);
		
		Top3<String> t2 = new Top3<String>();
		t2.setData("generic");
		String b = t2.getData();
		System.out.println(b);
	}
}
