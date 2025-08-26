import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_Buffer_pr {
	public static void main(String[] args) {
		    
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i=1;i<=9;i++) {
				bos.write(i+48); // 49('1') 50 51
			}
			// data.txt 쓰기
			bos.flush();
			
			fis = new FileInputStream("data.txt");
			bis = new BufferedInputStream(fis);
			
			while(true) {
				int r = bis.read();
				if(r == -1)
					break;
				System.out.print((char)r);
			}
			// data.txt에서 읽어와서 콘솔창에 출력
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}