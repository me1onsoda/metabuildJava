import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ex11_HashMap {
	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.size());
		hm.put("웬디", new Integer(30));
		hm.put("슬기", 40); //new Integer안써도 괜찮
		hm.put("조이", 30); 
		hm.put("슬기", 50); 
		System.out.println(hm.size()); //사이즈3 왜냐면 key는 중복이 되지않아서 하나가 덮어쓰여짐//
		
		System.out.println(hm.toString());
		
		Integer v =hm.get("슬기");
		System.out.println(v);
		
		Integer v2 =hm.get("아이린");
		System.out.println(v2); //없는 키를 넣어도 에러는 아님, null 반환
		
		boolean b =hm.containsKey("조이");
		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력:");
		String name = "조이";
		Integer output = hm.get(name);
		if(output == null) System.out.println("없습니다");
		else System.out.println(output);
		
		boolean result = hm.containsKey(name);
		System.out.println(result);
		
		System.out.println(hm.containsValue(50));
		System.out.println(hm.containsValue(150));
		
		System.out.println("------------------------");
		
		Map<String, Integer> scMap = new HashMap<>();
		scMap.put("손흥민", 10);
		scMap.put("메시", 7);
		scMap.put("호날두", 9);
		
		System.out.println(scMap);
		
		Set<String> ks = scMap.keySet();
		for(String s : ks) {
			System.out.println(s+":"+scMap.get(s));
		}
	}
}

//인터페이스 Map
//key 와 value 쌍으로 데이터를 표현
//key는 중복 허용x
//value은 중복 가능