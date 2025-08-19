class Sports extends Object{ //자동으로 Object라는것이 상속
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
	
	public void display() {
		//System.out.println("스포츠명:" + name);
		//System.out.println("인원수:" + inwon);
		super.display();
		System.out.println("타율:" + ta);
	}
	
}

class Football extends Sports{
	int goal;
	
	public Football(String name,int inwon,int goal){
		super();//안써도 자동으로 들어가있음, 부모생성자를 호출하겠다
		this.name = name;
		this.inwon = inwon;
		this.goal = goal;
	}
	
	public void display() {
		super.display();
		System.out.println("골:"+goal);
	}
}

public class Ex01_상속 {
	public static void main(String[] args) {
		Sports s = new Sports("스포츠",100);
		s.display();
		
		Baseball b = new Baseball("야구", 0, 0.345);
		b.display();
		System.out.println("--------------------");
		b.display();
		System.out.println("--------------------");
		
		Football f = new Football("축구",11,3);
		f.display();
		
		System.out.println("--------------------");
		Sports b2 = new Baseball("야구", 9, 0.345);
		b2.display();
		System.out.println();
		
		System.out.println("--------------------");
		Sports f2 = new Football("축구",11,5);
		f2.display();
		System.out.println();
		System.out.println("--------------------");
		
		Sports[] sa = new Sports[2];
		sa[0]= new Football("축구",11,55);
		sa[1] = new Baseball("야구", 9, 0.789);
		
		for(Sports sportsArray : sa) {
			sportsArray.display();
		}
	}
}
