import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex07_송병곤 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int menu;
		while(true) {
			System.out.print("1.단어입력 2.단어검색 3.종료\n>>");
			try {
				menu = Integer.parseInt(br.readLine());
			} catch (NumberFormatException  e) {
				System.out.println("오류: 메뉴는 숫자로 입력해주세요.");
				continue;
			}
			
			if(menu==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch(menu) {
			case 1:
				addWord(br);
				break;
			case 2:
				String word =searchWord(br);
				System.out.println(word);
				break;
			default:
				System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
			}
		}
		br.close();
	}
	
	public static void addWord(BufferedReader br) throws IOException {
		String word;
		System.out.print("입력(단어/뜻)\n>>");
		word = br.readLine();
		try (FileWriter fw  =new FileWriter("voca.txt",true)){
			StringTokenizer checkForm = new StringTokenizer(word,"/"); //형식확인
			if(checkForm.countTokens()<2) {
				System.out.println("형식을 지켜서 입력해주세요.");
				return;
			}
			fw.write(word+"\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String searchWord(BufferedReader br) throws IOException {
		String savedLine;
		System.out.print("검색 단어 입력>>");
		String searchWord = br.readLine();
		
		try(FileReader fr = new FileReader("voca.txt");
			BufferedReader brf = new BufferedReader(fr)) {
			while((savedLine = brf.readLine())!=null) {
				StringTokenizer savedWord = new StringTokenizer(savedLine,"/");
				if(savedWord.nextToken().equalsIgnoreCase(searchWord)) {
					return "단어의 뜻>>"+savedWord.nextToken();
				}
			}
			return"찾는 단어가 없습니다.";
			
		} catch (FileNotFoundException e) {
		    return "찾는 단어가 없습니다. (단어장이 비어있습니다)";
		} catch (IOException e) {
			e.printStackTrace();
			return "오류발생"+e;
		}
	}
	
}
