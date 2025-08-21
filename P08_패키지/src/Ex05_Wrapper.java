
public class Ex05_Wrapper {
	public static void main(String[] args) {
//		3:int=>Integer //기본 자료형을 객체 변수에 넣기위해서 자료형을 객체로 만들어주는 것 -> wrapper
//		1.4:double=>Double
		
		int a=11;
		int b=22;
		Integer it1 = new Integer(11);
		Integer it2 = 22; //위 아래 둘다 가능 , 아래는 autoboxing 되었다
						  // 22=>new Intger(22)
		System.out.println(it1+it2);
		
		int it3 = new Integer(21); //new Integer(21)=>21 unboxing
		int it4 = new Integer(22); //new Integer(21)=>21 unboxing
		System.out.println(it3+it4);
		
		double d = new Double(1.3);
		
//		int i = Integer.parseInt("100");
//		int j = Integer.parseInt("200");
		int i = Integer.valueOf("100");
		int j = Integer.valueOf("200");
		System.out.println("100"+"200");
		System.out.println(i+j);
		
		System.out.println(Double.parseDouble("1.23")+Double.parseDouble("3.45"));
		
		int x=100;
//		String s = String.
		

	}
}
