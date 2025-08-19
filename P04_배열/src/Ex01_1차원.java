
public class Ex01_1차원 {

	public static void main(String[] args) {
		//int x=10, y=20, z=30;
		
		int[] x= {10,20,30};
		System.out.println(x); //x에는 x배열의 시작 주소가 담겨져있다
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3-1]);
		
		
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println(x.length);
		
		int[] y= new int[3];
		
		int[] jumsu = {77,89,92,40,97,68};
		int sum=0;
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
			sum += jumsu[i];
			System.out.println("지금까지의 합계:"+sum);
		}
		double avg = (double)sum/jumsu.length;
		
		System.out.println("평균:"+avg);
		
		int max = jumsu[0];
		int min = jumsu[0];
		for(int i=0; i<jumsu.length; i++) {
			if(max<jumsu[i]) max=jumsu[i];
			if(min>jumsu[i]) min=jumsu[i];
		}
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		for (int score : jumsu) {
			System.out.print(score+" ");
		}
		
	}

}
