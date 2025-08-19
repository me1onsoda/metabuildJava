class Sports{
	String name;
	int inwon;
	
	Sports(){
	}
	Sports(String name, int inwon){
		this.name=name;
		this.inwon=inwon;
	}
	
	
	public void display() {
		System.out.println("스포츠명:"+name);
		System.out.println("인원수:"+inwon);
	}
}

class Baseball extends Sports {
	double ta;
	
	public Baseball(String name,int inwon,double ta){
		super();//안써도 자동으로 들어가있음, 부모생성자를 호출하겠다
		this.name = name;
		this.inwon = inwon;
		this.ta = ta;
	}
	
	public void display2() {
		//System.out.println("스포츠명:" + name);
		//System.out.println("인원수:" + inwon);
		System.out.println("타율:" + ta);
	}
	
}

public class Ex01_상속 {
	public static void main(String[] args) {
		Sports s = new Sports("스포츠",100);
		s.display();
		
		Baseball b = new Baseball("야구", 0, 0.345);
		b.display();
		b.display2();
	}
}
