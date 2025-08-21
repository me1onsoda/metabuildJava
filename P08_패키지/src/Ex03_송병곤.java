	
	public class Ex03_송병곤 {
		public static void main(String[] args) {
			String str = "No One Else Like You";
			
			int[] alpha = new int[26]; //알파벳 배열 a를 만나면 alpha[0]++ b만나면 alpha[1]++
			
			//str글자 개수 세기
			//0~ i++ 
			//0번째 1번쨰.... 하나씩 가져오기
			//ex 8번째 글자 가져오기	:b(98)-97=1 alpha[1] 증가
			//ex 10번째 글자 가져오기 :d(100)-97=3 alpha[3] 증가
			
			String lowStr = str.toLowerCase();
			for(int i=0; i<str.length(); i++) {
				if((int)lowStr.charAt(i)-97==-65) continue;
				alpha[(int)lowStr.charAt(i)-97]++;
			}
			for(int i=0; i<alpha.length; i++) {
				char c = (char)(i+97);
				System.out.println(c+":"+alpha[i]);
			}
		}
	}
	
	//a 개ㅅ b 몇개 c 몇개
	//a:0 b:3 c:3