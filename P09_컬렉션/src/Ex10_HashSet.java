import java.util.HashSet;

public class Ex10_HashSet {
	public static void main(String[] args) {
		//로또 배열
		int[] arr = new int[6];
		//정수 난수
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=(int)(Math.random()*10)+1;
//			for(int j=0; j<i;j++) {
//				if(arr[i]==arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for(int ranNum : arr) {
//			System.out.println(ranNum);
//		}
		int i=0,j;
		
		while(true) {
			arr[i] = (int)(Math.random()*10)+1;
			for(j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					arr[i]=(int)(Math.random()*10)+1;
					j--;
				}
			}
			i++;
			if(i==6) break;
		}
		for(int ranNum : arr) {
			System.out.print(ranNum+" ");
		}
		System.out.println();
		System.out.println("----------배열이용-----------");
		
		HashSet<Integer> hs = new HashSet<>();
		while(true) {
			int num = (int)(Math.random()*10)+1;
			hs.add(num);
			if(hs.size()==6) break;
		}
		System.out.println(hs);
		System.out.println("----------HashSet이용-----------"); //깔끔하게 ㄱㄴ
		
	}
}
