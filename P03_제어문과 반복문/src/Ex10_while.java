import java.util.Scanner;

public class Ex10_while {

    public static void main(String[] args) {

    	 for (int i=1; i<=5; i++) {

             System.out.println(i);
         }
        
        int j = 1;
        
        while (j<=5) {
        	System.out.println(j);
        	j++;
        }
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        System.out.print("숫자입력:");
        num = sc.nextInt();
        if(num<0) break;
        
        }
        
        System.out.println("while 탈출");
    }    // end main

}