import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_바이트스트림 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("from.txt");
			
			fos = new FileOutputStream("to.txt",true); //폴더 까진 안만들어줌 x\\to.txt이런식으로 쓰면 오류남
			String str ="\nAre we all lost stars";
			//false, X : 새로운파일 생성
			//true: 추가
			
			
			
//			int r = fis.read();
//			
//			System.out.println(r);
//			
//			r=fis.read(); //이거 하나에 한줄만 읽음!
//			System.out.println(r); //여러줄이면 여러개 써야함 read
			
			int r;
			while(true) {
				r=fis.read();
			//	System.out.print(r);
				if(r==-1) break; // eof를 읽으면 반복 탈출이라는 뜻 eof = -1이기 때문에
				System.out.print((char)r);
				fos.write((char)r);
			}
			byte[] bytes = str.getBytes();
			fos.write(bytes);
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("from.txt 발견못함");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
