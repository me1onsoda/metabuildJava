import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_Buffer {
	public static void main(String[] args) {
		//data.txt에 1부터 9까지 출력
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i=1; i<10; i++) {
				bos.write(i+48);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			fis = new FileInputStream("data.txt");
			bis = new BufferedInputStream(fis);
			int r=0;
			while(true) {
				r = bis.read();
				if (r==-1) break;
				System.out.print((char)r);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
