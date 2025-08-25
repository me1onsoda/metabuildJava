import java.util.HashSet;
import java.util.Iterator;

public class Ex09_HashSet {
	public static void main(String[] args) {
		HashSet<String>  hs= new HashSet<>();
		System.out.println(hs.size());
		hs.add("banana");
		hs.add("orange");
		hs.add("banana");
		hs.add("apple");
		hs.add("grape");
		System.out.println(hs.size()); 
		System.out.println(hs.toString()); //중복 안되기떄문에 에러는 아니지만 두개만 들어감
		System.out.println(hs.isEmpty()); //들어있으니까 false 
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) { //안에더 있으면 -> true //데이터의 끝까지 반복
			String fruit = it.next();
			System.out.println(fruit);
		}
		System.out.println("----------------");
		
		boolean c =hs.contains("orange"); //orange들어있음 true
		System.out.println(c);
		
		boolean r =hs.remove("appl"); //appl이 없음 삭제 실패 그래서 false
		System.out.println(r);
		
		System.out.println(hs);
		
		
		
	}
}

//Set interface : 순서x, 중복허용x