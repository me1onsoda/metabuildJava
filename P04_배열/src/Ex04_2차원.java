
public class Ex04_2차원 {
	public static void main(String[] args) {
		int[][] jumsu = {{10,90,78,54},
						{32,43},
						{90,32,43}
						};
		
		
		for (int[] row : jumsu) {
			for(int score : row) {
				System.out.print(score+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(jumsu[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		*/
		
		int[][] score = new int[3][];
		score[0]= new int[]{10,90,78,54};
		score[1]= new int[]{32,43};
		score[2]= new int[]{90,32,43};
		
		
	}
}
