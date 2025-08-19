
public class Ex03_정렬2 {
public static void main(String[] args) {
    int[] arr = {8, 3, 5, 2, 9};
	
	for (int i = 0; i < arr.length - 1; i++) {
    	for (int j = i + 1; j < arr.length; j++) {
    		if (arr[i] > arr[j]) {
    			int temp1 = arr[j];
    			arr[j] = arr[i];
    			arr[i] = temp1;
    		}
    	}
    }
	for (int num : arr) {
        System.out.print(num + " ");
    }

}
}
