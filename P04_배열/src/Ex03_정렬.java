
public class Ex03_정렬 {
	public static void main(String[] args) {
		int[] arr = {8, 3, 5, 2, 9};
		//int[] arr = {9, 2, 5, 3, 8};
		int temp;
		for(int i=4; i>=0; i--) {
			for(int j=0; j<i+1; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}

			}	
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

//선택정렬 알고리즘과 결과가 같고 방식이 유사하지만 그대로 구현했다고는 보기어려움
//왜나면 이 코드는 뒤에서부터 보고 정렬하기 떄문