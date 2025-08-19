class Parent {
	int x=10;
	void method() {
		System.out.println("P_x : "+x);
	}
}//Parent

class Child extends Parent{
	int x=20;  //같은 x이지만 부모의 x와 자식의 x두종료가 있음 ,  super로 부모것을 불러올수있음
	void method() {
		int x =20; //지역변수  이 함수 안에서만 존재 , 자동초기화 안됨(클래스의 멤버변수는 자동으로 초기화됨!!)
		System.out.println("L_x : "+x); //지역변수의 x가 사용됨
		System.out.println("P_x : "+super.x); //부모의 x
		System.out.println("C_x : "+this.x); //자식의 x
	}
}//Child

public class Ex02_super {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method();

		Child c = new Child();
		c.method();
	}

}
