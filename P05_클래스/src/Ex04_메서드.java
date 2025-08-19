class Calculate{
    int x;
    int y; //인스턴스번수
    static int z=2;//static인스턴스변수
    
    public static void star() { //인스턴스 메서드
    	System.out.println("*****************");
    	//System.out.println(x); //static메서드 안에서는 static 변수만
    	System.out.println(z); //static변수라서 사용가능
    }

    public static int add(int x, int y) {
    	int result = x+y;
    	return result;
    }
    public void add1() {
    	int result = x+y;
    	System.out.println(result);
    }
    public int add2() {
    	return x+y;
    }
    public int multiple() {
    	return x*y;
    }
    public int compare() {
    	if(x>y) return x;
    	else return y;
    }
}
public class Ex04_메서드 {
	public static void main(String[] args) {
		
		System.out.println(Calculate.z);
		
		Calculate c = new Calculate();
		c.x=10;
		c.y=20;
		
		System.out.println(c.x+c.y);
		
		c.add1();
		System.out.println(Calculate.add(c.x,c.y));
		System.out.println(c.add2());
		System.out.println(c.multiple());
		c.star();
		Calculate.star();
	}

}
