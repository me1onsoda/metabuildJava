	import java.io.BufferedReader;
	import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
	
	public class Main {
			public static void main(String[] args)throws Exception {
				/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int n = Integer.parseInt(br.readLine());
				int sum = 0;
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int i=0; i<n; i++) {
					sum += Integer.parseInt(st.nextToken());
				}
				System.out.println(sum);
				*/
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int n = Integer.parseInt(br.readLine());
				int sum = 0;
				String num = br.readLine();
				for(int i=0; i<n; i++) {
					char c = num.charAt(i);
					sum+= Integer.parseInt(String.valueOf(c));
				}
				System.out.println(sum);
			}
			
		} 

	