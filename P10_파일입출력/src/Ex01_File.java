import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		File win = new File("c:\\windows\\"); //폴더
		System.out.println(win.toString());
		boolean result1 = win.isDirectory();
		System.out.println(result1);
		
		String result2 = win.isDirectory() ? "폴더":"파일";
		System.out.println(result2);
		
		String result3 = win.isFile() ? "파일":"폴더";
		System.out.println(result3);
		
		String[] lists = win.list();
		for(int i=0; i<lists.length;i++) {
//			File kind = new File("c:\\window\\",lists[i]);
			File kind = new File(win, lists[i]);
			if(kind.isFile())
				System.out.println("파일:"+lists[i]);
			else
				System.out.println("폴더:"+lists[i]);
			
		}
	}
}
