import java.util.ArrayList;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Integer a = al.get(1);
		System.out.println(a);
		System.out.println(al);
	}

}

