import java.io.File;
import java.io.IOException;

public class Ex02_File {
	public static void main(String[] args){
		
		File f1 = new File("A"); //기본으로 놔두면 현재 프로젝트 폴더안의 얘기
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f1,"abc.text");
		
		if(f1.exists()) {
			System.out.println("이미 존재합니다.");
			f1.renameTo(f2);
			System.out.println("폴더명 변경");
		}
		else {
			f1.mkdir();
			System.out.println("폴더생성함");
			
			try {
				f4.createNewFile();
				System.out.println("파일 생성함");
			} catch (IOException e) {
				System.out.println("파일 생성중 예외 발생");
			}
		}
		if(f3.exists()) {
			boolean d =f3.delete(); //폴더 아래에 파일이 있으면 삭제 불가능 실패 false
			System.out.println(d);
		}
		
	}
}
