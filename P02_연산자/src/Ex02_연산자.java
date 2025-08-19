
public class Ex02_연산자 {

	public static void main(String[] args) {
		int a=10;
		a +=3;
		System.out.println("a:"+a);
		a *=3;
		System.out.println("a:"+a);
		
		int x=5, y=5, q, r;
		System.out.println("x:"+x);
		x+=1;
		System.out.println("x:"+x);
		q = 2+x++;
		System.out.println("x:"+x);
		System.out.println("q:"+q);
		
		r = --y; //4 4
		//r = y--; // 5 4
		System.out.println("r"+r);
		System.out.println("y"+y);
	}

}
