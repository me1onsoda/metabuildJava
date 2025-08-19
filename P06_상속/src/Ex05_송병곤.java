class Character{
	private String name;
	private int hp;
	private int mp;

	public Character(String name,int hp, int mp) {
		this.name=name;
		this.hp=hp;
		this.mp=mp;
	}
	
	public void displayProfile() {
		System.out.println("name:"+name);
		System.out.println("hp:"+hp);
		System.out.println("mp:"+mp);
	}
}

class Warrior extends Character{
	private String attackType;

	public Warrior(String name,int hp, int mp, String attackType) {
		super(name,hp,mp);
		this.attackType=attackType;
	}
	
	public void displayProfile() {
		super.displayProfile();
		System.out.println("공격타입:"+attackType);
	}
}

class Swordsman extends Warrior{
	private String weaponType;

	public Swordsman(String name,int hp, int mp, String attackType, String weaponType) {
		super(name,hp,mp,attackType);
		this.weaponType=weaponType;
	}
	
	public void displayProfile() {
		super.displayProfile();
		System.out.println("무기타입:"+weaponType);
	}
}

public class Ex05_송병곤 {
	public static void main(String[] args) {
		Character c = new Character("김풍",100,20);
		c.displayProfile();
		System.out.println("-----------------");

		Warrior w = new Warrior("침착맨",150,30,"근접");
		w.displayProfile();
		System.out.println("-----------------");

		Swordsman s = new Swordsman("이광수",200,50,"근접","한손검");
		s.displayProfile();
		System.out.println("-----------------");
		
		Character[] characterArray = {new Character("김풍",909,99),new Warrior("침착맨",190,79,"근접"),new Swordsman("이광수",290,59,"근접","한손검")};
		for(Character cA: characterArray) {
			cA.displayProfile();
		}
	}
}
