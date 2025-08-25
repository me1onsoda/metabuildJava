import java.util.Enumeration;
import java.util.Vector;

public class Ex08_Vector {
	public static void main(String[] args) {

		Vector<String> v=new Vector<String>();
		System.out.println(v.size());
		v.add("봄");
		v.add("여름");
		v.add("가을");
		v.add("겨울");
		System.out.println(v.size());
		System.out.println(v.toString());

		String s = v.get(0);
		System.out.println(s);

		Enumeration<String> enu = v.elements(); //Enumeration 클래스 또는 인터페이스

		while(enu.hasMoreElements()) { //하나라도 있으면 참 -> 안에 요소가 있는동안 반복
			String season = enu.nextElement();
			System.out.println(season);
		}
		
		for(String se : v) {
			System.out.println(se);
		}
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}
