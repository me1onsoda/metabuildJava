class Member{
	private String id;
	private String password;
	
	public Member(){
		System.out.println("생성자1 호출");
	}
	
	public Member (String id, String password){
		System.out.println("생성자2 호출");
		this.id=id;
		this.password=password;
	}
	
	public Member (String id){
		System.out.println("생성자3 호출");
		this.id=id;
	}
		
	public void setId(String id) {
		this.id=id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	
	public void display() {
		System.out.println(id+" "+password);
	}
}

public class Ex13_생성자 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId("kim"); m1.setPassword("1234");
		System.out.println(m1.getId()+" "+m1.getPassword());
		m1.display();
		System.out.println("---------------------------");
		
		Member m2 = new Member();
		System.out.println(m2.getId()+" "+m2.getPassword());
		m2.display();
		System.out.println("---------------------------");
		
		Member m3 = new Member("lee", "1357");
		m3.display();
		System.out.println(m3.getId()+" "+m3.getPassword());
		
		Member m4 = new Member("jung");
		m4.display();
		System.out.println(m4.getId()+" "+m4.getPassword());
	}

}
