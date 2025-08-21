
public class Ex06_Wrapper {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int sum =0;
		for(int arInt : arr) {
			sum += arInt;
		}
		sum=0;
		String[] s = {"1","2","3","4","5"};
		for(String sInt : s) {
			sum+= Integer.parseInt(sInt);
		}
		System.out.println(sum);
		
		sum=0;
		String[] str= {"웬디:70","아이유:90","최강창민:80"};
		for(String sepa : str) {
			sum += Integer.parseInt(sepa.substring(sepa.indexOf(":")+1));
		}
		System.out.println(sum);
	}
}
