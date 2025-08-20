class Robot{
	
}//Robot
class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}//DanceRobot
class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}//SingRobot
class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}//DrawRobot


public class Ex09_다형성 {
	public static void main(String[] args) {
		Robot[] r = new Robot[3];
		r[0]= new DanceRobot();
		r[1]= new SingRobot();
		r[2]= new DrawRobot();
		
		for(int i=0; i<r.length; i++) {
			action(r[i]);
		}
		
	}//main
	
	public static void action(Robot r) {
		if(r instanceof SingRobot) {
			SingRobot s = (SingRobot)r;
		}
	}
}
