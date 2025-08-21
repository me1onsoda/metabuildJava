abstract class Employee {
	private String empno;
	private String name;
	private int pay;
	
	public Employee(String empno, String name, int pay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
	}
	public int getPay() {
		return pay;
	}
	public void display() {
		System.out.print("사번:"+empno+"\n");
		System.out.print("이름:"+name+"\n");
	}
	public abstract double getMonthPay();
}
class PartTime extends Employee{
	private int workDay;
	
	public PartTime(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay=workDay;
	}
	
	public void display() {
		super.display();
		System.out.print("일당:"+super.getPay()+"\n");
		System.out.print("월 근무일:"+workDay+"\n");
	}
	
	@Override
	public double getMonthPay() {
		return super.getPay()*workDay;
	}
}
class Contract extends Employee{
	private int hireYear;

	public Contract(String empno, String name, int pay, int hireYear) {
		super(empno,name,pay);
		this.hireYear=hireYear;
	}
	
	public void display() {
		super.display();
		System.out.print("금액:"+super.getPay()+"\n");
		System.out.print("계약기간:"+hireYear+"\n");
	}

	@Override
	public double getMonthPay() {
		return super.getPay()/(double)12*hireYear;
	}
}
class FullTime extends Employee{
	private int bonus;
	
	public FullTime(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus=bonus;
	}
	
	public void display() {
		super.display();
		System.out.print("연봉:"+super.getPay()+"\n");
		System.out.print("보너스:"+bonus+"\n");
	}
	
	@Override
	public double getMonthPay() {
		return  (super.getPay()/(double)12) + (bonus/(double)12) ;
	}
	
}


public class Ex11_송병곤 {
	public static void main(String[] args) {
		PartTime p = new PartTime("P01","웬디",300,7);
		Contract c = new Contract("C01","슬기",200,5);
		FullTime f = new FullTime("F01","조이",100,400);

		p.display();//개인정보 출력
		System.out.println("월급:"+p.getMonthPay());
		System.out.println();
		c.display();//개인정보 출력
		System.out.println("월급:"+c.getMonthPay());
		System.out.println();
		f.display();//개인정보 출력
		System.out.println("월급:"+f.getMonthPay());
		System.out.println();
		System.out.println("----------------------");

		Employee[] e = new Employee[3];
		e[0]= new PartTime("P01","웬디",300,7);
		e[1]= new Contract("C01","슬기",200,5);
		e[2]= new FullTime("F01","조이",100,400);
		
		for(Employee emp : e) {
			emp.display();
			System.out.println("월급:"+emp.getMonthPay());
			System.out.println("----------------------");
		}
		try {
		for(int i=0; i<4; i++) {
			e[i].display();
			System.out.println("월급:"+e[i].getMonthPay());
			System.out.println("----------------------");
		}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("에러:없는 배열을 참조하려함("+a+")");
		}
	}

}
