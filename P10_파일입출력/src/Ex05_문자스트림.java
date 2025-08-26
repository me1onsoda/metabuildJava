import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05_문자스트림 {
	public static void main(String[] args) {

		FileWriter fw =null;
		FileReader fr = null;
		BufferedWriter bw=null;
		BufferedReader br= null;
		try {
			fw = new FileWriter("write.txt"); //1차 스트림
			bw= new BufferedWriter( fw,4); 
			bw.write("재미있는 자바 공부");
			bw.newLine();
			bw.write("재미있는 자바 공부2");
			bw.flush();
			fr=new FileReader("write.txt"); //FileNotFoundException은 부모인 IOException이 잡아줄수있음
			br=new BufferedReader(fr,4);
			
			int r=0;
			while(true) {
//				r = br.read(); //한 글자씩 읽음
//				if(r==-1) break;
//				System.out.print((char)r);
				String line = br.readLine(); //한줄 읽어들임 //엔터 전 까지
				if(line==null) break;
				System.out.println(line);
				
				
			}


		} catch (IOException e) {// IOException e  = new FileNotFoundException(); 인셈 
			e.printStackTrace();
		}finally {
			try {
				bw.close(); //이떄 파일에 작성됨 //그래서 중간에 flush해주지않는 이상은 파일에 입력되지않아서 읽어들이기 조차 안되는것
				br.close(); //그래서 그냥 중간에 flush를 넣어주던가 아니면 아예  try를 구분해서 작성 입력try 출력 try
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
