import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Movie{
	private String title;
	private int age;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Movie(String title, int age) {
		super();
		this.title = title;
		this.age = age;
	}
	public String toString() {
		return title+","+age;
	}
}
public class Ex13_HashMap {
	public static void main(String[] args) {
		Movie m1 = new Movie("좀비딸",12);
		Movie m2 = new Movie("오징어게임",19);
		//Movie m3 = new Movie("스머프",7);

		Map<String, Movie> movie = new HashMap<>();
		movie.put("롯데시네마", m1);
		movie.put("CGV", m2);
		movie.put("메가박스", new Movie("스머프",7));

		System.out.println(movie); //이러면 무비 객체의주소가 출력되버림 (Object의 toString이 호출되어버려서

		Set<String> ms = movie.keySet();
		for(String s : ms) {
			System.out.println(s+":"+movie.get(s));
			System.out.println(s+":"+movie.get(s).getTitle());
			System.out.println(s+":"+movie.get(s).getAge());
		}

		Movie m4 = new Movie("국제시장",15);
		movie.replace("메가박스", m4);
		System.out.println(movie);
		
		Movie rm = movie.remove("CGV"); //지우는 객체의 정보가 들어감
		System.out.println(movie);
		System.out.println(rm);
		Movie rmf = movie.remove("여긴어디람"); //지우는 객체의 정보가 들어감
		System.out.println(movie);
		System.out.println(rmf);//아무래도 null이 들어감
		
		movie.clear(); //싹다지움
		System.out.println(movie); //텅텅
		

	}
}
