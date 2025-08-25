import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex12_HashMap {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("sky", "하늘");
		dic.put("apple", "사과");
		dic.put("coffee", "커피");
		dic.put("face", "책상");

		System.out.println(dic);

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("찾는 단어는?(q입력시 종료):");
			String word = sc.next();
			if(word.equals("q")) {
				System.out.println("종료 되었습니다.");
				break;
			}
			if(dic.get(word)==null) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.println("뜻:"+dic.get(word));
		}

	}
}
